/**
 * @file question2.cpp 
 * 
 * @author David Little
 * @date August 26, 2020
 * @version 1.0
 **/

#include <iostream>
using namespace std;


int getAverageScore(int scoreArray[], int limit) {
  double total = 0;
  double number_of_values = 0;
  for (int i=0; i < limit; i++){
    if( scoreArray[i] != 0 ) {
        // cout << scoreArray[i] << "\n";
        total += double(scoreArray[i]);
        number_of_values++;
    }
  }
  return total / number_of_values;
}


int main(){
    const int SCORE_ARR_LIMIT = 10;
    // removed - no need for heap memory allocation | int * scores = new int[SCORE_ARR_LIMIT];
    // added - set the all to 0 to make sure we don't get any funky results in C++
    int scores[SCORE_ARR_LIMIT] = {0};
    for (int i=0; i < SCORE_ARR_LIMIT; i+=2 ) {
      scores[i] = i;
    }

  cout << "Average score: " << getAverageScore(scores, SCORE_ARR_LIMIT);
  // removed - no need for heap memory removal | delete [] scores;
  return 0;
}