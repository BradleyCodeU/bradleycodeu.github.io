from random import *
temp = randint(1,10)*10
result='''\n# Section 1: Generate and print the full array...
print("Section 1: Integers from '''+str(temp)+''' to '''+str(temp*2)+'''")
# - Create an empty array
# - Using a "for i in range" loop, randomly generate 20 positive integers ranging from '''

result += str(temp)
result += " to "
result += str(temp*2)
result += ''' and append them to the array
# - Print a line that says "FULL ARRAY"
# - Print the full contents of the array using print()
'''
if(random()<0.5):
  result += '''\n# -=-=-=-=-=-=-=-=-=-=-=-=-\n\n# Section 2: Print the Odd Integers...
print("Section 2: Odd Integers")
# - Create a variable called result and set it to be an empty string ""
# - Print a line that says "ODD INTEGERS"
# - Use a FOR EACH loop to iterate through the array.
# - If an integer is odd (Hint: you must use modulus), then add it to the result (Hint: use str() and concatenate like this result = result + str(i) + " & ")
# - Print result
  '''
else:
  result += '''\n# -=-=-=-=-=-=-=-=-=-=-=-=-\n\n# Section 2: Print the Even Integers...
print("Section 2: Even Integers")
# - Create a variable called result and set it to be an empty string ""
# - Print a line that says "EVEN INTEGERS"
# - Use a FOR EACH loop to iterate through the array.
# - If an integer is even (Hint: you must use modulus), then add it to the result (Hint: use str() and concatenate like this result = result + str(i) + "# - ")
# - Print result
  '''
temp = random()
if temp < .333:
  result += '''\n# -=-=-=-=-=-=-=-=-=-=-=-=-\n\n# Section 3: Print the Multiples of 3...
print("Section 3: Multiples of 3")
# - Set result to be an empty string ""
# - Print a line that says "MULTIPLES OF 3"
# - Use a FOR EACH loop to iterate through the array
# - If an integer is a multiple of 3 (Hint: you must use modulus), then add it to the result (Hint: use str() and concatenate like this result = result + str(i) + " / ")
# - Print result'''

elif temp < .666:
  result += '''\n# -=-=-=-=-=-=-=-=-=-=-=-=-\n\n# Section 3: Print the Multiples of 4...
print("Section 3: Multiples of 4")
# - Set result to be an empty string ""
# - Print a line that says "MULTIPLES OF 4"
# - Use a FOR EACH loop to iterate through the array
# - If an integer is a multiple of 4 (Hint: you must use modulus), then add it to the result (Hint: use str() and concatenate like this result = result + str(i) + " * ")
# - Print result'''
else:
  result += '''\n# -=-=-=-=-=-=-=-=-=-=-=-=-\n\n# Section 3: Print the Multiples of 5...
print("Section 3: Multiples of 5")
# - Set result to be an empty string ""
# - Print a line that says "MULTIPLES OF 5"
# - Use a FOR EACH loop to iterate through the array
# - If an integer is a multiple of 5 (Hint: you must use modulus), then add it to the result (Hint: use str() and concatenate like this result = result + str(i) + ", ")
# - Print result'''


print(result)
