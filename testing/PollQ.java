public class PollQ
{
  public static void main(String[] args)
  {
    ListNode n1 = new ListNode(new ReadThis("URL-1"));
    // n1.ReadThis("URL-1")

    n1.next = new ListNode(new ReadThis("URL-2"));
    // n1.ReadThis("URL-1")
    // n1.next("URL-2")

    n1.next.next = new ListNode(new ReadThis("URL-3"));
    // n1.ReadThis("URL-1")
    // n1.next("URL-2")
    // n1.next.next("URL-3")
 
    ListNode newList = new ListNode(n1.data);
    newList.next = new ListNode(n1.data);
 
    newList.next.data.url += "-!!";
 
    System.out.println(n1.data.url);
  }
}