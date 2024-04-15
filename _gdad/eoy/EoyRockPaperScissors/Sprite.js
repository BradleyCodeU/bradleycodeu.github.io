class Sprite{
  constructor(){
    this.x = random(width);
    this.y = random(height);
    this.xspeed = floor(random()*2+random()*2+5);
    this.yspeed = floor(random()*2+random()*2+5);
    this.emoji = random(["✂️","🗿","📒"])
    this.size = random()*5 + random()*5 + 30;
  }

  move(){
    // this.x = this.x + this.xspeed;
    // this.y = this.y + this.yspeed;
    this.x += this.xspeed
    this.y += this.yspeed
    if(this.x > width){
      this.x = 0;
    }
    if(this.x < 0){
      this.x = width;
    }
    if(this.y > height){
      this.y = 0;
    }
    if(this.y < 0){
      this.y = height;
    }
  }

  show(){
    //circle(this.x, this.y, 25);
    textSize(this.size);
    textAlign(CENTER, CENTER);
    text(this.emoji,this.x,this.y)
  }
  
}