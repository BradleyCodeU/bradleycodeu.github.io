import random
mylist = [15,170,223]
def is_power_of_two(n):
    return (n != 0) and (n & (n-1) == 0)
print(
"""
Take a screenshot and complete in Notability OR copy/paste
the output into a text editor like Google Docs, Microsoft
Word, or the iOS Notes app. Set the font to COURIER NEW
and complete the worksheet."""
)
print(""" ______  _                         
(____  \(_)                        
 ____)  )_ ____  _____  ____ _   _ 
|  __  (| |  _ \(____ |/ ___) | | |
| |__)  ) | | | / ___ | |   | |_| |
|______/|_|_| |_\_____|_|    \__  |
Binary Worksheet            (____/    Name: _______________""")

print("\nPart A: Convert the 4-bit binary number to decimal")
print("  Hint: 8s 4s 2s 1s")
print("  For example, 1111\u208d\u2082\u208e = 15\u208d\u2081\u2080\u208e")
for i in range(4):
    temp = random.randint(i,7)+random.randint(i,7)
   
    while temp in mylist or is_power_of_two(temp):
      temp = random.randint(i,7)+random.randint(i,7)
      
    mylist.append(temp)
mylist.sort()
for i in range(4):
    print(
        "%6s.) %21s"
        % (
            str(i + 1),
            str(bin(mylist[i]))[2:].zfill(4) + "\u208d\u2082\u208e = ______\u208d\u2081\u2080\u208e",
        )
    )
print("\nPart B: Convert the 8-bit binary number to decimal")
print("  Hint: 128s 64s 32s 16s 8s 4s 2s 1s")
print("  For example, 10101010\u208d\u2082\u208e = 170\u208d\u2081\u2080\u208e")
for i in range(5,9):
    temp = random.randint(i*6,i*6+5)+random.randint(i*6,i*6+5)
    #temp = temp[2:].zfill(8)
    while temp in mylist or is_power_of_two(temp):
      temp = random.randint(i*6,i*6+5)+random.randint(i*6,i*6+5)
      #temp = temp[2:].zfill(8)
    mylist.append(temp)
    print(
        "%6s.) %26s"
        % (
            str(i),
            str(bin(temp))[2:].zfill(8) + "\u208d\u2082\u208e = ______\u208d\u2081\u2080\u208e",
        )
    )
print("\nPart C: Convert the decimal number to binary")
print("  For example, 223\u208d\u2081\u2080\u208e = 11011111\u208d\u2082\u208e")
for i in range(9,15):
    temp = random.randint(i*6,i*6+5) + random.randint(i*6,i*6+5)
    while temp in mylist  or is_power_of_two(temp):
      temp = random.randint(i*6,i*6+5) + random.randint(i*6,i*6+5)
    mylist.append(temp)
    print(
        "\n%6s.) %34s"
        % (
            str(i),
            str(temp) + "\u208d\u2081\u2080\u208e = ____________________\u208d\u2082\u208e",
        )
    )
print("\nRaise your hand when finished.")
