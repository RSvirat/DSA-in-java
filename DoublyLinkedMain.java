public class DoublyLinkedMain {
	public static void main(String args[]) {
		DoublyLinkedList1 list = new DoublyLinkedList1();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		//print the list

		System.out.println("Linked list:");
		list.printList();

//		list.remove(4);

//		System.out.println("After remove:");
//		list.printList();
	
//		System.out.println("Element at index 1: "+list.get(1));
		list.insertBeginning(5);

		System.out.println("After value insert in first position:");
		list.printList();

		list.insertAtPos(2, 5);
		System.out.println("After value insert in at position:");
		list.printList();

		list.removeAtPos(3);
		System.out.println("After remove at position:");
		list.printList();

//		list.update(4,2);
//		System.out.println("After update data at position:");
//		list.printList();

//		list.displayReverse();
//		System.out.println("After reverse:");
//		list.printList();
	}
}