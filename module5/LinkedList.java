/**
 * LinkedList Class
 */

public class LinkedList {
    
    private ListNode headNode = null;
    private static int totalNodes = 0;
    
    public LinkedList(ReadThis newData)
    {
        this(newData, null);
    }

    public LinkedList(ListNode newNode)
    {
      headNode = newNode;
      totalNodes++;
    }
    
    public LinkedList(ReadThis newData, ListNode newNext)
    {
      headNode = new ListNode(newData, newNext);
      totalNodes++;
    }
    
    
    public static void printNumNodes()
    {
        System.out.println(totalNodes + " have been created so far.");
    }
    
    
    // Prints the list from "this" node
    public void printListFromHere()
    {
        System.out.println("----------\nStart List\n----------");
        ListNode currNode = headNode;
        while (currNode != null)
        {
            System.out.println("\t" + currNode.getData());
            currNode = currNode.getNext();
        }
        System.out.println("----------\nEnd List\n----------");
    }
    
    
    
    // Add a node to the beginning of the list, assuming
    // "this" node is the beginning, and return the new
    // start of the list
    public ListNode addNodeToBeginning(ListNode newNode)
    {
      /* OLD ---------v
        newNode.next = this;
        return newNode;
        */
        newNode.setNext( headNode );
        this.headNode = newNode;
        return newNode;
    }
    
   
    // Add a node to the end of the list "this" belongs to
    public void addNodeToEnd(ListNode newNode)
    {
      /* OLD ---------v
        ListNode currNode = this;
        while (currNode.next != null)
        {
            currNode = currNode.next;
        }
        
        currNode.next = newNode;
        */
        ListNode currNode = headNode;
        while (currNode.getNext() != null)
        {
            currNode = currNode.getNext();
        }
        
        currNode.setNext( newNode );
    }
    
    
    // Add a node after a given node, starting the search
    // at "this"
    public void addNodeAfterNode(ListNode newNode, ListNode addAfter)
    {
        ListNode currNode = headNode;
            
        // Use short-circuiting: if currNode ends up being
        // null, the first part of the and expression will be
        // false and the second part will never get evaluated
        // (this avoids a null pointer exception)
        while (currNode != null &&
               !currNode.getData().equals(addAfter.getData()))
        {
            currNode = currNode.getNext();
        }
        
        // currNode will either be null if we got to the
        // end of the list without finding the node,
        // or the node we want to add the new one after
        /* OLD ---------v
        if (currNode != null)
        {
            newNode.next = currNode.next;
            currNode.next = newNode;
        }
        */
        if (currNode != null)
        {
            newNode.setNext( currNode.getNext() );
            currNode.setNext( newNode );
        }
    }
    
     
    // Remove the first node in the list, and return
    // the new head
    public ListNode removeFirstNode()
    {
        // We just need to cut out the head node,
        // making the second node in the list the head
        // (if there isn't one, that's ok, head will
        // just become null)
        headNode = headNode.getNext();
        return headNode.getNext();
    }
    
    
    // Remove the last node from the list, and return
    // the head in case it changes because the list
    // is now empty
    public ListNode removeLastNode()
    {
        // If there's only one item in the list,
        // the new list should be empty (i.e. head
        // is null)
        if (headNode.getNext() == null)
        {
            return null;
        }
        
        // Otherwise, find the last node to remove
        else
        {
            // First we have to actually find the end of the list,
            // but we also have to hang onto the node right before the
            // last one so we can update its next reference
            ListNode prevNode = null;
            ListNode currNode = headNode;
            while (currNode.getNext() != null)
            {
                prevNode = currNode;
                currNode = currNode.getNext();
            }
            
            // currNode is the last one in the list; now we can cut it out
            // using the previous node
            prevNode.setNext( null );
            
            // The head isn't changing in this case, so
            // just return this
            return headNode;
        }
    }
    
  
    
    // Remove the given node from the list, and return
    // the head in case it changes
    public ListNode removeNode(ListNode toRemove)
    { 
        // Check if the head is the one to remove;
        // if so, link it out by returning a new head
        // (which can be null)
        if (headNode.getData().equals(toRemove.getData()))
        {
            // headNode.setNext( null );
            headNode = headNode.getNext();
            return headNode.getNext();
        }
        
        // Otherwise, we can search the list for the
        // node to remove and link it out
        else
        {
            
            ListNode currNode = headNode;
            
            // Stop when the next node's data equals the data
            // we want to remove
            while (currNode.getNext() != null &&
                   !currNode.getNext().getData().equals(toRemove.getData()))
            {
                currNode = currNode.getNext();
            }
            
            // If currNode's next is null, then we never found the
            // node to remove
            if (currNode.getNext() != null)
            {
                currNode.setNext( currNode.getNext().getNext() );
            }
            
            // If we got this far, the head hasn't changed
            return headNode;
        }
    }
    
    
    // Get the length of the list, assuming "this" is 
    // the beginning
    public int getLength()
    {
        // To get the length, walk through the list one
        // node at a time, adding one for each node we
        // visit
        
        int length = 0;
        
        ListNode currNode = this.headNode;
        while (currNode != null)
        {
            length++;
            currNode = currNode.getNext();
        }
        
        return length;
    }

    public static void main(String[] args){

    // ReadThis initReadThisTest = new ReadThis("testing 1");
    ListNode test1 = new ListNode("testing 1");
    LinkedList list = new LinkedList( test1 );

    // --- TEST 1 --List it
    System.out.println("\nTEST 1 - List is made");
      list.printListFromHere();

    // --- TEST 2 - Add a node
    System.out.println("\nTEST 2 - Add a node at beginning");
      ListNode test2 = new ListNode("testing 2");
      list.addNodeToBeginning(test2);
      list.printListFromHere();

    // --- TEST 3 - Add a node
    System.out.println("\nTEST 3 - Add a node at end");
      ListNode test3 = new ListNode("testing 3");
      list.addNodeToEnd(test3);
      list.printListFromHere();

    // --- TEST 4 - Add a node after spec node
    System.out.println("\nTEST 4 - Add a node after spec node (4 after 2)");
      ListNode test4 = new ListNode("testing 4");
      list.addNodeAfterNode(test4, test2);
      list.printListFromHere();

    // --- TEST 5 - Remove the first node!
    System.out.println("\nTEST 5 - Remove first node");
      list.removeFirstNode();
      list.printListFromHere();

    // --- TEST 6 - Remove the last node!
    System.out.println("\nTEST 6 - Remove LAST node");
      list.removeLastNode();
      list.printListFromHere();
    
    // --- TEST 7 - Remove a specific node
    System.out.println("\nTEST 7 - Remove a specific node (1)");
      list.removeNode(test1);
      list.printListFromHere();

    // --- TEST 8 - Length?
    System.out.println("\nTEST 8 - Length: " + list.getLength());

  }
  

}
