# Ascii art p1
#
# David Little
# Oct 15 2020
# Write a Ruby program that prompts a person to enter a number, and then outputs a triangle of asterisks of that height and length.
#  *
# * *
#* * *


def output(original_number, index=1)
  return if index == 0

  space = 1..original_number - index.abs
  space.each {|s| print "\s"}

  i = 1..index.abs
  i.each { |n| print "* " }
  print "\n"

  index = original_number == index ? -index+1 : index+1
  output(original_number, index)
end

print "Enter a number: "
num = gets.chomp.to_i
output(num)