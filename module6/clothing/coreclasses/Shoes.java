package coreclasses;
import interfaces.*;

public class Shoes extends Wearable  {
  
 String typeOfLace; // lace, velcro, snaps
  
 public Shoes(){
  // Empty
}

public Shoes(String nName){
  this.setName(nName);
}

// **  Boolean responders - - - - - - - - - - 
  public boolean isSeasonSpecific(){
    return seasonalWear != "all"; // returns false if its good for all seasons
  }
  public boolean isGoodForWinter(){
    return (seasonalWear == "winter" || seasonalWear == "all"); // returns false if its good for all seasons
  }
  public boolean isGoodWithDressShoes(){
    return this.isFormalWear();
  }
  public boolean isPlain(){
    return (getColourStyle() == "solid");
  }

// ** main functions - - - - - - - - - - - 


}
