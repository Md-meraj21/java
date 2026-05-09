package Recursion;

public class Occurence {
    public static int Occure(int arr[],int key,int n) {
        if(n==arr.length-1) {
            return -1;
        }
        else if(arr[n] == key) {
            return n;
        }
        else {
            return Occure(arr, key, n+1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,6,7,3,9};
        System.out.println(Occure(arr, 7, 00));
    }
}
