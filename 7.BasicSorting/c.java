public class c {
    public static void InsetionSort(int[] arr) {
        for(int i = 1;i<arr.length;i++) {
            int current = arr[i];
            int previous = i-1;
            while (previous >=0 && arr[previous] > current) {
                arr[previous+1] = arr[previous];
                previous--;
                
            }
            arr[previous+1] = current;
        }
        for(int j=0;j<arr.length;j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println();    
    }
    public static void main(String[] args) {
        int arr[] = {5,6,3,7,1,4};
        InsetionSort(arr);
    }
}
