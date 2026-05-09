// package Backtracking;

public class ChessBoard {
    public static boolean issafe(char board[][],int row , int col){
        //vertical up 
        for(int i=row-1;i>=0;i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        //diogonal left up
        for(int i = row-1,j=col-1;i>=0 && j>=0;i--,j--) {
            if(board[i][j]=='Q' ) {
                return false;
            }
        }
        //diogonal right up
        for(int i = row-1,j=col+1;i>=0 && j<board.length;i--,j++) {
            if(board[i][j]=='Q' ) {
                return false;
            }
        }
        return true;
    }
    public static void printarr(char board[][]) {
        System.out.println("~~~~~~~ChessBoard~~~~~~~~");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void nQueen(char board[][], int row) {
        // base case
        if (row == board.length) {
            printarr(board); 
            count++;
            return;
        }
        // loop for column
        for (int i = 0; i < board.length; i++) {
           if(issafe(board, row, i)) {
            board[row][i] = 'Q';
            nQueen(board, row+1);
            board[row][i] = 'x';
           }

        }
    }
    static int count =0;
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueen(board, 0);
        System.out.println("The number of how Queen place in there :- "+count);
    }
}
