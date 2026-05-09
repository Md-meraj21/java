// package Backtracking;

public class Onequeen {
    public static boolean issafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diogonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diogonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
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

    public static boolean nQueen(char board[][], int row) {
        // base case
        if (row == board.length) {
            printarr(board);
            count++;
            return true;
        }
        // loop for column
        for (int i = 0; i < board.length; i++) {
            if (issafe(board, row, i)) {
                board[row][i] = 'Q';
            }
            if (nQueen(board, row + 1)) {
                return true;
            }

        }
        return false;
    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        if (nQueen(board, 0)) {
            System.out.print("Solution is possible");
        } else {
            System.out.println("Solution is not possible");
        }

    }
}
