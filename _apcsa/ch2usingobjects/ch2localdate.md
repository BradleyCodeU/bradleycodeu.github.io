---
layout: project
category: ch2usingobjects
title: Ch2 LocalDate
---


In Java 8, the LocalDate class describes a calendar date that does not depend on a location or time zone. You construct a date like this:
```
LocalDate today = LocalDate.now(); // Today’s date
LocalDate eckertsBirthday = LocalDate.of(1919, 4, 9);
```

The plusDays method can be used to add a number of days to a LocalDate object:
```
LocalDate later = today.plusDays(10); // Ten days from today
```

This method does not mutate the today object, but it returns a new object that is a given number of days away from today. To get the year of a day, call
```
int year = today.getYear();
```

To get the weekday of a LocalDate, call
```
String weekday = today.getDayOfWeek().toString();
```

Your task is to write a program that prints

  - The weekday (Sun? Mon? Tues? etc.) of “Pi day”, that is, March 14, of the current year.
  - The date and weekday (Sun? Mon? Tues? etc.) of “Programmer’s day” in the current year; that is, the 256th day of the year. (The number 256, or 28, is useful for some programming tasks.)
  - The date and weekday (Sun? Mon? Tues? etc.) of the date that is 10,000 days earlier than today.
  
