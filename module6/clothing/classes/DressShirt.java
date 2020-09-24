package classes;
import coreclasses.*;
import interfaces.*;

public class DressShirt extends Shirt implements Size {
    // ** Constructors ------------------------------
    public DressShirt(){
    }
    public DressShirt(String nName){
      super.setName(nName);
    }
}
