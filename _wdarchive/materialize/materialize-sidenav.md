---
layout: project
category: materialize
title: Materialize Sidenav
---


<p>The Materialize Navbar is setup so that the links are automatically hidden on screen sizes small and medium. Notice that this line of code (from the Materialize Navbar) uses a class named hide-on-med-and-down:</p>
<pre class=" language-markup"><code class=" language-markup"><span class="token tag"><span class="token punctuation">&lt;</span>ul <span class="token attr-name">id</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>nav-mobile<span class="token punctuation">"</span></span> <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>right hide-on-med-and-down<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span></code></pre>
<p>If all of the links in the navbar are hidden, how will users be able to get to those links?</p>
<p>The Materialize Sidenav is great for allowing small screens to click the "hamburger menu icon" and access those links. The hamburger menu icon can be set to only show on screen sizes small and medium.</p>
<p class="caption"><img src="/wdarchive/materialize/images/materializeSidenav.gif" alt="materializeSidenav.gif" width="600" height="402" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/12392910" data-api-returntype="File"></p>
<p class="caption">This is a slide out menu. You can add a dropdown to your sidebar by using our collapsible component. If you want to see a demo, our sidebar will use this on smaller screens. To use this in conjunction with a fullscreen navigation, you have to use two copies of the same UL.</p>
<p>Please note that the sidenav HTML should <span style="text-decoration: underline;">NOT</span> be contained within the navbar HTML.</p>
<p>HTML code</p>
<pre><span class="token tag"><span class="token punctuation">  &lt;</span>nav<span class="token punctuation">&gt;<br>    <span class="token comment">&lt;!-- hamburger icon that opens the sidenav --&gt;<br></span>    &lt;a <span class="token attr-name">href</span><span class="token attr-value">="#"</span> <span class="token attr-name">data-target</span><span class="token attr-value">="slide-out"</span> <span class="token attr-name">class</span><span class="token attr-value">="sidenav-trigger show-on-medium-and-down"</span>&gt;<br>      &lt;i <span class="token attr-name">class</span><span class="token attr-value">="material-icons"</span>&gt;<span>menu</span>&lt;/i&gt;<br>    &lt;/a&gt; </span></span><span class="token comment"><br>    &lt;!-- navbar content here  --&gt;<br></span><span class="token tag"><span class="token punctuation">  &lt;/</span>nav<span class="token punctuation">&gt;</span></span>

  <span class="token tag"><span class="token punctuation">&lt;</span>ul <span class="token attr-name">id</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>slide-out<span class="token punctuation">"</span></span> <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>sidenav<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>li<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>user-view<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>background<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
        <span class="token tag"><span class="token punctuation">&lt;</span>img <span class="token attr-name">src</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>images/office.jpg<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>a <span class="token attr-name">href</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>#user<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;</span>img <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>circle<span class="token punctuation">"</span></span> <span class="token attr-name">src</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>images/yuna.jpg<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>a<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>a <span class="token attr-name">href</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>#name<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;</span>span <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>white-text name<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span>John Doe</span><span class="token tag"><span class="token punctuation">&lt;/</span>span<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>a<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>a <span class="token attr-name">href</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>#email<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;</span>span <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>white-text email<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span>jdandturk@gmail.com</span><span class="token tag"><span class="token punctuation">&lt;/</span>span<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>a<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>li<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>li<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;</span>a <span class="token attr-name">href</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>#!<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;</span>i <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>material-icons<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span>cloud</span><span class="token tag"><span class="token punctuation">&lt;/</span>i<span class="token punctuation">&gt;</span></span><span>First Link With Icon</span><span class="token tag"><span class="token punctuation">&lt;/</span>a<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>li<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>li<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;</span>a <span class="token attr-name">href</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>#!<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span>Second Link</span><span class="token tag"><span class="token punctuation">&lt;/</span>a<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>li<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>li<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>divider<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>li<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>li<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;</span>a <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>subheader<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span>Subheader</span><span class="token tag"><span class="token punctuation">&lt;/</span>a<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>li<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>li<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;</span>a <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>waves-effect<span class="token punctuation">"</span></span> <span class="token attr-name">href</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>#!<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span>Third Link With Waves</span><span class="token tag"><span class="token punctuation">&lt;/</span>a<span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>li<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;/</span>ul<span class="token punctuation">&gt;</span></span></pre>
<p>Javascript code</p>
<pre><span>  document</span><span class="token punctuation">.</span><span class="token function">addEventListener</span><span class="token punctuation">(</span><span class="token string">'DOMContentLoaded'</span><span class="token punctuation">,</span> <span class="token keyword">function</span><span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
    <span class="token keyword">var</span><span> elems </span><span class="token operator">=</span><span> document</span><span class="token punctuation">.</span><span class="token function">querySelectorAll</span><span class="token punctuation">(</span><span class="token string">'.sidenav'</span><span class="token punctuation">)</span><span class="token punctuation">;<br></span>    var options = {};
    <span class="token keyword">var</span><span> instances </span><span class="token operator">=</span><span> M</span><span class="token punctuation">.</span><span>Sidenav</span><span class="token punctuation">.</span><span class="token function">init</span><span class="token punctuation">(</span><span>elems</span><span class="token punctuation">,</span><span> options</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
  <span class="token punctuation">}</span><span class="token punctuation">)</span><span class="token punctuation">;</span></pre>
<h3>Materialize Classes For Hiding/Showing</h3>
<table class="striped">
<tbody>
<tr>
<td><code class=" language-markup">.hide</code></td>
<td>Hidden for all Devices</td>
</tr>
<tr>
<td><code class=" language-markup">.hide-on-small-only</code></td>
<td>Hidden for Mobile Only</td>
</tr>
<tr>
<td><code class=" language-markup">.hide-on-med-only</code></td>
<td>Hidden for Tablet Only</td>
</tr>
<tr>
<td><code class=" language-markup">.hide-on-med-and-down</code></td>
<td>Hidden for Tablet and Below</td>
</tr>
<tr>
<td><code class=" language-markup">.hide-on-med-and-up</code></td>
<td>Hidden for Tablet and Above</td>
</tr>
<tr>
<td><code class=" language-markup">.hide-on-large-only</code></td>
<td>Hidden for Desktop Only</td>
</tr>
<tr>
<td><code class=" language-markup">.show-on-small</code></td>
<td>Show for Mobile Only</td>
</tr>
<tr>
<td><code class=" language-markup">.show-on-medium</code></td>
<td>Show for Tablet Only</td>
</tr>
<tr>
<td><code class=" language-markup">.show-on-large</code></td>
<td>Show for Desktop Only</td>
</tr>
<tr>
<td><code class=" language-markup">.show-on-medium-and-up</code></td>
<td>Show for Tablet and Above</td>
</tr>
<tr>
<td><code class=" language-markup">.show-on-medium-and-down</code></td>
<td>Show for Tablet and Below</td>
</tr>
</tbody>
</table>
<h3>What is a Hamburger Menu Icon?</h3>
<p><img src="/wdarchive/materialize/images/mobileIcons.png" alt="mobileIcons.png" width="600" height="154" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/12393489" data-api-returntype="File"></p>
<p><img src="/wdarchive/materialize/images/moreMenuIcons.png" alt="moreMenuIcons.png" width="600" height="393" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/12393497" data-api-returntype="File"></p>
