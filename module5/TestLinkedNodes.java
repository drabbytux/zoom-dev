public class TestLinkedNodes {
  
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
    System.out.println("\nTEST 7 - Remove a specific node (4)");
      list.removeNode(test1);
      list.printListFromHere();

    // --- TEST 8 - Length?
    System.out.println("\nTEST 8 - Length: " + list.getLength());

  }
}
