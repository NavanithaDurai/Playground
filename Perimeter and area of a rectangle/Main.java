#include<stdio.h>
int main()
{
  //Type your code here
  int l = 6, b = 9, perimeter, area;
  perimeter = 2 * (l + b);
  area = l * b;
  printf("The perimeter of the rectangle is: %d cm\n", perimeter);
  printf("The area of the rectangle is: %d sq cm", area);
  return 0;
}