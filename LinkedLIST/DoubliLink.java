public class DoubliLink {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node Head;
    public static Node Tail;
    public static int Size;

    public void Addfirst(int data) {
        Node newnode = new Node(data);
        Size++;
        if (Head == null) {
            Head = Tail = newnode;
            return;
        }
        newnode.next = Head;
        Head.prev = newnode;
        Head = newnode;

    }

    public void AddLast(int data) {
        Node newnode = new Node(data);
        Size++;
        if (Head == null) {
            Head = Tail = newnode;
            return;
        }
        Tail.next = newnode;
        newnode.prev = Tail;
        Tail = newnode;

    }

    public void Print() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (Head == null) {
            System.out.print("Dll is Empty");
            return Integer.MIN_VALUE;
        }
        if (Size == 1) {
            int val = Head.data;
            Head = Tail = null;
            Size =0;
            return val;
        }
        int val = Head.data;
        Head = Head.next;
        Head.prev = null;
        Size--;
        return val;

    }

    public int removelast() {
        if (Head == null) {
            System.out.println("Dll is Empty");
            return Integer.MIN_VALUE;
        }
        if(Size == 1) {
            int val = Tail.data;
            Head = Tail = null;
            Size =0;
            return val;
        }
        int val = Tail.data;
        Tail = Tail.prev;
        Tail.next = null;
        return val;
    }

    public void reverse() {
        Node curr = Head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        Head = prev;
    }

    public static void main(String args[]) {
        DoubliLink Dll = new DoubliLink();
        Dll.Addfirst(1);
        Dll.Addfirst(2);
        Dll.Addfirst(3);
        Dll.AddLast(4);
        Dll.AddLast(5);
        Dll.Print();
        Dll.reverse();
        // Dll.removeFirst();
        Dll.Print();
        // Dll.removelast();
        // Dll.Print();
        

    }
}
