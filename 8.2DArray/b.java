public class b {
    //O(n^2) Time Complexity
    public static int DiagonalSum(int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            for(int j= 0;j<arr[0].length;j++) {
                if(i==j) {
                    sum +=arr[i][j];
                }
                else if(i+j==arr.length-1) {
                    sum +=arr[i][j];
                }
            }
        }
        return sum;
    }
    //low time Complexity
    public static int Diagonal(int[][] arr) {
        int sum =0;
        for(int i=0;i<arr.length;i++) {
            sum+= arr[i][i];
            if(i != arr.length-i-1) {
                sum+= arr[i][arr.length-1-i];
            } 
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};
        System.out.println(Diagonal(arr));
    }
}
