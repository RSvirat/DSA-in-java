class ArrayStack{
	static final int MAX_SIZE = 30;
	int arr[] = new int[30];
	int top; // which using for store the value in arr;
	
	ArrayStack() {
		top = -1;
	} 

	void push(int val) {
		if(top == MAX_SIZE-1)
			throw new IndexOutOfBoundsException("Stack is Overflow");
		top = top + 1;
		arr[top] = val;
	}

	int pop(){
		if(top == -1)
			throw new IndexOutOfBoundsException("Stack is underflow");
		return arr[top--];
	}

	int peek() {
		return arr[top];
	}

}	

class StackUsingLinkedList {
	class Node{
		int data;
		Node next;
		Node(int val) {
			this.data = val;
			this.next = null;
		}
	}
	Node top;
	StackUsingLinkedList() {
		top = null;
	}
	void push(int val) {
		Node newNode = new Node(val);
		newNode.next = top;
		top = newNode;
	}

	int pop() {
		if(top == null) {
			throw new IndexOutOfBoundsException("Stack is Empty");
		}
		int result = top.data;
		top = top.next;
		return result;
	}

	int peek() {
		return top.data;
	}
		
}

public class demoStack {
	public static void main(String args[]) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println(stack.pop());
		System.out.println("After pop the value of stack");
		System.out.println(stack.peek());
	}
}