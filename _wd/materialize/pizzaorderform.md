---
layout: project
category: materialize
title: Pizza Order Form
---

This is part 2 of the Materialize pizza webpage


<p><span>For this project you will CONTINUE your last project using the Materialize framework to create a website for either Little Louie's Pizza, Pizza Noun, Pizza Prison, or No Pizza.</span></p>
<p><span>Open your previous <a title="4.2.11MaterializePizza1" href="%24CANVAS_OBJECT_REFERENCE%24/assignments/g6644f8f890f472ed5354a5da6138e740" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/assignments/847944" data-api-returntype="Assignment">4.2.11MaterializePizza1</a> project.</span></p>
<h3><span>Create links from index.html to order.html</span></h3>
<p><span>Open index.html and create a link in the navbar that leads to order.html. This creates a link using HTML</span></p>
<pre>&lt;a href="order.html"&gt;Order Online&lt;/a&gt;</pre>
<p><span>Next, connect the Order Now buttons to order.html. You <em>might</em> just be able to add href="order.html"</span></p>
<p><span>You <em>might</em> need this code to redirect the page using Javascript</span></p>
<pre><span>window.</span><span class="jspropertycolor">location</span><span>.</span><span class="jspropertycolor">href</span><span> = '</span><span class="jsstringcolor">order.html'</span></pre>
<p><span>Here is what that code will look like when we put it in the onclick attribute of the button:</span></p>
<pre>&lt;button class="waves-effect waves-light btn pink" onclick="window.location.href='order.html'"&gt;ORDER NOW&lt;/button&gt;</pre>
<h3><span>Add New File</span></h3>
<p><span>Add a new file named: order.html</span></p>
<p><span>You can copy/paste the following code from index.html into order.html:</span></p>
<ul>
<li><span>the entire head section with the CDN link</span></li>
<li><span>the entire navbar</span></li>
</ul>
<p><span>Make sure that you have a link to the script.js file. It should look like this:</span></p>
<pre>&lt;!-- import the webpage's javascript file --&gt;<br>&lt;script src="/script.js" defer&gt;&lt;/script&gt;</pre>
<h3><span>Order Online</span></h3>
<ul>
<li>
<span>Inside the body, create a div and give it the container class <a title="Materialize Container and Grid" href="/wd/materialize/materialize-container-and-grid" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/pages/materialize-container-and-grid" data-api-returntype="Page">Materialize Container and Grid</a></span>
<ul>
<li>
<span>Inside the container, create a collapsable <a title="Materialize Collapsibles" href="/wd/materialize/materialize-collapsibles" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/pages/materialize-collapsibles" data-api-returntype="Page">Materialize Collapsibles</a></span>
<ul>
<li><span>Give the first collapsable header the text Pizza</span></li>
<li><span>Give the second collapsable header the text Drinks</span></li>
<li><span>Give the third collapsable header the text Contact Info</span></li>
</ul>
</li>
</ul>
</li>
</ul>
<p><span>Don't forget to add the Javascript code that makes a Materialize collapsible work:</span></p>
<pre class=" language-javascript"><code class=" language-javascript"><span class="token punctuation">document.addEventListener('DOMContentLoaded', function() {<br>  var elems = document.querySelectorAll('.collapsible'); <br>  var options = {};<br>  var instances = M.Collapsible.init(elems, options);<br>});</span></code></pre>
<h3><span>Pizza</span></h3>
<p><span>Inside of the collapsible-body for Pizza, create a div and give it the class "row"</span></p>
<p><span>Create radio buttons for THREE kinds of pizza crust <a title="Materialize Radio Buttons" href="/wd/materialize/materialize-radio-buttons" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/pages/materialize-radio-buttons" data-api-returntype="Page">Materialize Radio Buttons</a></span></p>
<pre>  &lt;div class="col s12 m6"&gt;<br>    &lt;h4&gt;<br>      Choose Your Crust<br>    &lt;/h4&gt;<br>    &lt;label&gt;<br>      &lt;input name="group1" type="radio" id="thin-crust" /&gt;<br>      &lt;span class="black-text"&gt;Thin Crust&lt;/span&gt;<br>    &lt;/label&gt;<br>    &lt;br /&gt;<br>    &lt;label&gt;<br>      &lt;input name="group1" type="radio" id="original-crust" checked /&gt;<br>      &lt;span class="black-text"&gt;Original Crust&lt;/span&gt;<br>    &lt;/label&gt;<br>    &lt;br /&gt;<br>    &lt;!--add a third radio button with another style of crust here. For example, Deep Dish--&gt;<br>  &lt;/div&gt; &lt;!-- this should end the crust column --&gt;</pre>
<p><span>Create some checkboxes for THREE OR MORE pizza toppings <a title="Materialize Checkboxes" href="/wd/materialize/materialize-checkboxes" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/pages/materialize-checkboxes" data-api-returntype="Page">Materialize Checkboxes</a></span></p>
<pre>  &lt;div class="col s12 m6"&gt;<br>    &lt;h4&gt;<br>      Choose Your Toppings<br>    &lt;/h4&gt;<br>    &lt;p&gt;<br>      &lt;label for="cheese"&gt;<br>        &lt;input id="cheese" type="checkbox" checked /&gt;<br>        &lt;span&gt;Cheese&lt;/span&gt;<br>      &lt;/label&gt;<br>    &lt;/p&gt;<br>    &lt;p&gt;<br>      &lt;label&gt;<br>        &lt;input type="checkbox" /&gt;<br>        &lt;span&gt;Pepperoni&lt;/span&gt;<br>      &lt;/label&gt;<br>    &lt;/p&gt;<br>    &lt;!--add more checkboxes for other toppings. For example, Mushrooms--&gt;<br>  &lt;/div&gt; &lt;!-- this should end the toppings column --&gt;</pre>
<h3><span>Drinks</span></h3>
<p><span>Inside of the Drinks collapsible-body, create a new "row" div</span></p>
<p><span>Use input type="number" to create inputs for 3 different types of drinks. <a href="https://www.w3schools.com/tags/att_input_type_number.asp">Click here</a> for more info about input type="number"</span></p>
<pre>  &lt;div class="col s12 m6"&gt;<br><br>    &lt;div class="input-field inline"&gt;<br>      &lt;input type="number" id="coke" class="validate" min="0" max="5" value="0"/&gt;<br>      2-liter of Coke<br>    &lt;/div&gt; &lt;!-- this should end Coke --&gt;<br>    &lt;br&gt;<br><br>    &lt;!--add more input type="number" for other drinks. For example, Sprite--&gt;<br><br>  &lt;/div&gt; &lt;!-- this should end the toppings column --&gt;</pre>
<h3><span>Contact Info</span></h3>
<p><span>Inside of the Contact Info collapsible-body, create a new "row" div</span></p>
<p><span>Create a drop-down select menu with THREE OR MORE locations</span></p>
<pre>  &lt;div class="input-field col s12 m6"&gt;<br>    &lt;h4&gt;<br>      Location<br>    &lt;/h4&gt;<br>    &lt;div&gt;<br>      &lt;select id="dropdown1"&gt;<br>        &lt;option value="" disabled selected&gt;Choose your location&lt;/option&gt;<br>        &lt;option value="Hilliard"&gt;Hilliard&lt;/option&gt;<br>        <br>        &lt;!-- add at least 2 more location options --&gt;<br><br>      &lt;/select&gt;<br>    &lt;/div&gt; &lt;!-- this should end the dropdown div --&gt;<br>  &lt;/div&gt; &lt;!-- this should end the location column --&gt;</pre>
<p><span>Don't forget to add the Javascript code that makes a Materialize drop-down select work:</span></p>
<pre class=" language-javascript"><code class=" language-javascript">document.addEventListener('DOMContentLoaded', function() {<br>  var elems = document.querySelectorAll('select');<br>  var options = {};<br>  var instances = M.FormSelect.init(elems, options);<br>});</code></pre>
<p><span>Create radio buttons for the 2 delivery options:</span></p>
<ul>
<li><span>Pickup</span></li>
<li><span>Delivery</span></li>
</ul>
<p><span>Create text inputs for Name, Phone, and Credit Card Number <a title="Materialize Text Inputs" href="/wd/materialize/materialize-text-inputs" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/pages/materialize-text-inputs" data-api-returntype="Page">Materialize Text Inputs</a></span></p>
<pre class=" language-markup"><code class=" language-markup"><span class="token tag"><span class="token punctuation">  &lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s12<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>row<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>input-field col s6<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
        <span class="token tag"><span class="token punctuation">&lt;</span>input <span class="token attr-name">placeholder</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>Placeholder<span class="token punctuation">"</span></span> <span class="token attr-name">id</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>name<span class="token punctuation">"</span></span> <span class="token attr-name">type</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>text<span class="token punctuation">"</span></span> <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>validate<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
        <span class="token tag"><span class="token punctuation">&lt;</span>label <span class="token attr-name">for</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>name<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>Name<span class="token tag"><span class="token punctuation">&lt;/</span>label<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>input-field col s6<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
        <span class="token tag"><span class="token punctuation">&lt;</span>input <span class="token attr-name">id</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>phone<span class="token punctuation">"</span></span> <span class="token attr-name">type</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>text<span class="token punctuation">"</span></span> <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"validate</span><span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
        <span class="token tag"><span class="token punctuation">&lt;</span>label <span class="token attr-name">for</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>phone<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>Phone<span class="token tag"><span class="token punctuation">&lt;/</span>label<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;<br></span></span>      &lt;!-- add another input for credit card here --&gt;
    <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt; &lt;!--this should end the name phone credit column--&gt;</span></span></code></pre>
<p><span>Create a Materialize raised button and give it the text SUBMIT ORDER <a title="Materialize Buttons and Waves" href="/wd/materialize/materialize-buttons-and-waves" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/pages/materialize-buttons-and-waves" data-api-returntype="Page">Materialize Buttons and Waves</a></span></p>
<p><span>The button does NOT need to do anything when pressed.</span></p>

### Tutorial video

[https://www.youtube.com/watch?v=QDqizHBYAKw](https://www.youtube.com/watch?v=QDqizHBYAKw)
<iframe width="560" height="315" src="https://www.youtube.com/embed/QDqizHBYAKw" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
