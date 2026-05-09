package Backtracking;
public class Gridways {
    public static int grid(int i , int j , int n,int m) {
        //base case
        if(i==n-1 && j==m-1) {
            return 1;
        }
        else if(i==n||j==n) {
            return 0;
        }
        int st = grid(i+1, j, n, m);
        int se = grid(i, j+1, n, m);
        return st+se;
    }
    public static void main(String[] args) {
        int n=3;
        int m = 3;
        System.out.print("The total grid are possible 3*3 :- "+grid(0, 0, n, m));
    }
}