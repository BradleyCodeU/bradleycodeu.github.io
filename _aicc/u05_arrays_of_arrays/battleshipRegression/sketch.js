const GRID_SIZE = 10;
const CELL_SIZE = 40;
const LINE_TOLERANCE = 0.7;

let secretSlope, secretIntercept;
let grid = [];
let currentPlayer = "bluePlayer";
let scores = { bluePlayer: 0, redPlayer: 0 };
let goodSquaresFound = [];
let predictedM = null;
let predictedB = null;
let gameOver = false;
let goodSquaresTotal = 0;
let gameState = "TITLE";

function setup() {
  createCanvas(windowWidth, windowHeight);
  textAlign(CENTER);
  text("click to play", width * 0.5, height * 0.5);
}

function resetGame() {
  secretSlope = random(-1.9, 1.9);
  secretIntercept = getSecretIntercept(secretSlope);

  grid = make2dArray(GRID_SIZE, GRID_SIZE);

  goodSquaresTotal = findTotalGoodSquares(secretSlope, secretIntercept);

  scores = { bluePlayer: 0, redPlayer: 0 };
  currentPlayer = "bluePlayer";
  goodSquaresFound = [];
  predictedM = null;
  predictedB = null;
  gameOver = false;
  drawBoard();
}

/**
 * Helper function to convert a grid-based Y-coordinate (for lines)
 * to a p5.js screen-based Y-coordinate.
 * (0,0) on grid -> (0, 400) on screen
 * (0,10) on grid -> (0, 0) on screen
 */
function getScreenY(gridY) {
  return (GRID_SIZE - gridY) * CELL_SIZE;
}

function drawBoard() {
  background(220);

  // Draw clicked cells
  // y=0 is now the bottom row, y=9 is the top row
  for (let y = 0; y < GRID_SIZE; y++) {
    for (let x = 0; x < GRID_SIZE; x++) {
      drawOneSquare(x, y)
    }
  }

  drawGridLines();
  drawPredictionLine(predictedM,predictedB)
  displayScores();
}

function drawOneSquare(x,y){
  const val = grid[y][x];
  stroke("lightgray");
  if (val === "bluePlayer") {
    fill(0, 100, 255);
  } else if (val === "redPlayer") {
    fill(255, 80, 80);
  } else if (val === "miss") {
    fill(200);
  } else {
    fill(255);
  }
  // Calculate the screen Y-coordinate for drawing
  // (GRID_SIZE - 1 - y) converts grid Y to screen Y for drawing rects
  // y=0 (bottom row) -> screenY = (10-1-0)*40 = 360
  // y=9 (top row) -> screenY = (10-1-9)*40 = 0
  const screenY = (GRID_SIZE - 1 - y) * CELL_SIZE;

  // Use the calculated screenY to draw the rect
  rect(x * CELL_SIZE, screenY, CELL_SIZE, CELL_SIZE);

  // Draw points on good cells
  if (val === "bluePlayer" || val === "redPlayer") {
    fill(255);
    textSize(16);
    textAlign(CENTER, CENTER);
    noStroke()
    const pts = Math.floor(distance(0,0,x,y)) + 1;
    // Use screenY to position the text
    text(pts, x * CELL_SIZE + CELL_SIZE / 2, screenY + CELL_SIZE / 2);
  }
}

function drawPredictionLine(predictedM,predictedB){
  if (
    predictedM !== null &&
    predictedB !== null &&
    isFinite(predictedM) &&
    isFinite(predictedB)
  ) {
    stroke(255, 200, 0);
    strokeWeight(2);

    // Use the helper function to get screen coordinates for the line
    const y1 = getScreenY(predictedB); // y at x=0
    const y2 = getScreenY(predictedM * GRID_SIZE + predictedB); // y at x=GRID_SIZE

    line(0 * CELL_SIZE, y1, GRID_SIZE * CELL_SIZE, y2);
  }
}

