---
layout: project
category: css
title: Css Puzzle 1
---

First, read this blog post about "How To Make A Good Puzzle": [https://auroriax.com/puzzle-explorable/](https://auroriax.com/puzzle-explorable/)



Here are the solutions to the puzzles from the blog post: [https://auroriax.com/puzzle-explorable-solutions/](https://auroriax.com/puzzle-explorable-solutions/)



Key Points:

  -  <mark>"A good puzzle should explain itself"</mark> Use bright colors for important sprites. Use dull colors for background sprites. The bright sprites will catch the player's attention.
  -  "If the player has an expectation of how an object will react before attempting to interact with it, that will help them learn and understand the puzzle faster" Do NOT try to trick the player with identical looking objects that behave in different ways.
  -  "A puzzle should be inviting and rewarding. <mark> The designer should always subtly push the player towards the correct solution."</mark> The designer and player are on the same team.
  -  <mark>"a good puzzle wants to be solved!"</mark> The designer should gradually provide more difficult (NOT impossible) challenges
  -  "puzzles should be in their smallest solvable setup" Remove unnecessary clutter.


## PROJECT DIRECTIONS:

Using [Puzzlescript](https://www.puzzlescript.net/) you will create a simple [Sokoban](https://en.wikipedia.org/wiki/Sokoban) box-pushing puzzle game. The Puzzlescript editor is located here: [https://www.puzzlescript.net/editor.html](https://www.puzzlescript.net/editor.html)


REMEMBER:


  1.  Use bright colors for important sprites. Use dull colors for background sprites. Oops! The colors in Mr Riley's starter code need fixed!
  1.  You MUST design your own 5x5 sprites for Background, Target, Wall, Player, Box, etc. NONE of your finished sprites can look like this...
        ```
        00000
        00000
        00000
        00000
        00000
        ```
  1.  You MUST design 5 levels that gradually increase in difficulty/complexity. It MUST be possible to win.
  1.  Replace the title and author.

When finished, click EXPORT. Turn in your finished HTML file here.



Here is what the starter code below looks like when exported: [bradleycodeu.github.io/gdad/html/PuzzleScriptSokobanExample.html](bradleycodeu.github.io/gdad/html/PuzzleScriptSokobanExample.html)



STARTER CODE:
```
title PuzzleScript Sokoban example
author Mr Riley

========
OBJECTS
========

Background
#FFFF00 #008000
11111
01111
11101
11111
10111

Target
#808080 #D3D3D3
.....
.010.
.101.
.010.
.....

Wall
#FFFF00 #A52A2A
00010
11111
01000
11111
00010

Player
#808080 #A9A9A9 #D3D3D3 #A52A2A
.00..
.11..
2222.
.33..
3..3.

Box
#A9A9A9 #D3D3D3 #808080
00000
01220
02120
02210
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
