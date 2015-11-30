/**
 * Problem 4: Largest palindrome product
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * @author Rudd Fawcett
 * @since 2015-11-27
 */
public class Problem4 {
  public static void main(String[] args) {
    int min = 100;
    int max = 999;
    int largest = 0;

    for (int i = min; i <= max; i++) {
      for (int j = min; j <= max; j++) {
        int mult = i * j;
        String string = Integer.toString(mult);
        StringBuffer buffer = new StringBuffer(string);

        if (string.equals(new String(buffer.reverse()))) {
          if (mult > largest) {
            largest = mult;
          }
        }
      }
    }

    System.out.print(largest);
  }
}
