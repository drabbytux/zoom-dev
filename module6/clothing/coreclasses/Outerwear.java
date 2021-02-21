package coreclasses;
import interfaces.*;

public class Outerwear extends Wearable  {
  
  int warmthLevel; // 0 comfortable, 5 hot

  public Outerwear(){
    // Empty
  }
  
  public Outerwear(String nName){
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
