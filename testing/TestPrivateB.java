public class TestPrivateB {

 private int value;
 public int count;
 
 public TestPrivateB(int v)
 {
   this.value = v;
   this.count = 0;
 }
 
 public int getValue()
 {
   count += 1;
   return value/2;
 }
 
 public int setValue(int v)
 {
   value = value + v;
   count +=2;
   return value;
 }
}