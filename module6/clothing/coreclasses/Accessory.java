package coreclasses;
import interfaces.*;

public class Accessory extends Wearable  {
  
  String typeOfFastener;
  
  public Accessory(){
    // Empty
  }
  
  public Accessory(String nName){
    this.setName(nName);
  }

}
