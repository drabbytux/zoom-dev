/**
 * @file pointer-tests
 * Just testing pointer and referrencing to make sure I've got it down!
 * 
 * @author David Little
 * @date August 13, 2020
 * @version 1.0
 **/

#include <iostream>

using namespace std;

void changeIt(int & test){
  test = 11;  
}


int main(){

  int * mypointer;
  int * myOtherpointer = mypointer;

cout << * myOtherpointer << "\n";
  /*
  int justAVar = 10;

  mypointer = &justAVar;
 

  changeIt( justAVar );

  cout << * mypointer << "\n";
  cout << justAVar << "\n";
   */

/*
  int *x;
  int *y = x;

  int myInt = 10;
  int mySecondInt = 25;

  x = &myInt;

  mySecondInt += *y;
  cout << mySecondInt << endl;

  The value of x as a pointer (in theory, a memory address) is copied into the pointer y in the second line. However, nothing has been assigned to x at that point, which means it just contains garbage. Therefore, when we try to dereference y, we get an error (think of what happened to Binky!).
  
  */

  return 0;
}