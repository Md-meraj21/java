public static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    // Method to insert a new node at the beginning
    public void insertAtBeginning(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        System.out.println("Linked list after inserting elements at the beginning:");
        list.printList();
    }
}
