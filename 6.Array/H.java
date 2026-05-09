public class H {
    public static void PrifixSum(int[] number) {
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int [number.length];
        prefix[0]=number[0];
        for(int i=1;i<prefix.length;i++) {
            prefix[i]= prefix[i-1] +number[i];
        }
        for(int j=0;j<number.length;j++) {
            int start = j;
            for(int k=0; k<number.length;k++) {
                int end = k;
                int CurrSum= start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxsum < CurrSum) {
                    maxsum = CurrSum;
                }
            }
        }
        System.out.println("The max Sum is : "+ maxsum);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        PrifixSum(number);

    }
}
