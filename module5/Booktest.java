public class Booktest {
  
  public static void main(String[] args){
    System.out.println("ok, let's begin.");

    // Create our bookcase
      Bookcase bookcase = new Bookcase();

    // Here is our Reader!
      Reader john = new Reader();

    // Add some decent books to the bookcase
      bookcase.addNewBook(new Book("A Girl Is A Body Of Water", "Jennifer Nansubuga Makumbi", "0-85131-041-9	"));
      bookcase.addNewBook(new Book("Bread Alone","Judith Ryan Hendricks"));
      bookcase.addNewBook(new Book("A Good Hard Look"));
      bookcase.addNewBook(new Book("The Overstory","Richard Powers","0-34153-021-9"));
      bookcase.addNewBook(new Book("The Vanishing Half","Brit Bennett"));
      bookcase.addNewBook(new Book("American Dirt","Jeanine Cummins"));
      bookcase.addNewBook(new Book("Where the Crawdads Sing","Delia Owens"));
      bookcase.addNewBook(new Book("Inheritance","Dani Shapiro"));
      bookcase.addNewBook(new Book("Normal People","Sally Rooney"));
      bookcase.addNewBook(new Book("Piranesi","Susanna Clarke"));
      bookcase.addNewBook(new Book("Ilse Witch","Terry Brooks"));
      bookcase.addNewBook(new Book("Find Me","Rosie O'Donnell"));

    // Output current titles on the shelf
      // bookcase.outputBookTitles();

    // Let our reader get a book to read
      System.out.println("------ - TEST 1 - Reader gets a book");
      john.borrowBook( bookcase.getBook("Bread Alone") );

    // Attempt to take another book out...
      System.out.println("\n------ - TEST 2 - Reader tries to take out another book before returning the one they have.");
      john.borrowBook( bookcase.getBook("A Good Hard Look") ); 

    // Reader returns the book
      System.out.println("\n------ - TEST 3 - Reader returns the book");
      bookcase.setBook( john.returnBook() );

    // Reader tries to get a book that doesn't exist
      System.out.println("\n------ - TEST 4 - Reader tries to get a book that doesn't exist.");
      john.borrowBook( bookcase.getBook("Darn tootin!") ); 

    // Reader returns the book
      System.out.println("\n------ - TEST 5 - Get another valid book");
      john.borrowBook( bookcase.getBook("Ilse Witch") ); 

  }
}
