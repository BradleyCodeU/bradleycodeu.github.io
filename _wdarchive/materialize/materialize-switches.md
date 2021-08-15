---
layout: project
category: materialize
title: Materialize Switches
---


<p><span>Switches are special checkboxes used for binary states such as on / off. They are also known as toggle switches. Toggle switches are actually just checkboxes with some extra CSS decoration.</span></p>
<p><img src="/wd/materialize/images/materializeToggleSwitches.png" alt="materializeToggleSwitches.png" width="150" height="98" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/12309818" data-api-returntype="File"></p>
<pre class=" language-markup"><code class=" language-markup"> <span class="token comment">&lt;!-- Switch --&gt;</span>
  <span class="token tag"><span class="token punctuation">&lt;</span>div <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>switch<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token punctuation">&lt;</span>label<span class="token punctuation">&gt;</span></span>
      Off
      <span class="token tag"><span class="token punctuation">&lt;</span>input <span class="token attr-name">type</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>checkbox<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
      <span class="token tag"><span class="token punctuation">&lt;</span>span <span class="token attr-name">class</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>lever<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span><span class="token tag"><span class="token punctuation">&lt;/</span>span<span class="token punctuation">&gt;</span></span>
      On
    <span class="token tag"><span class="token punctuation">&lt;/</span>label<span class="token punctuation">&gt;</span></span>
  <span class="token tag"><span class="token punctuation">&lt;/</span>div<span class="token punctuation">&gt;</span></span></code></pre>
<h3><span>Toggle Switches without Materialize</span></h3>
<p><span>It is possible to create toggle switches without Materialize, but it is MUCH more code. Here is the code for creating a toggle switch at W3Schools: <a href="https://www.w3schools.com/howto/howto_css_switch.asp">https://www.w3schools.com/howto/howto_css_switch.asp</a></span></p>
<p><img src="/wd/materialize/images/w3schoolsToggleSwitches.png" alt="w3schoolsToggleSwitches.png" width="160" height="112" data-api-endpoint="https://hilliard.instructure.com/api/v1/courses/31582/files/12309845" data-api-returntype="File"></p>
<p>HTML:</p>
<pre><span class="commentcolor">&lt;!-- Rectangular switch --&gt;</span><br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>label<span class="attributecolor"><span> </span>class<span class="attributevaluecolor">="switch"</span></span><span class="tagcolor">&gt;</span></span><br><span>  </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>input<span class="attributecolor"><span> </span>type<span class="attributevaluecolor">="checkbox"</span></span><span class="tagcolor">&gt;</span></span><br><span>  </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>span<span class="attributecolor"><span> </span>class<span class="attributevaluecolor">="slider"</span></span><span class="tagcolor">&gt;</span></span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/span<span class="tagcolor">&gt;</span></span><br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/label<span class="tagcolor">&gt;</span></span><br><br><span class="commentcolor">&lt;!-- Rounded switch --&gt;</span><br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>label<span class="attributecolor"><span> </span>class<span class="attributevaluecolor">="switch"</span></span><span class="tagcolor">&gt;</span></span><br><span>  </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>input<span class="attributecolor"><span> </span>type<span class="attributevaluecolor">="checkbox"</span></span><span class="tagcolor">&gt;</span></span><br><span>  </span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>span<span class="attributecolor"><span> </span>class<span class="attributevaluecolor">="slider round"</span></span><span class="tagcolor">&gt;</span></span><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/span<span class="tagcolor">&gt;</span></span><br><span class="tagnamecolor"><span class="tagcolor">&lt;</span>/label<span class="tagcolor">&gt;</span></span></pre>
<p>CSS:</p>
```
/* The switch - the box around the slider */
.switch {
  position: relative;
  display: inline-block;
  width: 60px;
  height: 34px;
}

/* Hide default HTML checkbox */
.switch input {
  opacity: 0;
  width: 0;
  height: 0;
}

/* The slider */
.slider {
  position: absolute;
  cursor: pointer;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  background-color: #ccc;
  -webkit-transition: .4s;
  transition: .4s;
}

.slider:before {
  position: absolute;
  content: "";
  height: 26px;
  width: 26px;
  left: 4px;
  bottom: 4px;
  background-color: white;
  -webkit-transition: .4s;
  transition: .4s;
}

input:checked + .slider {
  background-color: #2196F3;
}

input:focus + .slider {
  box-shadow: 0 0 1px #2196F3;
}

input:checked + .slider:before {
  -webkit-transform: translateX(26px);
  -ms-transform: translateX(26px);
  transform: translateX(26px);
}

/* Rounded sliders */
.slider.round {
  border-radius: 34px;
}

.slider.round:before {
  border-radius: 50%;
}
```
