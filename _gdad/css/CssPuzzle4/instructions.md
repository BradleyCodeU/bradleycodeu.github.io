---
layout: project
category: css
title: Css Puzzle 4
---

Using PuzzleScript, create a puzzle game that is similar to Pac-man... a "Pacman-like." The goal is to collect all of the Dots without touching any Ghosts.

### TO DO:

1. Fix the colors for the sprites

1. Fix the sprites

1. You MUST design 5 levels that gradually increase in difficulty/complexity. It MUST be possible to win.

Before:
![The game as it appears in the starter code](/gdad\css\CssPuzzle4\PacmanExample2.png)
After:
![The game as might appear when finished](/gdad\css\CssPuzzle4\PacmanExample1.png)

When finished, click EXPORT. Turn in your finished HTML file.

### STARTER TEMPLATE:
```
title Pacman-like Game

author Your Name

homepage none


===========
OBJECTS
===========

Background
green

Player
black
00000
00000
00000
00000
00000

DeadPlayer
black
.....
.000.
.000.
.000.
.....


Wall
black black
00010
11111
01000
11111
00010

LeftGhost
black black black
.....
.000.
1212.
.000.
.....

UpGhost
black black black
..0..
.101.
.202.
.000.
.....

RightGhost
black black black
.....
.000.
.2121
.000.
.....

DownGhost
black black black
.....
.202.
.101.
.000.
..0..

Dot
black
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
Wall, Player, DeadPlayer
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
( If the player dies, restart the level and play death sound )
[DeadPlayer] -> restart 
( When a ghost touches the player, mark player as dead and retain ghost position )
late [Player | Ghost] -> [DeadPlayer|Ghost] sfx0
( Another rule for when a ghost touches the player from different movement frames )
late [Player Ghost] -> [DeadPlayer Ghost] sfx0
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
#..G.....#
#.###.##.#
#..G.....#
#.##.###.#
#..P.....#
#.###.##.#
#..G.....#
##########

```

message YOU WIN