---
layout: project
category: materialize
title: Materialize Radio Buttons and Checkboxes
---
### Radio Buttons

<p><span>Sources:</span></p>
<ul>
<li><span><a href="https://materializecss.com/radio-buttons.html">https://materializecss.com/radio-buttons.html</a></span></li>
<li><span><a href="https://www.w3schools.com/tags/att_input_type_radio.asp">https://www.w3schools.com/tags/att_input_type_radio.asp</a></span></li>
</ul>
<p><span>Radio Buttons are used when the user must make only one selection out of a group of items. </span></p>
<p><span>A single pizza can only have one style of crust, so a group of radio buttons would be perfect. If you select Deep Dish the web page will automatically de-select all other options. The user should never be able to select Thin Crust AND Original AND Deep Dish.</span></p>
<p><span><img src="/wdarchive/materialize/images/materializeRadioButtons.png" alt="materializeRadioButtons.png" width="300" height="148" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/12014910" data-api-returntype="File"></span></p>
<pre>  &lt;div class="col s12 m6"&gt;<br>    &lt;h4&gt;<br>      Choose Your Crust<br>    &lt;/h4&gt;<br>    &lt;label&gt;<br>      &lt;input name="group1" type="radio" id="thin-crust" /&gt;<br>      &lt;span class="black-text"&gt;Thin Crust&lt;/span&gt;<br>    &lt;/label&gt;<br>    &lt;br /&gt;<br>    &lt;label&gt;<br>      &lt;input name="group1" type="radio" id="original-crust" checked /&gt;<br>      &lt;span class="black-text"&gt;Original Crust&lt;/span&gt;<br>    &lt;/label&gt;<br>    &lt;br /&gt;<br>    &lt;label&gt;<br>      &lt;input name="group1" type="radio" id="deep-dish" /&gt;<br>      &lt;span class="black-text"&gt;Deep Dish&lt;/span&gt;<br>    &lt;/label&gt;<br>  &lt;/div&gt;</pre>
<p><span>Notice that there are no special Materialize classes that are required for radio buttons. The radio buttons have been placed in a column in a row "col s12 m6" and the label text that appears next to each button has been given the "black-text" class.</span></p>
<p><span>The input HTML tag for Original Crust contains the word <strong>checked</strong>. This is not a class, but an HTML input attribute. When present, it specifies that an &lt;input&gt; element should be pre-selected (checked) when the page loads.</span></p>
<h3><span>name="group1"</span></h3>
<p><span>Radio buttons are normally presented in radio groups (a collection of radio buttons describing a set of related options). Only one radio button in a group can be selected at the same time.</span></p>
<p><span><strong>Note:</strong> The radio button group <strong><span style="text-decoration: underline;">must share the same name</span></strong> (for example, "group1") to be treated as a group. Once the radio group is created, selecting any radio button in that group automatically deselects any other selected radio button in the same group. You can have as many radio groups on a page as you want, as long as each group has its own name.</span></p>
<h3><span>value="thin-crust"</span></h3>
<p><span>The value attribute is optional. The value attribute defines the unique value associated with each radio button. The value is not shown to the user, but is the value that is sent to the server on "submit" to identify which radio button that was selected.</span></p>
<h3><span>Using JS to get the status of a radio button</span></h3>
<p>Find out if a radio button is checked or not with the following Javascript. Returns true if the radio button is checked, and false if the radio button is not checked:</p>
<pre>var x = document.getElementById("myRadioId").checked;</pre>
<p>The .checked attribute will either return true or false, so it can be used as a conditional statement.</p>
<pre>var price = 0;<br>if( document.getElementById("thin-crust").checked ){<br>  price = price + 9.49;<br>}<br>if( document.getElementById("original-crust").checked ){<br>  price = price + 10.99;<br>}<br>if( document.getElementById("deep-dish").checked ){<br>  price = price + 12.49;<br>}</pre>

<hr>

### Checkboxes

