import java.util.Stack;

public class MaxAreaHisto {
    public static void Histogram(int []arr) {
        int []nsl = new int[arr.length];
        int nsr[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        int maxarea  = 0;
        //Next Smaller Right(nsr) t/m= O(n)
        for (int i = arr.length-1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            }
            else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //Next Smaller Left(nsl)
         for (int i =0 ; i <arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            }
            else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //Current Area
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int currentArea = height * width;
            maxarea = Math.max(maxarea, currentArea);
        }
        System.out.println("Max Area in Histogram  = "  + maxarea);
    }
    public static void main(String[] args) {
        int [] arr = {2,1,5,6,2,3};
        Histogram(arr);

    }
}
