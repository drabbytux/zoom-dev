public class LegoItem {

  String name;
  float weight;

  LegoItem( String itemName, float itemWeight ){
    name = itemName;
    weight = itemWeight;
  }

  /**
   * public String toString(), which converts the item to an appropriate String. For example, if the name of the item is "sword" with weight 10 grams, then the method could return "a 10-gram sword".
   */

   public String toString(){
    return "a " + this.weight +  "-gram " + this.name;  
   }

   /**
    * public boolean isHeavy(float threshold), which returns true if the weight of the item exceeds the given threshold.
    */
    public boolean isHeavy(float threshold){
      if( this.weight > threshold ){
        return true;
      } else {
        return false;
      }
    }

}