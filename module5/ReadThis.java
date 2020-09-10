/**
 * ReadThis class
 */
public class ReadThis
{
    private String url;
    private int currentPoints;
    
    public ReadThis(String newUrl)
    {
        url = newUrl;
        currentPoints = 0;
    }
    
    public String toString()
    {
        return url + " (" + currentPoints + ")";
    }

    // NEW gets
      public String getUrl(){
        return url;
      }
      public int getCurrentPoints(){
        return currentPoints;
      }

    // NEW sets
      public void setUrl( String newUrl ){
        url = newUrl;
      }
      public void setCurrentPoints(int newPoints){
        currentPoints = newPoints;
      }
}