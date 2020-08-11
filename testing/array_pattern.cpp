#include <iostream>

using namespace std;

int main() {

  /*
block a (normal)
  array level 0 containing a number of arrays at level 1
  #----
  -##--
  array{{1,0,0,0,0}, {0,1,1,0,0}}
>>>> Logic? good to go (normal).

block b (normal flipped horizontal)
  ----#
  --##-
  array{{0,0,0,0,1}, {0,0,1,1,0}}
>>>> Logic? Reverse order of each level 1 array

block c (normal flipped vertical)
  -##--
  #----
  array{{0,1,1,0,0}, {1,0,0,0,0}}
>>>> Logic? Reverse order of Level 0 array

block d ( normal flipped horizontal and vertical)
  --##-
  ----#
  array{{0,0,1,1,0}, {0,0,0,0,1}}
>>>> Logic? Reverse order of Level 1 array, reverse order of level 0 array
(take block b and reverse level 0)


  ////////// Combined:
  array{ {1,0,0,0,0}, {0,1,1,0,0}, {0,0,0,0,1}, {0,0,1,1,0}, {0,1,1,0,0}, {1,0,0,0,0}, {0,0,1,1,0}, {0,0,0,0,1} }

  */


  return 0;
}