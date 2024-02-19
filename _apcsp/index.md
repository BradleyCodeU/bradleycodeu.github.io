---
  layout: default
  title: AP Computer Science Principles Curriculum Overview
  permalink: /apcsp/
---
{% for unit in site.data.apcsp_units[page.collection] %}
  {% if unit.title == 'menu1' %}{{ unit.content | markdownify }}{% endif %}
  {% if unit.title == 'menu2' %}{{ unit.content | markdownify }}{% endif %}
  {% if unit.title == 'menu3' %}{{ unit.content | markdownify }}{% endif %}
  {% if unit.title == 'menu4' %}{{ unit.content | markdownify }}{% endif %}
{% endfor %}

<!-- {{ site.data.apcsp_units.apcsp[1].content | markdownify }}
{{ site.data.apcsp_units.apcsp[6].content | markdownify }}
{{ site.data.apcsp_units.apcsp[13].content | markdownify }}
{{ site.data.apcsp_units.apcsp[20].content | markdownify }} -->

{% for unit in site.data.apcsp_units[page.collection] %}
  {{ unit.heading | markdownify }}
  {{ unit.content | markdownify }}
{% endfor %}
