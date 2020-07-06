---
layout: project
category: materialize
title: Materialize Checkboxes
---
<p>Sources:</p>
<ul>
<li><a href="https://materializecss.com/checkboxes.html">https://The indeterminate state is visual only. The checkbox is still either checked or unchecked.com/checkboxes.html</a></li>
<li><a href="https://css-tricks.com/indeterminate-checkboxes/">https://css-tricks.com/indeterminate-checkboxes/</a></li>
</ul>
<p><span>Use checkboxes when looking for yes or no answers. The </span><code class=" language-markup">for</code><span> attribute is necessary to bind our custom checkbox with the input. Add the input's </span><code class=" language-markup">id</code><span> as the value of the </span><code class=" language-markup">for</code><span> attribute of the label.</span></p>
<p><span>Below is a demo that shows six different styles of checkbox:</span></p>
<ul>
<li><span>Cheese is checked when the page loads. </span></li>
<li><span>Pepperoni is just a normal checkbox. </span></li>
<li><span>Mushrooms has the Materialize "filled-in" class. This is the only Materialize checkbox class.</span></li>
<li><span>Onions is set to indeterminate. More info about this below.</span></li>
<li><span>Black Olives is set to disabled.</span></li>
<li><span>Sauce is set to disabled AND checked when the page loads.</span></li>
</ul>
<p><img src="/wd/materialize/images/materializeCheckboxes-1.png" alt="materializeCheckboxes-1.png" width="353" height="296" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/12066318" data-api-returntype="File"></p>
<pre>  &lt;div class="col s12 m6"&gt;<br>    &lt;h4&gt;<br>      Choose Your Toppings<br>    &lt;/h4&gt;<br>    &lt;p&gt;<br>      &lt;label for="cheese"&gt;<br>        &lt;input id="cheese" type="checkbox" checked /&gt;<br>        &lt;span&gt;Cheese&lt;/span&gt;<br>      &lt;/label&gt;<br>    &lt;/p&gt;<br>    &lt;p&gt;<br>      &lt;label&gt;<br>        &lt;input type="checkbox" /&gt;<br>        &lt;span&gt;Pepperoni&lt;/span&gt;<br>      &lt;/label&gt;<br>    &lt;/p&gt;<br>    &lt;p&gt;<br>      &lt;label&gt;<br>        &lt;input type="checkbox" class="filled-in" checked /&gt;<br>        &lt;span&gt;Mushrooms&lt;/span&gt;<br>      &lt;/label&gt;<br>    &lt;/p&gt;<br>    &lt;p&gt;<br>      &lt;label&gt;<br>        &lt;input id="onions" type="checkbox" /&gt;<br>        &lt;span&gt;Onions&lt;/span&gt;<br>      &lt;/label&gt;<br>    &lt;/p&gt;<br>    &lt;p&gt;<br>      &lt;label&gt;<br>        &lt;input type="checkbox" disabled /&gt;<br>        &lt;span&gt;Black Olives (currently unavailable)&lt;/span&gt;<br>      &lt;/label&gt;<br>    &lt;/p&gt;<br>    &lt;p&gt;<br>      &lt;label&gt;<br>        &lt;input type="checkbox" disabled checked /&gt;<br>        &lt;span&gt;Sauce&lt;/span&gt;<br>      &lt;/label&gt;<br>    &lt;/p&gt;<br>  &lt;/div&gt;</pre>
<p><span>Checkbox inputs can only have two states: checked or unchecked. They can have any value, but they either submit that value (checked) or don’t (unchecked) with a form submission. The default is unchecked.</span></p>
<h3><span>Indeterminate Checkbox</span></h3>
<p>Visually, there are actually three states a checkbox can be in: checked, unchecked, or indeterminate. They look like this (without using Materialize):</p>
<p><img src="/wd/materialize/images/checkboxstates.png" alt="checkboxstates.png" width="146" height="80" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/12066426" data-api-returntype="File"></p>
<p><span>Indeterminate means not exactly known, established, or defined.  </span>You can’t make a checkbox indeterminate through HTML. There is no indeterminate attribute. It is a property of checkboxes though, which you can change via JavaScript.</p>
<pre><code>document.getElementById('indeterminate-checkbox').indeterminate = true;</code></pre>
<p>Radio buttons are indeterminate when all radio buttons with the same name value in the form are unchecked.</p>
<p>Note: The indeterminate state is visual only. The checkbox is still either checked or unchecked.</p>
<h3><span>Using JS to get the status of a checkbox</span></h3>
<p>Find out if a checkbox is checked or not with the following Javascript. Returns true if the checkbox is checked, and false if the checkbox is not checked:</p>
<pre>var x = document.getElementById("checkboxId").checked;</pre>
<p>The .checked attribute will either return true or false, so it can be used as a conditional statement.</p>
<pre>var price = 0;<br>if( document.getElementById("cheese").checked ){<br>  price = price + 0.49;<br>}<br>if( document.getElementById("pepperoni").checked ){<br>  price = price + 0.99;<br>}<br>if( document.getElementById("mushroom").checked ){<br>  price = price + 0.59;<br>}</pre>
