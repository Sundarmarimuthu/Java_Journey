import java.util.*;

class Edge {
    int src;
    int dest;
    int weight;

    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

class Disjoint {
    int[] parent;

    Disjoint(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    boolean union(int a, int b) {
        int ra = find(a);
        int rb = find(b);
        if (ra == rb)
            return false;
        parent[ra] = rb;
        return true;
    }
}

public class kruskals {
    public static void main(String[] sm) {
        int v = 5;
        List<Edge> ed = new ArrayList<>();
        ed.add(new Edge(0, 1, 2));
        ed.add(new Edge(0, 3, 6));
        ed.add(new Edge(3, 1, 8));
        ed.add(new Edge(1, 2, 3));
        ed.add(new Edge(4, 2, 7));
        ed.add(new Edge(1, 4, 5));

        ed.sort(Comparator.comparing(e -> e.weight));
        Disjoint ds = new Disjoint(v);
        int sum = 0;
        System.out.println("Edges in Minimum Spanning Tree:");
        for (Edge edg : ed) {
            if (ds.union(edg.src, edg.dest)) {
                System.out.println(edg.src + " -> " + edg.dest + "  Edge Weight: " + edg.weight);
                sum += edg.weight;
            }
        }
        System.out.println("Minimum cost of the tree: " + sum);
    }
}
