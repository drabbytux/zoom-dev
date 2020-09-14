
public class StringedInstrument extends Instrument {
  
  private int numberOfStrings;
  protected boolean hasFrets = false;

  public int getNumberOfStrings(){
    return numberOfStrings;
  }
  public void setNumberOfStrings(int numStrings){
    numberOfStrings = numStrings;
  }

}
