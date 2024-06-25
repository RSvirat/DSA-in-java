class Node {
	int data;
	Node next;
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class CircularLinkedList {
	Node last;
	CircularLinkedList() {
		this.last = null;
	}

	// insert the value at the beginning
	public void insertAtBeginning(int val) {
		Node newNode = new Node(val);
		if(last == null) {
			newNode.next = newNode;
			last = newNode;
		} else {
			newNode.next = last.next;
			last.next = newNode;
		}
	}
		
	public void insertAtEnd(int val) {
		Node newNode = new Node(val);
		if(last == null) {
			newNode.next = newNode;
			last = newNode;
		} else {
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
		}
	}
	
	public void insert(int val) {
		Node newNode = new Node(val);
		
		if(last == null) {
			insertAtBeginning(val);
			return;
		} 
		Node temp = last.next;
		while(temp != last) {
			temp = temp.next;	
		}
		newNode.next = last.next;
		last.next = newNode;
		last = newNode;
	}

	
	public void removeAtBeginning() {
		if(last == null) 
			throw new IndexOutOfBoundsException("Deletion attempted on empty list");
		if(last.next == last) {
			last = null;
		} else {
			last.next = last.next.next;
		}
	}
	
	public void removeAtEnd() {
		if(last == null)
			throw new IndexOutOfBoundsException("Deletion attempted on empty list");
		if(last.next == last) {
			last = null;
		} else {
			Node temp = last;
			while(temp.next != last) {
				temp = temp.next;
			}
			temp.next = last.next;
			last = temp;
		}
	}

	public boolean contains(int key) {
		Node temp = last;
		do {
			if(temp.data == key) {
				return true;
			}
			temp = temp.next;
		}while(temp != last);
		return false;		
	}

	public void display() {
		if(last == null) 
			return;
		Node temp = last.next;
		while(temp != last) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

}