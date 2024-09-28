package Day_5;

class LinkedList2 {
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
        System.out.println(); // To move to a new line after printing
    }

    public void display() {
        Node n = head; 
        while (n != null) {
            System.out.print(n.data + "-->");
            n = n.next;
        }
        System.out.println("null"); // Indicate the end of the list
    }
}

public class p2 {
    public static void main(String[] args) {
        LinkedList2 l1 = new LinkedList2(); // Change to LinkedList2
        l1.head = new LinkedList2.Node(10);
        LinkedList2.Node second = new LinkedList2.Node(20);
        LinkedList2.Node third = new LinkedList2.Node(30);

        l1.head.next = second;
        second.next = third;

        l1.printList();  // Print the linked list
        l1.display();    // Display the linked list with arrows
    }
}
