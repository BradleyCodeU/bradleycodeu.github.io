---
layout: project
category: materialize
title: Materialize Container and Grid
---
<p>Source: <a href="https://materializecss.com/grid.html">https://materializecss.com/grid.html</a></p>
<div id="grid-container" class="section scrollspy">
<p class="caption">We are using a standard 12 column fluid responsive grid system. The grid helps you layout your page in an ordered, easy fashion.</p>
<h3 class="header">Container</h3>
<p>The container class is not strictly part of the grid but is important in laying out content. It allows you to center your page content. The<span> </span><code class=" language-markup">container</code><span> </span>class is set to ~70% of the window width. It helps you center and contain your page content. We use the container to contain our body content.</p>
<p>To add a container just put your content inside a<span> </span><code class=" language-markup"><span class="token tag"><span class="token punctuation">&lt;</span>div<span class="token punctuation">&gt;</span></span></code><span> </span>tag with a<span> </span><code class=" language-markup">container</code><span> </span>class. Here's an example of how your page might be set up.</p>
<pre class=" language-markup"><code class=" language-markup">
    <span class="token tag"><span class="token punctuation">&lt;</span>body<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>container<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
        <span class="token comment">&lt;!-- Page Content goes here --&gt;</span>
      <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;/</span>body<span class="token punctuation">&gt;</span></span>
          </code></pre>
</div>
<div id="grid-intro" class="scrollspy">
<h3 class="header">Introduction</h3>
<p>Take a look at this section to quickly understand how the grid works!</p>
<h5><strong>12 Columns</strong></h5>
<p>Our standard grid has 12 columns. No matter the size of the browser, each of these columns will always have an equal width.</p>
<div class="r">
<div class="col s1 grid-example">
<table style="border-collapse: collapse; width: 100%;" border="1">
<tbody>
<tr>
<td>1</td>
<td>1</td>
<td>1</td>
<td>1</td>
<td>1</td>
<td>1</td>
<td>1</td>
<td>1</td>
<td>1</td>
<td>1</td>
<td>1</td>
<td>1</td>
</tr>
</tbody>
</table>
</div>
</div>
<p>To get a feel of how the grid is used in HTML, take a look at the code below which will produce a similar result to the one above.</p>
<pre class=" language-markup"><code class=" language-markup">
    <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>row<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s1<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>1<span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s1<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>2<span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s1<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>3<span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s1<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>4<span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s1<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>5<span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s1<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>6<span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s1<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>7<span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s1<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>8<span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s1<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>9<span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s1<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>10<span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s1<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>11<span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s1<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>12<span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
          </code></pre>
<p>Note: For now, just know that the<span> </span><code class=" language-markup">s1</code><span> </span>stands for small-1 which in plain English means "1 column on small screens".</p>
<br>
<h5><strong>Columns live inside Rows</strong></h5>
<p>Remember when you are creating your layout that all columns must be contained inside a row and that you must add the<span> </span><code class=" language-markup">col</code><span> </span>class to your inner divs to make them into columns</p>
<pre class=" language-markup"><code class=" language-markup">
    <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>row<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s12<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>This div is 12-columns wide on all screen sizes<span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s6<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>6-columns (one-half)<span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s6<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>6-columns (one-half)<span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
          </code></pre>
</div>
<div id="grid-layouts" class="scrollspy">
<h3 class="header">Creating Layouts</h3>
<p>Here we will show you how to create some commonly used layouts with our grid system. Hopefully these will get you more comfortable with laying out elements. To keep these demos simple, the ones here will not be responsive.</p>
<div class="r">
<div class="col s12 m6">
<h5><strong>Section</strong></h5>
<p>The section class is used for simple top and bottom padding. Just add the<span> </span><code class=" language-markup">section</code><span> </span>class to your div's containing large blocks of content.</p>
</div>
<div class="col s12 m6">
<h5><strong>Divider</strong></h5>
<p>Dividers are 1 pixel lines that help break up your content. Just add the<span> </span><code class=" language-markup">divider</code><span> </span>to a div in between your content.</p>
</div>
</div>
<pre class=" language-markup"><code class=" language-markup">
  <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>divider<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>section<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>h5<span class="token punctuation">&gt;</span></span>Section 1<span class="token tag"><span class="token punctuation">&lt;/</span>h5<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>p<span class="token punctuation">&gt;</span></span>Stuff<span class="token tag"><span class="token punctuation">&lt;/</span>p<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>divider<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>section<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>h5<span class="token punctuation">&gt;</span></span>Section 2<span class="token tag"><span class="token punctuation">&lt;/</span>h5<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>p<span class="token punctuation">&gt;</span></span>Stuff<span class="token tag"><span class="token punctuation">&lt;/</span>p<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>divider<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>section<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>h5<span class="token punctuation">&gt;</span></span>Section 3<span class="token tag"><span class="token punctuation">&lt;/</span>h5<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>p<span class="token punctuation">&gt;</span></span>Stuff<span class="token tag"><span class="token punctuation">&lt;/</span>p<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
          </code></pre>
