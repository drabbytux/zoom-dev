/**
 * 1. Write code that will use cin.get() to read characters in one by one until a newline is encountered. Report how many words there were in the input, how long the longest word was, and the largest number of vowels in a word (work on one of these at a time!). You may not store any of the characters but you can have other variables that store information about them as you go along.

2. Think about all potential cases. What types of input could break your program? What if someone presses enter right away? What if there’s only one word? What if there are many words? What if there are multiple spaces between words? etc… Make sure it all works.

For this portion, copy and paste the log of your console interactions in a new log.txt file (to be included in the PR). This log will demonstrate the good coverage of your program. You can manually divide and annotate test cases if it gives more clarity. 
 * 
 */
#include <iostream>

using namespace std;

bool isVowel(char str){
  char x = tolower(str);
  if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
    return true;
  else 
    return false;
}
void getUserInput(){

  int charItem, charTally = 0, vowelTally = 0, longestWord = 0, shortestWord = 0, numberOfWords = 0, longestVowelTally = 0;
  bool hitEnter = false;

  while( !hitEnter ){

    charItem = cin.get();

    if( charItem != ' ' && charItem != 10 ){

      charTally++;

      if( isVowel(charItem) )
        vowelTally++;

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
    
    if( charItem == 10 )
      hitEnter = true;
  }

  cout << "There were " << numberOfWords << " words.\n";
  cout << "The longest word was " << longestWord << " characters.\n";
  cout << "The shortest word was " << shortestWord << " characters.\n";
  cout << "The most vowels used in a word were " << longestVowelTally << " vowels.\n";
}

int main(){

  cout << "Enter some words, please: ";
  getUserInput();
  
  cout << "Great work!\n";
  return 0;
}