

public class Deletenode {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void SkipMdelN(Node head, int m, int n) {
        Node current = head;
        while (current != null) {
            for (int i = 1; i < m && current != null; i++) {
                current = current.next;
            }
            if (current == null || current.next == null) {
                break;
            }
            Node temp = current.next;
            for (int j = 0; j < n && temp != null; j++) {
                temp = temp.next;
            }
            current.next = temp;
            current = temp;
        }
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Deletenode d = new Deletenode();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        System.out.print("Original code  :-- ");
        d.print(head);
        d.SkipMdelN(head, 2, 2);
        System.out.print("After Deletion :-- ");
        d.print(head);

    }
}
