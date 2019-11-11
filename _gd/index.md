---
  layout: default
  title: Game Design Curriculum Overview
  permalink: /gd/
---
{% for unit in site.data.apcsa_units[page.collection] %}
  {% if unit.title == 'menu1' %}{{ unit.content | markdownify }}{% endif %}
  {% if unit.title == 'menu2' %}{{ unit.content | markdownify }}{% endif %}
  {% if unit.title == 'menu3' %}{{ unit.content | markdownify }}{% endif %}
  {% if unit.title == 'menu4' %}{{ unit.content | markdownify }}{% endif %}
{% endfor %}
<!-- {{ site.data.gd_units.gd[1].content | markdownify }}
{{ site.data.gd_units.gd[5].content | markdownify }}
{{ site.data.gd_units.gd[10].content | markdownify }}
{{ site.data.gd_units.gd[14].content | markdownify }} -->

{% for unit in site.data.gd_units[page.collection] %}
  {{ unit.heading | markdownify }}
  {{ unit.content | markdownify }}
{% endfor %}
