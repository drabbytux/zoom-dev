#include <iostream>

using namespace std;

int main(int argc, char** argv) {

  char digit;
  cout << "enter a one-digit number: ";
  cin >> digit;
  int sum = digit - '0';
  cout << "sum of digits " << sum << "?\n";
  return 0;
  
}
