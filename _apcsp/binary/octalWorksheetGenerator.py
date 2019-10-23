import random

print(
    """Run this code, then copy/paste the output to a
text editor like Google Docs or Micrsoft Word.
Finally, complete the worksheet with a partner."""
)
print("\nOctal Worksheet")
for i in range(2):
    print("  Name: _______________")
print("  Hint: 512s 64s 8s 1s")
print("\nPart A: Convert the octal number to decimal")
print("For example, 0321\u208d\u2088\u208e = 209\u208d\u2081\u2080\u208e")
for i in range(6):
    temp = (
        str(random.randint(0, int(i / 3)))
        + str(random.randint(0, int(i / 2) + 1))
        + str(random.randint(0, i + 1))
        + str(random.randint(i + 1, 7))
    )
    print(
        "%6s.%21s"
        % (
            str(i + 1),
            str(temp) + "\u208d\u2088\u208e = ______\u208d\u2081\u2080\u208e",
        )
    )
print("\nPart B: Convert the decimal number to octal")
print("For example, 221\u208d\u2081\u2080\u208e = 0335\u208d\u2088\u208e")
for i in range(6):
    temp = random.randint(i, i * 20 + 10) + random.randint(i, i * 20 + 10)
    print(
        "%6s.%20s"
        % (
            str(i + 7),
            str(temp) + "\u208d\u2081\u2080\u208e = ______\u208d\u2088\u208e",
        )
    )
print("\nRaise your hand when finished.")
