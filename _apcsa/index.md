---
  layout: default
  title: APCSA Curriculum Overview
  permalink: /apcsa/
---
yo...?
{{ assign menu = site.data.apcsa_units | where:"title","menu1" }}
{{ menu[0].content | markdownify }}
{{ assign menu = site.data.apcsa_units | where:"title","menu2" }}
{{ menu[0].content | markdownify }}
{{ assign menu = site.data.apcsa_units | where:"title","menu3" }}
{{ menu[0].content | markdownify }}
{{ site.data.apcsa_units.apcsa["menu4"].content | markdownify }}

{% for unit in site.data.apcsa_units[page.collection] %}
  {{ unit.heading | markdownify }}
  {{ unit.content | markdownify }}
{% endfor %}
