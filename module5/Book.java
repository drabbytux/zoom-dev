/**
 * Book Class
 */

public class Book {

  private String title;
  private String author;
  private String isbn;


  /* - - -  CONSTRUCTORS - - - */

    // A book placeholder
    public Book(){
      this(null,null,null);
    }
    // Just the book title
    public Book(String bookTitle){
      this(bookTitle, null, null);
    }
    // Just the book title and author
    public Book(String bookTitle, String bookAuthor){
      this(bookTitle, bookAuthor, null);
    }

    // The Whole thing
    public Book(String bookTitle, String bookAuthor, String bookISBN){
      title = bookTitle;
      author = bookAuthor;
      isbn = bookISBN;
    }

  /* - - - PUBLIC METHODS - - - */

    public String getTitle(){
      return title;
    }
    public String getAuthor(){
      return author;
    }

    public String getISBN(){
      return isbn;
    }
}
