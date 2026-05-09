public class Swaptwo {
    Node head;
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void swaping(int x, int y) {
        
        if (x==y) {
            return;
        }
        Node prevx = null;
        Node currx = head;
        while (currx != null && currx.data != x) {
            prevx = currx;
            currx = currx.next;
        }
        Node prevy = null;
        Node curry = head;
        while (curry != null && curry.data != y) {
            prevy = curry;
            curry = curry.next;
        }
        if (currx == curry) {
            return;
        }
        if (prevx != null) {
            prevx.next = curry;
        }
        else {
            head = curry;
        }
        if (prevy != null) {
            prevy.next = currx;

        }
        else{
            head = currx;
        }
        //Swaping part
        Node temp = currx.next;
        currx.next = curry.next;
        curry.next = temp;

        
    }
    public void push(int new_data) {
        
        Node newnode = new Node(new_data);
        newnode.next = head;
        head = newnode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Swaptwo s = new Swaptwo();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.print("Before Swapping :-- ");
        s.print();
        s.swaping(2, 4);
        System.out.print("After Swapping :-- ");
        s.print();
    }
}
