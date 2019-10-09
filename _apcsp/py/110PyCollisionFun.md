---
layout: project
category: py
title: Collision Fun
---
Create TWO of the following collision functions:
- [areCirclesColliding](#arecirclescolliding)
- [doesCircleContain](#doescirclecontain)
- [doesRectContain](#doesrectcontain)
- [isTouching](#istouching)

## areCirclesColliding

Create a function that requires the following arguments: x1, y1, radius1, x2, y2, radius2. It *returns* True if the two circles are colliding/intersecting.

## doesCircleContain

Create a function that requires the following arguments: circleX, circleY, circleRadius, pointX, pointY. It *returns* True if the circle contains the point (pointX, pointY).

Input &rarr; Output

doesCircleContain(0,0,10,1,2) &rarr; True

doesCircleContain(0,0,10,0,-9) &rarr; True

doesCircleContain(0,0,10,999,999) &rarr; False

doesCircleContain(0,0,10,0,999) &rarr; False

## doesRectContain

Create a function that requires the following arguments: rectX, rectY, rectWidth, rectHeight, pointX, pointY. It *returns* True if the rectangle contains the point (pointX, pointY).

Input &rarr; Output

doesRectContain(0,10,10,10,1,2) &rarr; True

doesRectContain(0,10,10,10,-1,-2) &rarr; False

doesRectContain(0,10,10,10,9,9) &rarr; True

doesRectContain(0,10,10,10,-9,9) &rarr; False


## isTouching

Create a function that requires the following arguments: x1, y1, x2, y2, minimumDistance. It *returns* True if the distance between the two points is less than or equal to minimumDistance.
