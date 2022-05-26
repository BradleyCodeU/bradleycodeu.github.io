---
layout: default
category: agile
title: Post Processing in Unity
---

<p>Install Post Process</p>
<ol>
    <li>Click "Window" drop-down menu &gt; Package Manager</li>
    <li>Click "Packages: In Project" drop-down menu and switch it to "Unity Registry"</li>
    <li>Find Post Processing, select it, click the Install button</li>
</ol>
<p>&nbsp;</p>
<p>Set up the Post-process Layer</p>
<ol>
    <li>Select your Main Camera object from the Hierarchy</li>
    <li>At the top of the Inspector, click Layer drop-down and select Add Layer</li>
    <li>In an empty layer (User Layer 10), type CameraFX</li>
    <li>Select Main Camera object again (this resets the Inspector view)</li>
    <li>At the top of the Inspector, change the Layer to CameraFX</li>
    <li>Add Component &gt; Post-process Layer</li>
    <li>Change the Volume blending Layer to CameraFX</li>
</ol>
<p>&nbsp;</p>
<p>Add a in-camera effects to the Main Camera</p>
<ol>
    <li>Select your Main Camera object from the Hierarchy</li>
    <li>Add Component &gt; Post-process Volume</li>
    <li>Is Global should be CHECKED</li>
    <li>Next to Profile click the NEW button</li>
    <li>Click the Post-process Volume's "Add Effect" button &gt; Unity &gt; Depth Of Field</li>
    <li>Place a check next to Aperture and change the value to 1.2</li>
    <li>Objects near the camera are now in-focus. Objects further away are blurry.</li>
    <li>Click the Post-process Volume's "Add Effect" button &gt; Unity &gt; Bloom</li>
    <li>Place a check next to&nbsp;</li>
</ol>
<p>&nbsp;</p>
<p>Add a glow effect to a Game Object</p>
<ol>
    <li>Select an object from the Hierarchy</li>
    <li>Add a Material.&nbsp;Place a check next to Emission and select a color for it to emit</li>
    <li>Want more glow?</li>
    <li>In the Hierarchy, add a new Point Light. Drag the point light onto the object so that it is a child of the object.</li>
    <li>Change the Color of the point light to match the color that it is emitting.</li>
    <li>Turn up the Intensity.</li>
</ol>
