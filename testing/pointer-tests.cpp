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

struct console
{
  bool on;
};

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

 int a;
int *b;
int *c;

/* 1 */ a = 5;
/* 2 */ b = &a;
/* 3 */ c = b;
/* 4 */ *c = 10;
cout << *c << "\n";
cout << a << "\n";

/* 5 */ a = 3;
cout << *c << "\n";






  console *c1;
  console c2;
  console c3;

  c2.on = true;
  c1 = &c2; /* 1 */
  c3.on = c1->on;
  c1 = &c3; /* 2 */
  c2.on = false; /* 3 */
	
 
  cout << "c1: " << c1->on << endl;
  cout << "c2: " << c2.on << endl;
  cout << "c3: " << c3.on << endl;




  return 0;
}