'''

Problem 4: Largest palindrome product
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
Find the largest palindrome made from the product of two 3-digit numbers.

@author Rudd Fawcett
@since 2015-11-27

'''

minimum = 100
maximum = 1000
largest = 0

for i in range(minimum, maximum):
    for j in range(minimum, maximum):
        mult = i * j
        string = str(mult)

        if string == string[::-1]:
            if mult > largest:
                largest = mult

print largest
