/**
 * The Shape of Things
 * 
 * Using only single-character output statements that output one of ‘#’, ‘ ’, or ‘\n’ (hash, space, and newline), write a C++ program to produce the following shape. You may not store characters anywhere before outputting them, and you may not use any string related functions.
 * 
 * @author David Little
 * @date August 5, 2020
 **/
#include <iostream>

using namespace std;

/**
 * getCorrectChar returns a character based on an int 
 * 
 * @param charItem type int
 * @return char
 **/
char getCorrectChar(int charItem){
  switch(charItem) {
    case 1:
      return '#';
    break;
    case 2:
        return '\n'; 
    break;
    default:
      return '-';
  }
}

/**
 * outputCharacters takes in the number of columns you'd like to display and it will output a wonderful design
 * 
 * @param totalColumns type int
 * @return void
 **/
void outputCharacters(int totalColumns){

  int totalRows, startingPoint, endingPoint, characterReference;

  //Setup oddrow factor for extra hash and to make sure the rows work with the number of columns
  bool isOddRows = false;
  if( totalColumns%2 ){
    totalRows = totalColumns/2 + 1;
    isOddRows = true;
  } else {
    totalRows = totalColumns/2;
  }

  // Spin through the rows and columns
  for(int currentRow=1; currentRow<=totalRows; currentRow++) {
    for(int currentColumn=1; currentColumn<=totalColumns; currentColumn++){

      characterReference = 0;
      
      // (First half of the columns) vs. (Second half of the columns)
      if( currentColumn <= totalColumns / 2 ) {
        if( currentRow <= totalRows / 2 ) {
          // First set rows, First set of columns
          startingPoint = currentRow;
          endingPoint = currentRow * 2 -1;
        } else {
          // Last set rows, First set of columns
          startingPoint = (isOddRows)? totalRows - currentRow +1 : totalRows - currentRow  + 1;
          endingPoint =  (isOddRows)? totalColumns - currentRow - currentRow +2: totalColumns - currentRow - currentRow + 1;
        }
      } else {
        if( currentRow <= totalRows / 2 ) {
          // First set rows, Second set of columns
          startingPoint = totalColumns - currentRow - currentRow+1;
          endingPoint = totalColumns - currentRow;
        } else {
          // Last set rows, Second set of columns
          startingPoint = (isOddRows)? (currentRow * 2) -2 : (currentRow * 2) - 1;
          endingPoint = (isOddRows)? totalColumns - totalRows + currentRow -1 : totalColumns - totalRows + currentRow  -1;
        }
      } 

      // Choose the right type of character required
      if(currentColumn >= startingPoint && currentColumn <= endingPoint ){
        characterReference = 1;
      } else {
        // Display an extra hash in the centre that was given in the example.
        if( (!isOddRows && currentColumn == totalColumns/2) && (currentRow == totalRows/2 || currentRow == (totalRows/2)+1 ) ){
           characterReference = 1;
        } else {
          characterReference = 0;
        }
      }

      // If we're at the end of the column, let's set it up to return a new line
      if (currentColumn == totalColumns){
        characterReference = 2;
      }

      // The ALMIGHTY one line of output
      cout << getCorrectChar(characterReference);
    }
  }
}

int main(){
  // Output column size
  int totalColumns = 20;
  outputCharacters(totalColumns);

  return 0;
}