import java.util.Scanner;

public class a {
    public static boolean Found(int matrix[][], int n) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == n) {
                    System.out.println("The number " + n + " is present at position (" + i + "," + j + ")");
                    return true;
                }
            }
            System.out.println();
        }
        return false;

    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int m = matrix.length, n = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        // For input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter the number to search for: ");
        int numberToSearch = sc.nextInt();
        Found(matrix, numberToSearch);
        sc.close();
    }

}
