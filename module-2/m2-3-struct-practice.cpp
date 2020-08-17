/**
 * @file m2-3-struct-practice.cpp
 * 
 * @author David Little
 * @date August 11, 2020
 * @version 1.0
 **/

#include <iostream>

using namespace std;

struct theTime {
  int hour;
  int minute;
  int second;
  string ampm;
};

// wasteSomeTime takes an hour away from your day! Just like real life.
void wasteSomeTime( theTime & rightNow){
  rightNow.hour = ( rightNow.hour == 12 ) ? rightNow.hour = 1: rightNow.hour + 1;
}

// isItMorning returns true if it's morning time. Start up the griddle!
bool isItMorning( theTime rightNow ){
  return ( rightNow.ampm == "am") ? true : false;
}


int main(){

  theTime rightNow = {8,10,25,"am"};
  rightNow.hour = 8;
 
  // Test the changing of AM/PM
  rightNow.ampm = "pm";
  cout << rightNow.ampm << "\n";

  // Call waste of time
  cout << rightNow.hour << "\n";
  wasteSomeTime(rightNow);
  cout << rightNow.hour << "\n";

  // Greeting time - Is it morning?
  cout << (isItMorning(rightNow)? "Good Morning!!!" : "Enjoy the rest of your day!") << "\n";

  return 0;
}