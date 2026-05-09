package Backtracking;
public class Chess {

    // cheak the Queen sit in their right place
    public static boolean issafe(char board[][], int row, int col) {
        // verticle
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diogonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diogonal Right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    // print all possible number or Queen
    public static void printall(char board[][]) {
        System.out.println("**********ChessBoard**********");
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
            // print
            printall(board);
            count++;
            return;
        }
        // loop for column
        for (int j = 0; j < board.length; j++) {
            if (issafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueen(board, row + 1);
                board[row][j] = 'X';
                
            }
        }
    }
    static int count =0;
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nQueen(board, 0);
        System.out.println("The total Possibles standing in there "+count);
    }
}
