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



int main(){

  theTime rightNow = {8,10,25,"am"};
  rightNow.hour = 8;
  rightNow.ampm = "pm";
  // 

  cout << rightNow.ampm << "\n";
  return 0;
}