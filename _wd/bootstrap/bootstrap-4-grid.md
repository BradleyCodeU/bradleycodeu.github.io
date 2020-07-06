---
layout: project
category: bootstrap
title: Bootstrap Grid
---
<h2>Bootstrap 4 Grid System</h2>
<p><span style="background-color: #ffff99;">Bootstrap's grid system divides the page into 12 columns.</span></p>
<p><span style="background-color: #ffff99;">If you do not want to use all 12 columns individually, you can group the columns together to create wider columns:</span></p>
<div class="table-responsive">
<table class="table grid" style="width: 100%;">
<tbody>
<tr>
<td style="border: 1px solid gray; text-align: center;">span 1</td>
<td style="border: 1px solid gray; text-align: center;">span 1</td>
<td style="border: 1px solid gray; text-align: center;">span 1</td>
<td style="border: 1px solid gray; text-align: center;">span 1</td>
<td style="border: 1px solid gray; text-align: center;">span 1</td>
<td style="border: 1px solid gray; text-align: center;">span 1</td>
<td style="border: 1px solid gray; text-align: center;">span 1</td>
<td style="border: 1px solid gray; text-align: center;">span 1</td>
<td style="border: 1px solid gray; text-align: center;">span 1</td>
<td style="border: 1px solid gray; text-align: center;">span 1</td>
<td style="border: 1px solid gray; text-align: center;">span 1</td>
<td style="border: 1px solid gray; text-align: center;">span 1</td>
</tr>
<tr>
<td style="border: 1px solid gray; text-align: center;" colspan="4"> span 4</td>
<td style="border: 1px solid gray; text-align: center;" colspan="4"> span 4</td>
<td style="border: 1px solid gray; text-align: center;" colspan="4"> span 4</td>
</tr>
<tr>
<td style="border: 1px solid gray; text-align: center;" colspan="4">span 4</td>
<td style="border: 1px solid gray; text-align: center;" colspan="8">span 8</td>
</tr>
<tr>
<td style="border: 1px solid gray; text-align: center;" colspan="6">span 6</td>
<td style="border: 1px solid gray; text-align: center;" colspan="6">span 6</td>
</tr>
<tr>
<td style="border: 1px solid gray; text-align: center;" colspan="12">span 12</td>
</tr>
</tbody>
</table>
</div>
<p>The grid system is responsive, and the columns will re-arrange automatically depending on the screen size.</p>
<p><span style="background-color: #ffff99;">Try to make sure that your column sizes add up to 12. If the total sum is less than 12, it's not a problem because it is not required that you use all 12 available columns. If the total sum is more than 12, it's not a problem because the extra columns will automatically begin a new row.</span></p>
<h3>Example</h3>
<div class="w3-code notranslate htmlHigh">
<span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="row"</span></span><span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col-6"</span></span><span class="tagcolor">&gt;Size Six Column</span></span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col-2"</span></span><span class="tagcolor">&gt;</span></span>Size Two Column<span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col-4"</span></span><span class="tagcolor">&gt;</span></span>Size Four Column<span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br><span class="tagnamecolor"><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span></span>
<table class="table grid" style="width: 100%;">
<tbody>
<tr>
<td style="border: 1px solid gray; text-align: center; width: 50%;">Size Six Column</td>
<td style="border: 1px solid gray; text-align: center; width: 17%;">Size Two Column</td>
<td style="border: 1px solid gray; text-align: center; width: 33%;">Size Four Column</td>
</tr>
</tbody>
</table>
<hr>
</div>
<h2>Grid Classes</h2>
<p>The Bootstrap 4 grid system has five classes:</p>
<ul>
<li>.col- (extra small devices - screen width less than 576px)</li>
<li>.col-sm- (small devices - screen width equal to or greater than 576px)</li>
<li>.col-md- (medium devices - screen width equal to or greater than 768px)</li>
<li>.col-lg- (large devices - screen width equal to or greater than 992px)</li>
<li>.col-xl- (xlarge devices - screen width equal to or greater than 1200px)</li>
</ul>
<p>The classes above can be combined to create more dynamic and flexible layouts.</p>
<p><span style="background-color: #ffff99;"><strong>Tip:</strong> Each class scales up, so if you wish to set the same widths for sm and md, you only need to specify sm.</span></p>
<h3>Example</h3>
<div class="w3-code notranslate htmlHigh">
<span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="row"</span></span><span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col-md-6"</span></span><span class="tagcolor">&gt;Size Six Column on medium and larger screens</span></span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col-md-2"</span></span><span class="tagcolor">&gt;</span></span>Size Two Column on medium and larger screens<span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col-md-4"</span></span><span class="tagcolor">&gt;</span></span>Size Four Column on medium and larger screens<span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span>
</div>
<table class="table grid" style="width: 100%;">
<tbody>
<tr>
<td style="border: 1px solid gray; text-align: center; width: 50%;">Size Six Column on medium and larger screens</td>
<td style="border: 1px solid gray; text-align: center; width: 17%;">Size Two Column on medium and larger screens</td>
<td style="border: 1px solid gray; text-align: center; width: 33%;">Size Four Column on medium and larger screens</td>
</tr>
</tbody>
</table>
<hr>
<h2>Basic Structure of a Bootstrap 4 Grid</h2>
<p>The following is a basic structure of a Bootstrap 4 grid:</p>
<div class="w3-example">
<div class="w3-code notranslate htmlHigh">
<span class="commentcolor">&lt;!-- Control the column width, and how they should appear on different devices --&gt;</span><br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="row"</span></span><span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col-*-*"</span></span><span class="tagcolor">&gt;</span></span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col-*-*"</span></span><span class="tagcolor">&gt;</span></span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="row"</span></span><span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col-*-*"</span></span><span class="tagcolor">&gt;</span></span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col-*-*"</span></span><span class="tagcolor">&gt;</span></span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col-*-*"</span></span><span class="tagcolor">&gt;</span></span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span>
</div>
<div class="w3-code notranslate htmlHigh">First, create a row (&lt;div class="row"&gt;). Then <span style="background-color: #ffff99;">the most common approach is to add the desired number of columns using `col-*-*` classes. The first star `*` represents the device-size: sm, md, lg or xl, while the second star represents a column-size, which should add up to 12 for each row.</span>
</div>
<div class="w3-code notranslate htmlHigh"><a class="w3-btn w3-margin-bottom" href="https://www.w3schools.com/bootstrap4/tryit.asp?filename=trybs_grid_ex1&amp;stacked=h" >Try it Yourself »</a></div>
</div>
<hr>
<h2>Responsive Columns</h2>
<table class="table grid" style="width: 100%;">
<tbody>
<tr>
<td style="border: 1px solid gray; text-align: center;" colspan="3">.col-sm-3</td>
<td style="border: 1px solid gray; text-align: center;" colspan="3">.col-sm-3</td>
<td style="border: 1px solid gray; text-align: center;" colspan="3">.col-sm-3</td>
<td style="border: 1px solid gray; text-align: center;" colspan="3">.col-sm-3</td>
</tr>
</tbody>
</table>
<p>The following example shows <span style="background-color: #ffff99;">how to create four equal-width columns starting at tablets and scaling to extra large desktops. <strong>On mobile phones or screens that are less than 576px wide, the columns will automatically stack on top of each other</strong></span>:</p>
<div class="w3-example">
<h3>Example</h3>
<div class="w3-code notranslate htmlHigh">
<span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="row"</span></span><span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col-sm-3"</span></span><span class="tagcolor">&gt;</span></span>.col-sm-3<span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col-sm-3"</span></span><span class="tagcolor">&gt;</span></span>.col-sm-3<span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col-sm-3"</span></span><span class="tagcolor">&gt;</span></span>.col-sm-3<span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col-sm-3"</span></span><span class="tagcolor">&gt;</span></span>.col-sm-3<span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span>
</div>
<a class="w3-btn w3-margin-bottom" href="https://www.w3schools.com/bootstrap4/tryit.asp?filename=trybs_grid_ex1&amp;stacked=h" >Try it Yourself »</a>
</div>
<hr>
<h2>Two Unequal Responsive Columns</h2>
<table class="table grid" style="width: 100%;">
<tbody>
<tr>
<td style="border: 1px solid gray; text-align: center; width: 33%;" colspan="1">.col-sm-4</td>
<td style="border: 1px solid gray; text-align: center; width: 67%;" colspan="2">.col-sm-8</td>
</tr>
</tbody>
</table>
<p>The following example shows <span style="background-color: #ffff99;">how to get two various-width columns starting at tablets and scaling to large extra desktops</span>:</p>
<div class="w3-example">
<h3>Example</h3>
<div class="w3-code notranslate htmlHigh">
<span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="row"</span></span><span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col-sm-4"</span></span><span class="tagcolor">&gt;</span></span>.col-sm-4<span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col-sm-8"</span></span><span class="tagcolor">&gt;</span></span>.col-sm-8<span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span>
</div>
<a class="w3-btn w3-margin-bottom" href="https://www.w3schools.com/bootstrap4/tryit.asp?filename=trybs_grid_ex3&amp;stacked=h" >Try it Yourself »</a>
</div>
<div class="w3-panel w3-note">
<hr>
<div class="w3-example">
<div class="w3-code notranslate htmlHigh">
<h2>Automatic Columns</h2>
<span class="commentcolor">&lt;!-- You can let Bootstrap automatically handle the layout --&gt;</span><br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="row"</span></span><span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col"</span></span><span class="tagcolor">&gt;</span></span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col"</span></span><span class="tagcolor">&gt;</span></span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col"</span></span><span class="tagcolor">&gt;</span></span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span>
</div>
</div>
<p><span style="font-size: 1rem;">First, create a row (&lt;div class="row"&gt;). Then i</span><span style="font-family: sans-serif; font-size: 1rem;">nstead of adding a number to each col, let bootstrap handle the layout, to create equal width columns: two "col" elements = 50% width to each col. three cols = 33.33% width to each col. four cols = 25% width, etc.</span></p>
<p><span style="font-family: sans-serif; font-size: 1rem; background-color: #ffff99;">Note: this creates columns that are NOT responsive, but will have the same layout <span style="color: #000000;">on all devices and screen widths.</span></span></p>
<p><span style="font-family: sans-serif; font-size: 1rem;"><span style="color: #000000;"><a class="w3-btn w3-margin-bottom" href="https://www.w3schools.com/bootstrap4/tryit.asp?filename=trybs_grid_ex&amp;stacked=h" >Try it Yourself »</a></span></span></p>
<p><span style="font-family: sans-serif; font-size: 1rem;">You can also use col-sm/col-md/col-lg/col-xl to make the automatic columns responsive.</span></p>
<hr>
<h2>Three Equal Columns</h2>
<table class="table grid" style="width: 100%;">
<tbody>
<tr>
<td style="border: 1px solid gray; text-align: center;">.col</td>
<td style="border: 1px solid gray; text-align: center;">.col</td>
<td style="border: 1px solid gray; text-align: center;">.col</td>
</tr>
</tbody>
</table>
<p>The following example shows <span style="background-color: #ffff99;">how to <span style="color: #000000;">automatically create three equal-width columns, on all devices and screen widths:</span></span></p>
<div class="w3-example">
<h3>Example</h3>
<div class="w3-code notranslate htmlHigh">
<span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="row"</span></span><span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col"</span></span><span class="tagcolor">&gt;</span></span>.col<span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col"</span></span><span class="tagcolor">&gt;</span></span>.col<span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="col"</span></span><span class="tagcolor">&gt;</span></span>.col<span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span>
</div>
<a class="w3-btn w3-margin-bottom" href="https://www.w3schools.com/bootstrap4/tryit.asp?filename=trybs_grid_ex&amp;stacked=h" >Try it Yourself »</a>
</div>
</div>
