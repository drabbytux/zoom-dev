/**
 * @file m3-3-soda.cpp
 * 
 * @author David Little
 * @date August 19, 2020
 * @version 1.0
 **/

#include <iostream>

using namespace std;

struct soda
{
  int gramsOfSugar;
  float gramsOfCarbonation;
};

int main(){

  soda **sodaArray = new soda*[3];

  // Using the first version of sodaArray with the two stars, create and store three dynamically allocated soda structs.

  sodaArray[0] = new soda;
  sodaArray[0]->gramsOfSugar = 12;
  sodaArray[0]->gramsOfCarbonation = 22;

  sodaArray[1] = new soda;
  sodaArray[1]->gramsOfSugar = 55;
  sodaArray[1]->gramsOfCarbonation = 60;

  sodaArray[2] = new soda;
  sodaArray[2]->gramsOfSugar = 4;
  sodaArray[2]->gramsOfCarbonation = 3;

  // Loop through the array and print out the values inside the structs. Clean up your memory ensuring there is one delete for every new.


  for (int i=0; i < 3; i++)
  {
    cout << "Item " << i << " - Grams of Sugar:" << sodaArray[i]->gramsOfSugar << " - Grams of Carbonation:" << sodaArray[i]->gramsOfCarbonation << "\n";
    // Now we know it, let's delete it.
    delete sodaArray[i];
  }
  delete [] sodaArray;

  return 0;
}