---
  layout: default
  title: APCSA Curriculum Overview
  permalink: /apcsa/
---
yooooo
{{ assign menu = site.data.apcsa_units | where:"title","menu1" }}
{{ menu.content | markdownify }}

{% for unit in site.data.apcsa_units[page.collection] %}
  {{ unit.heading | markdownify }}
  {{ unit.content | markdownify }}
{% endfor %}
