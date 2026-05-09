public class G {
    public static void MaxSubarray(int[] number) {
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
              int  CurrSum =0;
                for (int k = start; k <= end; k++) { ///print
                    CurrSum += number[k]; //Sumarray
                }
                System.out.println(CurrSum);
                if(maxsum < CurrSum) {
                    maxsum = CurrSum;
                }
            }
        }
        System.out.println("Max Sum is  : " + maxsum);
    }

    public static void main(String[] args) {
        int number[] = { 1,-2,6,-1,3};
        MaxSubarray(number);
    }
}
