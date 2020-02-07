

/*
 * Travis White CIS 322
 * HW 2 Question 3.32
 *
 * This class creates implements a queue with a singly linked list. Nodes are appended using push, and can be
 * deleted and returned with the pop method.
 *
 *
 */



class LinkedListQueue
{
    Node head;  // head of list
    Node tail;

    // Node class
    class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {data = d; next = null; }
    }


    /* This function is in LinkedList class. Inserts a
    new Node at back of the list. This method is
    defined inside LinkedList class shown above */
    public void addNode(int val){
		if(head==null){
			Node temp = new Node(val);
			head = temp;
			tail = temp;
		}else{
			tail.next = new Node(val);
			tail = tail.next;
		}
	}


 public Node stackPop() {
	 // Index will always equal 0 with a stack pop
	// This is a modified remove() function
	int index = 0;
	Node temp = head;
     if (index == 0) {
         // removing the first element must be handled specially
         head = head.next;
     } else {
         // removing some element further down in the list;
         // traverse to the node before the one we want to remove
         Node current = head;
         for (int i = 0; i < index - 1; i++) {
             current = current.next;
         }

         // change its next pointer to skip past the offending node
         current.next = current.next.next;
     }
     return temp;
 }

//Method to print the LinkedList.
 public static void printList(LinkedListQueue list)
 {
     Node currNode = list.head;

     System.out.print("LinkedList: ");

     // Traverse through the LinkedList
     while (currNode != null) {
         // Print the data at current node
         System.out.print(currNode.data + " ");

         // Go to next node
         currNode = currNode.next;
     }
 }

public static void main(String [] args) {


	LinkedListQueue queueList = new LinkedListQueue();

	queueList.addNode(15);
	queueList.addNode(20);
	queueList.addNode(25);


	System.out.println("Value popped: " + queueList.stackPop().data);

	printList(queueList);


}

}