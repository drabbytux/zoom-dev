/**
 * Array fundamentals Question 2 - Uppercase character count
 * Write a C++ program that defines a constant (fixed) array of at least 10 characters. This must be an array of char, not a string type. Loop through the array and count how many characters are uppercase. Demonstrate that your code works correctly in main().
 * @author David Little
 * @date August 11, 2020
 * */

#include <iostream>

using namespace std;

/**
 * getUpperCaseCharTotal takes in an array of charand the array element number
 * It compares the character to an uppercase version of itself. If it's equal, then it's tallied as an uppercase char.
 * @param char charArray, int array_total
 * @returns int Number of upper case characters found.
 * */
int getUpperCaseCharTotal(char charArray[], int array_total){
  int upperCaseTally = 0;
  for(int x=0; x<= array_total-1;x++){
    if( toupper(charArray[x]) == charArray[x] ){
      upperCaseTally++;
    }
  }
  return upperCaseTally;
}

int main(){

  const int ARRAY_TOTAL = 10;
  char charArray[ARRAY_TOTAL] = {'a','b','B','e','G','H','I','r','p','K'};
  cout << "There were " << getUpperCaseCharTotal(charArray, ARRAY_TOTAL) << " uppercase characters.\n";

  return 0;
}

