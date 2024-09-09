---
layout: project
category: css
title: Css Puzzle 3
---

Using Puzzlescript, create a game that is similar to Frogger... a "Frogger-like." The goal is to start on one side of the level and reach the other side of the level (the goal) without touching any of the moving enemies (cars and trucks).

PROJECT DIRECTIONS:

1. Replace the title and author.
1. You MUST design your own 5x5 sprites for Background, Target, Wall, Tunnel, Player, Car, etc. The Car sprite should face left.
1. Use bright colors for important moving sprites. Use dull colors for background sprites.
1. Each level has 5 or more moving enemies to avoid.
1. You MUST design 5 levels that gradually increase in difficulty/complexity. It MUST be possible to win.
1. In level #5, add a BlueCar enemy that moves from left-to-right. Look at the existing rules to help you figure out how to move BlueCar. (Hint: Try copying the red car movement rule and switching "left" to "right" and switching "Car" to "BlueCar") You MUST restart the level if the player is on the same tile as BlueCar and MUST restart the level if the player is directly in front of BlueCar.

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
.000.
00000
00000
00000
.000.

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

```
