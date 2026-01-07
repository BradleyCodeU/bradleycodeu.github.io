---
layout: project
category: u01a_primitive_types
title: Ch1 Passer Rating
---

Passer rating (also known as passing efficiency in college football) is a measure of the performance of passers, primarily quarterbacks, in gridiron football. Passer rating is calculated using a player's pass attempts, completions, yards, touchdowns, and interceptions. Passer rating in the NFL is on a scale from 0 to 158.3.

Since 1973, passer rating has been the official formula used by the NFL to determine its passing leader.

Passer rating is sometimes colloquially referred to as “quarterback rating” or “QB rating”, however the statistic applies only to passing (not to other contributions by a quarterback) and applies to any player at any position who throws a forward pass, not just to quarterbacks.

- Fill in the body of the method calculateNFLRating(int attempts, int completions, int yards, int touchdowns, int interceptions) and return a double. Use the NFL formula found here [https://en.wikipedia.org/wiki/Passer_rating#NFL_and_CFL_formula](https://en.wikipedia.org/wiki/Passer_rating#NFL_and_CFL_formula) 
- Fill in the body of the method calculateCollegeRating(int attempts, int completions, int yards, int touchdowns, int interceptions) and return a double. Use the NCAA formula found here [https://en.wikipedia.org/wiki/Passer_rating#NCAA_formula](https://en.wikipedia.org/wiki/Passer_rating#NCAA_formula) 


### Sample run #1:
```
*** Passer Rating Calculator ***
Enter the QB name: Tom Brady
Enter the year: 2016
Pass attempts: 432
Completions: 291
Passing yards: 3554
Touchdown passes: 28
Interceptions: 2

*** Results ***
The 2016 NFL passer rating for Tom Brady is 112.17206790123457
College passer rating would be 156.92962962962963
```
### Sample run #2:
```
*** Passer Rating Calculator ***
Enter the QB name: Aaron Rodgers
Enter the year: 2011
Pass attempts: 502
Completions: 343
Passing yards: 4643
Touchdown passes: 45
Interceptions: 6

*** Results ***
The 2011 NFL passer rating for Aaron Rodgers is 122.46015936254979
College passer rating would be 173.20956175298807
```



IMPORTANT NOTE: Although QB stats such as attempts would LOGICALLY be stored as an integer, you will need to convert the attempts to double (aka convert from int to decimal numbers) in order to avoid an incorrect result caused by [integer division](https://www.educative.io/answers/wrong-results-for-division-in-java).  When dividing two integers, Java uses integer division and the result is also an integer. The result is truncated (the fractional part is thrown away) and NOT rounded to the closest integer. `7 / 4` in Java will equal 1. However `7.0 / 4` (or `7 / 4.0` or `7.0 / 4.0`) would equal 1.75.
  