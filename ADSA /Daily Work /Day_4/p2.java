package Day_4;
	//Circular QUEUE 
class CQueue {
	int size = 5 ;
	int CQ[] = new int [size];
	int front , rear ;
	
	CQueue(){
		front = -1 ; 
		rear = -1 ;
	}
	
	boolean isEmpty() {
		return(front == -1);
	}
	boolean isFull() {
		return((rear + 1)% size == front); // logic for circular queue 
	}
	void enqueue(int x) {
		if(isFull()) {
			System.out.println("Queue is Full ! ");
		}
		else {
			if (front == -1) {
				front = 0 ;//set front to 0 if queue is empty 
			}
			rear = (rear + 1)% size;
			CQ[rear]= x ;
			System.out.println(x+" Inserted ");
		}
		
	}
	
	int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty ! ");
			return -1 ;
		}
		else {
			int x = CQ[front];
			System.out.println(x+" Deleted");
			if(front == rear) {
				front = -1 ; 
				rear = -1  ; 
			}
			else {
				front= (front +1 )% size ;
			}
			return x ;
		}
		
	}	
	void display() {
		if(isEmpty()) {
			System.out.println("Empty Queue ! ");
		}
		else {
			System.out.println("Queue elements : ");
			int i = front ;
			do {
				System.out.print (CQ[i]+ " ");
				i = (i+1)% size ;
			}
			while(i != (rear + 1) % size); {
				// printing changes for circular queue
				//System.out.println(CQ[rear]);
			}
//			for(int i = front ; i <= rear ; i ++) {
//				System.out.print(Q[i]+" ");
//			}
			System.out.println();
		}
	}
}
	


public class p2 {
	public static void main(String args[]) {
		
		//System.out.println(show(2));
		CQueue q1 = new CQueue ();
		
		//Enqueue 
		q1.enqueue(11);
		q1.enqueue(12);
		q1.enqueue(13);
		q1.enqueue(14);
		q1.display();
		//Dequeue 
		q1.dequeue();
		q1.display();
		
//		q1.dequeue();
//		q1.display();
//		
//		q1.dequeue();
//		q1.display();
//
//		q1.dequeue();
//		q1.display();
//		
//		q1.dequeue();
//		q1.display();
	}
	
}
