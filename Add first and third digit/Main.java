#include<stdio.h>
int main()
{
  //Type your code here
  int n, t, f, l;
  scanf("%d", &n);
  t = n;
  l = n % 10;
  while(n > 10)
  {
    n = n / 10;
  }
  f = n;
  printf("%d", f + l);
  return 0;
}