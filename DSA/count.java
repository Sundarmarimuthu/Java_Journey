import java.util.*;
class Graph{
    Map<Integer,HashSet<Integer>> adjacent =new HashMap<>();
    public void addEdges(int u,int v){
        if(!adjacent.containsKey(u)){
            adjacent.put(u,new HashSet<>());
        }
    adjacent.get(u).add(v);
    if(!adjacent.containsKey(v)){
        adjacent.put(v,new HashSet<>());
    }
    adjacent.get(v).add(u);
}

public void verEdge(){
  int edg=0;
  for(HashSet<Integer> hs:adjacent.values()){
    if(hs.size()==1) edg++;
 }
 System.out.println(edg);
}
}
 public class count {
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdges(0,1);
        g.addEdges(1,2);
        g.addEdges(2,3);
        g.addEdges(2,4);

        
        g.verEdge();
    }
}