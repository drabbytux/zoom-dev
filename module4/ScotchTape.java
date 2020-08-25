/**
 * @file ScotchTape.java
 * 
 * @author David Little
 * @since August 25, 2020
 * @version 1.0
 **/

public class ScotchTape {
  String colour = new String();
  int weight;
  int length;

  public static void printTapeArray(ScotchTape[] tapeArray) {
    for (int i=0; i < tapeArray.length; i++){
      System.out.println(
        tapeArray[i].colour + " (" +
        tapeArray[i].length + " cm, " + 
        tapeArray[i].weight + " oz)" + "\n"
      );
    }
  }
  
  public static void stickTape(ScotchTape tape, double percentToUse)
  {
    tape.weight -= (int)(tape.weight * percentToUse);
    tape.length -= (int)(tape.length * percentToUse);
  }

}