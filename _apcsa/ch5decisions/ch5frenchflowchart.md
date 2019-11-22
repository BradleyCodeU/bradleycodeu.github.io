---
layout: project
category: ch5decisions
title: French Flowchart
---
For this project, you will review the rules for French country names and then fix/redesign the flowchart below.

Big Java, page 229

French country names are feminine when they end with the letter e, masculine otherwise. For example: le Canada or la Belgique.

Exceptions to the "end in e" rule are the following which are masculine even though the name ends with e:

  - le Belize
  - le Cambodge
  - le Mexique
  - le Mozambique
  - le Zaïre (or le Zaire)
  - le Zimbabwe

If the country name starts with a vowel, use ```l’``` (for example, l’Afghanistan)

For the following plural country names, use les:

  - les Etats-Unis
  - les Pays-Bas

Here is a [flowchart for reference](/apcsa/ch5decisions/French Prefix Of Countries.pdf):
![flowchart](/apcsa\ch5decisions\flowchart.jpg)

There are a few problems with this flowchart:

  - Are we checking the conditionals in the correct order?
  - Look at the two outcomes for the final conditional, should they be the same?
  - Do we need 5 conditionals?
  - Is a flag necessary?

### Directions:

  1. Use either [drawings.google.com](https://docs.google.com/drawings/) or [draw.io](https://www.draw.io) or [lucidchart.com](https://www.lucidchart.com)
  1. Skip the basic setup steps (Start main method, create Scanner, declare variables)
  1. Begin your flowchart with the "Prompt for country name" input
  1. Conditionals must have either "True" and "False" labels or "Yes" and "No"
  1. All branches must end with "Display prefix and country name"
