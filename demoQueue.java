class QueueArrayList {
	static final int MAX_SIZE = 30;
	int a[];
	int front, rear;

	QueueArrayList() {
		this.a = new int[MAX_SIZE];
		this.front = -1;
		this.rear = -1;
	}

	public void enqueue(int val) {
		if(rear == MAX_SIZE - 1) {
			throw new IndexOutOfBoundsException("Queue is Overflow");
		}
		if(front == -1) {
			front = front + 1;
		}
		rear = rear+1;
		a[rear] = val;
	}

	public int dequeue() {
		if(front == MAX_SIZE - 1 || front>rear) {
			throw new IndexOutOfBoundsException("Queue is Overflow");
		}
		
		return a[front++]; 
	}
}

class QueueUsingLL {
	class Node{
		int data;
		Node next;
		Node(int val) {
			this.data = val;
			this.next = null;
		}
	}
	Node front, rear;
	QueueUsingLL() {
		this.front = null;
		this.rear = null;
	}
	
	public void enqueue(int val) {
		Node newNode = new Node(val);
		if(front == null) {
			front = newNode;
		} else {
			rear.next = newNode;
		}
		rear = newNode;		
	}
	public int dequeue() {
		if(front == null){
			throw new IndexOutOfBoundsException("Queue is empty");

		}
		int temp = front.data;
		front = front.next;
		if(front == null){
			rear = null;
		}
		return temp;
	}

	public boolean isEmpty() {
		return front == null;
	}
}
public class demoQueue {
	public static void main(String args[]) {
		QueueUsingLL q = new QueueUsingLL();

		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(5);
		q.enqueue(4);
		q.enqueue(8);

		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

		System.out.println(q.isEmpty());

	}
}