<p>Sources:</p>
<ul>
<li><a href="https://materializecss.com/checkboxes.html">https://materializecss.com/checkboxes.html</a></li>
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
<p><img src="/wdarchive/materialize/images/materializeCheckboxes-1.png" alt="materializeCheckboxes-1.png" width="353" height="296" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/12066318" data-api-returntype="File"></p>
<pre>  &lt;div class="col s12 m6"&gt;<br>    &lt;h4&gt;<br>      Choose Your Toppings<br>    &lt;/h4&gt;<br>    &lt;p&gt;<br>      &lt;label for="cheese"&gt;<br>        &lt;input id="cheese" type="checkbox" checked /&gt;<br>        &lt;span&gt;Cheese&lt;/span&gt;<br>      &lt;/label&gt;<br>    &lt;/p&gt;<br>    &lt;p&gt;<br>      &lt;label&gt;<br>        &lt;input type="checkbox" /&gt;<br>        &lt;span&gt;Pepperoni&lt;/span&gt;<br>      &lt;/label&gt;<br>    &lt;/p&gt;<br>    &lt;p&gt;<br>      &lt;label&gt;<br>        &lt;input type="checkbox" class="filled-in" checked /&gt;<br>        &lt;span&gt;Mushrooms&lt;/span&gt;<br>      &lt;/label&gt;<br>    &lt;/p&gt;<br>    &lt;p&gt;<br>      &lt;label&gt;<br>        &lt;input id="onions" type="checkbox" /&gt;<br>        &lt;span&gt;Onions&lt;/span&gt;<br>      &lt;/label&gt;<br>    &lt;/p&gt;<br>    &lt;p&gt;<br>      &lt;label&gt;<br>        &lt;input type="checkbox" disabled /&gt;<br>        &lt;span&gt;Black Olives (currently unavailable)&lt;/span&gt;<br>      &lt;/label&gt;<br>    &lt;/p&gt;<br>    &lt;p&gt;<br>      &lt;label&gt;<br>        &lt;input type="checkbox" disabled checked /&gt;<br>        &lt;span&gt;Sauce&lt;/span&gt;<br>      &lt;/label&gt;<br>    &lt;/p&gt;<br>  &lt;/div&gt;</pre>
<p><span>Checkbox inputs can only have two states: checked or unchecked. They can have any value, but they either submit that value (checked) or don’t (unchecked) with a form submission. The default is unchecked.</span></p>
<h3><span>Indeterminate Checkbox</span></h3>
<p>Visually, there are actually three states a checkbox can be in: checked, unchecked, or indeterminate. They look like this (without using Materialize):</p>
<p><img src="/wdarchive/materialize/images/checkboxstates.png" alt="checkboxstates.png" width="146" height="80" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/12066426" data-api-returntype="File"></p>
<p><span>Indeterminate means not exactly known, established, or defined.  </span>You can’t make a checkbox indeterminate through HTML. There is no indeterminate attribute. It is a property of checkboxes though, which you can change via JavaScript.</p>
<pre><code>document.getElementById('indeterminate-checkbox').indeterminate = true;</code></pre>
<p>Radio buttons are indeterminate when all radio buttons with the same name value in the form are unchecked.</p>
<p>Note: The indeterminate state is visual only. The checkbox is still either checked or unchecked.</p>
<h3><span>Using JS to get the status of a checkbox</span></h3>
<p>Find out if a checkbox is checked or not with the following Javascript. Returns true if the checkbox is checked, and false if the checkbox is not checked:</p>
<pre>var x = document.getElementById("checkboxId").checked;</pre>
<p>The .checked attribute will either return true or false, so it can be used as a conditional statement.</p>
<pre>var price = 0;<br>if( document.getElementById("cheese").checked ){<br>  price = price + 0.49;<br>}<br>if( document.getElementById("pepperoni").checked ){<br>  price = price + 0.99;<br>}<br>if( document.getElementById("mushroom").checked ){<br>  price = price + 0.59;<br>}</pre>
