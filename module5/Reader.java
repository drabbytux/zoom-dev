/**
 * Reader Class
 * This class represents somebody that can take a book off a bookcase to read. A reader can have exactly one book in their possession at a time. After a reader takes a book, they should have a reference to the book, but the bookshelf should not. They can later put the book back on the shelf.
 * 
 */

public class Reader {
  
  private Book currentBook;

  public void borrowBook(Book book){
    if( book != null ) {
      if( currentBook == null){
        currentBook = book;
        System.out.println("You have borrowed " + currentBook.getTitle() + " by " + currentBook.getAuthor() + ". We hope you enjoy it.");
      } else {
        System.out.println("Sorry. You can't borrow more than one book at a time.");
      }
    }
  }

  public Book returnBook(){
    Book returnBook = currentBook;
    currentBook = null;
    return returnBook;
  }

}
