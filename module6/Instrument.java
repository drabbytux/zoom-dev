public class Instrument {
  protected int volume;
  protected char keyLowest;
  protected char keyHighest;

  public void setVolume(int v){
    if( v >= 11 ){
      System.out.println("You can't go past 10 in volume.");
    } else {
      volume = v;
      System.out.println("Your instrument is set to volume "+ v + " out of 10.");
    }
  }

}
