/**
 * @file m2-5-dominoes
 * 
 * Define a struct that represents information about a single domino, keeping in mind that a single domino has two sets of 0 to 6 dots. You must decide what should be included and what the data types of the members will be.

In main(), declare an array of your domino structs that will store a double-six set of dominoes (Links to an external site.). (If you happen to know of more than one way to create arrays, make sure you are using a static array.) Write the necessary code using loop(s) needed to populate the array with all the dominoes in a set. The dominoes can be in any order.

Write code to sort the dominoes in a new order. You don’t need to write a function to do this, but may if you wish to.

Write code that prints the contents of the sorted dominoes array using asterisks (*) and any other characters needed, displaying them similar to how real dominoes would be laid out. When the program is run, it must be clear that your array has been sorted in a different order than it was created in.

 * @author David Little
 * @date August 12, 2020
 * @version 1.0
 **/

#include <iostream>
#include<string>  

using namespace std;

struct domino {
  int topNumber;
  int bottomNumber;
};


domino *populateDominoDeck(domino dominoDeck[], int TOTAL_DOMINOS ) {
  int dominoInst = 0;
  for(int bottomNum = 0; bottomNum < 7; bottomNum++){
    for(int topNum = 0; topNum <= bottomNum; topNum++){
      // cout <<  dominoInst << "=" << topNum << " | " << bottomNum << "\n";
      dominoDeck[dominoInst].topNumber = topNum;
      dominoDeck[dominoInst].bottomNumber = bottomNum;
      dominoInst++;
    }
  }
  return dominoDeck;
}


string getRowPips(int row, int num){
  string returnStr = "";
  // cout << "row " << row << ", number " << num << "\n";
  returnStr += "|";
  switch (row){
    case 1 :  // -- first row
      // ***** pip 1 & 2
      returnStr += ( num >= 2 ) ? "* " : "  "; // *** two characters
      // ***** pip 3
      returnStr += ( num >= 4 ) ? "*" : " "; // single character
    break;

    case 2 : // -- second row
      // ***** pip 1 
      returnStr += ( num == 6 ) ? "*" : " "; // single character
      // ***** pip 2 (1,3,5)
      returnStr += ( num % 2 ) ? "*" : " "; // single character
      // ***** pip 3
      returnStr += ( num == 6 ) ? "*" : " "; // single character
    break;

    case 3 : // -- third row
      // ***** pip 1 & 2
      returnStr += ( num >= 4) ? "* " : "  "; //  *** two characters
      // ***** pip 3
      returnStr += ( num >= 2 ) ? "*" : " "; // single character
    break;

    
  }
  returnStr += "|";
  return returnStr;
}


string getDominoDesign( domino dominoDeck[], int TOTAL_DOMINOS ){
  int x=0;
  string dominoDesign = "\0";

  while(x < TOTAL_DOMINOS){

    dominoDesign += " ___\n";

    int half=1;
    while( half <= 2 ){

      int row=1;
      while( row <= 3 ){
        int numberOnHalfDomino =  (half==1) ? dominoDeck[x].topNumber : dominoDeck[x].bottomNumber;
        dominoDesign += getRowPips( row, numberOnHalfDomino );
        dominoDesign += "\n";
        row++;
      }

      half++;
      dominoDesign += (half==2)? "|- -|\n": "";
    }

    dominoDesign += "////\n";
    x++;
  }
  return dominoDesign;
}


int main(){

  // Create the deck of dominoes!
  const int TOTAL_DOMINOS = 28;
  domino dominoDeck[TOTAL_DOMINOS];
  populateDominoDeck(dominoDeck, TOTAL_DOMINOS );

  int i = 0;
  while( i< TOTAL_DOMINOS ) {
    // cout <<  dominoDeck[i].topNumber << " | " << dominoDeck[i].bottomNumber << "\n";
    i++;
  }

  cout <<  getDominoDesign( dominoDeck, TOTAL_DOMINOS );
  // cout <<  dominoDeck[8].topNumber << " | " << dominoDeck[8].bottomNumber << "\n";

  return 0;
}