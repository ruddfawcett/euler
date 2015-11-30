/**
 * Problem 1: Multiples of 3 and 5
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @author  Rudd Fawcett
 * @since 2015-11-26
 */
public class Problem1 {
  public static void main(String[] args) {
    int max = 1000;
    int sum = 0;

    for (int min = 1; min < max; min++) {
      if (min % 3 == 0 || min % 5 == 0) {
        sum += min;
      }
    }

    System.out.print(sum);
  }
}
