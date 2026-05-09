public class AddFirstLast {
public static class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public static Node Head;
public static Node Tail;
public void AddFirst(int data) {
    //Create a New Node.
    Node newNode = new Node(data);
    //Basic 
    if(Head == null) {
        Head = Tail = newNode;
        return;
    }
    
    //Assign next in Head
    newNode.next = Head;
    //head - newNode
    Head = newNode;
}
public void AddLast(int data) {
    //Create a new Node.
    Node newNode = new Node(data);
    //Cheak 
    if (Head == null) {
        Head = Tail = newNode;
        return;
    }
    //Assign next in head.
    Tail.next = newNode;
    Tail = newNode;
}
public void print() {
    if(Head == null) {
        System.out.print("LL is Emppty");
        return;
    }
    Node temp = Head;
    while (temp != null) {
        System.out.println(temp.data+"->"+ " ");
        temp = temp.next;
    }
    System.out.println("Null");
}

    public static void main(String[] args) {
        AddFirstLast ll = new AddFirstLast();
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.print();
    }
}
