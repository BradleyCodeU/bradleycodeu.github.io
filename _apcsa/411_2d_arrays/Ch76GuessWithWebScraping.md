---
layout: project
category: ch762darrays
title: Guess With Web Scraping
---
Extend the previous project, GuessWithFileInput, so that it pulls data directly from the web (from GitHub).

Use pg.523 Special Topic 11.1 Reading Web Pages to guide you with using the java.net package to scrape the contents of a web page.

```
import java.net.*;
String address = "http://horstmann.com/index.html";
URL pageLocation = new URL(address);
Scanner in = new Scanner(pageLocation.openStream());
```

You may also want to specify your own delimiter...

`in.useDelimiter(",");`

You can use [regex](https://www.geeksforgeeks.org/write-regular-expressions/) to specify the delimiter. This one sets the delimiter to be a comma follewed by a new line...

`in.useDelimiter("[,\n]");`
