---
  layout: default
  title: APCSA Curriculum Overview
  permalink: /apcsa/
---

{{ site.data.apcsa_units.apcsa[1].content | markdownify }}
{{ site.data.apcsa_units.apcsa[6].content | markdownify }}
{{ site.data.apcsa_units.apcsa[14].content | markdownify }}
{{ site.data.apcsa_units.apcsa[20].content | markdownify }}

{% for unit in site.data.apcsa_units[page.collection] %}
  {{ unit.heading | markdownify }}
  {{ unit.content | markdownify }}
{% endfor %}
