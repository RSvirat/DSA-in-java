class ArrayStack{
	static final int MAX_SIZE = 30;
	int arr[] = new int[30];
	int top; // which using for store the value in arr;
	
	ArrayStack() {
		top = -1;
	} 

	void push(int val) {
		if(arr.length == MAX_SIZE)
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

public class demoStack {
	public static void main(String args[]) {
		ArrayStack stack = new ArrayStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println(stack.pop());
	}
}