import java.util.ArrayList;
public static void swap(ArrayList<Integer>list , int index1 , int index2) {
    int temp = list.get(index1);
    list.set(index1, list.get(index2));
    list.set(index2, temp);
}
public class Swapnum {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(4);
        list.add(5);

        int index1 = 1 , index2 = 2;
        System.out.print(list);
        swap(list, index1, index2);
        System.out.print(list);
    }
}
