#include <stdio.h>
int main(void) {
  int Count, Counter;
  printf("Enter a number upto which you want to print natural numbers:");
  scanf("%d", &Count);
  printf("The first %d natural numbers are", Count);
  for (Counter = 1; Counter <= Count; Counter++)
      printf(" %d", Counter);
      printf(".");
  return 0;
}