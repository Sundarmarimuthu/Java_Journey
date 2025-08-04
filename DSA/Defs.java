import java.util.*;

public class Defs {
    public static void main(String[] sm) {
        Graph v = new Graph(5);
        v.addEdges(0, 1);
        v.addEdges(0, 3);
        v.addEdges(1, 3);
        v.addEdges(1, 2);
        v.addEdges(2, 4);
        v.addEdges(3, 4);
        v.display();
        v.dfs(0);
    }
}

class Graph {
    private ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    Graph(int v) {
        for (int i = 0; i < v; i++) {
            list.add(new ArrayList<Integer>());
        }
    }

    public void addEdges(int u, int v) {
        list.get(u).add(v);
        list.get(v).add(u);
    }

    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print("Elements in the List " + i + ": ");
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public void dfs(int v) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[list.size()];
        stack.push(v);
        visited[v] = true;
        System.out.print("DFS Traversal: ");
        while (!stack.isEmpty()) {
            int ver = stack.pop();
            System.out.print(ver + " ");
            for (int i = 0; i < list.get(ver).size(); i++) {
                int av = list.get(ver).get(i);
                if (!visited[av]) {
                    visited[av] = true;
                    stack.push(av);
                }
            }
        }
        System.out.println();
    }
}
