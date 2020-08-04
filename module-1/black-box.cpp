/**
 * Black Box - First C++ Practice, Initial release
 * Brief: a function acting as a black box — someone using the function must be able to tell what the function does by its name, parameters and return type, but they do not have to care how the task is accomplished.
 * @author David Little
 * @version 1.0 August 20, 2020
 **/

#include <iostream>
using namespace std;

/**
 *  reverseString takes a string variable and returns the string in reverse charachter order
 *
 * @param strIncoming type string
 * @return string
 */
string reverseString(string strIncoming){
  string strReturn;
  if(strIncoming.size() >= 1){
    for(int i = strIncoming.size()-1; i >=0; i--){
      strReturn += strIncoming.at(i);
    }
  }
  return strReturn;
}

int main() {
  string testString;

  // The reverseString Test by input from the user
  // Currently not taking into consideration spaces or other potential input hick-ups.
  while(testString != "exit"){
    cout << "Reverse a simple string (type 'exit' to end): ";
    cin >> testString;
    cout << reverseString(testString) << endl;
  }

  return 0;
}