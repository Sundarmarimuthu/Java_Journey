
/*check the edges exists or not and print all the neighbours
 * Implementations:
 * create a class 
 * define a map
 * add edges
 * check the edges
 * print all the neighbours
 * mainly neighbours
 */
import java.util.*;

class Graph {
    HashMap<Integer, HashSet<Integer>> adjacent = new HashMap<>();

    public void addEdges(int u, int v) {
        if (!adjacent.containsKey(u)) {
            adjacent.put(u, new HashSet<Integer>());
        }
        adjacent.get(u).add(v);
        if (!adjacent.containsKey(v)) {
            adjacent.put(v, new HashSet<Integer>());
        }
        adjacent.get(v).add(u);

    }

    public void pair(int u, int v) {
        if (adjacent.containsKey(u)) {
            if (adjacent.get(u).contains(v)) {
                System.out.println("Path exist");
            }
        } else
            System.out.println("Path doesn't exist");
    }

    public void display() {
        List<Integer> keys = new ArrayList<>(adjacent.keySet());
        for (int i = 0; i < keys.size(); i++) {
            Integer key = keys.get(i);
            System.out.print("Elements in the List " + key + ": ");
            for (Integer neighbor : adjacent.get(key)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}

public class graph2 {
    public static void main(String[] sm) {
        Graph g = new Graph();
        g.addEdges(1, 2);
        g.addEdges(1, 3);
        g.addEdges(3, 2);
        g.pair(1, 3);
        g.display();

    }

}
