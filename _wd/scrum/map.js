/*global currentLocation,room,item,TWO_PI,vertex,CLOSE,abs,angleMode,append,background,beginShape,bezier,box,camera,ceil,CENTER,color,cone,cos,createCanvas,createCanvas,createGraphics,curveVertex,cylinder,DEGREES,displayHeight,displayWidth,dist,div,DOWN_ARROW,ellipse,endShape,fill,floor,frameCount,frameRate,height,image,key,keyCode,keyIsDown,keyIsPressed,keyIsPressed,keyPressed,LEFT,LEFT_ARROW,lerpColor,line,loadImage,loadJSON,loadSound,map,mouseIsPressed,mouseX,mouseY,noFill,noLoop,normalMaterial,noStroke,p5,plane,point,pointLight,pop,push,push,RADIANS,radians,random,rect,resizeCanvas,resizeCanvas,RIGHT,RIGHT_ARROW,rotate,rotateX,rotateY,rotateZ,round,round,scale,shuffle,sin,sphere,stroke,strokeWeight,text,textAlign,textFont,textSize,texture,textWidth,torus,translate,triangle,UP_ARROW,WEBGL,width,windowHeight,windowHeight,windowWidth,world */

/*
  map.js version 0.20210218
  Directions:
  Create an HTML div and give it id="mymap"
*/

let myCanvas;
let mappy;

function setup(){ // only when game loads
  myCanvas = createCanvas(300, 300);
  myCanvas.parent("mymap");
  background("lightblue");
  mappy = new Map();
}

function draw(){
  text(currentLocation, 10, 10);
  mappy.reveal(room,item,currentLocation); // use reveal to slowly display map
  // or use the show method to display the full map
}

class Map {
  constructor(){
    this.size = 300 // map window size
    this.mapBorder = 20
    this.roomSize = 20
    this.roomBorder = 2
    this.startingLocation = null
    this.columnHeight = 100
    this.bgColor= "black"
    this.roomColor = 'white'
    this.startTextColor = 'green'
    this.bigStarColor = 'red'
    this.littleStarColor = 'gold'
    this.playerLocation = null
    this.speed = 1
    this.littleStarSize = 4
    this.bigStarSize = 14
    // reveal instance variables
    this.revealDistance = 1
    this.revealWallColor = 'gray'
    this.mappedRooms = []
    this.mappedItems = []
    for(let i=0;i<1999;i++){
      this.mappedRooms[i]=null // null is unexplored and false is wall
      this.mappedItems[i]=false
    }
  }

  star(x, y, radius1, radius2, npoints) {
    var angle = TWO_PI / npoints;
    var halfAngle = angle/2.0;
    beginShape();
    for (var a = 0; a < TWO_PI; a += angle) {
      var sx = x + cos(a) * radius2;
      var sy = y + sin(a) * radius2;
      vertex(sx, sy);
      sx = x + cos(a+halfAngle) * radius1;
      sy = y + sin(a+halfAngle) * radius1;
      vertex(sx, sy);
    }
    endShape(CLOSE);
  }

  setBackgroundColor(color='black'){
    this.bgColor(color)
  }

  setRoomColor(color='white'){
    this.roomColor = color
  }

  setRevealWallColor(color='gray'){
    this.revealWallColor = color
  }

  setBigStarColor(color='red'){
    this.bigStarColor = color
  }

  setLittleStarColor(color='gold'){
    this.littleStarColor = color
  }

  setTextColor(color){
    this.startTextColor = color
  }

  //if there is no starting location, set it
  setStartingLocation(myLocation){
    if (this.startingLocation == null){
      this.startingLocation = myLocation
      this.playerLocation = this.gridToPixel(Math.floor(myLocation/this.columnHeight),myLocation%this.columnHeight)
    }
  }
  gridToPixel(column,row){
    //return [-this.size/2+(this.roomSize/2)+column*(this.roomSize+this.roomBorder)+this.mapBorder,this.size/2-(this.roomSize/2)-row*(this.roomSize+this.roomBorder)-this.mapBorder];
    return {x:(this.roomSize/2)+column*(this.roomSize+this.roomBorder)+this.mapBorder,y:(this.roomSize/2)+row*(this.roomSize+this.roomBorder)+this.mapBorder};
  }

  // transfer rooms within the reveal distance from the rooms array to the mapped rooms array
  mapTheSurroundingArea(myLocation,rooms,roomItems){
    for(let row=myLocation%this.columnHeight-this.revealDistance;row<myLocation%this.columnHeight+this.revealDistance+1;row++){
      for(let col=Math.floor(myLocation/this.columnHeight)*this.columnHeight-this.revealDistance*this.columnHeight;col<(Math.floor(myLocation/this.columnHeight)*this.columnHeight+this.revealDistance*this.columnHeight+this.columnHeight);col+=100){
        try{
          if(rooms[row+col]){
            this.mappedRooms[row+col] = true
          }else{
            this.mappedRooms[row+col] = false // wall
          }
          if(roomItems[row+col]){
            this.mappedItems[row+col] = true
          }else{
            this.mappedItems[row+col] = false
          }
        }
        catch(err){console.log(err)}
      }
    }
  }

