---
layout: project
category: css
title: Css Puzzle 1 Sokoban
---

How To Make A Good Puzzle ([source](https://auroriax.com/puzzle-explorable/)): 

  -  <mark>"A good puzzle should explain itself"</mark> Use bright colors for important sprites. Use dull colors for background sprites. The bright sprites will catch the player's attention.
  -  "If the player has an expectation of how an object will react before attempting to interact with it, that will help them learn and understand the puzzle faster" A well-designed sprite symbolizes the object in a recognizable way. Do NOT try to 'trick' the player with identical looking objects that behave in different ways.
  -  "A puzzle should be inviting and rewarding. <mark> The designer should always subtly push the player towards the correct solution."</mark> The designer and player are on the same team.
  -  <mark>"a good puzzle wants to be solved!"</mark> The designer should gradually provide more difficult (NOT impossible) challenges
  -  "puzzles should be in their smallest solvable setup" Remove unnecessary clutter or unnecessary space.




Using [Puzzlescript](https://www.puzzlescript.net/editor.html) you will create a simple [Sokoban](https://en.wikipedia.org/wiki/Sokoban) box-pushing puzzle game. The Puzzlescript editor is located here: [https://www.puzzlescript.net/editor.html](https://www.puzzlescript.net/editor.html)


## PROJECT DIRECTIONS:


  
  1.  You MUST design your own 5x5 sprites for Background, Target, Wall, Player, Box, etc. 
  1.  NONE of your finished sprites can just be a square
  1.  You MUST use [hexcode colors](https://en.wikipedia.org/wiki/Web_colors#HTML_color_names). Use bright colors for important sprites. Use dull colors for background sprites. The starter code below has the wrong colors and you need to fix them.
  1.  You MUST design 5 levels that gradually increase in difficulty/complexity. Levels MUST be rectangular. In other words, the length of each row must be the same.
  1.  It MUST be possible to win.
  1.  Replace the title and author.

When finished, click EXPORT. Turn in your finished HTML file here.







STARTER CODE:
```
title PuzzleScript Sokoban example
author Mr Riley

========
OBJECTS
========

Background
#ffff00 #00ff00
11111
01111
11101
11111
10111

Target
#333333
00000
00000
00000
00000
00000

Wall
#ffff00 #995500
00010
11111
01000
11111
00010

Player
#999999 #555555 #cccccc #995500
.00..
.11..
2222.
.33..
3..3.

Box
#555555
00000
00000
00000
00000
00000

=======
LEGEND
=======

. = Background
# = Wall
p = Player
b = Box
% = Box and Target
x = Target

=======
SOUNDS
=======

Box MOVE 36772507
Player MOVE 57790707
endlevel 83744503
startgame 92244503

================
COLLISIONLAYERS
================

Background
Target
Player, Wall, Box

======
RULES
======

[ > Player | Box ] -> [ > Player | > Box ]

==============
WINCONDITIONS
==============

all Box on Target

=======
LEVELS
=======

message Notice that this demo contains several mistakes... Levels SHOULD gradually increase in difficulty/complexity. Important sprites SHOULD be bright colors. Background sprites SHOULD be dull colors.
message level 1

########
#......#
#......#
#..#p..#
#..x%..#
#..b%..#
#......#
########

message level 2
message This level is a good example of how "puzzles should be in their smallest solvable setup"

........
....#...
..##x#..
.#.b.#..
.#.#p.#.
.#.xb.#.
.#...#..
..###...

message level 3

########
#......#
#......#
#..#p..#
#..xb..#
#......#
#......#
########

message level 4

########
#......#
#...p..#
#..x...#
#..#...#
#...b..#
#......#
########

message level 5

########
#......#
#...p..#
#..x...#
#......#
#.b.#..#
#......#
########

message you win!
```
