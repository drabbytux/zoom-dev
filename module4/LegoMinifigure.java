public class LegoMinifigure {

  String name;
  LegoHat hat;
  LegoItem rightHand, leftHand;

  LegoMinifigure(String figureName, LegoHat figureHat, LegoItem itemInRightHand, LegoItem itemInLeftHand){
    name = figureName;
    hat = figureHat;
    rightHand = itemInRightHand;
    leftHand = itemInLeftHand;
  }

  public String toString(){
    String returnStr = "";
    String strMultiple = "";
    boolean holdingOrWearingSomething = (hat != null || rightHand != null || leftHand != null) ? true: false;

    returnStr = "A Lego minifigure named " + this.name;
    returnStr +=  ( holdingOrWearingSomething) ? ", who is" : ".";

    if( hat != null) { 
      returnStr +=  " wearing "+ hat.toString();
      strMultiple = " and is";
    }
    returnStr += (rightHand != null)? strMultiple + " holding " + rightHand.toString() + " in the right hand" : "";
    returnStr += (leftHand != null)? strMultiple + " holding " + leftHand.toString() + " in the left hand" : "";
    returnStr += (holdingOrWearingSomething)? "." : "";

    return returnStr;
  }

  public void swapHands(){
    LegoItem tempItem = rightHand;
    rightHand = leftHand;
    leftHand = tempItem;
   }

  public void wearHat(LegoHat figureHat){
    hat = figureHat;
  }
  public void wearHat(){
    hat = null;
  }
  public void placeInLeftHand(LegoItem figureItem){
    leftHand = figureItem;
  }
  public void placeInLeftHand(){
    leftHand = null;
  }
  public void placeInRightHand(LegoItem figureItem){
    rightHand = figureItem;
  }
  public void placeInRightHand(){
    rightHand = null;
  }

  public boolean isGood(String season, float threshold){
    System.out.println("Hat style: "+ hat.computeStyle(season));
    System.out.println("Threshold: "+ threshold);
    if( hat != null && hat.computeStyle(season) >= threshold ){
      System.out.println("Hat style is good.");
      // OK - passed - we have a nice hat on... How about items?
      if( (rightHand != null && rightHand.isHeavy(threshold)) || ( leftHand != null && leftHand.isHeavy(threshold) ) ){
        // one of more items were too heavy - sorry!
        return false;
      } else {
        return true;
      }
    } else {
      System.out.println("Hat style is bad.");
      return false;
    }
  }


}