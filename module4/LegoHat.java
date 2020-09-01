import java.util.List;
import java.util.Arrays;

public class LegoHat {
  
  public String style;
  public int size;

  LegoHat(String hatStyle, int hatSize ){
    style = hatStyle;
    size = hatSize;
  }

  /*
  public String toString(), which converts the hat to an appropriate String. For example, if the style is "toque" and the size is "medium", then the method could return "a medium toque".
  */
  public String toString(){
    return "a " + toStringSize() +  " sized " + this.style ;  
  }

  /**
   * computeStyle returns an in based on a scale of 1 (completely ugly) to 10 (completely perfect)
   * @param season
   * @return integer styleInt
   */
  public int computeStyle(String season){
    int styleNum = 5;

    String summerHats[] = {"sun visor","baseball cap","flat cap"};
    String winterHats[] = {"toque","bomber","Russion ushanka"};

    List<String> summerList = Arrays.asList(summerHats);
    List<String> winterList = Arrays.asList(winterHats);
    
    // Make them perfect 10 if they are for the season, reduce 2 points if not... They're still somewhat stylish.
    if( season == "winter"){
      if(summerList.contains(style)){
        styleNum -= 2;
      }
      if(winterList.contains(style)){
        styleNum += 5;
      }
    } else if ( season == "summer"){
      if(summerList.contains(style)){
        styleNum += 5;
      }
      if(winterList.contains(style)){
        styleNum -= 2;
      }
    }

    return styleNum;
  }

  /**
   * toStringSize returns the small/medium/large string depending on hat size
   */
  private String toStringSize(){
    if( size < 55 ){
      return "small";
    } else if( size >= 55 && size <= 57){
      return "medium";
    } else {
      return "large";
    }
  }

} 