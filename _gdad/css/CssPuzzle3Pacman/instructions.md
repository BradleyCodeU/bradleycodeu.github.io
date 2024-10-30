---
layout: project
category: css
title: Css Puzzle 3 Pacman
---

Using [PuzzleScript](https://www.puzzlescript.net/editor.html), create a puzzle game that is similar to [Pac-man](https://en.wikipedia.org/wiki/Pac-Man)... a "Pacman-like." The goal is to collect all of the Dots without touching any Ghosts.

The Puzzlescript editor is here: [https://www.puzzlescript.net/editor.html](https://www.puzzlescript.net/editor.html)

### PROJECT DIRECTIONS:

1. You MUST use [hexcode colors](https://en.wikipedia.org/wiki/Web_colors#HTML_color_names). Use bright colors for important sprites. Use dull colors for background sprites. The starter code below has the wrong colors and you need to fix them.

1. You MUST design your own 5x5 sprites for Player, Wall, etc. 
1. NONE of your finished sprites can just be a square

1. Each level MUST have 1 or more moving enemies to avoid.
1. You MUST design 5 levels that gradually increase in difficulty/complexity. Levels MUST be rectangular. In other words, the length of each row must be the same.
1. It MUST be possible to win.

1. Replace the title and author.

Example:

![The game as it might appear when finished](/gdad\css\CssPuzzle3Pacman\PacmanExample1.png)


When finished, click EXPORT. Turn in your finished HTML file.

### STARTER TEMPLATE:
```
title Pacman-like Game

author Your Name

===========
OBJECTS
===========

Background
#005500

Player
#000000
00000
00000
00000
00000
00000

DefeatedPlayer
#000000
.....
.0.0.
..0..
.0.0.
.....


Wall
#000000 #000000
00010
11111
01000
11111
00010

LeftGhost (enemy facing left)
#000000 #000000 #000000
.0000
00000
12120
00000
.0000

UpGhost (enemy facing up)
#000000 #000000 #000000
.000.
01010
02020
00000
00000

RightGhost (enemy facing right)
#000000 #000000 #000000
0000.
00000
02121
00000
0000.

DownGhost (enemy facing down)
#000000 #000000 #000000
00000
02020
01010
00000
.000.

Dot
#000000
.....
.....
..0..
.....
.....

=======
LEGEND
=======
P = Player
G = LeftGhost
# = Wall
. = Dot
Ghost = LeftGhost or UpGhost or RightGhost or DownGhost

=======
SOUNDS
=======

sfx0 13969308
sfx1 66397907
sfx2 69186905

================
COLLISIONLAYERS
================
Background
Dot
Wall, Player, DefeatedPlayer
Ghost

======
RULES
======

( Prevents player from walking into walls )
[> Player|Wall] -> cancel
( Cancels player action button )
[action player] -> cancel
( Player to the right, ghost moves to the right )
left [Player|...|Ghost] -> [Player|...| < RightGhost]
( Player to the left, ghost moves to the left )
right [Player|...|Ghost] -> [Player|...| < LeftGhost]
( Player below, ghost moves down)
up [Player|...|Ghost] -> [Player|...| < DownGhost]
( Player above, ghost moves up )
down [Player|...|Ghost] -> [Player|...| < UpGhost]
( Left-moving ghost continues moving left if stationary )
[ stationary LeftGhost ] -> [ left LeftGhost ]
( Up-moving ghost continues moving up if stationary )
[ stationary UpGhost ] -> [ up UpGhost ]
( Right-moving ghost continues moving right if stationary )
[ stationary RightGhost ] -> [ right RightGhost ]
( Down-moving ghost continues moving down if stationary )
[ stationary DownGhost ] -> [ down DownGhost ]
( When two ghosts collide, they bounce back in opposite directions )
[ Ghost | Ghost ] -> [ < Ghost | > Ghost ]
( Left-moving ghost hits a wall and turns upward )
[ > LeftGhost | Wall ] -> [ UpGhost | Wall ]
( Up-moving ghost hits a wall and turns right )
[ > UpGhost | Wall ] -> [ RightGhost | Wall ]
( Right-moving ghost hits a wall and turns downward )
[ > RightGhost | Wall ] -> [ DownGhost | Wall ]
( Down-moving ghost hits a wall and turns left )
[ > DownGhost | Wall ] -> [ LeftGhost | Wall ]
( If the player dies, restart the level and play defeated sound )
[DefeatedPlayer] -> restart 
( When a ghost touches the player, mark player as defeated and retain ghost position )
late [Player | Ghost] -> [DefeatedPlayer|Ghost] sfx0
( Another rule for when a ghost touches the player from different movement frames )
late [Player Ghost] -> [DefeatedPlayer Ghost] sfx0
( Player collects a dot, removes the dot and plays sound )
[ > Player | Dot ] -> [ | Player ] sfx1

==============
WINCONDITIONS
==============
(Win Condition: Collect all dots)

no Dot 
    
===========
LEVELS
=========

message Level 1

##########
#........#
#.###.##.#
#..G.....#
#.##.###.#
#......P.#
#.###.##.#
#........#
##########

message Level 2

###########
#.........#
#.###.###.#
#.........#
#.##.####.#
#..P......#
#.###.###.#
#.........#
###########

message Level 3

############
#...G......#
#.####.###.#
#...G......#
#.###.####.#
#........P.#
#.####.###.#
#...G......#
############

message Level 4

###########
#.........#
#.###.###.#
#.........#
#.##.####.#
#..P......#
#.###.###.#
#.........#
###########

message Level 5

###########
#.........#
#.###.###.#
#.........#
#.##.####.#
#..P......#
#.###.###.#
#.........#
###########

message YOU WIN
```