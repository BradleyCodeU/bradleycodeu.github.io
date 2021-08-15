---
layout: project
category: bootstrap
title: Bootstrap Carousel
---
<p>Source: <a href="https://www.w3schools.com/bootstrap4/bootstrap_carousel.asp">https://www.w3schools.com/bootstrap4/bootstrap_carousel.asp</a></p>
<hr>
<p>The Carousel is a slideshow for cycling through elements (usually images). <a href="https://www.w3schools.com/bootstrap4/bootstrap_carousel.asp">CLICK HERE</a> to see an example.</p>
<p><img src="/wdarchive/bootstrap/images/bootstrap4Carousel.gif" alt="bootstrap4Carousel.gif" width="600" height="338"></p>
<h2>How To Create a Carousel</h2>
<p>The following example shows how to create a basic carousel with indicators and controls:</p>
<div class="w3-example">
<h3>Example</h3>
<div class="w3-code notranslate htmlHigh">
<span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"><span> </span>id<span class="attributevaluecolor">="demo"</span><span> </span>class<span class="attributevaluecolor">="carousel slide"</span><span> </span>data-ride<span class="attributevaluecolor">="carousel"</span></span><span class="tagcolor">&gt;</span></span><br><br> <span> </span><span class="commentcolor">&lt;!-- Indicators --&gt;</span><br> <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>ul<span class="attributecolor"><span> </span>class<span class="attributevaluecolor">="carousel-indicators"</span></span><span class="tagcolor">&gt;</span></span><br>   <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>li<span class="attributecolor"><span> </span>data-target<span class="attributevaluecolor">="#demo"</span><span> </span>data-slide-to<span class="attributevaluecolor">="0"</span><span> </span>class<span class="attributevaluecolor">="active"</span></span><span class="tagcolor">&gt;</span></span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/li<span class="tagcolor">&gt;</span></span><br>   <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>li<span class="attributecolor"><span> </span>data-target<span class="attributevaluecolor">="#demo"</span><span> </span>data-slide-to<span class="attributevaluecolor">="1"</span></span><span class="tagcolor">&gt;</span></span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/li<span class="tagcolor">&gt;</span></span><br>   <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>li<span class="attributecolor"><span> </span>data-target<span class="attributevaluecolor">="#demo"</span><span> </span>data-slide-to<span class="attributevaluecolor">="2"</span></span><span class="tagcolor">&gt;</span></span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/li<span class="tagcolor">&gt;</span></span><br> <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/ul<span class="tagcolor">&gt;</span></span><br><br> <span> </span><span class="commentcolor">&lt;!-- The slideshow --&gt;</span><br> <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"><span> </span>class<span class="attributevaluecolor">="carousel-inner"</span></span><span class="tagcolor">&gt;</span></span><br>   <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"><span> </span>class<span class="attributevaluecolor">="carousel-item active"</span></span><span class="tagcolor">&gt;</span></span><br>     <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>img<span class="attributecolor"><span> </span>src<span class="attributevaluecolor">="la.jpg"</span><span> </span>alt<span class="attributevaluecolor">="Los Angeles"</span></span><span class="tagcolor">&gt;</span></span><br>   <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br>   <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"><span> </span>class<span class="attributevaluecolor">="carousel-item"</span></span><span class="tagcolor">&gt;</span></span><br>     <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>img<span class="attributecolor"><span> </span>src<span class="attributevaluecolor">="chicago.jpg"</span><span> </span>alt<span class="attributevaluecolor">="Chicago"</span></span><span class="tagcolor">&gt;</span></span><br>   <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br>   <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>div<span class="attributecolor"><span> </span>class<span class="attributevaluecolor">="carousel-item"</span></span><span class="tagcolor">&gt;</span></span><br>     <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>img<span class="attributecolor"><span> </span>src<span class="attributevaluecolor">="ny.jpg"</span><span> </span>alt<span class="attributevaluecolor">="New York"</span></span><span class="tagcolor">&gt;</span></span><br>   <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br> <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span><br><br> <span> </span><span class="commentcolor">&lt;!-- Left and right controls --&gt;</span><br> <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>a<span class="attributecolor"><span> </span>class<span class="attributevaluecolor">="carousel-control-prev"</span><span> </span>href<span class="attributevaluecolor">="#demo"</span><span> </span>data-slide<span class="attributevaluecolor">="prev"</span></span><span class="tagcolor">&gt;</span></span><br>   <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>span<span class="attributecolor"><span> </span>class<span class="attributevaluecolor">="carousel-control-prev-icon"</span></span><span class="tagcolor">&gt;</span></span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/span<span class="tagcolor">&gt;</span></span><br> <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/a<span class="tagcolor">&gt;</span></span><br> <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>a<span class="attributecolor"><span> </span>class<span class="attributevaluecolor">="carousel-control-next"</span><span> </span>href<span class="attributevaluecolor">="#demo"</span><span> </span>data-slide<span class="attributevaluecolor">="next"</span></span><span class="tagcolor">&gt;</span></span><br>   <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>span<span class="attributecolor"><span> </span>class<span class="attributevaluecolor">="carousel-control-next-icon"</span></span><span class="tagcolor">&gt;</span></span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/span<span class="tagcolor">&gt;</span></span><br> <span> </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/a<span class="tagcolor">&gt;</span></span><br><br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/div<span class="tagcolor">&gt;</span></span>
</div>
<a class="w3-btn w3-margin-bottom" href="https://www.w3schools.com/bootstrap4/tryit.asp?filename=trybs_carousel" >Try it Yourself »</a>
</div>
<h3>Example explained</h3>
<p>A description of what each class from the example above do:</p>
<table style="border-style: solid; border-color: #AAAAAA;" border="1px" cellspacing="0px" cellpadding="5px">
<tbody>
<tr style="border: 1px solid #AAAAAA; padding: 3px; ">
<th>Class</th>
<th>Description</th>
</tr>
<tr style="border: 1px solid #AAAAAA; padding: 3px;">
<td>.carousel</td>
<td>Creates a carousel</td>
</tr>
<tr style="border: 1px solid #AAAAAA; padding: 3px; ">
<td>.carousel-indicators</td>
<td>Adds indicators for the carousel. These are the little dots at the bottom of each slide (which indicates how many slides there are in the carousel, and which slide the user are currently viewing)</td>
</tr>
<tr style="border: 1px solid #AAAAAA; padding: 3px;">
<td>.carousel-inner</td>
<td>Adds slides to the carousel</td>
</tr>
<tr style="border: 1px solid #AAAAAA; padding: 3px; ">
<td>.carousel-item</td>
<td>Specifies the content of each slide</td>
</tr>
<tr style="border: 1px solid #AAAAAA; padding: 3px;">
<td>.carousel-control-prev</td>
<td>Adds a left (previous) button to the carousel, which allows the user to go back between the slides</td>
</tr>
<tr style="border: 1px solid #AAAAAA; padding: 3px; ">
<td>.carousel-control-next</td>
<td>Adds a right (next) button to the carousel, which allows the user to go forward between the slides</td>
</tr>
<tr style="border: 1px solid #AAAAAA; padding: 3px;">
<td>.carousel-control-prev-icon</td>
<td>Used together with .carousel-control-prev to create a "previous" button</td>
</tr>
<tr style="border: 1px solid #AAAAAA; padding: 3px; ">
<td>.carousel-control-next-icon</td>
<td>Used together with .carousel-control-next to create a "next" button</td>
</tr>
<tr style="border: 1px solid #AAAAAA; padding: 3px;">
<td>.slide</td>
<td>Adds a CSS transition and animation effect when sliding from one item to the next. Remove this class if you do not want this effect</td>
</tr>
</tbody>
</table>
<hr>
