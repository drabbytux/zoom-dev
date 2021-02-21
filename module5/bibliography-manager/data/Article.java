package data;
public class Article {

  // Article Variables
    private String title;
    private String author;
    private Issue issue;


  // Constructors
    public Article(String newTitle, String newAuthor){
      this(newTitle, newAuthor, null);
    }

    public Article(String newTitle, String newAuthor, Issue newIssue){
      title = newTitle;
      author = newAuthor;
      issue = newIssue;
    }

  // Get Methods
    public String getTitle(){
      return title;
    }

    public String getAuthor(){
      return author;
    }

    public Issue getIssue(){
      return issue;
    }
  
}
