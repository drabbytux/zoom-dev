#include <iostream>
#include <string>

using namespace std;

// Example of a namespace A::testing.
namespace A {
  string testing(){
    cout << "testing\n\n";
    return "hello";
  }
}

// Example blackbox function. Just does it's job
bool flipIt(bool item){
  return !item;
}

int main()
{
  // Test 1 General
  int number1;
  float number2 = 1.4f; 
  number1 = 10;

  cout << number1 << ", " << number2 << endl;

  // Test 2 - String concat
  string strCommonDataTypes = "int, char, bool, float, double, string";
  strCommonDataTypes = strCommonDataTypes + "\n\nA short integer, represented by short in C++, is usually 2 bytes. \nA long integer (long) is 4 bytes,\nan integer (int) can be 2 or 4 bytes, \nand a long long integer is 8 bytes.";

  cout << strCommonDataTypes << endl;
  
  // Test 3 - naming spaces!
  A::testing();

  // Test 4 - using blackbox function - true will return 1, false 0
  bool boolAreYouSure = false;
  cout << "test 4: " << flipIt(boolAreYouSure) << endl;

  return 0;
}