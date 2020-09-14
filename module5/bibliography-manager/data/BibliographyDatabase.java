package data;
import java.util.ArrayList;
import java.util.HashMap;
public class BibliographyDatabase {
  
  // ** private variables - - - - - - - - - - - - - - 
    private ArrayList<Journal> journals = new ArrayList<Journal>();

  // ** Constructors - - - - - - - - - - - - - - 
    public BibliographyDatabase(ArrayList<Journal> newJournals){
      journals = newJournals;
    }

  // ** Private / helper methods - - - - - - - - - - - - - - - - 
    private void print(String toPrint){
      System.out.println( toPrint );
    }
    private void print(int toPrint){
      System.out.println( toPrint );
    }
    private void print(Integer toPrint){
      System.out.println( toPrint );
    }
    private ArrayList<Issue> getIssueList(String journalTitleSearchTerm ){
      ArrayList<Issue> rtnIssues = new ArrayList<Issue>();
      for( Journal j : journals ){
        if( j.getTitle() == journalTitleSearchTerm ){
          rtnIssues = j.getIssues();
        }
      }
      return rtnIssues;
    }
    private Journal getJournal(String journalTitleSearchTerm ){
      Journal rtnJournal = null;
      for( Journal j : journals ){
        if( j.getTitle() == journalTitleSearchTerm ){
          rtnJournal = j;
        }
      }
      return rtnJournal;
    }

  

  

  // ** Public Methods - - - - - - - - - - - - - - 
  // Users of the class should be able to add or remove a particular article, issue, or journal, and to add a list of journals.

    public void addArticleToIssue(Article newArticle, String journalSearchTerm, int yearSearch, int volumeSearch, int numberSearch){
      // System.out.println( getJournal( journalSearchTerm ).getTitle() );
      Issue issueToInsert = getJournal( journalSearchTerm ).getIssue(yearSearch, volumeSearch, numberSearch);
      if( issueToInsert != null ){
        issueToInsert.addArticle(newArticle);
      }
    }


    public void addIssueToJournal( Issue newIssue, String journalSearchTerm ){
      Journal currJournal = getJournal( journalSearchTerm );
      if( currJournal != null ){
        currJournal.addIssue( newIssue );
        newIssue.setJournal( currJournal );
      }
    }

    /**TODO vvvvvvvv      REMAINDER TO BE COMPLETE      vvvvvvvvvvvv */
    public void addJournalToList(Journal newJournal){

    }

    public void removeArticleFromIssue(Article newArticle, Issue currentIssue){

    }

    public void removeIssueFromJournal(Issue issue, Journal currentJournal){

    }

    public void removeJournalFromList(Journal newJournal){

    }
    /**TODO  ^^^^^^^^^^  REMAINDER TO BE COMPLETE   ^^^^^^^^^^^  */


    // OPTION 1 - getArticlesFromYear
    public String getArticlesFromYear(int year){
      String rtnString = "";
      for (Journal journal : journals) {
        for( Issue issue : journal.getIssues()){
          if( issue.getYear() == year ){
            if(issue.hasArticles()){
              for( Article article : issue.getArticles()){
                rtnString += "\t" + article.getAuthor() +
                ". " + article.getTitle() +
                ". " + journal.getTitle() + 
                ". " + issue.getYear() + 
                "\n";

              }
            }
          }
        }
      }
      return rtnString;
    }


    // OPTION 2 - 1 - getIssues
      public ArrayList<Issue> getAvailableIssuesArray(){
        ArrayList<Issue> issues = new ArrayList<Issue>();
        for (Journal journal : journals) {
          for(Issue issue : journal.getIssues()){
            issues.add(issue);
          }
        }
        return issues;
      }

      public void addArticleToIssue(String newTitle, String newAuthor, Issue issue){ 
        issue.addArticle( new Article(newTitle, newAuthor) );
      }


    // OPTION 3 - getMostPublishedAuthor 
      public String getMostPublishedAuthor(){
      String rtnString = "";
      String mostPublishedAuthor = null;
      int mostPublishedAuthorCount = 0;

      HashMap<String,Integer> authorMap = new HashMap<String,Integer>();
      
      for (Journal journal : journals) {
        for(Issue issue : journal.getIssues()){
          if(issue.hasArticles()){
            for(Article article : issue.getArticles()){
              
              if( ! authorMap.containsKey( article.getAuthor() ) ) {
                // no author yet, add them.
                  authorMap.put(article.getAuthor(), 1);
                  if( mostPublishedAuthor == null ){
                    mostPublishedAuthor = article.getAuthor();
                    mostPublishedAuthorCount = 1;
                  }
              } else {
                // increment the number of times it is seen in the hashmap
                  int tempAuthorCount = authorMap.get(article.getAuthor()) + 1;
                  authorMap.put(article.getAuthor(), tempAuthorCount);
                  if( mostPublishedAuthorCount < tempAuthorCount ){
                    mostPublishedAuthorCount++;
                    mostPublishedAuthor = article.getAuthor();
                  }
              }
            }
          }
        }
      }
      return mostPublishedAuthor;
    }

}
