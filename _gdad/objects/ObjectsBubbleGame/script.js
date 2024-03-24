let colorlist = ['gold', 'yellow', 'turquoise', 'red']

function setup() {
  createCanvas(windowWidth, windowHeight);
  
}

function draw() {
  background( colorlist[2] );
  fill( colorlist[3] );
  ellipse(mouseX, mouseY, 25, 25);
}