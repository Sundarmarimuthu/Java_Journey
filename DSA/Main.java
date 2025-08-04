import java.util.*;
public class Main{
    public static void main(String[] sm){
    int v=3;
    List<List<int[]>> adj=new ArrayList<>();
    for(int i=0;i<v;i++){
        adj.add(new ArrayList<>());
    }
    adj.get(0).add(new int[]{1,2});
    adj.get(1).add(new int[]{0,2});
    adj.get(0).add(new int[]{2,1});
    adj.get(2).add(new int[]{0,1});
    adj.get(1).add(new int[]{2,3});
    adj.get(2).add(new int[]{1,3});
    prim(adj,v);
  }
  static class pair{
      int v;int p;int w;
      pair(int v,int p,int w){
          this.v=v;
          this.w=w;
          this.p=p;
      }
  }
      public static void prim(List<List<int[]>> adj,int v){
          boolean[] visited = new boolean[v];
          PriorityQueue<pair> pq=new PriorityQueue<>(Comparator.comparing(a->a.w));
          pq.offer(new pair(0,-1,0));
          int cost=0;
          System.out.println("Edges of MST");
          while(!pq.isEmpty()){
              pair cur=pq.poll();
              if(visited[cur.v]) continue;
              visited[cur.v]=true;
              if(cur.p!=-1){
                  System.out.println("Edge: "+cur.p+"-"+cur.v+"(weight: "+cur.w +")");
              }
              cost+=cur.w;
              for(int [] n:adj.get(cur.v)){
                  if(!visited[n[0]]){
                      pq.offer(new pair(n[0],n[1],cur.v));
                  }
              }
              
          System.out.println("cost:"+cost);
      }
      
      
  }
}