/**
 * @file TestingScotchTape.java
 * 
 * @author David Little
 * @since August 25, 2020
 * @version 1.0
 **/

 public class TestingScotchTape {

  public static void main( String[] args ) {
    final int NUM_TAPES = 3;
    ScotchTape tapes[] = new ScotchTape[NUM_TAPES];
    
    tapes[0] = new ScotchTape();
    tapes[0].colour = "clear";
    tapes[0].length = 3;
    tapes[0].weight = 22;

    tapes[1] = new ScotchTape();
    tapes[1].colour = "green";
    tapes[1].length = 1;
    tapes[1].weight = 15;

    tapes[2] = new ScotchTape();
    tapes[2].colour = "blue";
    tapes[2].length = 2;
    tapes[2].weight = 19;

    ScotchTape.printTapeArray(tapes);
    
    ScotchTape.stickTape(tapes[0], 0.5);
    ScotchTape.stickTape(tapes[1], 0.3);
    ScotchTape.stickTape(tapes[2], 0.9);

    System.out.println("\n");
    ScotchTape.printTapeArray(tapes);

  }

  
}