import java.nio.file.attribute.GroupPrincipal;
import java.util.*;

/*
    Topological sorting using Kahn's Algorithm (Indegree/Outdegree)

    Fact: A DAG has at least one vertex with in-degree 0 and one vertex with
            out-degree 0.
 */


public class TopologicalSorting {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        // Arrays.fill(graph, new ArrayList<>()); --> Don't know why not working
        for(int i=0; i<graph.length; i++) { 
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void calcIndeg(ArrayList<Edge> graph[], int indeg[]){
        for(int i=0; i<graph.length; i++){
            int v = i;
            for(int j=0; j<graph[v].size(); j++) {
                Edge e = graph[v].get(j);
                indeg[e.dest]++;
            }
        }
    }
    
    public static void topSort(ArrayList<Edge> graph[]){
        int indeg[] = new int[graph.length];
        calcIndeg(graph, indeg);
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<indeg.length; i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }

        //bfs
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " ");

            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        topSort(graph);                                       
    }
}
