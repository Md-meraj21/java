package Recursion;

public class LastOccur {
    public static int Last(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        int l = Last(arr, key, i+1);

        if(l == -1 && arr[i] == key) {
            return i;
        }
        return l;
    }
    public static void main(String[] args) {
        int arr[] = {5,5,5,5};
        System.out.println(Last(arr, 5, 0));
    }
}
