import random

mylist = [199]
hr = "+-------+--------+---------+--------+--------+--------+"
print(
    """
Take a screenshot and complete in Notability OR copy/paste the
output into a text editor like Google Docs or Microsoft Word.
Set the font to COURIER NEW and then complete the worksheet.
"""
)
print(""" ██████╗ ██████╗ ██╗███╗   ██╗███████╗
██╔════╝██╔═══██╗██║████╗  ██║██╔════╝
██║     ██║   ██║██║██╔██╗ ██║███████╗
██║     ██║   ██║██║██║╚██╗██║╚════██║
╚██████╗╚██████╔╝██║██║ ╚████║███████║
 ╚═════╝ ╚═════╝ ╚═╝╚═╝  ╚═══╝╚══════╝""")
print("""Counting Coins Worksheet""")
for i in range(1):
    print("                                 Name: _______________")
print(
    """Convert each amount of cents to coins.
Notice that each column has a maximum number.
In the example, you CANNOT say 199 pennies.
You MUST make 199 cents using 1 silver dollar,
3 quarters, 2 dimes, 0 nickels, and 4 pennies."""
)
print(
"""
+=======+========+=========+========+========+========+
|Random |Dollars |Quarters |Dimes   |Nickels |Pennies |
|Number |(max 4) |(max 3)  |(max 2) |(max 1) |(max 4) |
+=======+========+=========+========+========+========+"""
)
print("|%6s | 1      | 3       | 2      | 0      | 4      |" % "199\u00A2")
# |
print(hr)
#print("|       |        |         |        |        |        |")

for i in range(10):
    temp = (
        random.randint(1, 4 + i * 18)
        + random.randint(i*5, 4 + i * 18)
        + random.randint(i*5, 4 + i * 18)
    )
    if temp % 2 == 0: temp -= 1
    if temp % 5 == 0: temp -= 2
    while temp in mylist:
      temp = (
        random.randint(1, 4 + i * 18)
        + random.randint(i*5, 4 + i * 18)
        + random.randint(i*5, 4 + i * 18)
      )
      if temp % 2 == 0: temp -= 1
      if temp % 5 == 0: temp -= 2
    mylist.append(temp)
    print(
      "|%6s |        |         |        |        |        |" %
      (str(temp) + "\u00A2")
    )
    print(hr)

#print("\nRaise your hand when finished.")
