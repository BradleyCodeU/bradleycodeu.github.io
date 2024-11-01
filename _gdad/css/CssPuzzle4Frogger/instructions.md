---
layout: project
category: css
title: Css Puzzle 4 Frogger
---

Using [Puzzlescript](https://www.puzzlescript.net/editor.html), create a game that is similar to [Frogger](https://en.wikipedia.org/wiki/Frogger)... a "Frogger-like." The goal is to start on one side of the level and reach the other side of the level (the goal) without touching any of the moving enemies (cars and trucks).

The Puzzlescript editor is here: [https://www.puzzlescript.net/editor.html](https://www.puzzlescript.net/editor.html)

PROJECT DIRECTIONS:


1. You MUST design your own 5x5 sprites for Background, Target, Wall, Tunnel, Player, Car, etc. The Car sprite should face left. 
1. NONE of your finished sprites can just be a square.
1. You MUST use [hexcode colors](https://en.wikipedia.org/wiki/Web_colors#HTML_color_names). Use bright colors for important sprites. Use dull colors for background sprites. The starter code below has the wrong colors and you need to fix them.
1. Each level MUST have 5 or more moving enemies to avoid.
1. You MUST design 5 levels that gradually increase in difficulty/complexity. Levels MUST be rectangular. In other words, the length of each row must be the same.
1. It MUST be possible to win.
1. Do NOT re-use any of Mr Riley's example levels. Those examples are provided in order to show you how the game works and maybe give you ideas about what is possible.
1. In level #5, you MUST add a BlueCar enemy that moves from left-to-right. Look at the existing rules to help you figure out how to move BlueCar. (Hint: Try copying the red car movement rule and switching "left" to "right" and switching "Car" to "BlueCar") You MUST restart the level if the player is on the same tile as BlueCar and MUST restart the level if the player is directly in front of BlueCar.
1. Replace the title and author.

Here are some examples:

![The game as might appear when finished](/gdad\css\CssPuzzle3\froggerExamples.png)

When finished, click EXPORT. Turn in your finished HTML file here.

 

STARTER TEMPLATE:

```
title Frog Game
author Mr Riley
zoomscreen 9x9

========
OBJECTS
========

Background
#aaffaa
00000
00000
00000
00000
00000

Target
#000022
..0..
.000.
00000
.000.
..0..

Wall
#ffaa77
00000
00000
00000
00000
00000

Tunnel
#332211
.000.
00000
00000
00000
00000

Player
#001100
00000
00000
00000
00000
00000

Car
#220000
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
t = Tunnel
p = Player
o = Target
c = Car

=======
SOUNDS
=======

TitleScreen 5337906
ShowMessage 61224106
CloseMessage 1241234
Startlevel 22711100
EndLevel 88568102
Restart 123413
player Move 92275707
player CantMove 69279104

================
COLLISIONLAYERS
================

Background
Target
Player, Wall, Tunnel
Car

======
RULES
======


[ stationary Car ] -> [ left Car ]
right [ Tunnel < Car | ... | Tunnel ] -> [ Tunnel | ... | Car Tunnel ]
[ Player Car ] -> restart
[ Player |< Car ] -> restart

==============
WINCONDITIONS
==============

all Player on Target

=======
LEVELS
=======

message Level 1

#ooooooo#
tc....c.t
t.c..c..t
#.......#
t...c.c.t
t....c.ct
#...p...#

message Level 2

#ooooooo#
t...c...t
t....c.t#
#.......#
t.....ct#
t......ct
t...c...t
t....c.t#
#.......#
t...c.ct#
t....c.ct
t...c...t
t....c.t#
#.......#
t.....ct#
t......ct
t...c...t
t....c.t#
#.......#
t.c...ct#
t..c...ct
#...p...# 

message Level 3

message Level 4

message Level 5

message You Win!
```
