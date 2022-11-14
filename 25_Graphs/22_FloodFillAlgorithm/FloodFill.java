/*
    LEETCODE-733
    Given a m x n integer grid image where represents the pixel value of the
    image.
    You are also given three integers sr, sc, and color. You should perform 
    a flood fill on the image starting from the pixel [sr][sc].
    To perform a flood fill, consider the starting pixel, plus any pixels 
    connected 4-directionally to the starting pixel of the same color as the 
    starting pixel, plus any pixels connected 4-directionally to those 
    pixels (also with the same color), and so on. Replace the color of all 
    of the aforementioned pixels with color.
 */


public class FloodFill {

    // O(m*n)
    public void helper(int [][] image, int sr, int sc, int color, boolean vis[][], int orgCol){
        if(sr<0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol){
            return;
        }

        //left 
        helper(image, sr, sc-1, color, vis, orgCol);

        //right
        helper(image, sr, sc+1, color, vis, orgCol);

        //up
        helper(image, sr-1, sc, color, vis, orgCol);
        
        //down
        helper(image, sr+1, sc, color, vis, orgCol);
    }

    public int[][] floodFill(int [][] image, int sr, int sc, int color){
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }
    
    public static void main(String[] args) {
        
    }
}
