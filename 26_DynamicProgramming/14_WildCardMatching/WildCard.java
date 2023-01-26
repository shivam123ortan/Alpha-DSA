/*
    Given a text and a wildcard pattern, implement wildcard pattern matching algorithm that 
    finds if wildcard pattern is matched with text. The matching should cover the entire text 
    (not partial text). The wildcard pattern can include the characters '?' and '*'
        * '?' - matches any single character
        * '*' - matches any sequence of characters (including the empty sequence)

    Text = "baaabab"
    Pattern = "*****ba*****ab"
    output : true

    Text = "baaabab"
    Pattern = "a*ab"
    output : false
 */


public class WildCard {

    // TC -> O(n*m) (HARD)
    public static boolean isMatch(String s, String p){
        int n = s.length();
        int m = p.length();

        boolean dp[][] = new boolean[n+1][m+1];

        //initialize
        dp[0][0] = true;
        // p = " "
        for(int i=1; i<n+1; i++){
            dp[i][0] = false;
        }
        // s = " "
        for(int j=1; j<m+1; j++){
            if(p.charAt(j-1) == '*'){
                dp[0][j] = dp[0][j-1]; // default value is false
            }
        }

        // bottom up
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                //case -> ith char == jth char || jth char == ?
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                } else if(p.charAt(j-1) == '*'){
                               //matched     //ignore
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                } else {
                    dp[i][j] = false;
                }
            }
        }

        //string -> n, patern -> m
        return dp[n][m];

    }
    
    public static void main(String[] args) {
        String s = "baaabab";
        String p = "*****ba*****ab";

        System.out.println(isMatch(s, p));
    }
    
}