---
layout: project
category: bootstrap
title: Bootstrap Forms and Inputs
---
<p>Forms and inputs are pretty simple. There are only 4 classes.</p>
<ol>
<li>form-input is for a div that contains a group of inputs and their labels</li>
<li>form-control is the basic class that adds style and spacing to an input</li>
<li>you can add form-control-sm if you want a smaller sized input</li>
<li>or you can add form-control-lg if you want a larger sized input</li>
</ol>
<hr>
<h2>Bootstrap 4's Default Settings</h2>
<p>Form controls automatically receive some global styling with Bootstrap:</p>
<p>All textual<span> </span>&lt;input&gt;,<span> </span>&lt;textarea&gt;, and<span> </span>&lt;select&gt;<span> </span>elements with class<span> </span>.form-control<span> </span>have a width of 100%.</p>
<hr>
<h2>Supported Form Controls</h2>
<p>Bootstrap supports the following form controls:</p>
<ul>
<li>input</li>
<li>textarea</li>
<li>checkbox</li>
<li>radio</li>
<li>select</li>
</ul>
<p>We are only going to look at the text input.</p>
<hr>
<h2>Bootstrap Input</h2>
<p>Bootstrap supports all the HTML5 input types: text, password, datetime, datetime-local, date, month, time, week, number, email, url, search, tel, and color.</p>
<p><strong>Note:</strong><span> </span><span style="text-decoration: underline;">Inputs will <strong>NOT</strong> be fully styled if their type (for example, type="text") is not properly declared!</span></p>
<div>
<div class="form-group"><img src="/wd/bootstrap/images/bootstrapInputs01.png" alt="bootstrapInputs01.png" width="600" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/10748134" data-api-returntype="File"></div>
</div>
<p>The following example contains two input elements; one of<span> </span>type="text"<span> </span>and one of<span> </span>type="password". We use the<span> </span>.form-control<span> </span>class to style inputs with full-width and proper padding, etc:</p>
<div class="w3-example">
<h3>Example</h3>
<div class="w3-code notranslate htmlHigh">
<span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"><span> </span>class<span class="attributevaluecolor">="form-group"</span></span><span class="tagcolor">&gt;</span></span><br> <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>label<span class="attributecolor"><span> </span>for<span class="attributevaluecolor">="usr"</span></span><span class="tagcolor">&gt;</span></span>Name:<span class="tagnamecolor"><span class="tagcolor">&lt;</span>/label<span class="tagcolor">&gt;</span></span><br> <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>input<span class="attributecolor"><span> </span>type<span class="attributevaluecolor">="text"</span><span> </span>class<span class="attributevaluecolor">="form-control"</span><span> </span>id<span class="attributevaluecolor">="usr"</span></span><span class="tagcolor">&gt;</span></span><br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"><span> </span>class<span class="attributevaluecolor">="form-group"</span></span><span class="tagcolor">&gt;</span></span><br> <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>label<span class="attributecolor"><span> </span>for<span class="attributevaluecolor">="pwd"</span></span><span class="tagcolor">&gt;</span></span>Password:<span class="tagnamecolor"><span class="tagcolor">&lt;</span>/label<span class="tagcolor">&gt;</span></span><br> <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>input<span class="attributecolor"><span> </span>type<span class="attributevaluecolor">="password"</span><span> </span>class<span class="attributevaluecolor">="form-control"</span><span> </span>id<span class="attributevaluecolor">="pwd"</span></span><span class="tagcolor">&gt;</span></span><br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span>
</div>
<a class="w3-btn w3-margin-bottom" href="https://www.w3schools.com/bootstrap4/tryit.asp?filename=trybs_form_input&amp;stacked=h" >Try it Yourself »</a>
</div>
<hr>
<h2>Form Control Sizing</h2>
<p>Change the size of the form control with<span> </span>.form-control-sm<span> </span>or<span> </span>.form-control-lg:</p>
<p><img src="/wd/bootstrap/images/bootstrapInputs02.png" alt="bootstrapInputs02.png" width="600" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/10748131" data-api-returntype="File"></p>
<div class="w3-example">
<h3>Example</h3>
<div class="w3-code notranslate htmlHigh">
<span class="tagnamecolor"><span class="tagcolor">&lt;</span>input<span class="attributecolor"><span> </span>type<span class="attributevaluecolor">="text"</span><span> </span>class<span class="attributevaluecolor">="form-control form-control-sm"</span></span><span class="tagcolor">&gt;</span></span><br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>input<span class="attributecolor"><span> </span>type<span class="attributevaluecolor">="text"</span><span> </span>class<span class="attributevaluecolor">="form-control"</span></span><span class="tagcolor">&gt;</span></span><br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>input<span class="attributecolor"><span> </span>type<span class="attributevaluecolor">="text"</span><span> </span>class<span class="attributevaluecolor">="form-control form-control-lg"</span></span><span class="tagcolor">&gt;</span></span>
</div>
<a class="w3-btn w3-margin-bottom" href="https://www.w3schools.com/bootstrap4/tryit.asp?filename=trybs_form-control-size&amp;stacked=h" >Try it Yourself »</a>
</div>
<hr>
