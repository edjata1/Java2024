// Singly Linked List class
public class SinglyLinkedList {

	// Global instance variable, head node holds complete list
	private static ListNode head;
	
	// List node method: this class contains data and next properties
	private static class ListNode {
		// Node data
		private int data;
		// Points to next node
		private ListNode next;
		
		// List node constructor for data input and pointer to next node default null value
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	// Display Method: displays singly linked list content
	public void display() {
		// Current head data
		ListNode current = head;
		// Loop over current's data
		while(current != null) {
			// Output each element in linked list on same line
			System.out.print(current.data + " --> ");
			// Move to next element in current's linked list
			current = current.next;
		}
		// Loop ends output null at end of linked list
		System.out.print("null");
	}
	
	// Length method: gets length of linked list
	public int length() {
		// Base case no elements in linked list
		if(head == null) {
			return 0;
		}
		int count = 0;
		ListNode current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	// Insert First method: insert new node at head
	public void insertFirst(int value) {
		// Adding new node at beginning of linked list
				ListNode newNode = new ListNode(value); // [newNode|1]-->[null]
				newNode.next = head; // [newNode|11|next]-->[head|null] both pointing to null
				head = newNode; // [head|11|pointer]-->[null]

	}
	
	// Insert last method: insert new node at end
	public void insertLast(int value) {
		// Create node object
		ListNode newNode = new ListNode(value);
		// Base case, head is null because head and end are same
		if(head == null) {
			// Assign newNode value to head 
			head = newNode;
			return;
		}
		// Gets head's list assigns it elements to current (not empty)
		ListNode current = head;
		// Loop over list
		while(null != current.next) {
			current = current.next;
			
		}
		// Insert element 
		current.next = newNode;
	}
	
	// Insert anywhere method: node at any given position, position goes 1 to linkedlist length
	public void insertAnywhere(int position, int value) {
		
		// Create node for value
		ListNode node = new ListNode(value);
		
		// Node|position 1 ->[value {8}| ]-->{null|pointer} head|->[ 10 | ]-->[ 1| ]-->{null|pointer}
		// Base case check if position = 1
		if(position == 1) {
			// [value {8}| ]-->[ 10 | ]-->[ 1| ]
			// Change node.next from pointing to -> null to pointing to -> head
			node.next = head;
			// Head|-> [8| ]-->[ 10 | ]-->[ 1| ]
			head = node;
		} else {
			ListNode previous = head;
			// Count to keep track of position and where to insert node
			int count = 1;
			while(count < position - 1) {
				// Assigns previous value from previous.next
				previous = previous.next;
				count++;
			}
			// Current is assigned to hold previous.next
			ListNode current = previous.next;
			// previous.next is assigned to hold node data
			previous.next = node;
			
			node.next = current;
		}	
	}
	
	// Delete method: removes 1st node
	public ListNode deleteFirst() {
		// Base case head null
		if(head == null) {
			return null;
		}
		
		// Temp assigned first node
		ListNode temp = head;
		// Head assigned rest of nodes
		head = head.next;
		// Splits temp node from list by setting next to null
		temp.next = null;
		
		// Returns the deleted node
		return temp;
	}
	
	// Delete last method: remove last node in linked list
	public ListNode deleteLast() {
		// Base case head or head.next is null return head
		if(head == null || head.next == null) {
			return head;
		}
		
		// Create variable for pointers 
		ListNode current = head;
		ListNode previous = null;
		
		// Loop over linked list
		while(current.next != null) {
			// Point to current
			previous = current;
			// Point to current.next
			current = current.next;
		}
		previous.next = null;
		return current;
	}
	
	// Delete method: delete any position
	public void delete(int position) {
		// Remove first position and assign head to next position  
		if(position == 1) {
			head = head.next;
		}
		// traverse to get to position 
		else {
			// Temp list to hold head
			ListNode previous = head;
			// Count to keep track of position
			int count = 1;
			// Loop (iterate) over linked list example count 3 < position 3 stop loop
			while(count < position - 1) {
				// Assigns previous the value of previous.next
				previous = previous.next;
				count++;
			}
			// Assigns current the values and remove position
			ListNode current = previous.next;
			previous.next = current.next;
		}
	}
	
	// Search key Method: searches for indicated number returns boolean value
	public boolean searchKey(int searchKey)
	{
		// Base case
		if(head == null) {
			return false;
		}
		
		ListNode current = head;
		
		// Loop over linked list
		while(current != null) {
			// search for key
			if(current.data == searchKey) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	
	// Main Method: executes program
	public static void main(String[] args) {

		 
		// Call class create object
		SinglyLinkedList sll = new SinglyLinkedList();
		
		// Add elements to each node
		sll.head = new ListNode(10);
		ListNode second  = new ListNode(1);
		ListNode third  = new ListNode(8);
		ListNode fourth  = new ListNode(11);

		// Link node together
		sll.head.next = second; // 10-->1
		second.next = third; // 10-->1-->8
		third.next = fourth; // 10-->1-->8-->11-->null
		
		// Display linked list
		sll.display();
		System.out.println();
		System.out.println("***********************************");
		System.out.println("Length: " + sll.length());
		System.out.println("Using head.next: ");
		System.out.println(sll.head.data);
		
		// insert new node at beginning
		System.out.print("Insert node at beginning: ");
		sll.insertFirst(421);
		sll.insertFirst(225);
		sll.insertFirst(-10);
		sll.insertFirst(121);
		sll.insertFirst(325);
		sll.insertFirst(-410);
		sll.display();
		
		System.out.println();
		
		// Insert new node at end
		System.out.print("Insert node at end: ");
		sll.insertLast(121);
		sll.display();
		
		System.out.println();
		
		// Insert anywhere
		System.out.print("Insert node anywhere: ");
		sll.insertAnywhere(4, 23);
		sll.display();
		
		System.out.println();
		
		// Delete first node
		System.out.print("Delete 1st node: ");
		sll.deleteFirst();
		sll.display();
		System.out.println();
		sll.deleteFirst();
		sll.display();
		
		System.out.println();
		
		// Delete first node
		System.out.print("Delete last node: ");
		System.out.println(sll.deleteLast().data);
		sll.deleteLast();
		sll.display();
		System.out.println();
		
		// Delete any position
		System.out.println();
		sll.delete(3);  
		sll.display();
		System.out.println();
		sll.delete(6); // Delete end
		sll.display();
		
		System.out.println();
		
		// SearchKey
		System.out.println(sll.searchKey(22));
		System.out.println(sll.searchKey(10));
		
		if(sll.searchKey(22)) {
			System.out.println("Found it!");
		}else {
			System.out.println("Nope, ain't find it!");
		}
		
		if(sll.searchKey(10)) {
			System.out.println("Yup, found it!");
		}else {
			System.out.println("Nope, ain't find it!");
		}
		System.out.println("*******************************");
		
		
		
		
	}

}
