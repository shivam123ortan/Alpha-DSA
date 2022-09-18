/*
    You are given n pairs of numbers. In every pair, the first number is 
    always smaller than the second number. A pair (c, d) can follow another 
    pair (a, b) if b < c. Chain of pairs can be formed in this fashion. 
    Find the longest chain which can be formed from a given set of pairs. 

    For example, if the given pairs are {{5, 24}, {39, 60}, {15, 28}, 
    {27, 40}, {50, 90} }, then the longest chain that can be formed is 
    of length 3, and the chain is {{5, 24}, {27, 40}, {50, 90}}
 */

import java.util.*;

public class MaxChain {
    public static void main(String[] args) { // TC - O(nlogn)
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
        
        // Same as Activity Selection
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1]; // Last selected pair end or Chain end

        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("Max length of chain = " + chainLen);

    }
}
