class Node {
	int data;
	Node next;
	Node(int val) {
		this.data = val;
		this.next = null;
	}
}

class LinkedList {
	Node head;
	public void insert(int val) {
		Node newNode = new Node(val);

		if(head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		
	}
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();

	}
	
	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	
	public void insertAtPos(int pos, int data) {
		if(pos == 0){
			insertAtBeginning(data);
			return;
		}
		Node newNode = new Node(data);
		Node temp = head;
		for(int i=1; i<pos; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	public void updateAtPos(int pos, int data) {
		Node temp = head;
		if(pos == 0) {
			temp.data = data;
		}

		for(int i=0; i<pos; i++) {
			temp = temp.next;
		}
		temp.data = data;	
	}

	public void deleteAtPos(int pos) {
		Node temp = head;
		Node prev = null;
		if(pos == 0) {
			head = head.next;
			return;
		}
		for(int i=1; i<=pos; i++) {
			prev = temp;	
			temp = temp.next;
		}
		prev.next = temp.next;
	}

	public void reserve() {
		Node prev = null;
		Node temp = head;	// 10 20 30 next = 20, temp.next = null, prev = 10, 
		Node next = null;

		while(temp != null) {
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		head = prev;
	}		
}


public class demoLinkedList {
	
	public static void main(String args[]){
		LinkedList linked = new LinkedList();
		linked.insert(1);
		linked.insert(2);
		linked.insert(3);
		linked.display();
		linked.insertAtBeginning(5);
		System.out.println("After insert the value at beginning");
		linked.display();

		linked.insertAtPos(2,18);
		System.out.println("After insert the value at Pos");
		linked.display();


		linked.updateAtPos(3,17);
		System.out.println("After update the value at Pos");
		linked.display();

		linked.deleteAtPos(2);
		System.out.println("After delete the value at position");
		linked.display();

			
	}
}