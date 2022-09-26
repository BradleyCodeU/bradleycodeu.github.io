---
layout: project
category: css
title: Colorful Tables
---

Add the following HTML:
  1.  add three or more animated GIFs
  1.  add an h2 that says Main Office
  1.  create a new table for the Main Office staff
  1.  create two table headings for this table:
    - In the first column, Name. Second column, Title.
  1.  add two rows to this this table:
    - In the first column, Your Name. Second column, CEO.
    - In the first column, a friend's name. Second column, Treasurer.

Next, add "some color" and "style" to these boring tables. "Some color" means not black and not white. Each "some color" should be a different color. These tables should be very colorful and very full of "style". Pick fonts from this list of some of the worst fonts of all time:

  - Comic Sans MS
  - Papyrus
  - Trebuchet MS
  - Impact
  - Andale Mono
  - Zapfino
  - Tahoma
  - Courier New
  - Trajan Pro
  - Bradley Hand


Add the following CSS code inside the head section:

  1. give the page some background color and between 20-30px padding
  1. center the h1 and h2s, give them a margin of between 20-30px, and pick a new font (from the list above)
  1. each table fills 100% of the width, has a different font (from the list above), and has a thick 4-6px border with some color
  1. each th has the text aligned to the left, has some dark background color, has an underline text decoration, and has some light text color
  1. every th and td has a 1-3px bottom border with some color
  1. every odd numbered row tr is in the "odd" class. add CSS so that each row in the odd class has some different light background color
  1. each td has a cell padding of between 10-20px

STARTER CODE:
```
<!DOCTYPE html>
<html>
<head>
  <title>ColorfulTables</title>
  <style>

  </style>
</head>
<body>

  <h1>Contact Us</h1>

  <h2>
    Columbus Staff
  </h2>

  <table>
    <tr>
      <th>Name</th>
      <th>Phone</th>
      <th>Email</th>
    </tr>
    <tr class="odd">
      <td>Alfreds Futterkiste</td>
      <td>555-4728</td>
      <td>alfutt@email.com</td>
    </tr>
    <tr>
      <td>Mo Moctezuma</td>
      <td>555-5281</td>
      <td>momo@email.com</td>
    </tr>
    <tr class="odd">
      <td>Ernst Handel</td>
      <td>555-6627</td>
      <td>ernh@email.com</td>
    </tr>
    <tr>
      <td>Helen Bell</td>
      <td>555-6878</td>
      <td>bhell@email.com</td>
    </tr>
    <tr class="odd">
      <td>Bacchus Wells</td>
      <td>555-7878</td>
      <td>bwell@email.com</td>
    </tr>
    <tr>
      <td>Magazzini Riuniti</td>
      <td>555-8192</td>
      <td>mriun@email.com</td>
    </tr>
  </table>

  <h2>
    Hilliard Staff
  </h2>

  <table>
    <tr>
      <th>Name</th>
      <th>Job Title</th>
      <th>Phone</th>
      <th>Email</th>
      <th>Twitter</th>
    </tr>
    <tr class="odd">
      <td>Sarah Stalder</td>
      <td>Regional Manager</td>
      <td>555-9273</td>
      <td>stald@email.com</td>
      <td>@stalds</td>
    </tr>
    <tr>
      <td>Bocephus Jones</td>
      <td>Assistant to the Regional Manager</td>
      <td>555-0841</td>
      <td>bjones@email.com</td>
      <td>@jonesguy</td>
    </tr>
    <tr class="odd">
      <td>Steve Stevens</td>
      <td>Webmaster and IT Administrator</td>
      <td>555-2211</td>
      <td>steve@email.com</td>
      <td>@supersteve</td>
    </tr>
  </table>

  <h2>
    New Albany Staff
  </h2>

  <table>
    <tr>
      <th>Name</th>
      <th>Phone</th>
      <th>Email</th>
      <th>Twitter</th>
    </tr>
    <tr class="odd">
      <td>Cindy Calahan</td>
      <td>555-1281</td>
      <td>ccal@email.com</td>
      <td>@coolcc</td>
    </tr>
    <tr>
      <td>Jon James</td>
      <td>555-2241</td>
      <td>jjames@email.com</td>
      <td>@jjjamez</td>
    </tr>
    <tr class="odd">
      <td>Kyle Kalder</td>
      <td>555-3273</td>
      <td>kalder@email.com</td>
      <td>@kalds</td>
    </tr>
  </table>

</body>
</html>
```