<h5><strong>Example Promotion Table</strong></h5>
<p>If we want 3 divs that are equal size, we define the divs with a width of 4-columns, as 4+4+4 nicely adds up to 12. Inside those divs, we can put our content. Take our front page content for example. We've modified it slightly for the sake of this example.</p>
<div class="r">
<div class="col s4">
<div class="center promo promo-example">
<p class="light center">We have provided detailed documentation as well as specific code examples to help new users get started.</p>
</div>
</div>
</div>
<pre class=" language-markup"><code class=" language-markup">
    <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>row<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>

      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s4<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
        <span class="token comment">&lt;!-- Promo Content 1 goes here --&gt;</span>
      <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s4<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
        <span class="token comment">&lt;!-- Promo Content 2 goes here --&gt;</span>
      <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s4<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
        <span class="token comment">&lt;!-- Promo Content 3 goes here --&gt;</span>
      <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>

    <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
          </code></pre>
<h5><strong>Example Side Navigation Layout</strong></h5>
<p>You can see how easy it is to create layouts using the grid system. Just remember to make sure your column numbers add up to 12 for an even layout.</p>
<div class="r">
<div class="col s12">
<div class="browser-window">
<div class="top-bar">
<div class="circles">
<span> </span><span> <img src="/wdarchive/materialize/images/materializeSideMenu.png" alt="materializeSideMenu.png" width="600" height="355" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/11452025" data-api-returntype="File"></span>
</div>
</div>
</div>
</div>
</div>
<pre class=" language-markup"><code class=" language-markup">
    <span class="token comment">&lt;!-- Navbar goes here --&gt;</span>

    <span class="token comment">&lt;!-- Page Layout here --&gt;</span>
    <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>row<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>

      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s3<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
        <span class="token comment">&lt;!-- Grey navigation panel --&gt;</span>
      <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>

      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s9<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
        <span class="token comment">&lt;!-- Teal page content  --&gt;</span>
      <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>

    <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
          </code></pre>
</div>
<div id="grid-responsive" class="scrollspy">
<h3 class="header">Creating Responsive Layouts</h3>
<p>Above we showed you how to layout elements using our grid system. Now we'll show you how to design your layouts so that they look great on all screen sizes.</p>
<h5><strong>Screen Sizes</strong></h5>
<table style="border-collapse: collapse; width: 100%;" border="1">
<thead>
<tr>
<th></th>
<th data-field="id">Mobile Devices<br>&lt;= 600px</th>
<th data-field="name">Tablet Devices<br>&gt; 600px</th>
<th data-field="price">Desktop Devices<br>&gt; 992px</th>
<th data-field="price">Large Desktop Devices<br>&gt; 1200px</th>
</tr>
</thead>
<tbody>
<tr>
<td><strong>Class Prefix</strong></td>
<td><code class=" language-markup">.s</code></td>
<td><code class=" language-markup">.m</code></td>
<td><code class=" language-markup">.l</code></td>
<td><code class=" language-markup">.xl</code></td>
</tr>
<tr>
<td><strong>Container Width</strong></td>
<td>90%</td>
<td>85%</td>
<td>70%</td>
<td>70%</td>
</tr>
<tr>
<td><strong>Number of Columns</strong></td>
<td>12</td>
<td>12</td>
<td>12</td>
<td>12</td>
</tr>
</tbody>
</table>
<br>
<h5><strong>Adding Responsiveness</strong></h5>
<p>In the previous examples, we only defined the size for small screens using<span> </span><code class=" language-markup">"col s12"</code>. This is fine if we want a fixed layout since the rules propagate upwards. By just saying s12, we are essentially saying<span> </span><code class=" language-markup">"col s12 m12 l12"</code>. But by explicitly defining the size we can make our website more responsive.</p>
<pre class=" language-markup"><code class=" language-markup">
    <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>row<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>grid-example col s12<span class="token punctuation">"</span></span><span class="token punctuation">&gt;<br></span></span><span class="token tag"><span class="token punctuation">        &lt;</span>span <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>flow-text<span class="token punctuation">"</span></span><span class="token punctuation">&gt;<br></span></span>          I am always full-width (col s12)<br><span class="token tag"><span class="token punctuation">        &lt;/</span>span<span class="token punctuation">&gt;<br></span></span><span class="token tag"><span class="token punctuation">      &lt;/</span>div<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>grid-example col s12 m6<span class="token punctuation">"</span></span><span class="token punctuation">&gt;<br></span></span><span class="token tag"><span class="token punctuation">        &lt;</span>span <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>flow-text<span class="token punctuation">"</span></span><span class="token punctuation">&gt;<br></span></span>          I am full-width on mobile (col s12 m6)<br><span class="token tag"><span class="token punctuation">        &lt;/</span>span<span class="token punctuation">&gt;<br></span></span><span class="token tag"><span class="token punctuation">      &lt;/</span>div<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>          </code></pre>
