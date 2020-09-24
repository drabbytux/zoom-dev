package coreclasses;
import interfaces.*;

public class Pants extends Wearable {
  
  String typeOfFastener;
  
  public Pants(){
    // Empty
  }
  
  public Pants(String nName){
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
  
}
