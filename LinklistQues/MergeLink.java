public class MergeLink {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    public Node Merge(Node Head1 , Node Head2) {
        while (Head2 != null) {
            Node temp = Head1;
            while (temp != null) {
                if (temp == Head2) {
                    return temp;
                }
                temp = temp.next;
            }
            Head2 = Head2.next;
        }
        return null;
    }
    public static void main(String[] args) {
        MergeLink l = new MergeLink();
        Node head1, head2;
        head1 = new Node(10); //1
        head2 = new Node(3); //2

        Node newNode = new Node(6);
        head2.next = newNode; //22
        
        newNode = new Node(9);
        head2.next.next = newNode; //22

        newNode = new Node(15);
        head1.next = newNode; //11
        head2.next.next.next = newNode; //222

        newNode = new Node(30);
        head1.next.next = newNode;

        head1.next.next.next = null;

        Node intersectionpiont = l.Merge(head1, head2);
        if (intersectionpiont == null) {
            System.out.println("No Intersection Point ");

        }
        else{
            System.out.println(" InterSection Point " + intersectionpiont.data);
        }




    }
    
}
