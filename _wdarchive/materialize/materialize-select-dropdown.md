---
layout: project
category: materialize
title: Materialize Select Dropdown
---


<p><span>Select allows user input through specified options. Make sure you wrap it in a </span><code class=" language-markup">.input-field</code><span> for proper alignment with other text fields. Remember that this is a Javascript plugin so make sure you </span><a href="https://materializecss.com/select.html#initialization">initialize</a><span> this by following the Initialization directions below.</span></p>
<p><img src="/wdarchive/materialize/images/materializeSelect01-1.png" alt="materializeSelect01-1.png" width="294" height="221" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/11959051" data-api-returntype="File"></p>
<pre class=" language-markup"><code class=" language-markup">  <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>input-field col s12<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>select id="dropdown1"<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>option <span class="token attr-name">value</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span><span class="token punctuation">"</span></span> <span class="token attr-name">disabled</span> <span class="token attr-name">selected</span><span class="token punctuation">&gt;</span></span>Choose your option<span class="token tag"><span class="token punctuation">&lt;/</span>option<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>option <span class="token attr-name">value</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>1<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>Option 1<span class="token tag"><span class="token punctuation">&lt;/</span>option<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>option <span class="token attr-name">value</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>2<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>Option 2<span class="token tag"><span class="token punctuation">&lt;/</span>option<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>option <span class="token attr-name">value</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>3<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>Option 3<span class="token tag"><span class="token punctuation">&lt;/</span>option<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;/</span>select<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>label<span class="token punctuation">&gt;</span></span>Materialize Select<span class="token tag"><span class="token punctuation">&lt;/</span>label<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span></code></pre>
<p>Notice that the <span style="text-decoration: underline;">disabled</span> text inside of the first option is NOT a class. It is an HTML attribute. When present, it specifies that the drop-down list item should be disabled, unusable and un-clickable. If a user opens the drop-down and selects "Option 3", then if they reopen the drop-down they will not be able to select "Choose your option"</p>
<p>Also, the <span style="text-decoration: underline;">selected</span> text inside of the first option is NOT a class. It is an HTML attribute. It specifies that an option should be pre-selected when the page loads. It is optional. If it is missing, then the first option is automatically pre-selected.</p>
<div class="input-field col s12">
<h3 class="header">Initialization</h3>
<p>You must initialize the select element using Javascript as shown below. In addition, you will need a separate call for any dynamically generated select elements your page generates.</p>
<pre class=" language-javascript"><code class=" language-javascript">document.addEventListener('DOMContentLoaded', function() {<br>  var elems = document.querySelectorAll('select');<br>  var options = {};<br>  var instances = M.FormSelect.init(elems, options);<br>});
</code></pre>
</div>
<h3 class="input-field col s12">Get The Selected Value</h3>
<div class="input-field col s12">
<p>Using Javascript you can get the value of a selected option in a drop-down list by using the value property. The value property sets or returns the value of the selected option in a drop-down list.</p>
<pre class="w3-code notranslate jsHigh"><span class="jscolor"><span class="jskeywordcolor">var</span><span> selectedValue1</span> = document.<span class="jspropertycolor">getElementById</span>(<span class="jsstringcolor">"dropdown1"</span>).<span class="jspropertycolor">value</span>;</span></pre>
</div>
