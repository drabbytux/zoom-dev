package coreclasses;

public abstract class Wearable {
  
  
  // ** Variables - - - - - - - - - - - - - - - - - - - - - - - - - 
    protected String name, fabric, colour, colourStyle, seasonalWear;
    boolean formalWear;

  // ** Contructor Methods - - - - - - - - - - - - - - - - - - - - - - - - -
  public Wearable(){
  }
  public Wearable(String nName){
    name = nName;
  }

  // ** Get Methods - - - - - - - - - - - - - - - - - - - - - - - - - 
    public String getName(){
      return name;
    }
    public String getFabric(){
      return fabric;
    }
    public String getColour(){
      return colour;
    }
    public String getColourStyle(){
      return colourStyle;
    }
    public String getSeasonalWear(){
      return seasonalWear;
    }
    boolean isFormalWear(){
      return formalWear;
    }
    boolean isSeasonSpecific(){
      return seasonalWear != "all"; // returns false if its good for all seasons
    }


  // ** Set Methods - - - - - - - - - - - - - - - - - - - - - - - - - 
    public void setName(String nName){
      name = nName;
    }

    public void setFabric(String nFabric){
      fabric = nFabric;
    }
    public void setColour(String nColour){
      colour = nColour;
    }
    public void setColourStyle(String nColourStyle){
      colourStyle = nColourStyle;
    }
    public void setSeasonalWear(String nSeasonalWear){
      seasonalWear = nSeasonalWear;
    }
    public void setFormalWear(boolean nFormalWear){
      formalWear = nFormalWear;
    }





}
