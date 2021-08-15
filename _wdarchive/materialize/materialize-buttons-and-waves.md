---
layout: project
category: materialize
title: Materialize Buttons and Waves
---

<p>Source: <a href="https://materializecss.com/buttons.html">https://materializecss.com/buttons.html</a></p>
<div id="raised" class="section scrollspy">
<p class="caption">There are 3 main button types described in material design. The raised button is a standard button that signify actions and seek to give depth to a mostly flat page. The floating circular action button is meant for very important functions. Flat buttons are usually used within elements that already have depth like cards or modals.</p>
<h3 class="header">Raised</h3>
<img src="/wdarchive/materialize/images/materializeButtonRaised.png" alt="materializeButtonRaised.png" width="365" height="50" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/11696311" data-api-returntype="File"><br>
<pre class=" language-markup"><code class=" col s12 language-markup"><span class="token tag"><span class="token punctuation">&lt;</span>a <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>waves-effect waves-light btn<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>button<span class="token tag"><span class="token punctuation">&lt;/</span>a<span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token punctuation">&lt;</span>a <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>waves-effect waves-light btn<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;</span>i <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>material-icons left<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>cloud<span class="token tag"><span class="token punctuation">&lt;/</span>i<span class="token punctuation">&gt;</span></span>button<span class="token tag"><span class="token punctuation">&lt;/</span>a<span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token punctuation">&lt;</span>a <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>waves-effect waves-light btn<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;</span>i <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>material-icons right<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>cloud<span class="token tag"><span class="token punctuation">&lt;/</span>i<span class="token punctuation">&gt;</span></span>button<span class="token tag"><span class="token punctuation">&lt;/</span>a<span class="token punctuation">&gt;</span></span>        </code></pre>
</div>
<div id="floating" class="section scrollspy">
<h3 class="header">Floating</h3>
<img src="/wdarchive/materialize/images/materializeButtonFAB.png" alt="materialize Button FAB" width="68" height="67" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/11696337" data-api-returntype="File"><br>
<pre class=" language-markup"><code class=" col s12 language-markup"><span class="token tag"><span class="token punctuation">&lt;</span>a <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>btn-floating btn-large waves-effect waves-light red<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;</span>i <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>material-icons<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>add<span class="token tag"><span class="token punctuation">&lt;/</span>i<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>a<span class="token punctuation">&gt;</span></span>        </code></pre>
<h5>See the Floating Action Button documentation on<span> </span><a href="https://materializecss.com/floating-action-button.html">this page</a>
</h5>
</div>
<div id="flat" class="section scrollspy">
<h3 class="header">Flat</h3>
<p>Flat buttons are used to reduce excessive layering. For example, flat buttons are usually used for actions within a card or modal so there aren't too many overlapping shadows.</p>
<img src="/wdarchive/materialize/images/materializeButtonFlat.png" alt="materializeButtonFlat.png" width="100" height="34" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/11696372" data-api-returntype="File"><br>
<pre class=" language-markup"><code class=" col s12 language-markup"><span class="token tag"><span class="token punctuation">&lt;</span>a <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>waves-effect waves-teal btn-flat<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>Button<span class="token tag"><span class="token punctuation">&lt;/</span>a<span class="token punctuation">&gt;</span></span></code></pre>
</div>
<hr>
<p>Source: <a href="https://materializecss.com/waves.html">https://materializecss.com/waves.html</a></p>
<h3>What are Waves?</h3>
<div id="introduction" class="section scrollspy">
<p class="caption"><img src="/wdarchive/materialize/images/waves-demo.gif" alt="waves-demo.gif" width="600" height="87"></p>
<p class="caption">Waves is an external library that we've included in Materialize to allow us to create the ink effect outlined in Material Design. You can test it out by clicking the button at the top of <a href="https://materializecss.com/waves.html">this page</a>.</p>
</div>
<div id="applying-waves" class="section scrollspy">
<h3>Applying Waves</h3>
<p>The waves effect can be applied to any element. To put the waves effect on buttons, you just have to put the class<span> </span><code class=" language-markup">waves-effect</code><span> </span>on to the buttons. If you want the waves effect to be white instead, add both<span> </span><code class=" language-markup">waves-effect</code> and <code>waves-light</code><span> </span>as classes.</p>
<pre class=" language-markup"><code class=" language-markup"><span class="token tag"><span class="token punctuation">&lt;</span>a <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>waves-effect waves-light btn-large<span class="token punctuation">"</span></span> <span class="token attr-name">href</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>#<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>Wave<span class="token tag"><span class="token punctuation">&lt;/</span>a<span class="token punctuation">&gt;</span></span></code></pre>
</div>
