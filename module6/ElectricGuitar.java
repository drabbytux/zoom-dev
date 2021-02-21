public class ElectricGuitar extends Guitar {
  
  private int numberOfPickUps;

  // Overriding method, since guitars can get loud.
    public void setVolume(int v){
      //This one goes to 11!
      if( v >= 12){
        System.out.println("You can go to 11, but above cannot be done.");
      } else{
        volume = v;
        System.out.println(v + " is a very good volume for your electric guitar!");
      }
    }

}
