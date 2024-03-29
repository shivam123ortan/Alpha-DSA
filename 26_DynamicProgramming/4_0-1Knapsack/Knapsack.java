/*
    val [] = {15, 14, 10, 45, 30}
    wt [] = {2, 5, 1, 3, 4}
    W (total allowed weight) = 7
    ans = maxProfit
 */

public class Knapsack {

    // Recursion
    public static int knapsack(int val[], int wt[], int W, int n){
        if(W == 0 || n == 0){ // base condition
            return 0;
        }

        if(wt[n-1] <= W){ // valid
            // include
            int ans1 = val[n-1] + knapsack(val, wt, W-wt[n-1], n-1);
            // exclude
            int ans2 = knapsack(val, wt, W, n-1);
            return Math.max(ans1, ans2);
        } else {
            return knapsack(val, wt, W, n-1);
        }
    }
    
    // Memoization: TC = O(n*W)
    public static int knapsackDP(int val[], int wt[], int W, int n, int dp[][]){
        if(W == 0 || n == 0){ // base condition
            return 0;
        }

        if(dp[n][W] != -1){
            return dp[n][W];
        }

        if(wt[n-1] <= W){ // valid
            // include
            int ans1 = val[n-1] + knapsackDP(val, wt, W-wt[n-1], n-1, dp);
            // exclude
            int ans2 = knapsackDP(val, wt, W, n-1, dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        } else {
            dp[n][W] = knapsackDP(val, wt, W, n-1, dp);
            return dp[n][W];
        }
    }

    public static void print(int dp[][]){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Tabulation
    public static int knapsackTab(int val[], int wt[], int W){
        int n = val.length;
        int dp[][] = new int[n+1][W+1];
        for(int i=0; i<dp.length; i++){ // 0th column
            dp[i][0] = 0;
        }
        for(int j=0; j<dp[0].length; j++){ // 0th row
            dp[0][j] = 0;
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<W+1; j++){
                int v = val[i-1]; // value of ith item
                int w = wt[i-1]; // wt of ith item
                if(w <= j){ // valid
                    // include
                    int incProfit = v + dp[i-1][j-w];
                    // exclude
                    int excProfit = dp[i-1][j];
                    
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else { // invalid
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        print(dp);
        return dp[n][W];
    }
    
    public static void main(String[] args) {
        int val [] = {15, 14, 10, 45, 30};
        int wt [] = {2, 5, 1, 3, 4};
        int W = 7;
        // int dp[][] = new int[val.length+1][W+1];
        // for(int i=0; i<dp.length; i++){
        //     for(int j=0; j<dp[0].length; j++){
        //         dp[i][j] = -1;
        //     }
        // }
        // System.out.println(knapsackDP(val, wt, W, val.length, dp));

        // System.out.println(knapsack(val, wt, W, val.length));

        System.out.println(knapsackTab(val, wt, W));
    }    
}
