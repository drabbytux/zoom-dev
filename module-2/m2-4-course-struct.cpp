/**
 * @file m2-4-course-struct.cpp
 * @author David Little
 * @date August 12, 2020
 * @version 1.0
 **/

#include <iostream>

using namespace std;


struct course {
  string departmentCode;
  int id;
  string title;
};

// Declare an array of 10 course structs, and then fill in the data for the 10 structs such that they represent different courses in various departments. Ensure there are multiple courses within some of the departments.
const int NUMBER_COURSES = 10;
course firstYear[ NUMBER_COURSES ] = {
    {"MUSIC", 995, "Intense Music Composition"},
    {"CANS", 1077,"Canadian Cultural Studies"},
    {"DANCE", 101,"Doing the Limbo"},
    {"ENGL", 1827, "Memorize the Dictionary"},
    {"PARKLF", 44, "Picnicing 101"},
    {"SOBR", 991, "Student life on a budget"},
    {"WOOF", 785, "Make money walking dogs to pay back student loans"},
    {"UFO", 51, "Astonomy for consipircy theororists"},
    {"CANS", 1075,"Canadian Society Structures"},
    {"ENGL", 1832, "English words that start with R"}
  };



int numCoursesInDepartment(course courseArray[], int numCourses, string department) {
  int tally = 0;
  int x = 0;

  while ( x < numCourses ){
    if( courseArray[x].departmentCode == department )
      tally++;
    x++;
  }

 return tally;
}


int main() {

  string departmentCheck = "ENGL";
  cout << "There are " << numCoursesInDepartment( firstYear, NUMBER_COURSES, departmentCheck ) << " courses with department code " << departmentCheck << ".\n";

  return 0;
}