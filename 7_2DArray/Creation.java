import java.util.Scanner;

public class Creation {

    public static boolean search(int matrix[][], key){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mif (matrix[i][j] == key){
                    System.out.println("Found at " + i + j);
                    return true
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int [][] matrix = new int[3][3];
        int n = matrix.length; //For rows length
        int m = matrix[0].length; //For columns length

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //Output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }    
}
