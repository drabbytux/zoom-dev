public class InheritanceTest {
  


  public static void main(String[] args) {
      
    A a = new A(); a.print();
    B b = new B(); b.print();
    C c = new C(); c.print();
    D d = new D(); d.print();
    A ab = new B(); ab.print();
    A ac = new C(); ac.print();
    A ad = new D(); ad.print();
   // B ba = new A(); ba.print();
    B bc = new C(); bc.print();
    B bd = new D(); bd.print();


    //C ca = new A(); ca.print();
    //C cb = new B(); cb.print();
    C cd = new D(); cd.print();

  }
}
