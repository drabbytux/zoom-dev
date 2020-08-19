> Question 1
> Consider the difference between statically and dynamically allocated memory.

> How can you tell in code that a value is being stored on the stack?
> If the value is declared as a literal style variable, it will be stored within the stack. If it’s being declared as a pointer with the “new” keyword, it will then be used as a value on the heap during runtime.

When does the memory for a variable on the stack get deleted?
Stack based values are deleted by the program when the function utilizing them has completed.They are implicitly deallocated once the function is finished.

> Similarly, how can you tell in code that a value is being stored on the heap?
When you use the “new” keyword to create a variable pointer, the values will be stored on the heap during runtime.

> When does memory for a value on the heap get deleted?
That must be done by the programmer one they decide the variable is no longer needed. It is explicitly removed by calling the function to be deleted.


> Question 2
> In C++, you can create an array on the stack just like usual, but use it to store pointers to data created on the heap. For example, suppose we want to store integers. Instead of creating a contiguous row of boxes in memory that will each store an integer, the boxes will store a pointer to integers on the heap.

Logically you can create an array on the stack that can be utilized at runtime to store references. However, it would require a keen eye and smart coding to make sure those values that are populated on the heap are properly referenced and dereferenced. I would imagine that creating an array of pointers on the heap would require much less stress and the amount of memory required as they would all need to be referenced to their memory addresses. This would reduce redundancy and stress on the programmers part.

> Draw a box-and-arrow diagram that illustrates how the array will look after running the following code. Keep in mind that while the array itself will be stored contiguously, boxes allocated for the integers on the heap will be placed wherever there is room (so don't draw them contiguously).

```
int * pointerArray[3];

pointerArray[0] = new int;
pointerArray[1] = new int;
pointerArray[2] = new int;

*(pointerArray[0]) = 1;
*(pointerArray[1]) = 10;
*(pointerArray[2]) = 50;
Question 3
Draw a box-and-arrow diagram that illustrates the state of the program’s memory after lines 1, 2, and 3.

struct dynamicNum
{
  int *theNumber;
};


int main()
{
  dynamicNum staticStruct;
  staticStruct.theNumber = new int;
  *(staticStruct.theNumber) = 10; /* 1 */

  dynamicNum *dynamicStruct = new dynamicNum;
  dynamicStruct->theNumber = new int;
  *(dynamicStruct->theNumber) = 55; /* 2 */

  cout << "Static struct pointer: "
       << staticStruct.theNumber << endl;
  cout << "Static struct number: "
       << *(staticStruct.theNumber) << endl;

  cout << "Dynamic struct pointer: "
       << dynamicStruct->theNumber << endl;
  cout << "Dynamic struct number: "
       << *(dynamicStruct->theNumber) << endl;

  delete staticStruct.theNumber;
  delete dynamicStruct->theNumber; /* 3 */
  delete dynamicStruct;
}
```

[![https://drive.google.com/file/d/1UHg8uwLyBZ0XP-sXNumhF5yfNX0el3v9/view?usp=sharing](https://drive.google.com/file/d/1UHg8uwLyBZ0XP-sXNumhF5yfNX0el3v9/view?usp=sharing)](https://drive.google.com/file/d/1UHg8uwLyBZ0XP-sXNumhF5yfNX0el3v9/view?usp=sharing)