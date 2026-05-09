public class B {
    public static int Largestnumber(int[] number) {
        int large = Integer.MIN_VALUE; //-infinity
        int Smallest = Integer.MAX_VALUE;//+infinity
        for(int i =0; i < number.length;i++) {
            if(large < number[i]) {
                large = number[i];
            }
            if(Smallest > number[i]) {
                Smallest = number[i];
            }
        }
        System.out.println("The smallest number is : "+Smallest);
        return large;
    }
    public static void main(String[] args) {
        int number[] = { 2,8,12,7,1};
        System.out.println("The Large number is : "+Largestnumber(number));
    }
}
