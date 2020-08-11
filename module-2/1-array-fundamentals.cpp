/**
 * Array Fundamentals Practice
 * 
 * Write a function that returns a bool and takes as parameters an array and the number of items in the array. Looping through the array exactly once, determine whether the items in the array are in ascending sorted order. (Hint: think about the problem solving techniques when working on this problem, and perhaps even try to “solve” it on paper before coding.)
 * 
 * @author David Little
 * @date August 11, 2020
 */
#include <iostream>

using namespace std;

/*
  isSorted takes in an array and number of items in the array and returns true if it's in assending order
  The last element has nothing to be compared to, as long as the previous one was smaller.
*/
bool isSorted(int array[], int numItems)
{
  int currentElement = 0;
  while (currentElement < numItems-1){
    if( array[currentElement] > array[currentElement+1] ){
      return false;
    }
    currentElement++;
  }
  return true;
}


int main(){

  const int TEST_ARRAY_1_SIZE = 7;
  int testArray1[TEST_ARRAY_1_SIZE] = {4, 2, 4, 5, 6, 7, 8};  // -- Test incorrect order
  //int testArray1[TEST_ARRAY_1_SIZE] = {2, 2, 4, 5, 6, 7, 8}; // -- Test correct order
  cout << "isSorted returned " << isSorted(testArray1, TEST_ARRAY_1_SIZE);

  return 0;
}

