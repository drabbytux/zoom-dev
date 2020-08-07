/**
 * Word Count
 * 
 * It takes in user input and does several calculations on the words entered.
 * @author David Little
 * @date Aug 6, 2020
 */
#include <iostream>

using namespace std;

/**
 * isVowel checks if the charachter passed is a vowel 
 * 
 * @param char the character passed
 * @returns bool true if a vowel, false if not.
 **/
bool isVowel(char str){
  char x = tolower(str);
  if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
    return true;
  else 
    return false;
}

/**
 * getUserInput takes in user input and does a variety of calculations on cin.get() until the line return is used. It then outputs using cout the calculations done.
 * 
 **/
void getUserInput(){

  int charItem, charTally = 0, vowelTally = 0, longestWord = 0, shortestWord = 0, numberOfWords = 0, longestVowelTally = 0;
  bool hitEnter = false, wordsContainNonAlphaChars = false;

  while( !hitEnter ){

    charItem = cin.get();

    if( charItem != ' ' && charItem != 10 ){

      charTally++;

      // Tally the vowels
      if( isVowel(charItem) )
        vowelTally++;

      // Flag non-alpha characters
      if( !isalpha(charItem) )
        wordsContainNonAlphaChars = true;

    } else {

      // We've hit a space. Did our new word make the cut?
      if( charTally != 0 ) {

        if( charTally < shortestWord || shortestWord == 0 )
          shortestWord = charTally;
        if( charTally > longestWord )
          longestWord = charTally;
        if( vowelTally > longestVowelTally )
          longestVowelTally = vowelTally;

        numberOfWords++; 

        // reset the tallies
        charTally = 0;
        vowelTally = 0;
      }
    }
    // Line return was hit, our work here is done.
    if( charItem == 10 )
      hitEnter = true;
  }
    if( numberOfWords ){
      cout << "\nThere were " << numberOfWords << " words in total.\n";
      cout << "\t- The longest word was " << longestWord << " character(s).\n";
      cout << "\t- The shortest word was " << shortestWord << " character(s).\n";
      cout << "\t- The most vowels used in a word were " << longestVowelTally << " vowel(s).\n";
      if( wordsContainNonAlphaChars )
        cout << "FYI - Some words contained non-alphabetic characters but were included.\n";
    } else { 
      cout << "\nYou didn't enter any words. That wasn't any fun.\n";
    }
}

int main(){
  char response;

  cout << "Enter some words, please: ";
  getUserInput();
  cout << "\n";

  return 0;
}