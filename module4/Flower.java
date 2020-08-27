/**
 * @file Flower.java
 * 
 * @author David Little
 * @since August 27, 2020
 * @version 1.0
 **/

public class Flower {

  String color;
  int height;
  float percentWater;

  public Flower(String newColor, int newHeight, float newPercentWater){
    this.color = newColor;
    this.height = newHeight;
    this.percentWater = newPercentWater;
  }

  public void print(){
    System.out.println(
      this.color  + " (" + this.height + " cm, " +
      this.percentWater +  "% water)" + "\n"
    );
  }

  public void grow(){
    this.height += 2;
    this.percentWater -= 0.05f;
  }

  public void water(){
    this.percentWater += 0.1f;
  }

  public static void main( String[] args ) {
    Flower f = new Flower("purple", 10, 0.5f);

    f.print();

    f.water();
    f.print();
  
    f.grow();
    f.print();  
  }
}
