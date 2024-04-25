
let scoreDisplay = document.getElementById("scoreDiv");
let score = 0;
let myFont;
let player = new GameObject();
player.transform.position.x = -200;
player.transform.position.z = -200;
player.transform.rotation.y = 45;
let cam = new Camera();

function preload() {
  myFont = loadFont(
    "PressStart2P.ttf"
  );
}

function setup() {
  angleMode(DEGREES);
  createCanvas(windowWidth, windowHeight, WEBGL);
  setAttributes("antialias", true);
  // setup the camera
  cam.setParent(player, distBehind, distAbove);
  createHUD();
}

function draw() {
  background(220);
  // light the scene
  ambientLight(128);
  directionalLight(255, 255, 255, 1, -1, -1);
  directionalLight(0, 0, 128, -1, 1, 1);
  checkPlayerControls();
  cam.update();
  player.show();
  drawFloor();
  drawBoxes();
  // add the p5js text
  push();
  translate(1000, 0, 1000);
  rotateY(45);
  drawText("p5js");
  pop();
  // label the x axis
  push();
  translate(1000, 0, 0);
  rotateY(90);
  drawText("X+", "red", 10)
  pop();
  // label the x axis
  push();
  translate(0, 0, 1000);
  drawText("Z+", "blue", 10);
  pop();
}

function createHUD() {
  var mydiv = document.createElement("div"); // Create a <div> element
  mydiv.innerHTML = "Score: <span id='scoreDiv'>0</span> / 100"; // Insert text
  mydiv.id = "hud";
  mydiv.style.position = "absolute";
  mydiv.style.top = 0;
  mydiv.style.left = 0;
  document.body.appendChild(mydiv); // Append <div> to <body>
  scoreDisplay = document.getElementById("scoreDiv");
}

function drawBoxes() {
  push();
  translate(600, 5, 50);
  fill("red");
  rotateY(frameCount)
  noStroke();
  box(10);
  pop();
  push();
  translate(100, 5, 800);
  fill("blue");
  rotateY(frameCount)
  noStroke();
  box(10);
  pop();
}

function drawFloor() {
  let tileSize = 100;
  // tile floor
  for (let row = 0; row < 10; row++) {
    for (let col = 0; col < 10; col++) {
      push();
      translate(
        row * tileSize + tileSize / 2,
        0,
        col * tileSize + tileSize / 2
      );
      fill(255);
      if ((row + col) % 2) {
        fill(235);
      }
      stroke(0);
      box(tileSize, 0, tileSize);
      pop();
    }
  }
}
function drawText(mytext = "", color = '#ED225D', size = 36) {
  push();
  scale(1, -1, 1);
  textAlign(CENTER);
  fill(color);
  textFont(myFont);
  textSize(size);
  text(mytext, 0, 0);
  pop();
}

function windowResized() {
  resizeCanvas(windowWidth, windowHeight);
}
