public class OddEven {
    Node head;

    public class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void segregateEvenOdd() {
        Node end = head;
        Node perv = null;
        Node curr = head;

        while (end.next != null) {
            end = end.next;
        }
        Node new_end = end;
        while (curr.data % 2 == 0 && curr != end) {
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }

        head = curr;
        while (curr != end) {

            if (curr.data % 2 == 0) {
                prev.next = curr.next;
                curr.next = null;
                new_end.next = curr;
                new_end = curr;
                curr = prev.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        if (new_end != end && end.data % 2 != 0) {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }

    }

    public void push(int ele) {
        Node newnode = new Node(ele);
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
        OddEven o = new OddEven();
        o.push(11);
        o.push(10);
        o.push(8);
        o.push(6);
        o.push(4);
        o.push(2);
        o.push(0);

        System.out.println("Linked List");
        o.print();
        o.segregateEvenOdd();
        o.print();
    }
}
