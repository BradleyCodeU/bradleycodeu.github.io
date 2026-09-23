let vid;
let BUBBLE_SIZE = 2;

function setup() {
    createCanvas(windowWidth, windowHeight);
    vid = createCapture(VIDEO, { flipped: true });
    console.log(vid.width + " " + vid.height);
    vid.size(64, 48); // increasing this causes "error multiple infinite loops" 
    vid.hide();
}

function draw() {
    background(220);
    
    for (let row = 0; row < vid.height; row += 1) {
        for (let col = 0; col < vid.width; col += 1) {
            let values = vid.get(col, row);
            // console.log(values);
            let myRed = values[0];
            let myGreen = values[0];
            let myBlue = values[0];
            if (keyIsPressed === true) {
                // ???
            }
            fill(myRed, myGreen, myBlue);
            ellipse(col * BUBBLE_SIZE, row * BUBBLE_SIZE, BUBBLE_SIZE, BUBBLE_SIZE);
        }
    }
}