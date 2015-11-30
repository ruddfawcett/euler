'''

Problem 1: Multiples of 3 and 5
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.

@author  Rudd Fawcett
@date 2015-11-26

'''

max, sum = 1000, 0

for min in range(1, max):
  if min % 3 == 0 or min % 5 == 0:
      sum += min

print sum
