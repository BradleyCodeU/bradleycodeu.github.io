---
layout: project
category: css
title: Css Puzzle 2 Zelda
---

Using [Puzzlescript](https://www.puzzlescript.net/editor.html), create a dungeon-crawler game that is similar to the original [Legend of Zelda](https://en.wikipedia.org/wiki/The_Legend_of_Zelda_(video_game)) game... a "Zelda-like." The goal is to collect one-time-use swords (one-time-use in order to make the game more interesting), kill trolls, unlock doors with keys (by pushing the key into the locked door), and reach the exit of the dungeon (the goal).

The Puzzlescript editor is here: [https://www.puzzlescript.net/editor.html](https://www.puzzlescript.net/editor.html)


PROJECT DIRECTIONS:

 

  1.  You MUST design your own 5x5 sprites for Background, Target, Wall, Hero, HeroWithSword, Sword, Key, Lock, Troll. 
  1.  NONE of your finished sprites can just be a square
  1.  You MUST use [hexcode colors](https://en.wikipedia.org/wiki/Web_colors#HTML_color_names). Use bright colors for important sprites. Use dull colors for background sprites. The starter code below has the wrong colors and you need to fix them.
  1.  Each level MUST have 2 or more moving enemies to avoid.
  1.  You MUST design 5 levels that gradually increase in difficulty/complexity. Levels MUST be rectangular. In other words, the length of each row must be the same.
  1.  Do NOT re-use any of Mr Riley's example levels. Those examples are provided in order to show you how the game works and maybe give you ideas about what is possible.
  1.  It MUST be possible to win.
  1.  Replace the title and author.

Here are some examples:

![The game as might appear when finished](/gdad\css\CssPuzzle2Zelda\zeldaExamples.png)

When finished, click EXPORT. Turn in your finished HTML file.



STARTER TEMPLATE:
```
title RPG Demo
author Mr Riley
flickscreen 7x7

========
OBJECTS
========

Background
#00FF00
00000
00000
00000
00000
00000

Target
#333333
00000
00000
00000
00000
00000

Wall
#00FFFF
00000
00000
00000
00000
00000

Hero
#333333 #00FF00
.000.
.000.
01110
.111.
.1.1.

HeroWithSword
#333333 #FFFFFF
.0001
.0001
.0001
.0001
.0001

Sword
#551144
00000
00000
00000
00000
00000

Key
#331155
00000
00000
00000
00000
00000

Lock
#441133
00000
00000
00000
00000
00000

Troll
#331144
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
p = Hero
k = Key
l = Lock
x = Target
s = Sword
t = Troll
Player = Hero or HeroWithSword


=======
SOUNDS
=======

Key MOVE 36772507
restart 25967902
endlevel 83744503
startgame 92244503
sfx0 6408904
sfx1 78973300
sfx2 4769303

================
COLLISIONLAYERS
================

Background
Target
Player, Wall, Key, Lock, Sword, Troll

======
RULES
======

[ > Player | Key ] -> [ > Player | > Key ] (if player bumps key, move both)
[ > Key | Lock ] -> [ | ] sfx1 (if key bumps lock, both disappear)
[ > Hero | Sword ] -> [ | HeroWithSword ] sfx2 (if player bumps sword, replace)
[ Troll | ... | Player ] -> [ > Troll | ... | Player ] (troll chases player)
[ > HeroWithSword | Troll ] -> [|Hero] sfx0 (hero kills troll and sword breaks)
[ Troll | Hero ] -> restart (swordless hero defeated, restart level)
[ > Troll | HeroWithSword ] -> restart (hero defeated, restart level)


==============
WINCONDITIONS
==============

All Player on Target

=======
LEVELS
=======



message level 1

############x#
#.....##s...l#
#.....##.t...#
#.........k..#
#.....##.....#
#.....##.....#
###.######.###
###.######l###
#.....##.....#
#.....##.....#
#..k...l..k..#
#.....##...p.#
#.....##.....#
##############

message level 2

###x##########
#.....##.....#
#.....##.....#
#............#
#.....##.....#
#.....##.....#
##.########.##
##.########.##
#.....##.....#
#.....##.....#
#.....##.....#
#..........p.#
#.....##.....#
##############

message level 3

#x############
#l.#.t##s...t#
#..#..##.....#
#..#......s..#
#.##..##.....#
#...k.##....s#
#.###.##.#####
#l###.##.#####
#t....##.....#
#....k.......#
#.....##.....#
#.....##...p.#
#.....##.....#
##############

message level 4

###x##########
#..l..##...t.#
#......l.....#
#.....##..k.s#
########.....#
#....s##.t...#
##.########.##
##.########l##
#s....##.....#
#....t##.k...#
#.....##..p..#
#t.k.........#
#..s..##.....#
##############


message level 5

###x##########
#.....##.....#
#.....##.....#
#............#
#.....##.....#
#.....##.....#
##.########.##
##.########.##
#.....##.....#
#.....##.....#
#.....##.....#
#..........p.#
#.....##.....#
##############

message you win!
```