

/*
    Bi-> Two
    partite-> graph

    A Bipartite Graph is a graph whose vertices can be divided into two
    independent sets, U and V such that every edge(u, v) either connects a 
    vertex from U to V or a vertex from V to U. In other words, for every 
    edge (u, v), either u belongs to U and v to V, or u belongs to V and v 
    to U. We can also say that there is no edge that connects vertices of
    same set.

    NOTE: If graph doesn't have cycles then graph is bipartite.
          1. If Acyclic graph -> Bipartite
          2. If Even cycle -> Bipartite
          3. If Odd cycle -> Non Bipartite

    Approach->
    Colors - (-1) no color
             (1) yellow
             (0) blue
    
    Case1: neigh -> color -> same -> false
    Case2: neigh -> color -> diff -> do nothing 
    Case3: neigh -> no color -> opposite color
 */
import java.util.*;

public class Bipartite {

    static class Edge{
        int src;
        int dest;
        // int wt;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
            // this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
    }

    
    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int col[] = new int[graph.length];
        Arrays.fill(col, -1);

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<graph.length; i++){
            if(col[i] == -1){ // BFS
                 q.add(i);
                 col[i] = 0; // yellow
                 while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0; j<graph[curr].size(); j++){
                        Edge e = graph[curr].get(j); // e.dest
                        if(col[e.dest] == -1){
                            int nextCol = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = nextCol;
                            q.add(e.dest);
                        } else if (col[e.dest] == col[curr]) {
                            return false; // NOT Bipartite
                        } 
                    }
                 }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int V = 5;
        @SuppressWarnings ("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}
