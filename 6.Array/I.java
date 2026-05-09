public class I {
    public static void KadansSum(int number[]) {
        int ms = Integer.MIN_VALUE;
        int CurrSum = 0;
        for(int i=0; i<number.length;i++) {
            CurrSum += number[i];
            if(CurrSum < 0) {
                CurrSum = 0;
            }
            ms = Math.max(CurrSum, ms);
        }
        System.out.println("The max Sum is : " +ms);
    }
    public static void main(String[] args) {
        int number[] = {-2,-3,4,-1,-2,1,5,-3};
        KadansSum(number);
    }
}
