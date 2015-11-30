/**
 * Problem 4: Largest palindrome product
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * @author Rudd Fawcett
 * @since 2015-11-27
 */
#include <stdio.h>
#include <stdbool.h>

bool palindrome(int num) {
  int backwards = 0;
  int original = num;

  if (num < 10) {
    return true;
  }
  if (num % 10 == 0) {
    return false;
  }

  while (num >= 1) {
    backwards = (backwards * 10) + (num % 10);
    num = num / 10;
  }

  return (original == backwards);
}

int main() {
  int min = 100;
  int max = 999;
  int largest = 0;

  for (int i = min; i <= max; i++) {
    for (int j = min; j <= max; j++) {
      int mult = i*j;

      if (palindrome(mult)) {
        if (mult > largest) {
          largest = mult;
        }
      }
    }
  }

  printf("%d", largest);

  return 0;
}
