package ui;
import java.util.ArrayList;
import java.util.Random;
import coreclasses.*;
import classes.*;

public class OutfitGenerator {

  // ** A big variable lists ------------------
    ArrayList<Wearable> outfit;   // Outfit generated
    ArrayList<ArrayList> inventory;  // the entire inventory
  // Each list
    ArrayList<Shirt> shirts;
    ArrayList<Pants> pants;
    ArrayList<Outerwear> outerwear;
    ArrayList<Shoes> shoes;
    ArrayList<Accessory> accessories;


  
  public OutfitGenerator(){
    // Initialize our lists
      this.outfit = new ArrayList<Wearable>();
      this.inventory = new ArrayList<ArrayList>(); // Was Wearable
      
      this.shirts = new ArrayList<Shirt>();
      this.pants = new ArrayList<Pants>();
      this.outerwear = new ArrayList<Outerwear>();
      this.shoes = new ArrayList<Shoes>();
      this.accessories = new ArrayList<Accessory>();

  }

  // ** Quick Helper methods -----------------------------
    public void print(String str){
      System.out.println(str);
    }
    public void print(int i){
      System.out.println(i);
    }
    private String getClassName(Object c){
      return c.getClass().getSimpleName();
    }

    private int getRandomInt(int upper){
      Random intRandom = new Random(); //instance of random class
      return intRandom.nextInt(upper);
    }


  // ** Main functions --------------------------------------

    public void generateRandomOutfit(){
      Shirt randomShirt = shirts.get(getRandomInt( shirts.size() ) );
      Pants randomPants = pants.get(getRandomInt( pants.size() ) );
      
      System.out.print( randomShirt.getName() + " " + getClassName(randomShirt)  + "\n");
      System.out.print( randomPants.getName() + " " + getClassName(randomPants)  + "\n");
    }

  // ** Generate an inventory of items -----------------------
    public void generateSampleInventory(){
      // Shirts - - - - - - - - 
        TShirt s1 = new TShirt("Super Fly T");
        TShirt s2 = new TShirt("Plain and Simple");
        CasualShirt s3 = new CasualShirt("Moby Casual");
        CasualShirt s4 = new CasualShirt("Cripy Casual");
        DressShirt s5 = new DressShirt("White Dress");
        DressShirt s6 = new DressShirt("Flowers");
        SweaterShirt s7 = new SweaterShirt("Signiture Grey");
        SweaterShirt s8 = new SweaterShirt("Warm and cozy");
        
        // Add the shirts to the list
          this.shirts.add(s1);
          this.shirts.add(s2);
          this.shirts.add(s3);
          this.shirts.add(s4);
          this.shirts.add(s5);
          this.shirts.add(s6);
          this.shirts.add(s7);
          this.shirts.add(s8);

       
      // Pants - - - - - - - - 
        Shorts p1 = new Shorts("Very Short");
        Shorts p2 = new Shorts("Cargo");
        Jeans p3 = new Jeans("Tight Fit");
        Jeans p4 = new Jeans("Bootcut");
        DressPants p5 = new DressPants("Simply Black");
        DressPants p6 = new DressPants("Lowrise");

        // Add the pants to the list
         this.pants.add(p1);
         this.pants.add(p2);
         this.pants.add(p3);
         this.pants.add(p4);
         this.pants.add(p5);
         this.pants.add(p6);

      // Outerwear - - - - - - - - 
        RainJacket o1 = new RainJacket();
        RainJacket o2 = new RainJacket();
        Hoodie o3 = new Hoodie();
        Hoodie o4 = new Hoodie();
        WindBreaker o5 = new WindBreaker();
        WindBreaker o6 = new WindBreaker();

        // Add the outerwear to the list
          this.outerwear.add(o1);
          this.outerwear.add(o2);
          this.outerwear.add(o3);
          this.outerwear.add(o4);
          this.outerwear.add(o5);
          this.outerwear.add(o6);

      // Shoes - - - - - - - - 
        CasualShoes sh1 = new CasualShoes();
        CasualShoes sh2 = new CasualShoes();
        DressShoes sh3 = new DressShoes();
        DressShoes sh4 = new DressShoes();
        RunningShoes sh5 = new RunningShoes();
        RunningShoes sh6 = new RunningShoes();

        // Add the shoes to the list
          this.shoes.add(sh1);
          this.shoes.add(sh2);
          this.shoes.add(sh3);
          this.shoes.add(sh4);
          this.shoes.add(sh5);
          this.shoes.add(sh6);

      // Accessory - - - - - - - - 
        Tie a1 = new Tie();
        Tie a2 = new Tie();
        Watch a3 = new Watch();
        Watch a4 = new Watch();
        Sunglasses a5 = new Sunglasses();
        Sunglasses a6 = new Sunglasses();

        // Add the accessory to the list
          this.accessories.add(a1);
          this.accessories.add(a2);
          this.accessories.add(a3);
          this.accessories.add(a4);
          this.accessories.add(a5);
          this.accessories.add(a6);


      // Add them all to the inventory  - - - - - - - - 
        this.inventory.add(shirts);
        this.inventory.add( pants );
        this.inventory.add( outerwear );
        this.inventory.add( shoes );
        this.inventory.add( accessories );
        
    }
}