  // if there is a room here, stamp a square at the current row and column
  showRoom(row,column,roomArray){
    try{
      if(roomArray[column*this.columnHeight+row]){
        fill(this.roomColor)
        let loc = this.gridToPixel(column,row)
        rect(loc.x-this.roomSize/2,loc.y-this.roomSize/2,this.roomSize,this.roomSize)
      }
    }
    catch(err){}
  }

  // if there is a revealed wall here, stamp a square at the current row and column
  showRevealedWall(row,column,roomArray){
    try{
      if(roomArray[column*this.columnHeight+row] == false){
        fill(this.revealWallColor)
        let loc = this.gridToPixel(column,row)
        rect(loc.x-this.roomSize/2,loc.y-this.roomSize/2,this.roomSize,this.roomSize)
      }
    }
    catch(err){}
  }

  // if there is an item here, stamp a little star at the current row and column
  showLittleStar(row,column,itemArray){
    try{
      if(itemArray[column*this.columnHeight+row]){
        fill(this.littleStarColor)
        //this.shape("littleStar")
        let loc = this.gridToPixel(column,row)
        ellipse(loc.x,loc.y,this.littleStarSize,this.littleStarSize)
      }
    }
    catch(err){}
  }

  // if there the startingLocation is here, write Start at the current row and column
  showStart(row,column,_startingLocation){
    if(_startingLocation == column*this.columnHeight+row){
        fill(this.startTextColor)
        // The text() function needs three parameters:
        // the text to draw, the horizontal position,
        // and the vertical position
        fill(this.startTextColor);
        let loc = this.gridToPixel(column,row)
        textSize(9)
        textAlign(CENTER);
        text('start',loc.x,loc.y);
    }
  }

  // if the currentlocation is here, stamp a big star at the current row and column
  showBigStar(myLocation){
    // if(myLocation == column*this.columnHeight+row){
    //     fill(this.bigStarColor)
    //     //this.shape("bigStar")
    //     let loc = this.gridToPixel(column,row)
    //     ellipse(loc.x,loc.y,this.bigStarSize,this.bigStarSize)
    // }
    //newX = }
    //let loc = this.gridToPixel(col,row)
    fill(this.bigStarColor)
    ellipse(this.playerLocation.x,this.playerLocation.y,this.bigStarSize,this.bigStarSize)
  }

  movePlayer(myLocation){

    let temp = this.gridToPixel(Math.floor(myLocation/this.columnHeight),myLocation%this.columnHeight)
    if(this.playerLocation.x < temp.x){
      this.playerLocation.x += this.speed
    }
    if(this.playerLocation.x > temp.x){
      this.playerLocation.x -= this.speed
    }
    if(this.playerLocation.y < temp.y){
      this.playerLocation.y += this.speed
    }
    if(this.playerLocation.y > temp.y){
      this.playerLocation.y -= this.speed
    }
  }

  // use the show method to display the full map
  show(rooms,roomItems,myLocation){
    background(this.bgColor);
    let rowWidth = parseInt(Math.ceil((rooms.length) / this.columnHeight))
    this.setStartingLocation(myLocation)
    for(let row=0;row<this.columnHeight;row++){
      for(let column=0;column<rowWidth;column++){
        this.showRoom(row,column,rooms)
        this.showLittleStar(row,column,roomItems)
        this.showStart(row,column,this.startingLocation)
        //this.showBigStar(row,column,myLocation)
      }
    }
    this.movePlayer(myLocation)
    this.showBigStar(myLocation)
  }

  // use the reveal method (instead of show) to SLOWLY show and reveal the map
  reveal(rooms,roomItems,myLocation){
    background(this.bgColor);
    this.mapTheSurroundingArea(myLocation,rooms,roomItems)
    let rowWidth = parseInt(Math.ceil((rooms.length) / this.columnHeight))
    this.setStartingLocation(myLocation)
    for(let row=0;row<this.columnHeight;row++){
      for(let column=0;column<rowWidth;column++){
        this.showRoom(row,column,this.mappedRooms)
        this.showRevealedWall(row,column,this.mappedRooms)
        this.showLittleStar(row,column,this.mappedItems)
        this.showStart(row,column,this.startingLocation)
        //this.showBigStar(row,column,myLocation)
      }
    }
    this.movePlayer(myLocation)
    this.showBigStar(myLocation)
  }
}
