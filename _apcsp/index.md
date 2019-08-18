---
  layout: default
  title: AP Computer Science Principles Curriculum Overview
  permalink: /apcsp/
---
{{ site.data.apcsp_units.apcsp[1].content | markdownify }}
{{ site.data.apcsp_units.apcsp[7].content | markdownify }}
{{ site.data.apcsp_units.apcsp[13].content | markdownify }}
{{ site.data.apcsp_units.apcsp[20].content | markdownify }}

{% for unit in site.data.apcsp_units[page.collection] %}
  {{ unit.heading | markdownify }}
  {{ unit.content | markdownify }}
{% endfor %}
