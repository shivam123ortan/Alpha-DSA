/*
    We are given a bar of chocolate composed of mxn square pieces . One should break the chocolate
    into single squares . Each break of a part of the chocolate is charged a cost expressed by a positive
    integer . This cost does not depend on the size of the part that is being broken but only depends on
    the line the break goes along . Let us denote the costs of breaking along consecutive vertical lines
    with x1 , x2 , ... , xm - 1 and along horizontal lines with y1 , y2 , ... , yn - 1 .
    Compute the minimal cost of breaking the whole chocolate into single squares .

    SOLUTION
    1. We have to use all cuts.
    2. Every time we cut we have increased pieces of choclates
        -> Therefore we must do expensive cuts first and cheap at last
    3. Cost of each cut = (no. of pieces) * (cost of that line)
 */

import java.util.*;

public class Chocola {
    public static void main(String[] args) {
        int n = 4;
        int m = 6;
        Integer costVer[] = {2, 1, 3, 1, 4}; //m-1
        Integer costHor[] = {4, 1, 2}; //n-1

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h=0; // horizontal cuts
        int v=0; // vertical cuts
        int hp=0; // horizontal pieces
        int vp=0; // vertical pieces
        int cost=0; // minimum cost

        while(h<(n-1) && v<(m-1)){
            // vertical cost < horizontal cost
            if(costVer[v] <= costHor[h]){ // horizontal cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else { // vertical cut
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        // left cuts (bacha khucha) -- for horizontal cuts
        while(h < (n-1)){
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        // left cuts (bacha khucha) -- for vertical cuts
        while(v < (m-1)){
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println("Minimus cost of cuts = " + cost);
    }
}
