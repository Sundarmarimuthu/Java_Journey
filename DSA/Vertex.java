import java.util.*;
public class Vertex{
    public static void main(String[] sm) {
        Graph v = new Graph(5);
        v.addEdges(0, 1);
        v.addEdges(0, 3);
        v.addEdges(1, 3);
        v.addEdges(1, 2);
        v.addEdges(2, 4);
        v.addEdges(3, 4);
        v.display();
    }

}


 class Graph {
    ArrayList<ArrayList<Integer>> List = new ArrayList<>();

     Graph(int v) {
        for (int i = 0; i < v; i++) {
            List.add(new ArrayList<Integer>());
        }
    }

    public void addEdges(int u, int v) {
        List.get(u).add(v);
        List.get(v).add(u);
    }

    public void display() {
        for (int i = 0; i < List.size(); i++) {
            System.out.println("Elements in the List:" + i + ";");
            for (int j = 0; j < List.get(i).size(); j++) {
                System.out.println("->"+List.get(i).get(j));
            }
        }
    }

}

