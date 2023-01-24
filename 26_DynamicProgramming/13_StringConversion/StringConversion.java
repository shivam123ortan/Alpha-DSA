/*
    Convert Stringl to String2 with only insertion & deletion.
    Print number of deletions & insertions.
    strl "pear" str2 *"sea" 
 */

public class StringConversion {

    // Tabulation 
    public static int lcsTab(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];
        // initialization
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                dp[i][j] = 0;
            }
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }

        return dp[n][m];
    }

    public static int stringConversion(String str1, String str2){
        int lcs = lcsTab(str1, str2);
        int leftoverstr1 = str1.length() - lcs;
        int leftoverstr2 = str2.length() - lcs;
        return leftoverstr1 + leftoverstr2;
    }
    
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "aceg";

        System.out.println(stringConversion(str1, str2));
    }    
}
