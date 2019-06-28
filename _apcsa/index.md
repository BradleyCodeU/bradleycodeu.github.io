---
  layout: default
  title: APCSA Curriculum Overview
  permalink: /apcsa/
---
yo??
{{ site.data.apcsa_units.apcsa | where:"title","menu1" }}
{{ assign menu = site.data.apcsa_units.apcsa | where:"title","menu2" }}
{{ menu | markdownify }}
{{ menu[0] | markdownify }}
{{ site.data.apcsa_units.apcsa.menu4.content | markdownify }}
{{ site.data.apcsa_units.apcsa["menu4"].content | markdownify }}

{% for unit in site.data.apcsa_units[page.collection] %}
  {{ unit.heading | markdownify }}
  {{ unit.content | markdownify }}
{% endfor %}
