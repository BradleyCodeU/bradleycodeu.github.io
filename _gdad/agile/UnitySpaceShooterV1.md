---
layout: project
category: agile
title: Unity Space Shooter V1
---

Create a new 3D Unity project named Space Shooter.

Download the starter files here [https://drive.google.com/file/d/1E0O8PRlfQ3xOMtQu2jwf2iXxU_NuDgO-/view?usp=sharing](https://drive.google.com/file/d/1E0O8PRlfQ3xOMtQu2jwf2iXxU_NuDgO-/view?usp=sharing), unzip/extract the files, and drag them into the Project Assets window in Unity.

Follow along with the tutorial videos here [https://drive.google.com/drive/folders/1m8aVsgm2mqPOOGBTuRc50YesTPaWs1E_?usp=sharing](https://drive.google.com/drive/folders/1m8aVsgm2mqPOOGBTuRc50YesTPaWs1E_?usp=sharing)



*NOTE: In the tutorial videos, you will be directed to assign new values to rigidbody.position but this is now read-only. Instead you can assign a new values to
```
transform.position
```
The tutorials also skip the helpful step in which you store the rigidbody in a variable. Like this…
```
private Rigidbody rb;
void Start(){
  rb = GetComponent<Rigidbody>();
}
```
Once you’ve done that you can change the velocity Vector3 with rb.velocity or the tilt Vector3 with rb.tilt

Requirements:

- Must have PlayerController script and be able to move the player with arrow keys
- Must be able to shoot lasers.
- Go to Edit > Project Settings > Input > Axes > Fire1 and change the positive button to space
- Must have created your own unique skybox (tutorial video here and in the Space Shooter Tutorials folder)
- Player MUST move on X and Y axis NOT Z axis. (Note: Lasers move on Z axis)
- Use a 3rd person camera (NOT top-down) and the camera must move along with the ship
