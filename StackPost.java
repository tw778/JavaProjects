/*
 * Travis White CIS 322
 *
 * This class creates implements a stack with a singly linked list. Nodes are prepended using push, and can be
 * deleted and returned with the pop method.
 *
 * HW2 Question 3.22
 */



class StackPost
{
    Node head;  // head of list


    /* Node Class */
    class Node
    {
        double data;
        Node next;

        // Constructor to create a new node
        Node(double d) {data = d; next = null; }
    }




    /* This function is in LinkedList class. Inserts a
    new Node at front of the list. This method is
    defined inside LinkedList class shown above */
 public void push(double new_data)
 {
     /* 1 & 2: Allocate the Node &
               Put in the data*/
     Node new_node = new Node(new_data);

     /* 3. Make next of new Node as head */
     new_node.next = head;

     /* 4. Move the head to point to new Node */
     head = new_node;
 }

 public Node stackPop() {
	 // Index will always equal 0 with a stack pop
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
 public static void printList(StackPost list)
 {
     Node currNode = list.head;

     // Traverse through the LinkedList
     while (currNode != null) {
         // Print the data at current node
         System.out.print(currNode.data + " ");

         // Go to next node
         currNode = currNode.next;
     }
 }

}
