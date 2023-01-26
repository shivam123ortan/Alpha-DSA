/*
    Mountains & Valleys
        up stroke
        down stroke
    find the number of mountain ranges formed by up and down 
    strokes
    
    at any moment the number of down strokes cannot be more than number of up strokes.
 */

public class MountainRanges {

    //O(n^2)
    public static int mountainRanges(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i=2; i<n+1; i++){
            // i pairs -> mountain ranges => Ci
            for(int j=0; j<i; j++){
                int inside = dp[j];
                int outside = dp[i-j-1];
                dp[i] += inside * outside;
            }
        }
        return dp[n];
    }
    
    public static void main(String[] args) {
        int n = 4;   
        System.out.println(mountainRanges(n));     
    }    
}
