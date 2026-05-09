import java.util.Arrays;
import java.util.Collections;

public class D {
    public static void main(String[] args) {
        Integer arr[] = {6,8,4,8,9,2,1,6};
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
// if we want to change Sorting Order With reverse to do , 
// first change Integer to int 
// then remove the Collections.rec=verseOrder()
// the Complete our Code Executions