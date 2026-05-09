public class F {
    public static void Subarray(int[] number) {
        int ts= 0;
        for(int i=0; i<number.length;i++) {
            int start = i;
            for(int j=i;j<number.length;j++) {
                int end = j;
                for(int k=start;k<=end;k++) {
                    System.out.print(number[k]+" ");
                    
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The Total number is : "+ts);
    }
    public static void main(String[] args) {
        int number[] = {3,5,7,8,9,12,32,14,33};
        Subarray(number);
    }
}
