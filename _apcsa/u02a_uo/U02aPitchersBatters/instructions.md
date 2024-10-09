---
layout: project
category: u02a-using-objects
title: U02a Pitchers Batters
---

Mr. Riley has provided a Pitcher class and a Batter class. Documentation for the classes can be found here: [https://bradleycodeu.github.io/apcsa/u02a_uo/U02aPitchersAndBatters/doc/package-summary.html](https://bradleycodeu.github.io/apcsa/u02a_uo/U02aPitchersAndBatters/doc/package-summary.html)

A Pitcher object MUST be given a name as an argument when it is constructed. Construct a Pitcher object like this...
```
Pitcher myPitcher = new Pitcher("Steve");
```

A Pitcher object can only do one thing, nextPitch(), which returns a String...
```
String message = myPitcher.nextPitch();
```

A Batter object MUST be given a name as an argument when it is constructed. A Batter object can only do one thing, nextSwing(), which returns a String...
```
message = myBatter.nextSwing();
```
