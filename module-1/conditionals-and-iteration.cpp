#include <iostream>
#include <string>

using namespace std;

// Example of if/else-if/else:
void strMakeTheRightChoiceIfElse(int intSelectedValue){
 if( intSelectedValue <= 5){
   cout << "A little undervalued, but OK" << endl;
 } else if( intSelectedValue > 6 && intSelectedValue <=10 ){
   cout << "That's perfect! It's a deal!" << endl;
 } else {
   cout << "Wow! Amazing!" << endl;
 }
}

// Example of case
void strMakeTheRightChoiceCase(char charSelectedValue){

  switch(charSelectedValue){
    case 'A':
      cout << "A fine choice. Yummy!" << endl;
    break;
    case 'B':
      cout << "I love chocolate!" << endl;
    break;
    case 'C':
      cout << "You had me at, er, Lime. YuM!" << endl;
    break;
    default:
      cout << "Sorry - not an option. You borked me!" << endl;
    break;
  }
}

void forLoopExample(){
  for(int x=0; x<=5; x++){
    cout << x;
  }
}

int main()
{
  // Test 1 - else/else-if
  int price;
  cout << "Enter a price for my soul:";
  cin >> price;
  strMakeTheRightChoiceIfElse(price);
  cout << "--- Test one complete ---\n" << endl;

  // Test 2 - CASE switch
  char charChoice;
  cout << "Would you like:\n";
  cout << "  A) Vanilla:\n";
  cout << "  B) Chocolate:\n";
  cout << "  C) Lime:\n";
  cout << "A, B OR C:";
  cin >> charChoice;
  strMakeTheRightChoiceCase(charChoice);
  cout << "--- Test two complete ---\n" << endl;

  // Test 3 - FOr loop
  forLoopExample();
  cout << "\n--- Test three complete ---\n" << endl;
  cout.fill('*');
  cout.width(30);
  cout << left << "Test four complete" << endl;
  
  return 0;
}