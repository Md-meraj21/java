public class A {
    public static void BubbleSort(int number[]) {
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 0; j < number.length - 1 - i; j++) {
                if (number[j] > number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                }
            }
        }
        for(int k =0;k<number.length;k++) {
            System.out.print(number[k]+" ");
        }
        System.out.println();
    }

    // public static void printsum(int number[]) {
    //     for (int k = 0; k < number.length; k++) {
    //         System.out.print(number[k] + " ");

    //     }
    //     System.out.println();
    // }

    public static void main(String[] args) {
        int number[] = { 5, 8, 3, 4, 1 };
        System.out.print("Sorted array :  ");
        BubbleSort(number);
        // printsum(number);
    }
}
