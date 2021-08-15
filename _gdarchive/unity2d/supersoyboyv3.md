---
layout: project
category: unity2d
title: Super Soy Boy v3
---

Finish the [Soy Boy v3 tutorial](https://github.com/ohiofi/soyboy3tutorial/blob/master/README.md)

Your level should take a minute or more to complete (but must not be impossible)

Reset to public Vector2 startposition when Soy Boy falls.

Add arrow sprites to point the player in the correct direction. Give the arrow sprites box collider triggers. Create a new tag called "checkpoint." Tag the arrow sprites as "checkpoint" *and put the arrows in Layer 2: Ignore Raycast*

On trigger enter, set Soy Boy's start position to be the arrow sprite's x y location (in other words, these arrows will serve as checkpoints).

  - Edit the SoyBoyController and add the function OnTriggerEnter2D(Collider2D other)
  - If the other.tag is "checkpoint" then set Soy Boy's startposition to other.transform.position

Finally, change the Hazards script so that Soy Boy resets to startposition instead of being destroyed and restarting the level

  - Comment out Destroy (coll.gameObject);
  - Comment out GameManager.instance.RestartLevel (1.25f);
  - Add this line instead:
coll.transform.position = coll.gameObject.GetComponent<SoyBoyController>().startPosition;
