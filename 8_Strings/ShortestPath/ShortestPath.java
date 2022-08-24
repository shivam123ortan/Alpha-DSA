// Give a route containing 4 directions (E, W, N, S),
// Find the shortest path to reach destination.
// WNEENESENNN

public class ShortestPath {

    public static float shortestPath(String str){ //O(n)
        int x = 0;
        int y = 0;
        for(int i=0; i<str.length(); i++){
            char dir = str.charAt(i);
            if(dir== 'S'){
                y--;
            }
            else if(dir=='N'){
                x++;
            }
            else if(dir=='W'){
                x--;
            }
            else{
                y++;
            }
        }
        float displacement = (float)Math.sqrt((x*x) + (y*y));
        return displacement;
    }
    
    public static void main(String[] args) {
        String str = "WNEENESENNN";    
        System.out.println(shortestPath(str));
    }
}
