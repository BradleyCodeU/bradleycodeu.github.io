let mylist = [];

function setup() {
  createCanvas(windowWidth, windowHeight);

  for(let i=0;i<10;i++){
    mylist.push(new Rock());
    mylist.push(new Paper());
    mylist.push(new Scissors());
  }
  
  
}

function draw() {
  background(255);
  for(let each of mylist){
    each.move();
    each.show();
  }
  checkCollisions();
  if(frameCount%120==0){
    mylist.shift();
    addRandomSprite();
  }
}

function addRandomSprite(){
  if(random() < 1/3){
    mylist.push(new Rock());
  } else if(random() < 1/2){
    mylist.push(new Paper());
  }else{
    mylist.push(new Scissors());
  }
}

function checkCollisions(){
  for(let i=mylist.length-1;i>=0;i--){
    for(let j=mylist.length-1;j>=0;j--){
      if(i == j){
        continue;
      }
      let a = mylist[i];
      let b = mylist[j];
      let minDistance = a.size;
      if(dist(a.x,a.y,b.x,b.y)<minDistance){
        if(a.emoji == "📒" && b.emoji == "✂️"){
          mylist.splice(i,1);
          let baby = new Scissors();
          baby.x = b.x+1;
          baby.y = b.y+1;
          mylist.push(baby);
        }else if(a.emoji == "✂️" && b.emoji == "🗿"){
          mylist.splice(i,1);
          let baby = new Rock();
          baby.x = b.x+1;
          baby.y = b.y+1;
          mylist.push(baby);
        }else if(a.emoji == "🗿" && b.emoji == "📒"){
          mylist.splice(i,1);
          let baby = new Paper();
          baby.x = b.x+1;
          baby.y = b.y+1;
          mylist.push(baby);
        }
      }
    }
  }
}