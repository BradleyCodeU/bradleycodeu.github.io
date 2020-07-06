---
layout: project
category: materialize
title: Materialize Radio Buttons
---
<p><span>Sources:</span></p>
<ul>
<li><span><a href="https://materializecss.com/radio-buttons.html">https://materializecss.com/radio-buttons.html</a></span></li>
<li><span><a href="https://www.w3schools.com/tags/att_input_type_radio.asp">https://www.w3schools.com/tags/att_input_type_radio.asp</a></span></li>
</ul>
<p><span>Radio Buttons are used when the user must make only one selection out of a group of items. </span></p>
<p><span>A single pizza can only have one style of crust, so a group of radio buttons would be perfect. If you select Deep Dish the web page will automatically de-select all other options. The user should never be able to select Thin Crust AND Original AND Deep Dish.</span></p>
<p><span><img src="/wd/materialize/images/materializeRadioButtons.png" alt="materializeRadioButtons.png" width="300" height="148" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/12014910" data-api-returntype="File"></span></p>
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
