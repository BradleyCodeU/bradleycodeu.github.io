---
  layout: default
  title: Game Design and App Development Curriculum Overview
  permalink: /gdad/
---
{% for unit in site.data.gdad_units[page.collection] %}
  {% if unit.title == 'menu1' %}{{ unit.content | markdownify }}{% endif %}
  {% if unit.title == 'menu2' %}{{ unit.content | markdownify }}{% endif %}
  {% if unit.title == 'menu3' %}{{ unit.content | markdownify }}{% endif %}
  {% if unit.title == 'menu4' %}{{ unit.content | markdownify }}{% endif %}
{% endfor %}

{% for unit in site.data.gdad_units[page.collection] %}
  {{ unit.heading | markdownify }}
  {{ unit.content | markdownify }}
{% endfor %}
