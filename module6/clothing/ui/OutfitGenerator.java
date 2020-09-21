package ui;
import java.util.ArrayList;
import coreclasses.*;
import classes.*;

public class OutfitGenerator {

  ArrayList<Wearable> outfit;
  ArrayList<Wearable> inventory;
  
  public OutfitGenerator(){
    this.outfit = new ArrayList<Wearable>();
    this.inventory = new ArrayList<Wearable>();
  }

  public void print(String str){
    System.out.println(str);
  }


  // ** Generate an inventory of items -----------------------
  public void generateSampleInventory(){

    // Shirts
      TShirt s1 = new TShirt("Super Fly T");
      TShirt s2 = new TShirt("Plain and Simple");
      CasualShirt s3 = new CasualShirt();
      CasualShirt s4 = new CasualShirt();
      DressShirt s5 = new DressShirt();
      DressShirt s6 = new DressShirt();
      SweaterShirt s7 = new SweaterShirt();
      SweaterShirt s8 = new SweaterShirt();

    // Pants
      Shorts p1 = new Shorts();
      Shorts p2 = new Shorts();
      Jeans p3 = new Jeans();
      Jeans p4 = new Jeans();
      DressPants p5 = new DressPants();
      DressPants p6 = new DressPants();


    // Add them into the inventory
      this.inventory.add( s1 );
  }
}

/**
 * 
 * 
 Belt
Hat
Jacket
Sunglasses
Tie
Boots
Overalls
Swimming Shorts
Scarf
Dinner Jacket
Shoes
Fleece
Briefs
Bra
Shorts
Socks
Cravat
Sarong
Polo Shirt
Knickers
Corset
Tracksuit
Waistcoat
Stockings
Cummerbund
Underwear
Blazer
Robe
Tankini
Poncho
Cargos
Swimwear
Lingerie
Jogging Suit
Coat
Nightgown
Slippers
Shawl
Gown
Jeans
Top
Sweatshirt
Boxers
Cufflinks
Camisole
Shirt
Tights
Kilt
Bikini
Cardigan
 */