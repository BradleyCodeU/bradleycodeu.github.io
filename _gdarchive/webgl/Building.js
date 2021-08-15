/*global ambientMaterial, directionalLight, texture, gameobject, bark, leaves, coconut, createCamera,GameObject,abs,updateCamera,checkPlayerControls,requestPointerLock,scale,loadFont,setAttributes,PI,round,camera,sphere,torus,cone,cylinder,plane,rotateX,rotateY,rotateZ,frameCount,normalMaterial,translate,angleMode,background,beginShape,box,CENTER,color,cos,createCanvas,curveVertex,DEGREES,displayHeight,displayWidth,dist,DOWN_ARROW,ellipse,endShape,fill,floor,frameRate,height,image,keyCode,keyIsDown,LEFT,LEFT_ARROW,line,loadImage,loadSound,mouseIsPressed,mouseX,mouseY,noFill,noStroke,p5,pointLight,pop,push,RADIANS,random,RIGHT,RIGHT_ARROW,rotate,rotateX,rotateY,shuffle,sin,stroke,strokeWeight,text,textAlign,textFont,textSize,translate,triangle,UP_ARROW,WEBGL,width,windowHeight,windowWidth*/

class Building extends GameObject{
  constructor(_x,_z,_rotation){
    super();
    this.transform.position.x = _x;
    this.transform.position.y = 0;
    this.transform.position.z = _z;
    this.transform.rotation.y = _rotation
    this.xWidth = 500;
    this.yHeight = random(500,1000);
    this.zDepth = 500;
    this.texture = ceil(random(8))
    switch(this.texture) {
      case 1:
        this.texture = imgs.bldg1;
        break;
      case 2:
        this.texture = imgs.bldg2;
        break;
      case 3:
        this.texture = imgs.bldg3;
        break;
      case 4:
        this.texture = imgs.bldg4;
        break;
      case 5:
        this.texture = imgs.bldg5;
        break;
      case 6:
        this.texture = imgs.bldg6;
        break;
      case 7:
        this.texture = imgs.bldg7;
        break;
      case 8:
      default:
        this.texture = imgs.bldg8;
    }
  }
  getMesh() {
    noStroke();
    texture(this.texture)
    push();
    translate(0, -this.yHeight/2, 0);
    box(this.xWidth, this.yHeight, this.zDepth);
    pop();
  }
  isTouching(otherX,otherZ){
    var frontZEdge = this.transform.position.z + this.zDepth/2;
    var backZEdge = this.transform.position.z - this.zDepth/2;
    var leftXEdge = this.transform.position.x - this.xWidth/2;
    var rightXEdge = this.transform.position.x + this.xWidth/2;
    var buffer = 50;
    if(otherX < leftXEdge - buffer){
      return false;
    }
    if(otherX > rightXEdge + buffer){
      return false;
    }
    if(otherZ > frontZEdge + buffer){
      return false;
    }
    if(otherZ < backZEdge - buffer){
      return false;
    }
    return true;
  }
}
