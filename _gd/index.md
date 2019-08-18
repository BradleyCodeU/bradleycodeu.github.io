---
  layout: default
  title: Game Design Curriculum Overview
  permalink: /gd/
---

{{ site.data.gd_units.gd[1].content | markdownify }}
{{ site.data.gd_units.gd[8].content | markdownify }}
{{ site.data.gd_units.gd[14].content | markdownify }}
{{ site.data.gd_units.gd[20].content | markdownify }}

{% for unit in site.data.gd_units[page.collection] %}
  {{ unit.heading | markdownify }}
  {{ unit.content | markdownify }}
{% endfor %}
