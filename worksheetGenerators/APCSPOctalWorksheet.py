import random

mylist=["0321",221]
print(
"""
Take a screenshot and complete in Notability OR copy/paste
the output into a text editor like Google Docs, Microsoft
Word, or the iOS Notes app. Set the font to COURIER NEW
and complete the worksheet.
"""
)
print("""\n  __    ___  ____   __    __
 /  \  / __)(_  _) /  \  (  )
(  O )( (__   )(  /  O \ / (_/\\
 \__/  \___) (__) \_/\_/ \____/""")
print("Octal Worksheet")
print("Hint: 512s 64s 8s 1s")
for i in range(1):
    print("                     Name: _______________")

print("\nPart A: Convert the octal number to decimal")
print("For example, 0321\u208d\u2088\u208e = 209\u208d\u2081\u2080\u208e")
for i in range(6):
    temp = (
        str(random.randint(0, int(i / 3)))
        + str(random.randint(0, int(i / 2) + 1))
        + str(random.randint(0, i + 1))
        + str(random.randint(i + 1, 7))
    )
    while temp in mylist:
      temp = (
        str(random.randint(0, int(i / 3)))
        + str(random.randint(0, int(i / 2) + 1))
        + str(random.randint(0, i + 1))
        + str(random.randint(i + 1, 7))
      )
    mylist.append(temp)
    print(
        "%6s.) %21s"
        % (
            str(i + 1),
            str(temp) + "\u208d\u2088\u208e = ______\u208d\u2081\u2080\u208e",
        )
    )
print("\nPart B: Convert the decimal number to octal")
print("For example, 221\u208d\u2081\u2080\u208e = 0335\u208d\u2088\u208e")
for i in range(6):
    temp = random.randint(i*10+1, i * 25 + 10) + random.randint(i*10, i * 25 + 10)
    while temp in mylist:
      temp = random.randint(i*10+1, i * 25 + 10) + random.randint(i*10, i * 25 + 10)
    mylist.append(temp)
    print(
        "\n%6s.) %29s"
        % (
            str(i + 7),
            str(temp) + "\u208d\u2081\u2080\u208e = _______________\u208d\u2088\u208e",
        )
    )
print("\nRaise your hand when finished.")
