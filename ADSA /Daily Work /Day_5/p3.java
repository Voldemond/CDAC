package Day_5;

class LinkedList3 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node at the beginning of the list
    public void insert(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Method to print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); // To move to a new line after printing
    }

    // Method to display the list in "data-->next" format
    public void display() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "-->");
            n = n.next;
        }
        System.out.println("null"); // Indicate the end of the list
    }
}

public class p3 {
    public static void main(String args[]) {
        LinkedList3 l1 = new LinkedList3();
        l1.head = new LinkedList3.Node(10);
        LinkedList3.Node second = new LinkedList3.Node(20);
        LinkedList3.Node third = new LinkedList3.Node(30);

        l1.head.next = second;
        second.next = third;

        // Display the list
        l1.display();

        // Insert new nodes
        System.out.println();
        l1.insert(40);
        l1.insert(50);

        // Display the updated list
        l1.display();
    }
}
