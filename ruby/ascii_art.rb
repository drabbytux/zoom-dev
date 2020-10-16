# Ascii art p1
#
# David Little
# Oct 15 2020
# Write a Ruby program that prompts a person to enter a number, and then outputs a triangle of asterisks of that height and length.
#  *
# * *
#* * *


def output(original_number, index=1)
  return if index > original_number

  space = 1..original_number - index
  space.each {|s| print "\s"}

  i = 1..index
  i.each { |n| print "* " }
  print "\n"
  output(original_number, index+1)
end

print "Enter a number: "
num = gets.chomp.to_i
output(num)