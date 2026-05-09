package Recursion;

public class Cheak {
    public static Boolean Shorted(int arr[],int i) {
        if(i==arr.length-1) {
            return true;
        }
        else if(arr[i]>arr[i+1]) {
            return false;
        }
        else {
           return Shorted(arr, i+1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        System.out.println(Shorted(arr, 0));
    }
}
