import java.util.*;


public class AscendAndDecend {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(8);
        System.out.println(list);
        Collections.sort(list); //Ascending Order
        System.out.println(list);
        Collections.reverse(list); //Deacending Order
        System.out.println(list);
    }
}
