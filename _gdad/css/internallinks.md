---
layout: project
category: css
title: Internal Links
---
<a href="#whenYouClick">I'm an internal link. Click me to test</a>

Internal links are used to allow readers to jump to specific parts of a Web page. You've probably used them on a Wikipedia page in order to jump to a section on a long page. These internal links are useful if your webpage is very long.

To make an internal link, you must first create an id, and then add a link to it. Any HTML tag can have an id. When the link is clicked, the page will scroll to the location with the id.

First, create a "bookmark" by giving any HTML tag (heading, paragraph, image, etc) an id attribute.

```html
<h2 id="C4">Chapter 4</h2>
```

The id name can be anything that you want, but remember that each id name should be ```UNIQUE```. In other words, you shouldn't have two HTML tags with the same id.

Next, create a link to the bookmark from within the same page:

```html
<a href="#C4">Jump to Chapter 4</a>
```

You can even add a link to the bookmark from another page:

```html
<a href="html_demo.html#C4">Jump to Chapter 4</a>
```

HTML internal link is linked within the same web page. This link can be an absolute path or relative path.

HTML internal link name is followed by the hash sign(#). You have to assign an id to refer section of your page, which is referred to as an internal link to the same page.

<p id="whenYouClick">When you click on an internal anchor link, you will scroll automatically to the referred section and display it on your browser. </p>


## Linking to parts of other documents

You can set target to specific sections of the other pages by adding the #id at the end of the href. After adding hash mark is known as a "fragment identifier". This helps a lot for example, you can link to the third section of this tutorial from anywhere else, you have to write

```html
<a href="https://en.wikipedia.org/wiki/Hilliard,_Ohio#Education"> Wiki Hilliard education </a>
```
Test it out: <a href="https://en.wikipedia.org/wiki/Hilliard,_Ohio#Education"> Wiki Hilliard education </a>
