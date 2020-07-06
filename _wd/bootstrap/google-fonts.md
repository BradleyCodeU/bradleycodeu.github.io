---
layout: project
category: bootstrap
title: Google Fonts
---
<p>Source: <a href="https://developer.mozilla.org/en-US/docs/Learn/CSS/Styling_text/Web_fonts">https://developer.mozilla.org/en-US/docs/Learn/CSS/Styling_text/Web_fonts</a></p>
<p class="intro"> </p>
<p>Currently there are<span> </span><span id="spancount2">987</span><span> </span>fonts available at <a href="http://fonts.google.com">fonts.google.com</a></p>
<p>Online font services generally store and serve fonts for you, so you don't have to worry about writing the<span> </span>@font-face<span> </span>code, and generally just need to insert a simple line or two of code into your site to make everything work. Examples include<span> </span><a class="external" href="https://fonts.adobe.com/">Adobe Fonts</a><span> </span>and<span> </span><a class="external" href="http://www.typography.com/cloud/welcome/">Cloud.typography</a>. Most of these services are subscription-based, with the notable exception of<span> </span><a class="external" href="https://www.google.com/fonts">Google Fonts</a>, a useful free service, especially for rapid testing work and writing demos.</p>
<p>Most of these services are easy to use, so we won't cover them in great detail. Let's have a quick look at Google fonts, so you can get the idea.</p>
<p>Learn how to use Google Fonts on your web page.</p>
<ol>
<li>Go to<span> </span><a href="https://fonts.google.com/">fonts.google.com</a>
</li>
<li>Use <strong>Categories</strong> button to display only the style of fonts that you are looking for. Then choose one or more fonts you like.</li>
<li>To select a font family, press the <strong>+ Select This Style</strong> (or in some places just + button). If you want, you can also add more styles of this font or add different fonts.
<ul>
<li><img src="/wd/bootstrap/images/googleFontsSelectThisStyleButton.png" alt="googleFontsSelectThisStyleButton.png" width="386" height="154" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/11040481" data-api-returntype="File"></li>
</ul>
</li>
<li>When you've chosen everything you want, press <strong>Selected Families</strong> button at the top-right of the page. Then click <strong>Embed</strong>.
<ul>
<li><img src="/wd/bootstrap/images/googleFontsSelectedFamiliesButton.png" alt="googleFontsSelectedFamiliesButton.png" width="600" height="170" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/11040476" data-api-returntype="File"></li>
</ul>
</li>
<li>In the resulting screen, you first need to copy the HTML <a style="margin: 0px; padding: 0px; border: 0px; color: #3d7e9a; text-decoration: none;" title='The HTML External Resource Link element (&lt;link&gt;) specifies relationships between the current document and an external resource. This element is most commonly used to link to stylesheets, but is also used to establish site icons (both "favicon" style icons and icons for the home screen and apps on mobile devices) among other things.' href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/link">&lt;link&gt;</a> code shown and paste it into the head of your HTML file. Paste it above any other<span style="font-family: sans-serif; font-size: 1rem;"> </span><a style="margin: 0px; padding: 0px; border: 0px; color: #3d7e9a; text-decoration: none;" title='The HTML External Resource Link element (&lt;link&gt;) specifies relationships between the current document and an external resource. This element is most commonly used to link to stylesheets, but is also used to establish site icons (both "favicon" style icons and icons for the home screen and apps on mobile devices) among other things.' href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/link">&lt;link&gt;</a><span style="font-family: sans-serif; font-size: 1rem;"> </span><span style="font-family: sans-serif; font-size: 1rem;">elements (for your external CSS file, for example) so that the font is imported before you try to use it in your CSS file.</span>
</li>
<li>You then need to copy the CSS rules and paste them into your code (your external CSS file or your style section), to use the custom fonts in your HTML.</li>
</ol>
