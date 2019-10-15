---
layout: project
category: css
title: Internal Links
---

Internal links are used to allow readers to jump to specific parts of a Web page. You've probably used them on a Wikipedia page in order to jump to a section on a long page.

These internal links can be useful if your webpage is very long.

To make an internal link, you must first create an id, and then add a link to it.

When the link is clicked, the page will scroll to the location with the id.

First, create a "bookmark" by giving any HTML tag (heading, paragraph, image, etc) an id attribute.
```
<h2 id="C4">Chapter 4</h2>
```
The id name can be anything that you want, but remember that each id name should be unique. In other words, you shouldn't have two HTML tags with the same id.

Next, create a link to the bookmark from within the same page:
```
<a href="#C4">Jump to Chapter 4</a>
```
You can even add a link to the bookmark from another page:
```
<a href="html_demo.html#C4">Jump to Chapter 4</a>
```
