---
layout: project
category: materialize
title: Birthday Club
---

## Directions

For this project you will CONTINUE your last project using the Materialize framework to create a website for either Little Louie's Pizza, Pizza Noun, Pizza Prison, or No Pizza.

Open your previous 4.2.19MaterializePizza2 project.

### Create links from index.html to birthday.html

Open index.html and create a link in the navbar that leads to birthday.html. This creates a link using HTML

```
<a href="birthday.html">Birthday Club</a>
```

### Add New File

Add a new file named: birthday.html

You can copy/paste the following code from index.html into birthday.html:
- the entire head section with the CDN link
- the entire navbar

Make sure that you have a link to the script.js file. It should look like this:

```
<!-- import the webpage's javascript file -->
<script src="/script.js" defer></script>
```

Next, copy/paster the last 4 lines of index.html which should be:
```
    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
  </body>
</html>
```

### Birthday Club

- Inside the body, create a div and give it the container class Materialize Container and Grid
  - Inside the container, create a div card and give it a very light blue background Materialize Cards and also Materialize Colors
    - Inside the card, create another div with the container class
      - Add a birthday picker with the label When Is Your Birthday? Materialize Pickers
      - Add a slider with the label How old are you right now? Materialize Range Sliders
      - Add a text input with the label Email Address Materialize Text Inputs
      - Add a toggle switch with the label Subscribe to our Daily Newsletter Materialize Switches
      - Add a Materialize raised button with the text Submit Materialize Buttons and Waves


### Sidenav

Since the sidenav menu uses a Material Design icon, you will need to add this CDN link to the head section:
```
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
```
Add a sidenav menu. Materialize Sidenav You ONLY need to add this to birthday.html

- You do not need to change any of the text inside of the sidenav.
- Put the hamburger icon inside of the nav bar
- Set it so that the hamburger icon that will ONLY show on small screens. You will need to remove the show-on-med-and-down class, then add two other hide/show classes:
  - add the show-on-small class
  - add the hide-on-med-and-up class

Edit the navbar so that the links will ONLY hide on small screens using the hide-on-small-only class

### Tutorial video

[https://www.youtube.com/watch?v=BwoPhGIObDY](https://www.youtube.com/watch?v=BwoPhGIObDY)
<div>
<iframe width="560" height="315" src="https://www.youtube.com/embed/BwoPhGIObDY" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe></div>