function displayScores() {
  noStroke();
  fill(0);
  textSize(16);
  textAlign(LEFT);
  text("Blue: " + scores.bluePlayer, 10, GRID_SIZE * CELL_SIZE + 20);
  text("Red: " + scores.redPlayer, 10, GRID_SIZE * CELL_SIZE + 40);
  text(
    "Found: " + goodSquaresFound.length + "/" + goodSquaresTotal,
    10,
    GRID_SIZE * CELL_SIZE + 60
  );
  if (currentPlayer === "bluePlayer") {
    fill("blue");
    text("Current Turn: Blue", 10, GRID_SIZE * CELL_SIZE + 80);
  } else {
    fill("red");
    text("Current Turn: Red", 10, GRID_SIZE * CELL_SIZE + 80);
  }
}

function mousePressed() {
  if (gameOver) return;

  if(gameState == "TITLE"){
    resetGame();
    gameState = "INGAME";
  }

  const gridX = floor(mouseX / CELL_SIZE);
  const std_gridY = floor(mouseY / CELL_SIZE); // The "normal" p5.js grid Y

  // Flip the y-axis: 0 on screen (top) becomes 9. 9 on screen (bottom) becomes 0.
  const gridY = GRID_SIZE - 1 - std_gridY;

  if (gridX < 0 || gridX >= GRID_SIZE || gridY < 0 || gridY >= GRID_SIZE) return;
  if (grid[gridY][gridX] !== 0) return;

  const distFromLine = distance(gridX, secretSlope * gridX + secretIntercept, gridX, gridY);
  const distFromOrigin = Math.floor(distance(0, 0, gridX, gridY)) + 1;

  if (distFromLine <= LINE_TOLERANCE) {
    grid[gridY][gridX] = currentPlayer;
    scores[currentPlayer] += distFromOrigin;
    goodSquaresFound.push({ x: gridX, y: gridY }); // Save the correct (x, y)
    computeTrendLine();
  } else {
    grid[gridY][gridX] = "miss";
  }
  currentPlayer = getNextPlayer(currentPlayer);
  drawBoard();

  if (goodSquaresFound.length === goodSquaresTotal && !gameOver) {
    endGame();
  }
}

// Analytical regression
function computeTrendLine() {
  const xs = getXValues(goodSquaresFound);
  const ys = getYValues(goodSquaresFound);
  const meanX = xs.reduce((a, b) => a + b, 0) / xs.length;
  const meanY = ys.reduce((a, b) => a + b, 0) / ys.length;

  let num = 0,
    den = 0;
  for (let i = 0; i < goodSquaresFound.length; i++) {
    num += (xs[i] - meanX) * (ys[i] - meanY);
    den += (xs[i] - meanX) ** 2;
  }

  predictedM = num / den;
  predictedB = meanY - predictedM * meanX;
}

function endGame() {
  gameOver = true;

  // Draw secret line
  stroke(0, 255, 0);
  strokeWeight(2);

  // Use the helper function to get screen coordinates
  const y1 = getScreenY(secretIntercept); // y at x=0
  const y2 = getScreenY(secretSlope * GRID_SIZE + secretIntercept); // y at x=GRID_SIZE

  line(0 * CELL_SIZE, y1, GRID_SIZE * CELL_SIZE, y2);

  // Display result and comparison
  noStroke();
  fill(0);
  textSize(18);
  textAlign(CENTER);
  let message = "";
  if (scores.bluePlayer === scores.redPlayer) {
    text("It's a tie!", width / 2, GRID_SIZE * CELL_SIZE + 100);
  } else if (scores.bluePlayer > scores.redPlayer) {
    fill("blue");
    text("Blue wins!", width / 2, GRID_SIZE * CELL_SIZE + 100);
  } else {
    fill("red");
    text("Red wins!", width / 2, GRID_SIZE * CELL_SIZE + 100);
  }
  fill(0);
  textSize(14);
  text(
    `Secret: y = ${secretSlope.toFixed(2)}x + ${secretIntercept.toFixed(2)}`,
    width / 2,
    GRID_SIZE * CELL_SIZE + 120
  );
  if (predictedM !== null && predictedB !== null) {
    text(
      `Predicted: y = ${predictedM.toFixed(2)}x + ${predictedB.toFixed(2)}`,
      width / 2,
      GRID_SIZE * CELL_SIZE + 140
    );
  }
}

function keyPressed() {
  if (key === "r" || key === "R") resetGame();
}

