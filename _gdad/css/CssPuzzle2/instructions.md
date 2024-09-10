---
layout: project
category: css
title: Css Puzzle 2
---

Using Puzzlescript, create a dungeon-crawler game that is similar to the original Legend of Zelda game... a "Zelda-like." The goal is to collect one-time-use swords (one-time-use in order to make the game more interesting), kill trolls, unlock doors with keys, and reach the exit of the dungeon (the goal).

PROJECT DIRECTIONS:

  1.  Replace the title and author.
  1.  Use bright colors for important/moving sprites. Use dull colors for background sprites.
  1.  You MUST design your own 5x5 sprites for Background, Target, Wall, Hero, HeroWithSword, Sword, Key, Lock, Troll. NONE of your finished sprites can look like this...
        ```
        00000
        00000
        00000
        00000
        00000
        ```


  1.  You MUST design 7 levels that gradually increase in difficulty/complexity. It MUST be possible to win. Each level should have increasingly more moving enemies to avoid.
  1.  Do NOT re-use any of Mr Riley's example levels. Those examples are provided in order to show you how the game works and maybe give you ideas about what is possible.

Here are some examples:

![The game as might appear when finished](/gdad\css\CssPuzzle2\zeldaExamples.png)

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
#2F4F2F
00000
00000
00000
00000
00000

Target
#223322
00000
00000
00000
00000
00000

Wall
#304433
00000
00000
00000
00000
00000

Hero
#2A4A2A #304433
.000.
.000.
01110
.111.
.1.1.

HeroWithSword
#AAAA66 #FFFFFF
.0001
.0001
.0001
.0001
.0001

Sword
#441144
00000
00000
00000
00000
00000

Key
#331133
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
[ Troll | Hero ] -> restart (swordless hero dies, restart level)
[ > Troll | HeroWithSword ] -> restart (hero dies, restart level)


==============
WINCONDITIONS
==============

All Player on Target

=======
LEVELS
=======

message here is an empty level template

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

message level 1

############x#
#.....##s...l#
#.....##.t...#
#.....##..k..#
#.....##.....#
#.....##.....#
##########.###
##########l###
#.....##.....#
#.....##...k.#
#.....##.....#
#.....##...p.#
#.....##.....#
##############

message level 2

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

message level 3

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

message level 4

########x#####
#.....##l..s.#
#.k.k.####l#s#
#........#.#.#
#.k.k.##.#.#.#
#...t.##.#.#.#
#.###.##.#.#.#
#.###.##.#.#.#
#...p.##.....#
#####l####...#
####..####..t#
####....slt..#
####..####...#
##############

message here is an empty level template

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