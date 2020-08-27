public class TestPrivateRun {

  
  public static void main ( String[] args ) {
    


    TestPrivateA.updateType("toothbrush");


    TestPrivateA a = new TestPrivateA(4);
    TestPrivateB b = new TestPrivateB(7);
    
    a.setValue(b.setValue(a.getValue()));
    int c = 2*a.count + 3*b.count;
    System.out.println(c);
    System.out.println(c + b.setValue(b.getValue()));
    System.out.println(a.type);

  }

}