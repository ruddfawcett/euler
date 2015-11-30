# Problem 4: Largest palindrome product
# A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
# Find the largest palindrome made from the product of two 3-digit numbers.
#
# @author Rudd Fawcett
# @since 2015-11-27

min = 100
max = 1000
largest = 0

for i in min..max
  for j in min..max
    mult = i * j
    string = mult.to_s

    if string == string.dup.reverse!
      if mult > largest
        largest = mult
      end
    end
  end
end

print largest
