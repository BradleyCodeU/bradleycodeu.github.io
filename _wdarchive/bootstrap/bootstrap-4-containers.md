---
layout: project
category: bootstrap
title: Bootstrap Containers
---
<p>Sources:</p>
<ul>
<li><a href="https://www.w3schools.com/bootstrap4/bootstrap_containers.asp">https://www.w3schools.com/bootstrap4/bootstrap_containers.asp</a></li>
<li><a href="https://getflywheel.com/layout/css-breakpoints-responsive-design-how-to/">https://getflywheel.com/layout/css-breakpoints-responsive-design-how-to/</a></li>
</ul>
<h2>Containers</h2>
<p><span >Creating a container is simple. Make a div and give it the container (or container-fluid) class.</span></p>
<h3>Example</h3>
<div class="w3-code notranslate htmlHigh">
<span class="tagnamecolor" ><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="container"</span></span><span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>h1<span class="tagcolor">&gt;</span></span>My First Bootstrap Page<span class="tagnamecolor"><span class="tagcolor">&lt;</span>/h1<span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>p<span class="tagcolor">&gt;</span></span>This is some text.<span class="tagnamecolor"><span class="tagcolor">&lt;</span>/p<span class="tagcolor">&gt;</span></span> <br><span class="tagnamecolor" ><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span>
</div>
<p><a class="w3-btn w3-margin-bottom" href="https://www.w3schools.com/bootstrap4/tryit.asp?filename=trybs_gs_container2&amp;stacked=h" >Try it Yourself »</a></p>
<p>In the next few days, we will learn how to easily give these containers background colors.</p>
<hr>
<h2>Two Container Classes</h2>
<p>You learned from the previous chapter that Bootstrap requires a containing element to wrap site contents.</p>
<p>Containers are used to pad the content inside of them. <span >There are two container classes available:</span></p>
<ol>
<li><span >The container class provides a responsive <strong>fixed width container</strong></span></li>
<li><span >The container-fluid class provides a <strong>full width container</strong>, spanning the entire width of the viewport</span></li>
</ol>
<div class="w3-row-padding">
<div class="w3-half">
<div class="w3-padding-16">
<div class="w3-center w3-display-container"><img src="/wd/bootstrap/images/bootstrap4ContainerVsContainerFluid.png" alt="bootstrap4ContainerVsContainerFluid.png" width="1968" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/10549841" data-api-returntype="File"></div>
</div>
</div>
</div>
<hr>
<h2>Fixed Container</h2>
<p>Use the .container class to create a responsive, fixed-width container.</p>
<p>Note that its width (max-width) will change on different screen sizes:</p>
<div class="w3-responsive">
<table class="w3-table w3-table-all">
<thead>
<tr>
<th></th>
<th>Extra small<br>&lt;576px</th>
<th>Small<br>≥576px</th>
<th>Medium<br>≥768px</th>
<th>Large<br>≥992px</th>
<th>Extra large<br>≥1200px</th>
</tr>
</thead>
<tbody>
<tr>
<td>max-width</td>
<td>100%</td>
<td>540px</td>
<td>720px</td>
<td>960px</td>
<td>1140px</td>
</tr>
</tbody>
</table>
</div>
<p>Open the Try it Yourself example below and resize the browser window to see that <span >the container width will change at different breakpoints</span>. <span >CSS breakpoints are points where the website content responds (usually by resizing) according to the device width, allowing you to show the best possible layout to the user.</span></p>
<div class="w3-example">
<h3>Example</h3>
<div class="w3-code notranslate htmlHigh">
<span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="container"</span></span><span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>h1<span class="tagcolor">&gt;</span></span>My First Bootstrap Page<span class="tagnamecolor"><span class="tagcolor">&lt;</span>/h1<span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>p<span class="tagcolor">&gt;</span></span>This is some text.<span class="tagnamecolor"><span class="tagcolor">&lt;</span>/p<span class="tagcolor">&gt;</span></span> <br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span>
</div>
<a class="w3-btn w3-margin-bottom" href="https://www.w3schools.com/bootstrap4/tryit.asp?filename=trybs_gs_container2&amp;stacked=h" >Try it Yourself »</a>
</div>
<hr>
<h2>Fluid Container</h2>
<p>Use the .container-fluid class to create a full width container, that will always span the entire width of the screen (width is always 100%):</p>
<div class="w3-example">
<h3>Example</h3>
<div class="w3-code notranslate htmlHigh">
<span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"> class<span class="attributevaluecolor">="container-fluid"</span></span><span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>h1<span class="tagcolor">&gt;</span></span>My First Bootstrap Page<span class="tagnamecolor"><span class="tagcolor">&lt;</span>/h1<span class="tagcolor">&gt;</span></span><br>  <span class="tagnamecolor"><span class="tagcolor">&lt;</span>p<span class="tagcolor">&gt;</span></span>This is some text.<span class="tagnamecolor"><span class="tagcolor">&lt;</span>/p<span class="tagcolor">&gt;</span></span> <br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span>
</div>
<a class="w3-btn w3-margin-bottom" href="https://www.w3schools.com/bootstrap4/tryit.asp?filename=trybs_gs_container-fluid&amp;stacked=h" >Try it Yourself »</a>
</div>
<hr>
<p> </p>
