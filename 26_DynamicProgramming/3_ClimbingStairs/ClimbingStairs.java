/*
    CLIMBING STAIRS
        Count ways to reach the nth stair. The person can climb either 1 
        stairs at a time.
 */

import java.util.*;

public class ClimbingStairs {

    // Recursion -> O(2^n)
    public static int countWays(int n){
        if(n==0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        return countWays(n-1) + countWays(n-2);
    }

    // Memoiztion -> O(n)
    public static int countWaysMem(int n, int [] ways){
        if(n==0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        if(ways[n] != -1){ // already calculated
            return ways[n];
        }

        ways[n] = countWays(n-1) + countWays(n-2);
        return ways[n];
    }

    // Tabulation -> O(n)
    public static int countWaysTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
 
        for(int i=1; i<=n; i++){
            if(i == 1){
                dp[i] = dp[i-1];
            } else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }

        return dp[n];
    }
    
    public static void main(String[] args) {
        int n = 5;   
        
        // Recursion
        // System.out.println(countWays(n));

        // Memoization
        // int [] ways = new int[n+1];
        // Arrays.fill(ways, -1);
        // System.out.println(countWaysMem(n, ways));

        // Tabulation
        System.out.println(countWaysTab(n));
    }
}
