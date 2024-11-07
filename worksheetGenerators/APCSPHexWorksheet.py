import random

b10="\u208d\u2081\u2080\u208e"
b16="\u208d\u2081\u2086\u208e"
mylist=["00FC",252,225,"00E1",0,1,16,256,4096]
print(
"""
Take a screenshot and complete in Notability OR copy/paste
the output into a text editor like Google Docs, Microsoft
Word, or the iOS Notes app. Set the font to COURIER NEW
and complete the worksheet_           _                 _ 
  /\  /\_____  ____ _  __| | ___  ___(_)_ __ ___   __ _| |
 / /_/ / _ \ \/ / _` |/ _` |/ _ \/ __| | '_ ` _ \ / _` | |
/ __  /  __/>  < (_| | (_| |  __/ (__| | | | | | | (_| | |
\/ /_/ \___/_/\_\__,_|\__,_|\___|\___|_|_| |_| |_|\__,_|_|
Hexadecimal Worksheet                   Name: ______________________________
Hex is a base-16 system that uses 0123456789ABCDEF
A=10 B=11 C=12 D=13 E=14 F=15
Columns are: 4096s 256s 16s 1s
""")

print("Part A: Convert the base-16 number to decimal")
print("  For example, 00FC"+b16+" = 252"+b10)
for i in range(6):
    temp = random.randint(i*i*10,i*i*10+10)+random.randint(i*i*10,i*i*10+10)+17
    # temp = temp[2:].zfill(4).upper()
    while temp in mylist:
      temp = random.randint(i*i*10,i*i*10+10)+random.randint(i*i*10,i*i*10+10)+17
      # temp = temp
    mylist.append(temp)
    print(
        "%6s.) %22s"
        % (
            str(i + 1),
            str(str(hex(temp))[2:].zfill(4).upper()) + b16 + " = ______"+b10,
        )
    )
print("\nPart B: Convert the decimal number to base-16")
print("  For example, 225"+ b10 +" = 00E1"+b16)
for i in range(2,8):
    temp = random.randint(i*i*3,i*i*3+10) + random.randint(i*i*3,i*i*3+10)+18
    # if i%2==0:temp+=1
    while temp in mylist:
      temp = random.randint(i*i*3,i*i*3+10) + random.randint(i*i*3,i*i*3+10)+18
      # if i%2==0:temp+=1
    mylist.append(temp)
    print(
        "\n%6s.) %25s"
        % (
            str(i + 5),
            str(temp) + b10 + " = __________"+b16,
        )
    )
print("\nRaise your hand when finished.")
