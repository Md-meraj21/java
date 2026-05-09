import java.util.*;
public class A {
    public static int LinearSearch(int marks[], int key) {
        for(int i=1;i<=marks.length;i++) {
            if(marks[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("{2,5,6,7,34,46,51}");
        System.out.println("Here the Given number choose any Whose you want to search : ");

        Scanner c= new Scanner(System.in);
        int marks[] = {2,5,6,7,34,46,51};
        System.out.print("Enter key number : ");
        int key = c.nextInt();
        int index = LinearSearch(marks, key);
        if(index== -1) {
            System.out.print("Not found ");
        }
        else {
            System.out.print("The index is :"+index);
        }
        c.close();
    }
}
