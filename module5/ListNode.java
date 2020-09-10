/**
 * ListNode class
 */
public class ListNode {
  private ReadThis data;
  private ListNode next;

  public ListNode(String newDataForReadMe){
    this(new ReadThis(newDataForReadMe));
  }
  public ListNode(ReadThis newData){
    this(newData, null);
  }
  public ListNode(ReadThis newData, ListNode newNext){
    data = newData;
    next = newNext;
  }

  // New gets 
    public ReadThis getData(){
      return data;
    } 
    public ListNode getNext(){
      return next;
    }

  // New sets
    public void setData( ReadThis newData ){
      data = newData;
    } 
    public void setNext( ListNode newNextNode ){
      next = newNextNode;
    }


}