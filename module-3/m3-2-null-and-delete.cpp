/**
 * @file m3-2-null-and-delete.cpp
 * 
 * @author David Little
 * @date August 19, 2020
 * @version 1.0
 **/

#include <iostream>

using namespace std;

/** 
 * 
 * [QUESTION 2 ANSWER]
 * We're checking for the NULL addresses before outputting their contents.
 * If the pointer doesn't have an address assigned to it, the system will
 * throw a segmentation fault error, meaning the the variable doesn't have the right
 * to access the address or there is not a valid address associated to it.
 * Since it's set to NULL, '0x0' address is used to signify a NULL address which throws
 * this exception.
 * 
 */
int main()
{
 int * pointerArray[4];

 pointerArray[0] = new int;
 pointerArray[1] = new int;
 pointerArray[2] = NULL;
 pointerArray[3] = new int;

 *(pointerArray[0]) = 1;
 *(pointerArray[1]) = 10;
 *(pointerArray[3]) = 50;

  // Show the contents, skipping over the NULL pointer
  for(int x=0; x<4; x++){
    if( pointerArray[x] != 0 ){ // check if the value of the memory address is 0.
      cout << *(pointerArray[x]) << "\n";
    }
  }


  // Just a test to the address - ignore me....
  int *testingpoint = pointerArray[3];


  // Let's delete the whole lot, skipping over any NULL pointers again.
  for(int x=0; x<4; x++){
    if( pointerArray[x] != 0 ){ // check if the value of the memory address is 0.
    
      pointerArray[x] = NULL; // Set pointer address to NULL
    }
  }


  // Check it again... skipping over any NULL pointers... which should be all of them!
  for(int x=0; x<4; x++){
    if( pointerArray[x] != 0 ){ // check if the value of the memory address is 0.
      cout << *(pointerArray[x]) << "\n";
    } else {
      cout << "Pointer was empty \n";
    }
  }

  // IGNORE - Part deux of the memory test
  cout << testingpoint << " \n";
  cout << *testingpoint << " \n";

  return 0;
}
