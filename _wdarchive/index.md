---
  layout: default
  title: Web Design Curriculum Overview
  permalink: /wd/
---
{% for unit in site.data.wd_units[page.collection] %}
  {% if unit.title == 'menu1' %}{{ unit.content | markdownify }}{% endif %}
  {% if unit.title == 'menu2' %}{{ unit.content | markdownify }}{% endif %}
  {% if unit.title == 'menu3' %}{{ unit.content | markdownify }}{% endif %}
  {% if unit.title == 'menu4' %}{{ unit.content | markdownify }}{% endif %}
{% endfor %}
<!-- {{ site.data.wd_units.wd[1].content | markdownify }}
{{ site.data.wd_units.wd[6].content | markdownify }}
{{ site.data.wd_units.wd[10].content | markdownify }}
{{ site.data.wd_units.wd[14].content | markdownify }} -->

{% for unit in site.data.wd_units[page.collection] %}
  {{ unit.heading | markdownify }}
  {{ unit.content | markdownify }}
{% endfor %}
