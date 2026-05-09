
import java.util.Stack;

public class NextGreat {
    public static void main(String[] args) {
        int[] arr = { 6,2,0,2,7,9,8 };
        Stack<Integer> s = new Stack<>();
        int nxtgreater[] = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) { // Reverse
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nxtgreater[i] = -1;
            } else {
                nxtgreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        // print Solution
        for (int i = 0; i < nxtgreater.length; i++) {
            System.out.print(nxtgreater[i] + " ");
        }
        System.out.println();
    }
}
