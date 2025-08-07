import java.util.*;

class Edge {
    int v;
    Edge(int v) {
        this.v = v;
    }
}

public class Dijkstras {
    public static void main(String[] sm) {
        int v = 5;
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        // Example graph (u, v, w): u->v with weight w
        adj.get(0).add(new int[]{1, 10});
        adj.get(0).add(new int[]{4, 5});
        adj.get(1).add(new int[]{2, 1});
        adj.get(1).add(new int[]{4, 2});
        adj.get(2).add(new int[]{3, 4});
        adj.get(3).add(new int[]{2, 6});
        adj.get(3).add(new int[]{0, 7});
        adj.get(4).add(new int[]{1, 3});
        adj.get(4).add(new int[]{2, 9});
        adj.get(4).add(new int[]{3, 2});

        dijkstra(adj, v, 0); // source is 0
    }

    public static void dijkstra(ArrayList<ArrayList<int[]>> adj, int v, int src) {
        int[] dist = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{src, 0});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[0];
            int d = curr[1];
            if (d > dist[u]) continue;
            for (int[] edge : adj.get(u)) {
                int neighbor = edge[0];
                int weight = edge[1];
                if (dist[u] + weight < dist[neighbor]) {
                    dist[neighbor] = dist[u] + weight;
                    pq.offer(new int[]{neighbor, dist[neighbor]});
                }
            }
        }

        System.out.println("Shortest distances from source " + src + ":");
        for (int i = 0; i < v; i++) {
            System.out.println("To " + i + " : " + dist[i]);
        }
    }
}
