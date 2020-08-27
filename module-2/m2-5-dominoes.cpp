/**
 * @file m2-5-dominoes
 * 
 * @author David Little
 * @date August 12, 2020
 * @version 1.0
 **/

#include <iostream>
#include<string>  

using namespace std;

/**
 *  domino struct, simply a top number and bottom number
 **/
struct domino {
  int topNumber;
  int bottomNumber;
};

/**
 *  populateDominoDeck takes a blank array of domino tiles and adds the needed dots or "pips" to each.
 * 
 * @param domino dominoDeck array, int total number of dominos
 * @returns pointer dominoDeck
 **/
domino *populateDominoDeck( domino dominoDeck[], int TOTAL_DOMINOS ) {
  int dominoInst = 0;
  for(int bottomNum = 0; bottomNum < 7; bottomNum++){
    for(int topNum = 0; topNum <= bottomNum; topNum++){
      dominoDeck[dominoInst].topNumber = topNum;
      dominoDeck[dominoInst].bottomNumber = bottomNum;
      dominoInst++;
    }
  }
  return dominoDeck;
}

/**
 *  *randomizeDeck takes in the deck of domnios and shuffles them up
 * @param domino dominoDeck array, int total number of dominos
 * @returns pointer dominoDeck
 **/
domino *randomizeDeck( domino dominoDeck[], int TOTAL_DOMINOS ){
  int numberOfShuffles = TOTAL_DOMINOS;
  int x = 0;
  domino pickedDomnio;
  int randomElement = 0;

  while( x < numberOfShuffles ){
    randomElement =  rand() % TOTAL_DOMINOS; 
    pickedDomnio = dominoDeck[randomElement];
    dominoDeck[randomElement]= dominoDeck[x];
    dominoDeck[x] = pickedDomnio;
    x++;
  }
  return dominoDeck;
}


/**
 *  getRowPips will send you the current row of dots or "pips" as a string.
 * @param int row number, int current number on the top/bottom portion of domnio
 * @returns string of pips
 **/
string getRowPips(int row, int num){
  string returnStr = "";
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


/**
 *  *randomizeDeck takes in the deck of domnios and processes each design needed for each domino
 * @param domino dominoDeck array, int total number of dominos
 * @returns string of all the domino designs
 **/
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

  randomizeDeck( dominoDeck, TOTAL_DOMINOS );
  cout << getDominoDesign( dominoDeck, TOTAL_DOMINOS );


  return 0;
}