---
layout: project
category: materialize
title: Materialize Range Sliders
---

<p><span>Add a range slider for values with a wide range. This one is set to be a number between 0 and 100.</span></p>
<p><span><img src="/wd/materialize/images/materializeRangeSlider.png" alt="materializeRangeSlider.png" width="600" height="103" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/12260207" data-api-returntype="File"></span></p>
<pre class=" language-markup"><code class=" language-markup"><span class="token tag"><span class="token punctuation">  &lt;</span>p <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>range-field<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>input <span class="token attr-name">type</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>range<span class="token punctuation">"</span></span> <span class="token attr-name">id</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>test5<span class="token punctuation">"</span></span> <span class="token attr-name">min</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>0<span class="token punctuation">"</span></span> <span class="token attr-name">max</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>100<span class="token punctuation">"</span></span> <span class="token punctuation">/&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;/</span>p<span class="token punctuation">&gt;</span></span></code></pre>
<p><span>Add either the onchange="" attribute or the onmouseup="" attribute to do something once user has selected a value. </span></p>
<pre>&lt;input type="range" id="slider1" min="1" max="50" onchange="alert('hello 1')"&gt;<br>&lt;input type="range" id="slider2" min="0" max="10" onmouseup="alert('hello 2')"&gt;</pre>
<p><span>You can use Javascript to collect the value of a range slider.</span></p>
<pre><span class="jskeywordcolor">var</span><span> sliderValue = </span><span>document.</span><span class="jspropertycolor">getElementById</span><span>(</span><span class="jsstringcolor">"slider1"</span><span>).value;</span><br>if(sliderValue &lt;= 14){<br>  alert("I'm sorry, but you are not old enough to join. Ask a parent to sign up.");<br>} else {<br>  alert("You are " + slideValue + " years old");<br>}</pre>
<h3><span>Basic HTML5 Range Slider</span></h3>
<p><span>You don't need Materialize to create a range slider, but the Materialize version looks </span><span>MUCH</span><span> better.</span></p>
<p><span><img src="/wd/materialize/images/html5RangeSlider.png" alt="html5RangeSlider.png" width="152" height="71" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/12260376" data-api-returntype="File"></span></p>
<p>The &lt;input type="range"&gt; defines a control for entering a number whose exact value is not important (like a slider control).</p>
<p>Default range is 0 to 100. However, you can set restrictions on what numbers are accepted with the attributes below.</p>
<ul>
<li>
<a href="https://www.w3schools.com/tags/att_input_max.asp">max</a><span> </span>- specifies the maximum value allowed</li>
<li>
<a href="https://www.w3schools.com/tags/att_input_min.asp">min</a><span> </span>- specifies the minimum value allowed</li>
<li>
<a href="https://www.w3schools.com/tags/att_input_step.asp">step</a><span> </span>- specifies the legal number intervals</li>
<li>
<a href="https://www.w3schools.com/tags/att_input_value.asp">value</a><span> </span>- Specifies the default value</li>
</ul>
<p><strong>Tip:</strong><span> </span>Always add the<span> </span><a href="https://www.w3schools.com/tags/tag_label.asp">&lt;label&gt;</a><span> </span>tag for best accessibility practices! </p>
<p>The following example creates a label and a range slider that goes from 0-255 in steps of 5 and is preset to the value 125.</p>
<pre><span class="tagnamecolor"><span class="tagcolor">&lt;</span>label<span class="attributecolor"><span> </span>for<span class="attributevaluecolor">="points"</span></span><span class="tagcolor">&gt;</span></span><span>Points (between 0 and 255):</span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/label<span class="tagcolor">&gt;</span></span><br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>input<span class="attributecolor"><span> </span>type<span class="attributevaluecolor">="range"</span><span> </span>id<span class="attributevaluecolor">="points"</span><span> </span>name<span class="attributevaluecolor">="points"</span><span> </span>min<span class="attributevaluecolor">="0"</span><span> </span>max<span class="attributevaluecolor">="255" step="5" value="125"</span></span><span class="tagcolor">&gt;</span></span></pre>
<h3>Step</h3>
<p>By default, the slider's step attribute is set to 1. Each position on the slider is 1 apart. You can change the step to make it less precise (step="10" will round to the nearest 10) or more precise (step="0.01" will round to the nearest 1/100th).</p>
<p>The following example creates a label and a range slider that goes from 0-1 in steps of 0.01 and is preset to the value 1.</p>
<pre><span class="tagnamecolor"><span class="tagcolor">&lt;</span>label<span class="attributecolor"><span> </span>for<span class="attributevaluecolor">="service"</span></span><span class="tagcolor">&gt;Please rate the quality of your service</span></span><span>:</span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/label<span class="tagcolor">&gt;</span></span><br>&lt;input type="range" id="service" min="0" max="1" step="0.01" value="1" &gt;</pre>
</body>
</html>
