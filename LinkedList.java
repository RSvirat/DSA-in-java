public class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int val) {
			data = val;
			next = null;
		}
	}
	
	LinkedList() {
		head = null;
	}
	
	public void insertBeginning(int val) {
		Node newNode = new Node(val);

		//when list empty:-
		if(head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void display() {
		Node temp = head; //start from head
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next; //jump next node.
		}
	}
}
