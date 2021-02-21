/**
 * @file m3-4-songs.cpp
 *
 * @author David Little
 * @date August 19, 2020
 * @version 1.0
 **/

#include <iostream>

using namespace std;

struct song {
  string title;
  string artist;
  int yearReleased;
  int airPlayLevel; // out of 10
  int timeLengthMinutes;
  int timeLengthSeconds;
};


song** songsFromYear(song **songs, int size, int year, int* resultSize){
  song **songYearArray = new song*[size];
  for(int x=0;x<size;x++){
    if(songs[x]->yearReleased == year){
      songYearArray[*resultSize] = new song;
      // songYearArray[*resultSize]->title = *(songs[x]);
      songYearArray[*resultSize] = songs[x];
      *resultSize = *resultSize + 1;
    }
  }
  return songYearArray;
}


string airplayInformation( int airPlayLevel ){
  string strReturn = "";
  if( airPlayLevel < 3){
    strReturn = "The song didn't receive a lot of airplay, but was very popular nevertheless.";
  } else if( airPlayLevel >=3 and airPlayLevel <=6 ){
    strReturn = "The song received a decent amount of radio rotation which helped solidify it's popularity.";
  } else if( airPlayLevel > 6 ){
    strReturn = "The song received an outstanding amount of airplay and was very popular.";
  }
  return strReturn;
}

/**
 * songToString brings in a song struct that needs to be returned in a nice string.
 * @param struct song s
 * @returns string
 **/
string songToString(song s) {
  string strReturn = "";
  strReturn = s.artist;
  strReturn += "'s song \"";
  strReturn += s.title;
  strReturn += "\" debuted in ";
  strReturn += to_string( s.yearReleased );
  strReturn += ". " + airplayInformation(s.airPlayLevel) + "\n";
  return strReturn;
}


// - - -  Variable Declartion  - - - 
const int NUMBER_OF_SONGS = 5;
song **favouriteSongArray = new song*[NUMBER_OF_SONGS];


int main(){
  favouriteSongArray[0] = new song;
  favouriteSongArray[0]->title = "Sunday Papers";
  favouriteSongArray[0]->artist = "Joe Jackson";
  favouriteSongArray[0]->yearReleased = 1979;
  favouriteSongArray[0]->airPlayLevel = 6;
  favouriteSongArray[0]->timeLengthMinutes = 3;
  favouriteSongArray[0]->timeLengthSeconds = 42;

  favouriteSongArray[1] = new song;
  favouriteSongArray[1]->title = "A Forest";
  favouriteSongArray[1]->artist = "The Cure";
  favouriteSongArray[1]->yearReleased = 1979;
  favouriteSongArray[1]->airPlayLevel = 3;
  favouriteSongArray[1]->timeLengthMinutes = 55;
  favouriteSongArray[1]->timeLengthSeconds = 5;
 
  favouriteSongArray[2] = new song;
  favouriteSongArray[2]->title = "Losing My Edge";
  favouriteSongArray[2]->artist = "LCD Soundsystem";
  favouriteSongArray[2]->yearReleased = 2002;
  favouriteSongArray[2]->airPlayLevel = 1;
  favouriteSongArray[2]->timeLengthMinutes = 7;
  favouriteSongArray[2]->timeLengthSeconds = 52;

  favouriteSongArray[3] = new song;
  favouriteSongArray[3]->title = "Ain't Nobody";
  favouriteSongArray[3]->artist = "Chaka Khan";
  favouriteSongArray[3]->yearReleased = 1983;
  favouriteSongArray[3]->airPlayLevel = 7;
  favouriteSongArray[3]->timeLengthMinutes = 4;
  favouriteSongArray[3]->timeLengthSeconds = 41;

  favouriteSongArray[4] = new song;
  favouriteSongArray[4]->title = "The Passanger";
  favouriteSongArray[4]->artist = "Iggy Pop";
  favouriteSongArray[4]->yearReleased = 1977;
  favouriteSongArray[4]->airPlayLevel = 5;
  favouriteSongArray[4]->timeLengthMinutes = 4;
  favouriteSongArray[4]->timeLengthSeconds = 44;  

  // Output the song information
  cout << songToString(*favouriteSongArray[2]);


  // get songs from a specific year
  int year = 1979;
  int resultSize = 0;
  song ** songArrayFromYear = songsFromYear(favouriteSongArray, NUMBER_OF_SONGS, year, &resultSize);


  // Output songs from a specific year
  if( resultSize > 0 ) {
    cout << "These songs were big in " << year << "\n";
    for (int i=0; i < resultSize; i++) {
      cout << " - " << songArrayFromYear[i]->title << "\n";
    }
  } else {
    cout << "There were no songs in our list from " << year << "\n";
  }


  // THE END... Destroy all that we've built.
  for (int i=0; i < NUMBER_OF_SONGS; i++) {
   delete favouriteSongArray[i];
  }
  delete [] favouriteSongArray;
  
  for (int i=0; i < resultSize; i++) {
   songArrayFromYear[i] = NULL;
   delete songArrayFromYear[i];
  }
  delete [] songArrayFromYear;

  return 0;
}