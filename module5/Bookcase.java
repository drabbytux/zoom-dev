
/**
 * Bookcase class
 * 
 * A bookcase should be able to hold up to 10 books on each of 5 distinct shelves. A book can be added or removed from the shelf it is on. If removed, a reference to the book should be provided to whoever was asking to remove it.
 */

public class Bookcase {

  private final int TOTAL_SHELVES = 5;
  private final int TOTAL_BOOKS_ON_SHELF = 10;
  private Book [][] shelfPosition = new Book[ TOTAL_SHELVES ][ TOTAL_BOOKS_ON_SHELF ];

  Bookcase(){
    // default - nothing really happens when a bookcase is made. Its just there!
  }

  public boolean addNewBook(Book newBook){
    if( this.placeBookOnShelf( newBook ) ) {
      return true;
    } else {
      System.out.println("WARNING: The Bookcase is full and your new book won't fit.");
      return false;
    }
  }

  /**
   * getBook retrieves a book from the shelf by title
   * @param bookTitle
   * @return
   */
  public Book getBook(String bookTitle){
    // Search for the title in current books
    int shelf=0;
    Book returnBook = null;
    while( shelf < TOTAL_SHELVES ){
      int spot=0;
      while(spot < TOTAL_BOOKS_ON_SHELF){
        if( shelfPosition[shelf][spot] != null ){
          if( shelfPosition[shelf][spot].getTitle() == bookTitle){
            returnBook = shelfPosition[shelf][spot];
            shelfPosition[shelf][spot] = null; // removes it from the shelf entirly
            spot=TOTAL_BOOKS_ON_SHELF;
          }
        }
        spot++;
      }
      shelf++;
    }
    if( returnBook == null ){
      System.out.println("The book titled '" + bookTitle + "' is not currently available on the shelf.");
    }
    return returnBook;
  }

  public boolean setBook( Book book){
    // put the book back
    if( this.placeBookOnShelf(book) ){
      System.out.println("The book titled '" + book.getTitle() + "' was successfully returned");
      return true;
    } else {
      return false;
    }
    
  }

  private boolean placeBookOnShelf( Book booktoPlace ){
    int shelf=0;
    Book returnBook = null;
    while( shelf < TOTAL_SHELVES ){
      int spot=0;
      while(spot < TOTAL_BOOKS_ON_SHELF){
        if( shelfPosition[shelf][spot] == null ){
          shelfPosition[shelf][spot] = booktoPlace;
          spot=TOTAL_BOOKS_ON_SHELF;
          shelf=TOTAL_SHELVES;
          return true;
        }
        spot++;
      }
      shelf++;
    }
    return false;
  }


  

}
