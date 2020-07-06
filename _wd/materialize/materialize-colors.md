---
layout: project
category: materialize
title: Materialize Colors
---
<p>Did you hate Bootstrap's color system? Info? Warning? Danger? I bet most of you didn't like it. Well, the Materialize Colors are MUCH MUCH better.</p>
<hr>
<p>Source: <a href="https://materializecss.com/color.html">https://materializecss.com/color.html</a></p>
<h3 class="header">Usage</h3>
<div class="section">
<h5 class="col s12 m3"><strong>Background Color</strong></h5>
<div class="col s12 m9">
<p>To apply a background color, just add the color name class and (an optional) lighten/darken class to the element.</p>
<div class="card-panel teal lighten-2">This is a card panel with a teal lighten-2 class:</div>
<pre class=" language-markup"><code class=" language-markup">
  <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>card-panel teal lighten-2<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>This is a card panel with a teal lighten-2 class<span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
            </code></pre>
</div>
<h5 class="col s12 m3"><strong>Text Color</strong></h5>
<div class="col s12 m9">
<p>To apply a text color, just append<span> </span><code class="languague-markup">-text</code><span> </span>to the end of the color class like this... <code class="languague-markup">blue-text</code></p>
<div class="card-panel"><span class="blue-text text-darken-2">This is a card panel with dark blue text:</span></div>
<pre class=" language-markup"><code class=" language-markup">
  <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>card-panel<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>span <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>blue-text text-darken-2<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>This is a card panel with dark blue text<span class="token tag"><span class="token punctuation">&lt;/</span>span<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span></code></pre>
</div>
</div>
<hr>
<p>Source: <a href="https://www.tutorialspoint.com/materialize/materialize_colors.htm">https://www.tutorialspoint.com/materialize/materialize_colors.htm</a></p>
<p>Materialize supports a rich set of color classes. These color classes are inspired and developed considering the colors used in marketing, road signs, and sticky notes.</p>
<ul class="list">
<li>red</li>
<li>pink</li>
<li>purple</li>
<li>deep-purple</li>
<li>indigo</li>
<li>blue</li>
<li>light-blue</li>
<li>cyan</li>
<li>teal</li>
<li>green</li>
<li>light-green</li>
<li>lime</li>
<li>yellow</li>
<li>amber</li>
<li>orange</li>
<li>deep-orange</li>
<li>brown</li>
<li>grey</li>
<li>blue-grey</li>
<li>black</li>
<li>white</li>
<li>transparent</li>
</ul>
<p><strong>Lighten and Darken</strong></p>
<p>Following is the list of lightness/darkness classes, which can be used to vary the color applied.</p>
<ul class="list">
<li>lighten-1</li>
<li>lighten-2</li>
<li>lighten-3</li>
<li>lighten-4</li>
<li>lighten-5</li>
<li>darken-1</li>
<li>darken-2</li>
<li>darken-3</li>
<li>darken-4</li>
<li>accent-1</li>
<li>accent-2</li>
<li>accent-3</li>
<li>accent-4</li>
</ul>
<p>The following example demonstrates how to use the above classes to render the background or to change the color of the text.</p>
<pre class="prettyprint notranslate tryit prettyprinted"><span class="tag">&lt;ul&gt;</span>          
  <span class="tag">&lt;li</span> <span class="atn">class</span> <span class="pun">=</span> <span class="atv">"red lighten-5"</span><span class="tag">&gt;</span><span class="pln">Using red lighten-5</span><span class="tag">&lt;/li&gt;</span>
  <span class="tag">&lt;li</span> <span class="atn">class</span> <span class="pun">=</span> <span class="atv">"red lighten-4"</span><span class="tag">&gt;</span><span class="pln">Using red lighten-4</span><span class="tag">&lt;/li&gt;</span>
  <span class="tag">&lt;li</span> <span class="atn">class</span> <span class="pun">=</span> <span class="atv">"red lighten-3"</span><span class="tag">&gt;</span><span class="pln">Using red lighten-3</span><span class="tag">&lt;/li&gt;</span>
  <span class="tag">&lt;li</span> <span class="atn">class</span> <span class="pun">=</span> <span class="atv">"red lighten-2"</span><span class="tag">&gt;</span><span class="pln">Using red lighten-2</span><span class="tag">&lt;/li&gt;</span>
  <span class="tag">&lt;li</span> <span class="atn">class</span> <span class="pun">=</span> <span class="atv">"red lighten-1"</span><span class="tag">&gt;</span><span class="pln">Using red lighten-1</span><span class="tag">&lt;/li&gt;</span>
  <span class="tag">&lt;li</span> <span class="atn">class</span> <span class="pun">=</span> <span class="atv">"red"</span><span class="tag">&gt;</span><span class="pln">Using red</span><span class="tag">&lt;/li&gt;</span>
  <span class="tag">&lt;li</span> <span class="atn">class</span> <span class="pun">=</span> <span class="atv">"red darken-1"</span><span class="tag">&gt;</span><span class="pln">Using red darken-1</span><span class="tag">&lt;/li&gt;</span>
  <span class="tag">&lt;li</span> <span class="atn">class</span> <span class="pun">=</span> <span class="atv">"red darken-2"</span><span class="tag">&gt;</span><span class="pln">Using red darken-2</span><span class="tag">&lt;/li&gt;</span>
  <span class="tag">&lt;li</span> <span class="atn">class</span> <span class="pun">=</span> <span class="atv">"red darken-3"</span><span class="tag">&gt;</span><span class="pln">Using red darken-3</span><span class="tag">&lt;/li&gt;</span>
  <span class="tag">&lt;li</span> <span class="atn">class</span> <span class="pun">=</span> <span class="atv">"red darken-4"</span><span class="tag">&gt;</span><span class="pln">Using red darken-4</span><span class="tag">&lt;/li&gt;</span>
  <span class="tag">&lt;li</span> <span class="atn">class</span> <span class="pun">=</span> <span class="atv">"red accent-1"</span><span class="tag">&gt;</span><span class="pln">Using red accent-1</span><span class="tag">&lt;/li&gt;</span>
  <span class="tag">&lt;li</span> <span class="atn">class</span> <span class="pun">=</span> <span class="atv">"red accent-2"</span><span class="tag">&gt;</span><span class="pln">Using red accent-2</span><span class="tag">&lt;/li&gt;</span>
  <span class="tag">&lt;li</span> <span class="atn">class</span> <span class="pun">=</span> <span class="atv">"red accent-3"</span><span class="tag">&gt;</span><span class="pln">Using red accent-3</span><span class="tag">&lt;/li&gt;</span>
  <span class="tag">&lt;li</span> <span class="atn">class</span> <span class="pun">=</span> <span class="atv">"red accent-4"</span><span class="tag">&gt;</span><span class="pln">Using red accent-4</span><span class="tag">&lt;/li&gt;</span>
<span class="tag">&lt;/ul&gt;</span></pre>
<p><img src="/wd/materialize/images/materializeRedLightenDarken.png" alt="shades of red" width="600" height="465" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/11515414" data-api-returntype="File"></p>
