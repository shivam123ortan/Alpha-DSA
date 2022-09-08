public class GridWays { //O(2^(n+m))

    public static int gridWays(int i, int j, int m, int n){
        // Base Case 
        if(i==m-1 && j==n-1){
            return 1;
        } else if(i==n || j==m) {
            return 0;
        }

        // Kaam
        return gridWays(i+1, j, m, n) + gridWays(i, j+1, m, n);
    }

    public static int fact(int n){ // TC - O(n), SC - O(n) 
        if(n == 0){
            return 1;
        }
        int fn =  n * fact(n-1);
        return fn;
    }
    
    public static int optimizedGridWays(int m, int n){
        return (fact(n-1+m-1))/(fact(n-1)*fact(m-1));
    }
    
    public static void main(String[] args) {
        System.out.println(gridWays(0, 0, 3, 3));
        System.out.println(optimizedGridWays(3, 3));
    }    
}
