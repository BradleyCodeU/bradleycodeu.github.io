---
  layout: default
  title: Web Design Curriculum Overview
  permalink: /wd/
---

{{ site.data.wd_units.wd[1].content | markdownify }}
{{ site.data.wd_units.wd[6].content | markdownify }}
{{ site.data.wd_units.wd[10].content | markdownify }}
{{ site.data.wd_units.wd[13].content | markdownify }}

{% for unit in site.data.wd_units[page.collection] %}
  {{ unit.heading | markdownify }}
  {{ unit.content | markdownify }}
{% endfor %}
