import random

mylist=[0,1,8,64,209,221,512]
print(
"""
Take a screenshot and complete in Notability OR copy/paste
the output into a text editor like Google Docs, Microsoft
Word, or the iOS Notes app. Set the font to COURIER NEW
and complete the worksheet."""
)
print("""  __    ___  ____   __    __   
 /  \  / __)(_  _) /  \  (  )  
(  O )( (__   )(  /  O \ / (_/\\
 \__/  \___) (__) \_/\_/ \____/""")
print("Octal Worksheet             Name: _______________")
print("Hint: 512s 64s 8s 1s")

print("\nPart A: Convert the octal number to decimal")
print("For example, 0321\u208d\u2088\u208e = 209\u208d\u2081\u2080\u208e")
for i in range(1,7):
    temp = (
        str(int(i / 6))
        + str(int(i / 3))
        + str(i + 1)
        + str(random.randint(i, 7))
    )
    while int(temp) in mylist:
      temp = (
        str(int(i / 6))
        + str(int(i / 3))
        + str(i + 1)
        + str(random.randint(i, 7))
      )
    mylist.append(int(temp))
    print(
        "%6s.) %21s"
        % (
            str(i),
            str(temp) + "\u208d\u2088\u208e = ______\u208d\u2081\u2080\u208e",
        )
    )
print("\nPart B: Convert the decimal number to octal")
print("For example, 221\u208d\u2081\u2080\u208e = 0335\u208d\u2088\u208e")
for i in range(6):
    temp = random.randint(i*i*10 + 9, i*i*10 + 19) + random.randint(i*i*10 + 9, i*i*10 + 19)
    while temp in mylist:
      temp = random.randint(i*i*10 + 9, i*i*10 + 19) + random.randint(i*i*10 + 9, i*i*10 + 19)
    mylist.append(temp)
    print(
        "\n%6s.) %29s"
        % (
            str(i + 7),
            str(temp) + "\u208d\u2081\u2080\u208e = _______________\u208d\u2088\u208e",
        )
    )
print("\nRaise your hand when finished.")
