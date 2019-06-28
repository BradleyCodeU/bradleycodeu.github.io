---
  layout: default
  title: APCSA Curriculum Overview
  permalink: /apcsa/
---
foo?
{{ site.data.apcsa_units.apcsa[1].content | markdownify }}


{% for unit in site.data.apcsa_units[page.collection] %}
  {{ unit.heading | markdownify }}
  {{ unit.content | markdownify }}
{% endfor %}
