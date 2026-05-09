public class Addidx {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;
    public static int Size; // To Found Size

    public void AddFirst(int data) {
        Node newNode = new Node(data);
        Size++; // Size ke lia
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        newNode.next = Head;
        Head = newNode;
    }

    public void AddLast(int data) {
        Node newNode = new Node(data);
        Size++; // Size ke lia
        if (Head == null) {
            Head = Tail = newNode;
        }
        Tail.next = newNode;
        Tail = newNode;
    }

    public void print() {
        if (Head == null) {
            System.out.print("ll is Empty");
            return;
        }
        Node temp = Head;

        while (temp != null) {
            System.out.print(temp.data + "->" + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int index, int data) {
        if (index == 0) {
            AddFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Size++; // Size ke lia
        Node temp = Head;
        int i = 0;
        while (i < (index - 1)) {
            temp = temp.next;
            i++;
        }
        // i = index -1; temp -> previous
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (Size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (Size == 1) {
            int val = Head.data;
            Head = Tail = null;
            Size = 0;
            return val;
        }
        int val = Head.data;
        Size--;
        Head = Head.next;
        return val;
    }

    public int RemoveLast() {
        if (Size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (Size == 1) {
            int val = Head.data;
            Head = Tail = null;
            Size = 0;
            return val;
        }
        Node prev = Head;
        for (int i = 0; i < Size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        Tail = prev;
        Size--;
        return val;

    }

    public int IteSearch(int key) {
        Node temp = Head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // If not Found
        return -1;
    }

    public static int helper(Node Head, int key) {
        if (Head == null) {
            return -1;
        }
        if (Head.data == key) {
            return 0;
        }
        int idx = helper(Head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public static int recSearch(int key) {
        return helper(Head, key);
    }

    public void Reverse() {
        Node prev = null;
        Node curr = Tail = Head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        Head = prev;

    }

    public void deleteNthFromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = Head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (sz == n) {
            Head = Head.next;
            return;

        }

        // sz -n
        int i = 1;
        int itoFind = sz - n;
        Node prev = Head;
        while (i < itoFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // CHeak if LinkedList is a Palandrome.

    // Write Slow Fast approach
    public Node Findmid(Node data) {
        Node slow = Head;
        Node Fast = Head;
        while (Fast != null && Fast.next != null) {
            slow = slow.next; // +1
            Fast = Fast.next.next;// +2
        }
        return slow;
    }

    public boolean CheakPalandrome() {
        // Base case
        if (Head == null || Head.next == null) {
            return true;
        }

        // Reverse 2nd Half
        Node prev = null;
        Node curr = Findmid(Head);
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = Head;
        while (right != null) {
            if (left.data != right.data) {
                return false;

            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    // Detect a loop in linkedList
    public static boolean IsCycle() {
        Node slow = Head;
        Node Fast = Head;
        while (Fast != null && Fast.next != null) {// Flloyed's CFA(Cycle Finding Algorithms)
            slow = slow.next;// +1
            Fast = Fast.next.next;// +2
            if (slow == Fast) {
                return true;// exits Cycle
            }
        }
        return false; // Doesnot Exist Cycle
    }

    // Remove a Cycle in a LinkedList
    public static void removeCycle() {
        // Detect Cycle
        Node slow = Head;
        Node fast = Head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        // Find Meeting point
        slow = Head;
        Node prev = null; // last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;

        }
        prev.next = null;

    }

    private Node getmid(Node Head) {
        Node slow = Head;
        Node fast = Head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // to get mid.
    }

    private Node merge(Node head1, Node head2) {
        Node mergell = new Node(-1); //Dummy Node.
        Node temp = mergell;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergell.next;
    }

    // MergeSort in LinkedList.
    public Node MergeSort(Node Head) {
        if (Head == null || Head.next == null) {
            return Head;
        }

        // find mid
        Node mid = getmid(Head);
        // left & Right Merge Sort
        Node RightHead = mid.next;
        mid.next = null;
        Node newleft = MergeSort(Head);
        Node newright = MergeSort(RightHead);

        return merge(newleft, newright);
    }

    //Zig-Zag 
    public void ZigZag() {
        //Find mid
        Node slow = Head;
        Node fast = Head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;


        //Reverse 2nd Half.
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
           next = curr.next;
           curr.next = prev;
           prev = curr;
            curr = next;
        }

        Node left = Head;
        Node right = prev;
        Node nextl , nextr;
        //Zig Zag Work
        while (left != null && right != null) {
            nextl = left.next;
            left.next = right;
            nextr = right.next;
            right.next = nextl;

            left = nextl;
            right = nextr;
        }
    }

    public static void main(String[] args) {
        Addidx ll = new Addidx();
        ll.AddLast(1);
        ll.AddLast(2);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.AddLast(5);
        // ll.print();
        // // System.out.println(("The Size of Whole Nodes -> "+ll.Size));
        // ll.removeFirst();
        // ll.print();
        // // System.out.println(("The Size of Whole Nodes -> "+ll.Size));
        // ll.RemoveLast();
        // ll.print();
        // // System.out.println(("The Size of Whole Nodes -> "+ll.Size));
        // // System.out.println(ll.recSearch(3));
        // ll.Reverse();
        // ll.print();
        // ll.deleteNthFromEnd(3);
        // ll.print();
        // System.out.println(ll.CheakPalandrome());

        // Head = new Node(1);
        // Node temp = new Node(2);
        // Head.next = temp;
        // Head.next.next = new Node(3);
        // Head.next.next.next = temp;
        // System.out.println(IsCycle());
        // removeCycle();
        // System.out.println(IsCycle());

        // ❤️ Merge Sort
        // System.out.println("Before Sort:");
        // ll.print();

        // ll.Head = ll.MergeSort(ll.Head);

        // System.out.println("After Sort:");
        // ll.print();

        // ❤️ Zig Zag
        ll.print();
        ll.ZigZag();
        ll.print();

    }
}
