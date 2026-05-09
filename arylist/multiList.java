import java.util.ArrayList;

public class multiList {
    // public static void main(String[] args) {
    // ArrayList<ArrayList<Integer>> main = new ArrayList<>();
    // ArrayList<Integer> list = new ArrayList<>();
    // list.add(2);
    // list.add(4);
    // main.add(list);

    // ArrayList<Integer> list2 = new ArrayList<>();
    // list2.add(5);
    // list2.add(8);
    // main.add(list2);
    // for(int i= 0; i<main.size();i++) {
    // ArrayList<Integer> Current = main.get(i);
    // for(int j = 0; j< Current.size();j++) {
    // System.out.print(Current.get(j) +" ");
    // }
    // System.out.println();
    // }
    // System.out.print(main);
    // }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i*1);
            list1.add(i*2);
            list2.add(i*3);
        }
        main.add(list);
        main.add(list1);
        main.add(list2);
        System.out.println(main);

        for(int i =0;i< main.size();i++) {
            ArrayList<Integer> curr = main.get(i);
            for(int j=0;j<curr.size();j++) {
                System.out.print(curr.get(j)+ " ");
            }
            System.out.println();
        }

    }
}
