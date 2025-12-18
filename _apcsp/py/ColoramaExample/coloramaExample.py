from colorama import *
import sys
import time

def typing(txt, text_speed=0.02):
    new_line_speed = 0.3
    for char in txt:
        if char != "\n":
            sys.stdout.write(char)
            sys.stdout.flush()
            time.sleep(text_speed)
        else:
            sys.stdout.write(Style.RESET_ALL + "\n")
            sys.stdout.flush()
            time.sleep(text_speed + new_line_speed) # wait longer for new lines
    else:
        sys.stdout.write(Style.RESET_ALL + "\n")
        time.sleep(text_speed + new_line_speed) # wait longer for new lines

init()
print(Back.BLACK + Fore.RED + 'some red text')
print(Style.RESET_ALL + 'back to default color again')
print(Fore.RED + Back.YELLOW + 'some red text')
print(Fore.BLUE + Back.WHITE + 'some blue text')
print(Back.BLACK + Fore.RED)
typing('some red text')
typing('back to default color again')
typing(Fore.RED + Back.YELLOW + 'some red text')
typing(Fore.BLUE + Back.WHITE + 'some blue text')