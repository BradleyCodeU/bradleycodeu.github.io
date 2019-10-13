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

Each function will return boolean values True or False

## areCirclesColliding

Create a function that requires the following arguments: x1, y1, radius1, x2, y2, radius2. It *returns* True if the two circles are colliding/intersecting.

Input &rarr; Output

areCirclesColliding(1,1,5,7,7,5) &rarr; True

areCirclesColliding(-1,1,5,-12,12,5) &rarr; False

areCirclesColliding(12,12,5,1,1,5) &rarr; False

areCirclesColliding(-7,7,5,-1,1,5) &rarr; True

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

Input &rarr; Output

isTouching(1,1,3,3,2) &rarr; False

isTouching(1,1,3,1,2) &rarr; True

isTouching(-3,-1,-2,-1,2) &rarr; True

isTouching(-4,-4,-1,-1,2) &rarr; False
