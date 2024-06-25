/*
*create the node
*add the values
*remove
*remove the at position
*update value at position
*insert value at position
*insert value beginning
*display the value
*get the value
*/

class Node {
	int data;
	Node next;
	Node prev;
	Node(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

public class DoublyLinkedList1 {
	private Node head;
	private Node tail;
	
// add a node at the end of the list
	public void add(int data) {
		Node newNode = new Node(data);

		if(head == null) {
			head = newNode;
			tail = newNode;
		} else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			newNode.prev = current;
			current.next = newNode;
		}
		tail = newNode;	 
	}

	// remove a node by value
	public void remove(int data) {
		if(head == null) return;
		
		if(head.data == data) {
			head = head.next;
			return;
		}

		Node current = head;
		while(current.next != null && current.next.data != data) {
			current= current.next;
		}

		if(current.next != null) {
			current.next = current.next.next;
		}
	}

	// remove a node by at position
	public void removeAtPos(int pos) {
		Node temp = head;
		Node prev = null;
		if(pos == 0) {
			head = head.next;
			if(head == null){
				tail = null;
			} else {
				head.prev = null;
			}	 
			return;
		}

		for(int i=1; i<=pos; i++) {
			prev = temp;
			temp = temp.next;
			if(temp == null) {
				throw new IndexOutOfBoundsException("Invalid Pos " + pos);
			}
		}
		prev.next = temp.next;
		if(temp.next == null) {
			tail = prev;
		} else {
			temp.next.prev = prev;
		}
	}	
	
	// print the elements of the list
	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data+ " ");
			current = current.next;
		}
		System.out.println();
	}
	
	// Get the value at a specific position 
	public int get(int index) {
		Node current = head;
		int count = 0;
		while (current != null) {
			if(count == index) {
				return current.data;
			}
			count++;
			current = current.next;
		}
		 throw new IndexOutOfBoundsException("Index: " + index);
	}

	// value insert at first position
	public void insertBeginning(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		if(head == null) {
			tail = newNode;
		} else {
			head.prev = newNode;
		}
		head = newNode;
	}

	// value insert the position
	public void insertAtPos(int pos, int val) {
		if(pos == 0){
			insertBeginning(val);
			return;
		}
		Node newNode = new Node(val);
		Node temp = head;

		for(int i=1; i<pos; i++) {
			temp = temp.next;
			if(temp == null) {
				throw new IndexOutOfBoundsException("Invalid Pos " + pos);
			}
		}
		
		//reassign pointers
		newNode.next = temp.next;
		newNode.prev = temp;
		if(temp == tail) {
			tail = newNode;
		} else {
			temp.next.prev = newNode;
		}
		temp.next = newNode;
	}

	public void displayReverse() {
		if(head == null){
			System.out.println("List is empty");
		}
		Node temp = tail;
		while(temp != null) {
			System.out.print(temp.data+ " ");
			temp = temp.prev;
		}
	}

}	