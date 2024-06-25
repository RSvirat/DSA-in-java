public class DemoCircularLinkedList {
	public static void main(String args[]) {
		CircularLinkedList list = new CircularLinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insertAtBeginning(4);		
		list.display();

		list.removeAtBeginning();
		System.out.println("After removing the value at the list");	
		list.display();

		list.removeAtEnd();
		System.out.println("After removing the value at the list End");	
		list.display();

		System.out.println("check contains value at the list End "+ list.contains(2));	
	
	}
}