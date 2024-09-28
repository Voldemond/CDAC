package Day_5;

class LinkedList1 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

public class p1 {
    public static void main(String args[]) {
        LinkedList1 l1 = new LinkedList1();
        l1.head = new LinkedList1.Node(10);
        LinkedList1.Node second = new LinkedList1.Node(20);
        LinkedList1.Node third = new LinkedList1.Node(30);

        l1.head.next = second;
        second.next = third;

        l1.printList();  // Optional: to print the linked list
    }
}
