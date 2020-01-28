---
layout: project
category: csharp
title: Space Shooter v1
---

NOTE: In the tutorial videos, you will be directed to assign new values to ```rigidbody.position``` but this is now read-only. Instead you can assign a new values to ```transform.position```

[Space Shooter tutorials](https://drive.google.com/open?id=1yYnAjzR8CyDajmKLqHUM8pPBGv-HVkbe)

The tutorials also skip the helpful step in which you store the rigidbody in a variable. Like this...
```
private Rigidbody rb;
void Start(){
  rb = GetComponent<Rigidbody>();
}
```
Once you've done that you can change the velocity Vector3 with ```rb.velocity``` or the tilt Vector3 with ```rb.tilt```

Requirements:

  - Must have PlayerController script and be able to move the player with arrow keys
  - Must be able to shoot lasers.

Additional requirements:

  - Go to Edit > Project Settings > Input > Axes > Fire1 and change the positive button to space
  - Must have created your own unique skybox ([tutorial video here](https://drive.google.com/open?id=1P-6g1iFS3hhI8ssJkpRXPMlQFbyZxtvi) and in the [Space Shooter Tutorials folder](https://drive.google.com/open?id=1yYnAjzR8CyDajmKLqHUM8pPBGv-HVkbe))
  - Player MUST move on X and Y axis NOT Z axis. (Note: Lasers move on Z axis)
  - 3rd person camera (```NOT top-down```) must move along with the ship
