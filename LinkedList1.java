package Java8Features.FunctionalInterfacePrac;

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
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedList1 {
	private Node head;
	
// add a node at the end of the list
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		} else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}	 
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
		Node current = head;
		Node prev = null;
		if(pos == 0) {
			head = head.next;
			return;	
		}

		for(int i=1; i<=pos; i++) {
			prev = current;
			current = current.next;
			if(current == null) {
				throw new IndexOutOfBoundsException("Invalid Pos " + pos);
			}
		}
		prev.next = current.next;
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
		if(head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
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
		temp.next = newNode;
	}

	public void update(int pos, int data) {
		Node temp = head;
		int count = 0;
		while(temp != null) {	
			if(count == pos) {
				temp.data = data;	
			}
		count++;
		temp = temp.next;
		}
		
	} 


	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next  = null;
		//System.out.println("current value : " +current.data);
		while(current != null) {
			next = current.next;
			current.next = prev;			
			prev = current;
			current = next;
			System.out.println("current value : " +current.data);
		}
		head = prev;
	}
}	