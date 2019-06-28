---
  layout: default
  title: APCSA Curriculum Overview
  permalink: /apcsa/
---
yo
{{ site.data.apcsa_units[menu1] | markdownify }}
{{ site.data.apcsa_units[menu2] | markdownify }}
{{ site.data.apcsa_units[menu3] | markdownify }}
{{ site.data.apcsa_units[menu4] | markdownify }}
{% for unit in site.data.apcsa_units[page.collection] %}
  {{ unit.heading | markdownify }}
  {{ unit.content | markdownify }}
{% endfor %}
