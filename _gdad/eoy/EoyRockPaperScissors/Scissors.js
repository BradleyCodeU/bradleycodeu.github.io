class Scissors{
  constructor(){
    this.x = random(width);
    this.y = random(height);
    this.xspeed = floor(random()*2+random()*2+5);
    this.yspeed = floor(random()*2+random()*2+5);
    this.emoji = "✂️";
    this.size = random()*5 + random()*5 + 30;
  }

move(){
    // this.x = this.x + this.xspeed;
    // this.y = this.y + this.yspeed;
    this.x += this.xspeed
    this.y += this.yspeed
    if(this.x > width){
      this.xspeed = -this.xspeed;
    }
    if(this.x < 0){
      this.xspeed = abs(this.xspeed);
    }
    if(this.y > height){
       this.yspeed = -this.yspeed;
    }
    if(this.y < 0){
      this.yspeed = abs(this.yspeed)
    }
  }

  show(){
    //circle(this.x, this.y, 25);
    textSize(this.size);
    textAlign(CENTER, CENTER);
    text(this.emoji,this.x,this.y)
  }
  
}