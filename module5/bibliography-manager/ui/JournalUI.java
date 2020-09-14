package ui;

import data.*;
import java.util.Scanner;
import java.util.ArrayList;

public class JournalUI {
  
  // ** Variables - - - - - - - - - - - - - - - - - - - - - - - - - 
    // private static ArrayList<Journal> journals = new ArrayList<Journal>();
    private static BibliographyDatabase bib;
    private boolean isActive = false;


  // ** Language Variables - - - - - - - - - - - - - - - - - - - - - - - - - 
    // General Language
    private String langWelcome = "Welcome to the Bibliography Database!";
    private String langGoodBye = "Bye!";
    private String langInputQuestion = "Please enter your choice (1, 2, or 3):";
    private String [] langChoices = {
      "1) Find articles from a given year",
      "2) Add an article to an issue",
      "3) Find the most-published author",
      "4) Exit"      
    };
    
    // Option 1 lang items
      private String langOption1        = "What year are you interested in?";
      private String langOption1Result  = "Here are the articles from ";

    // Option 2 lang items
    private String langOption2Response1 = "Here are the available issues:";
    private String langOption2Response2 = "What issue would you like to add to ";
    private String langOption2Response3 = "Please specify the article ";

    // Option 3 lang items
    private String langOption3Result  = "The most published author is ";   

    


  // ** Constructors - - - - - - - - - - - - - - - - - - - - - - - - - 
    public JournalUI(ArrayList<Journal> newJournal)
    {
      bib = new BibliographyDatabase( newJournal );
    }
  

  // ** Private / helper methods - - - - - - - - - - - - - - - - - - - - - - - - - 
    // displayOptions outputs options available
      private void displayOptions(){
        for(String op : langChoices) {
          System.out.println(op);
        }
        System.out.printf(langInputQuestion);
      }

    // validOption Looks at the options in our language array
      private boolean validOption( int choiceIndex ){
        if( choiceIndex < langChoices.length  ){
          return true;
        } else {
          return false;
        }
      }
    // print(String) is a Quick Print method
      private void print(String toPrint){
        System.out.println( toPrint );
      }
      private void print(int toPrint){
        System.out.println( toPrint );
      }

    // printArrayOptionNumbers(int arrItems[])
      private String printIntOptionNumbers(int totalCount){
        String output = "";
        for(int i=1;i<=totalCount;i++){
            output += ( i < totalCount ) ? i + ", " : "or " + i;
        }
        return output;
      }
     

  // ** Pubic Methods - - - - - - - - - - - - - - - - - - - - - - - - - 
    void runManager(){

      this.isActive = true;

      while(this.isActive){

        print(langWelcome);

        // User input
        displayOptions();
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()) 
        {
            input.nextLine(); //clear the invalid input before prompting again
            print(langInputQuestion);
        }

        int choiceIndex = input.nextInt() - 1;

          // Valid? Lets go through the options
          if( !validOption( choiceIndex ) ){
            print(langGoodBye);
          } else{
            // Let's see what they have chosen.
            String output = ""; // A nice common output variable
            print("");
            switch(choiceIndex){
              case 0: // ----- Find Articles by Year --------------------------

                // Print and get year optino
                  print(langOption1);
                  Scanner input1 = new Scanner(System.in);
                  int choice1 = input1.nextInt();

                // Collected article string
                  output = bib.getArticlesFromYear(choice1);

                // If articles, print it
                  if(  output != null ) {
                    print( langOption1Result + choice1 + ":");
                    print( output );
                  }
                break;

              case 1: // ----- Add an article to issue --------------------------
                // get issues
                  print( langOption2Response1 );
                  int issueCount = 0;

                  ArrayList<Issue> lookupIssues = bib.getAvailableIssuesArray();
                  for( Issue issue : lookupIssues ){
                    issueCount++;
                    print( "\t" + issueCount + ") " + issue.getJournal().getTitle() + ", Issue " + issue.getNumber() );
                  }

                // Show Issues and ask what issues they'd like to associated their new article with
                  print(langOption2Response2 + "(" + this.printIntOptionNumbers( issueCount ) + ")" );
                  Scanner input2 = new Scanner(System.in);
                  int issueChoice = input2.nextInt();

                // Input the new article title
                  print(langOption2Response3 + "title:");
                  Scanner input2Title = new Scanner(System.in);
                  //int newTitle= input2Title.nextInt();
                  String newTitle = input2Title.nextLine(); 

                // Input the new article author
                  print(langOption2Response3 + "author:");
                  Scanner input2Author = new Scanner(System.in);
                  String newAuthor = input2Author.nextLine();
                  
                // Insert the new info! issueChoice, newTitle, new Author;
                  bib.addArticleToIssue(newTitle, newAuthor, lookupIssues.get(issueChoice - 1));
                break;

              case 2: //  ------- Most published author --------------------------
                print( langOption3Result + bib.getMostPublishedAuthor() + "\n");
                break;

              case 3: //  ------ So long! --------------------------
                print(langGoodBye);
                this.isActive = false;
                break;
            }
          }
        
      }
    }

  // ** Public main method - GOOOOO!! - - - - - - - - - - - - - - - - - - - - - - - - - 
    public static void main(String[] args) {
        // Generate the Bibliography manager with it's database
        JournalUI ui = new JournalUI(Journal.getSampleJournals());

        // TESTING Add/remove
        Article art4 = new Article("Will this be added?", "Frugin Latouski");
        bib.addArticleToIssue(art4, "Journal of Modern Politics", 2018, 1, 76);

        // Current testing
        Issue newIssue = new Issue(2022, 4, 44);
        bib.addIssueToJournal(newIssue, "Journal of Modern Politics");


        ui.runManager();
    }
  
}
