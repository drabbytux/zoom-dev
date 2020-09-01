public class LegoTestClass {
  

  public static void main( String[] args){

    // -+-+-+ TESTING for Lego HAT -+-+-+ 
    LegoHat hat = new LegoHat("baseball cap", 55);
    // System.out.println( hat.computeStyle("winter") );
    // System.out.println( hat.toString() );

    //  -+-+-+ TESTING for Lego ITEM -+-+-+ 
    LegoItem item1 = new LegoItem("staff", 4.2f);
    LegoItem item2 = new LegoItem("battle axe", 12.7f);
    // System.out.println( item1.toString() );

    // LegoMinifigure(String figureName, LegoHat figureHat, LegoItem itemInRightHand, LegoItem itemInLeftHand)
    //  -+-+-+ TESTING for Lego MINIFIGURE -+-+-+ 

    // TEST 1 - Just the main figure instantiation 
    LegoMinifigure theFigure = new LegoMinifigure("Scotty", hat, item1, item2);
    System.out.println("\n--- TEST 1 - SWAP Hands ---");
    System.out.println(theFigure.toString());
    theFigure.swapHands();
    System.out.println(theFigure.toString());

    // TEST 2 
    System.out.println("\n--- TEST 2 - Wear Hat ---");
    LegoHat toque = new LegoHat("toque", 50);
    theFigure.wearHat(toque);
    System.out.println(theFigure.toString());

    // TEST 3 
    System.out.println("\n--- TEST 3 - Place left hand ---");
    LegoItem coffecup = new LegoItem("Coffee Cup", 3.3f);
    theFigure.placeInLeftHand(coffecup);
    System.out.println(theFigure.toString());

    // TEST 4
    System.out.println("\n--- TEST 4 - Place NOTHING in left hand ---");
    theFigure.placeInLeftHand();
    System.out.println(theFigure.toString());

    // TEST 5 
    System.out.println("\n--- TEST 5 - Place RIGHT hand ---");
    LegoItem scotch = new LegoItem("Scotch", 4.3f);
    theFigure.placeInLeftHand(scotch);
    System.out.println(theFigure.toString());

    // TEST 6 
    System.out.println("\n--- TEST 6 - Place NOTHING in right hand ---");
    theFigure.placeInRightHand();
    System.out.println(theFigure.toString());
    
    // TEST 7 
    System.out.println("\n--- TEST 7 - Is it good? ---");
    if( theFigure.isGood("winter", 6.0f) ){
      System.out.println("It's good!");
    } else {
      System.out.println("It's NOT good :(");
    }

    // Extra TEST 8
    System.out.println("\n--- TEST 8 - no hat ---");
    theFigure.wearHat(); // Missing hat
    System.out.println(theFigure.toString());
    

  }


}