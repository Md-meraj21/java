public class c {
    public static int BinarySearch(int[] number , int key) {
        int start = 0 , end = number.length-1;
        while (start<=end) {
            int mid = (start + end)/2; //Calculating mid
            if(number[mid]==key) { //mid
                return mid;
            }
            if(number[mid]<key) { //Right
                start = mid +1;
            }
            else { //left
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,7,8,9,10,12,14};
        int key = 9;
        System.out.println("The BinarySearch is : " + BinarySearch(number, key));
        
    }
}
