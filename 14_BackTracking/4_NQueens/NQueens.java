public class NQueens { // O(n!)

    public static boolean isSafe(char board[][], int row, int col){

        // Verticle up
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // Diagonal left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // Diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void NQueens(char board[][], int row){
        // Base Case
        if(row == board.length){
            printBoard(board);
            count++;
            return;
        }
        // Column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                NQueens(board, row+1); // function call
                board[row][j] = 'x'; // backtracking step
            }
        }
    }
    
    // To check how many total combinations are there
    public static boolean NQueensExist(char board[][], int row){
        // Base Case
        if(row == board.length){
            printBoard(board);
            count++;
            return true;
        }
        // Column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(NQueensExist(board, row+1)){
                    return true;
                } // function call
                board[row][j] = 'x'; // backtracking step
            }
        }
        return false;
    }

    public static void printBoard(char board[][]){
        System.out.println("-------Chess Board-------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    static int count = 0; // For counting

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        // Initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'x';
            }
        }
        NQueens(board, 0);
        System.out.println("Total ways to solve NQueens: " + count);
        System.out.println("-------------------------------");
        System.out.println("Solution exist? -->" + NQueensExist(board, 0));
    }    
}
