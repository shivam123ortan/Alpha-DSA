// Give a "2 x n" floor and tiles of size "2 x 1", count the number of 
// ways to tile the given board using the 2 x 1 tiles.
// (A tile can either be placed horizontally or veritcally)

public class Tilling {

    public static int tillingWays(int n){ // 2 * n
        // Base Case
        if(n==0 || n==1){
            return 1;
        }
        
        // Kaam
        // Verticle
        int fnm1 = tillingWays(n-1);
        // Horizontal
        int fnm2 = tillingWays(n-2);

        int totalWays = fnm1 + fnm2;

        return totalWays;
    }
    
    public static void main(String[] args) {
        System.out.println(tillingWays(5));
    }    
}
