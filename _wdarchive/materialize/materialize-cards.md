---
layout: project
category: materialize
title: Materialize Cards
---

<p>Cards are <a href="https://www.w3schools.com/bootstrap4/bootstrap_cards.asp">also in Bootstrap</a>, but we didn't need to use them. They are just a type of page section with a header, body, and footer. Very similar to how a Modal has a header, body, and footer. Materialize calls the card header the "card-title" and calls the card footer the "card-action."</p>
<p>There are lots of different types of Cards, but we're only going to look at 4 examples:</p>
<ol>
<li>Basic Card</li>
<li>Card in a Column</li>
<li>Image Card</li>
<li>Card Sizes</li>
</ol>
<hr>
<p>Source: <a href="https://materializecss.com/cards.html">https://materializecss.com/cards.html</a></p>
<p><span>Cards are a convenient means of displaying content composed of different types of objects. They’re also well-suited for presenting similar objects whose size or supported actions can vary considerably, like photos with captions of variable length.</span></p>
<h2>Basic Card</h2>
<pre>&lt;div class="card blue-grey darken-1"&gt;
  &lt;div class="card-content white-text"&gt;<br>    &lt;!-- Card Title --&gt;
    &lt;span class="card-title"&gt;<br>      Card Title<br>    &lt;/span&gt;<br>    &lt;!-- Card Body --&gt;
    &lt;p&gt;<br>      I am a very simple card. I am good at containing small bits of information.
      I am convenient because I require little markup to use effectively.<br>    &lt;/p&gt;
  &lt;/div&gt;<br>  &lt;!-- Card Action --&gt;
  &lt;div class="card-action"&gt;
    &lt;a href="#"&gt;This is a link&lt;/a&gt;
    &lt;a href="#"&gt;This is a link&lt;/a&gt;
  &lt;/div&gt;
&lt;/div&gt;</pre>
<p>The height of a basic card is automatic. It is based on the size of the text and images inside of the card.</p>
<p>The width of a basic card is 100%. It will fill up the full width of the page if there is no container. It is recommended that you use cards in columns inside of rows.</p>
<h2>Card in a Column</h2>
<p>Cards look best when they are placed in a column inside of a row. In the example below, the card width will be about 50% on medium-sized screens and larger.</p>
<pre class=" language-markup"><code class=" language-markup"><span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>row container<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>col s12 m6<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>card blue-grey darken-1<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>card-content white-text<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
        <span class="token tag"><span class="token punctuation">&lt;</span>span <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>card-title<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>Card Title<span class="token tag"><span class="token punctuation">&lt;/</span>span<span class="token punctuation">&gt;</span></span>
        <span class="token tag"><span class="token punctuation">&lt;</span>p<span class="token punctuation">&gt;</span></span>I am a very simple card. I am good at containing small bits of information.
        I am convenient because I require little markup to use effectively.<span class="token tag"><span class="token punctuation">&lt;/</span>p<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>card-action<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
        <span class="token tag"><span class="token punctuation">&lt;</span>a <span class="token attr-name">href</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>#<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>This is a link<span class="token tag"><span class="token punctuation">&lt;/</span>a<span class="token punctuation">&gt;</span></span>
        <span class="token tag"><span class="token punctuation">&lt;</span>a <span class="token attr-name">href</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>#<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>This is a link<span class="token tag"><span class="token punctuation">&lt;/</span>a<span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span></code></pre>
<h2>Image Card</h2>
<p>Here is the standard card with an image thumbnail.</p>
<p><img src="/wdarchive/materialize/images/materializeImageCard.png" alt="image Card" width="400" height="523" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/11564683" data-api-returntype="File"></p>
<pre class=" language-markup"><code class=" language-markup"><span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>card<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>card-image<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>img <span class="token attr-name">src</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>images/sample-1.jpg<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>span <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>card-title<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>Card Title<span class="token tag"><span class="token punctuation">&lt;/</span>span<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>card-content<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>p<span class="token punctuation">&gt;</span></span>I am a very simple card. I am good at containing small bits of information.
    I am convenient because I require little markup to use effectively.<span class="token tag"><span class="token punctuation">&lt;/</span>p<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>card-action<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>a <span class="token attr-name">href</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>#<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>This is a link<span class="token tag"><span class="token punctuation">&lt;/</span>a<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span></code></pre>
<h2>Card Sizes</h2>
<p><span>If you want to have uniformly sized cards, you can use our pre-made size classes. Just add the size class in addition to the card class.</span></p>
<pre class=" language-markup"><code class=" language-markup"><span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>card small<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
  <span class="token comment">&lt;!-- Normal card content goes here --&gt;</span>
<span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span></code></pre>
<p>There are 3 different size classes that you can add if you want to force a card to be a specific height. You might want to do this because it looks good if all of your cards are the exact same height. The three sizes are:</p>
<ul>
<li>small = <span>locks the height of the card to</span> 300px</li>
<li>medium = <span>locks the height of the card to</span> 400px</li>
<li>large = <span>locks the height of the card to 500px.</span>
</li>
</ul>
