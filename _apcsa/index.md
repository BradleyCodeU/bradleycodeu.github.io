---
  layout: default
  title: APCSA Curriculum Overview
  permalink: /apcsa/
---

{% for unit in site.data.apcsa_units[page.collection] %}
  {% if user.title == 'menu1' || user.title == 'menu2' || user.title == 'menu3' || user.title == 'menu4'  %}
    unit.content | markdownify }}
  {% endif %}
{% endfor %}

{{ site.data.apcsa_units.apcsa[1].content | markdownify }}
{{ site.data.apcsa_units.apcsa[7].content | markdownify }}
{{ site.data.apcsa_units.apcsa[14].content | markdownify }}
{{ site.data.apcsa_units.apcsa[20].content | markdownify }}

{% for unit in site.data.apcsa_units[page.collection] %}
  {{ unit.heading | markdownify }}
  {{ unit.content | markdownify }}
{% endfor %}
