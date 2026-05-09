public class b {
    public static void SelectionSort(int arr[]) {
        for(int i =0;i<arr.length-1;i++) {
            int minimum = i;
            for(int j=i+1;j<arr.length;j++) 
            {
                if(arr[minimum] > arr[j]) {
                    minimum = j;
                }
            }
            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;
        }
        for(int k =0;k<arr.length;k++) {
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,2,4,1,3};
        SelectionSort(arr);
    }
}