<br>
<h5><strong>Responsive Side Navigation Layout</strong></h5>
<p>In this example below, we take the same layout from above, but we make it responsive by defining how many columns the div should take up on each screen size.</p>
<div class="r">
<div class="col s12">
<div class="browser-window">
<div class="top-bar">
<div class="circles"><span><img src="/wdarchive/materialize/images/materializeSideMenu.png" alt="materializeSideMenu.png" width="600" height="355" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/11452025" data-api-returntype="File"></span></div>
</div>
</div>
</div>
</div>
<pre class=" language-markup"><code class=" language-markup">
    <span class="token comment">&lt;!-- Navbar goes here --&gt;</span>

    <span class="token comment">&lt;!-- Page Layout here --&gt;</span>
    <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>row<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>

      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s12 m4 l3<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span> <span class="token comment">&lt;!-- Note that "m4 l3" was added --&gt;</span>
        <span class="token comment">&lt;!-- Grey navigation panel

              This content will be:
          3-columns-wide on large screens,
          4-columns-wide on medium screens,
          12-columns-wide on small screens  --&gt;</span>

      <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>

      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s12 m8 l9<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span> <span class="token comment">&lt;!-- Note that "m8 l9" was added --&gt;</span>
        <span class="token comment">&lt;!-- Teal page content

              This content will be:
          9-columns-wide on large screens,
          8-columns-wide on medium screens,
          12-columns-wide on small screens  --&gt;</span>

      <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>

    <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
          </code></pre>
<h5><strong>More Responsive Grid Examples</strong></h5>
<div class="r">
<pre class=" language-markup"><code class=" col s12 language-markup">
  <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>row<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s12<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;</span>p<span class="token punctuation">&gt;</span></span>s12<span class="token tag"><span class="token punctuation">&lt;/</span>p<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s12 m4 l2<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;</span>p<span class="token punctuation">&gt;</span></span>s12 m4<span class="token tag"><span class="token punctuation">&lt;/</span>p<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s12 m4 l8<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;</span>p<span class="token punctuation">&gt;</span></span>s12 m4<span class="token tag"><span class="token punctuation">&lt;/</span>p<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s12 m4 l2<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;</span>p<span class="token punctuation">&gt;</span></span>s12 m4<span class="token tag"><span class="token punctuation">&lt;/</span>p<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>row<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s12 m6 l3<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;</span>p<span class="token punctuation">&gt;</span></span>s12 m6 l3<span class="token tag"><span class="token punctuation">&lt;/</span>p<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s12 m6 l3<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;</span>p<span class="token punctuation">&gt;</span></span>s12 m6 l3<span class="token tag"><span class="token punctuation">&lt;/</span>p<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s12 m6 l3<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;</span>p<span class="token punctuation">&gt;</span></span>s12 m6 l3<span class="token tag"><span class="token punctuation">&lt;/</span>p<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s12 m6 l3<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;</span>p<span class="token punctuation">&gt;</span></span>s12 m6 l3<span class="token tag"><span class="token punctuation">&lt;/</span>p<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
            </code></pre>
</div>
</div>
