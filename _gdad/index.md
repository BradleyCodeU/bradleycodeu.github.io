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
<!-- {{ site.data.wd_units.wd[1].content | markdownify }}
{{ site.data.wd_units.wd[6].content | markdownify }}
{{ site.data.wd_units.wd[10].content | markdownify }}
{{ site.data.wd_units.wd[14].content | markdownify }} -->

Testing 123
<!-- {% for unit in site.data.gdad_units[page.collection] %}
  {{ unit.heading | markdownify }}
  {{ unit.content | markdownify }}
{% endfor %} -->
