package Day_4;
// Double ended QUEUE 
class DQueue {
    int size = 5;
    int DQ[] = new int[size];
    int front, rear;

    DQueue() {
        front = -1;
        rear = -1; // for insertion point of view 
    }

    boolean isEmpty() {
        return (front == -1);
    }

    boolean isFull() {
        // return((rear + 1)% size == front); // logic for circular queue
        return ((front == 0 && rear == size - 1) || front == rear + 1);
        // if front is in front and rear is at last then queue is full
        // 2 2 2 2 2 2 2
        // frt          rear 
        // this is eg 
    }

    void insertfront(int key) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = size - 1;
        } else {
            front = front - 1;
        }
        DQ[front] = key;
    }

    void insertrear(int key) {
        if (isFull()) {
            System.out.println("Full!");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == size - 1) {
            rear = 0;
        } else {
            rear = rear + 1;
        }
        DQ[rear] = key;
    }

    void deletefront() {
        if (isEmpty()) {
            System.out.println("Empty!");
            return;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front = front + 1;
        }
    }

    void deleterear() {
        if (isEmpty()) {
            System.out.println("Empty!");
            return;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear = rear - 1; // Corrected to decrement rear
        }
    }

    int getfront() {
        if (isEmpty()) {
            System.out.println("Empty!");
            return -1;
        }
        return DQ[front];
    }

    int getrear() {
        if (isEmpty() || rear < 0) {
            System.out.println("Empty!");
            return -1;
        }
        return DQ[rear];
    }

    void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is Full!");
        } else {
            if (front == -1) {
                front = 0; // set front to 0 if queue is empty 
            }
            rear = (rear + 1) % size;
            DQ[rear] = x;
            System.out.println(x + " Inserted");
        }
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        } else {
            int x = DQ[front];
            System.out.println(x + " Deleted");
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return x;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Empty Queue!");
        } else {
            System.out.println("Queue elements: ");
            int i = front;
            do {
                System.out.print(DQ[i] + " ");
                i = (i + 1) % size;
            } while (i != (rear + 1) % size);
            System.out.println();
        }
    }
}

public class p3 {
    public static void main(String args[]) {
        DQueue q1 = new DQueue();

        // Input sequence to demonstrate functionality
        q1.insertrear(10); 
        q1.insertrear(20); 
        q1.insertfront(5); 
        q1.insertrear(30); 
        q1.display();     

        q1.deletefront();  
        q1.display();      

        q1.insertfront(1); 
        q1.display();     

        q1.deleterear();  
        q1.display();      

        q1.insertrear(40); 
        q1.display();      

        q1.deletefront(); 
        q1.deletefront();  
        q1.display();      
    }
}
