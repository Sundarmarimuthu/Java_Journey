import java.util.*;

class Graph {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    Graph(int v) {
        for (int i = 0; i < v; i++) {
            list.add(new ArrayList<>());
        }
    }

    public void addEdges(int u, int v) {
        list.get(u).add(v);
        list.get(v).add(u);
    }

    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Elements in List " + i + ":");
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.println("-> " + list.get(i).get(j));
            }
        }
    }

    public boolean bfs(int source, int dest) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[list.size()];
        q.add(source);
        visited[source] = true;

        while (!q.isEmpty()) {
            int current = q.poll();
            if (current == dest)
                return true;

            System.out.print(current + " ");

            for (int neighbor : list.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        return false;
    }
}

public class Bfsqn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of edges: ");
        int n = sc.nextInt(); // Number of edges

        System.out.print("Enter source vertex: ");
        int source = sc.nextInt();

        System.out.print("Enter destination vertex: ");
        int dest = sc.nextInt();

        Graph g = new Graph(100); // 100 is just a max size; can be replaced with exact max vertex + 1

        System.out.println("Enter " + n + " edges:");
        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.addEdges(u, v);
        }

        System.out.println("\nBFS Traversal:");
        if (g.bfs(source, dest))
            System.out.println("\nPath Exists");
        else
            System.out.println("\nPath does not Exist");
    }
}
