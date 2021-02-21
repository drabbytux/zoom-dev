/**
 * 
 */
package data;
import java.util.ArrayList;

public class Journal {

  // Jounal Variables
    private String title;
    private ArrayList<Issue> issues;

  // ** Contructors - - - - - - - - - - - - - - 
    public Journal(){
      this(null);
    }
    public Journal(String newTitle){
      title = newTitle;
      issues = new ArrayList<Issue>();
    }
    public Journal(String newTitle, ArrayList<Issue> newIssues){
      title = newTitle;
      issues = new ArrayList<Issue>(newIssues);
    }

  // ** Public Methods - - - - - - - - - - - - - - 

    // getIssues() gets issues within a certain journal
      public ArrayList<Issue> getIssues(){
        return issues;
      }
      public String getTitle(){
        return title;
      }
      public Issue getIssue(int yearSearch, int volumeSearch, int numberSearch){
        Issue rtnIssue = null;
        for(Issue i : issues){
          if( i.getYear() == yearSearch && i.getVolume() == volumeSearch && i.getNumber() == numberSearch){
            rtnIssue = i;
            System.out.println("FOUND IT");
          }
        }
        return rtnIssue;
      }

      public void addIssue(Issue newIssue){
        issues.add(newIssue);
      }

    // getSampleJournals() returns back a Journal ArrayList
      public static ArrayList<Journal> getSampleJournals(){

      ArrayList<Journal> sampleJournals = new ArrayList<Journal>();

      // Create the Journal Objects
        Journal journal1 = new Journal("Journal of made up Science");
        Journal journal2 = new Journal("Journal of Modern Politics");

      // Create issues
        Issue issue1 = new Issue(2020, 2, 55, journal1);
        Issue issue2 = new Issue(2020, 2, 32, journal1);
        Issue issue3 = new Issue(2018, 1, 76, journal2);

      // Create Articles
        Article art1 = new Article("Amazing things with playdough", "Albert Finginns", issue1);
        Article art2 = new Article("Death of the Sun and goats", "Frugin Latouski", issue2);
        Article art3 = new Article("Ugh: A Political System", "Sen. Trooly Incap", issue3);
        Article art4 = new Article("Earth is dirt.", "Frugin Latouski", issue1);

      // Associate articles with issues
        issue1.addArticle( art1 );
        issue1.addArticle( art4 );
        issue2.addArticle( art2 );
        issue3.addArticle( art3 );
     
      // Associate issues with Journals
        journal1.issues.add(issue1);
        journal1.issues.add(issue2);
        journal2.issues.add(issue3);

      // Populate the journal list
        sampleJournals.add(journal1);
        sampleJournals.add(journal2);


      return sampleJournals;
    }
  
}
