package data;
import java.util.ArrayList;
public class Issue {

  private int year;
  private int volume;
  private int number;
  private ArrayList<Article> articles;
  private Journal journal;
 

  // Constructors
  public Issue(int newYear, int newVolume, int newNumber){
    year = newYear;
    volume = newVolume;
    number = newNumber;
    articles = new ArrayList<Article>();
    journal = new Journal();
  }

  public Issue(int newYear, int newVolume, int newNumber, Journal newJournal){
    year = newYear;
    volume = newVolume;
    number = newNumber;
    articles = new ArrayList<Article>();
    journal = newJournal;
  }

  public Issue(int newYear, int newVolume, int newNumber, ArrayList<Article> newArticle, Journal newJournal){
    year = newYear;
    volume = newVolume;
    number = newNumber;
    articles = newArticle;
    journal = newJournal;
  }

  // ** Public get methods - - - - - - - - - - - 
  public int getYear(){
    return year;
  }
  public int getVolume(){
    return volume;
  }
  public int getNumber(){
    return number;
  }
  public ArrayList<Article> getArticles(){
    return articles;
  }
  public Journal getJournal(){
    return journal;
  }

  public void setJournal( Journal newJournal ){
    journal = newJournal;
  }
  
  // ** Public confirm methods - - - - - - - - - - - 
  public boolean hasArticles(){
    if( articles != null && articles.size() > 0){
      return true;
    } else {
      return false;
    }
  }

  public void addArticle( Article newArticle ){
    articles.add( newArticle );
  }
  
}
