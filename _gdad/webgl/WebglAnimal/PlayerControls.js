let distAbove = 300;
let distBehind = 300;
let horizontalTiltSpeed = 0.05;
let moveSpeed = 5;

function checkPlayerControls() {
  // NOTE: tilt camera up/down is a camera control found in the Camera class

  // rotate player left/right
  player.transform.rotation.y -= -movedX * horizontalTiltSpeed;

  // right
  if (keyIsDown(RIGHT_ARROW) || keyIsDown(68)) {
    requestPointerLock();
    player.transform.position.x +=
      cos(player.transform.rotation.y) * moveSpeed;
    player.transform.position.z -=
      sin(player.transform.rotation.y) * moveSpeed;
  }
  // left
  if (keyIsDown(LEFT_ARROW) || keyIsDown(65)) {
    requestPointerLock();
    player.transform.position.x -=
      cos(player.transform.rotation.y) * moveSpeed;
    player.transform.position.z +=
      sin(player.transform.rotation.y) * moveSpeed;
  }
  // reverse
  if (keyIsDown(DOWN_ARROW) || keyIsDown(83)) {
    requestPointerLock();
    player.transform.position.x -= sin(player.transform.rotation.y) * moveSpeed;
    player.transform.position.z -= cos(player.transform.rotation.y) * moveSpeed;
  }
  // forward
  if (keyIsDown(UP_ARROW) || keyIsDown(87)) {
    requestPointerLock();
    player.transform.position.x += sin(player.transform.rotation.y) * moveSpeed;
    player.transform.position.z += cos(player.transform.rotation.y) * moveSpeed;
  }
  // plus
  if(keyIsDown(187)){
    requestPointerLock();
    distAbove *= 0.99;
    distBehind *= 0.99;
    cam.setParent(player, distBehind, distAbove);
  }
  // minus
  if(keyIsDown(189)){
    requestPointerLock();
    distAbove *= 1.01;
    distBehind *= 1.01;
    cam.setParent(player, distBehind, distAbove);
  }
}
function mouseClicked() {
  requestPointerLock();
}
