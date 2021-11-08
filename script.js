// <!-- Halloween stuff begins -->
function spookyHalloween() {
  let h1Array = document.getElementsByTagName("h1");
  let h2Array = document.getElementsByTagName("h2");
  let h3Array = document.getElementsByTagName("h3");
  let h4Array = document.getElementsByTagName("h4");
  let letters = "ABCDEF";
  setInterval(() => {
    for (let i = 0; i < h1Array.length; i++) {
      h1Array[i].style.marginLeft = Math.floor(Math.random() * 50) + "px";
      h1Array[i].style.color = "#" + letters[Math.floor(Math.random() * 6)] + letters[Math.floor(Math.random() * 6)] + letters[Math.floor(Math.random() * 6)];
    }
    for (let i = 0; i < h2Array.length; i++) {
      h2Array[i].style.marginLeft = Math.floor(Math.random() * 50) + "px";
      h2Array[i].style.color = "#" + letters[Math.floor(Math.random() * 6)] + letters[Math.floor(Math.random() * 6)] + letters[Math.floor(Math.random() * 6)];
    }
    for (let i = 0; i < h3Array.length; i++) {
      h3Array[i].style.marginLeft = Math.floor(Math.random() * 50) + "px";
      h3Array[i].style.color = "#" + letters[Math.floor(Math.random() * 6)] + letters[Math.floor(Math.random() * 6)] + letters[Math.floor(Math.random() * 6)];
    }
    for (let i = 0; i < h4Array.length; i++) {
      h4Array[i].style.marginLeft = Math.floor(Math.random() * 50) + "px";
      h4Array[i].style.color = "#" + letters[Math.floor(Math.random() * 6)] + letters[Math.floor(Math.random() * 6)] + letters[Math.floor(Math.random() * 6)];
    }

  }, 5000);
}
// <!-- Halloween stuff ends -->
// <!-- Turkey day stuff begins -->
function choice(arr) {
  return arr[Math.floor(Math.random() * arr.length)];
}

function turkeyDay() {
  let emojis = ["😋", "😋", "😋", "🦃", "🦃", "🦃", "🦃", "🍗", "🥧", "🥧", "🥧", "🥧", "🍂", "🍂", "🍂", "🍂", "🍃", "🍃", "🍃", "🎑", "🎑", "🎑", "🌇", "🌇", "🌇", "🍁", "🍁", "🍁", "🍁", "🌽", "🌽", "🌽", "🎩", "🎩", "🎩", "🎈", "🎈", "🎈", "🏈", "🏈", "🏈", "🎉", "🎉", "🎉", "🍞", "🤤", "🤤", "🤤", "🥔", "🥔", "🥔", "🥕", "🥕", "🥕", "🏡", "🏡", "🏡", "🧣", "🧣", "🧣", "🍴", "🍴", "🍴", "☕", "☕", "☕", "🧤", "🧤", "🧤", "🍽️", "🍽️", "🍽️", "🏫", "💯", "👨‍🏫"];
  // These don't work?! "🍽️","🍽️","🍽️"
  const d = new Date();
  const today = d.getDate();
  let h1Array = document.getElementsByTagName("h1");
  let h2Array = document.getElementsByTagName("h2");
  let h3Array = document.getElementsByTagName("h3");
  let h4Array = document.getElementsByTagName("h4");
  let anchorArray = document.getElementsByTagName("a");
  for (let i = 0; i < anchorArray.length; i++) {
    if (Math.random() + Math.random() > 15 / today) {
      anchorArray[i].innerHTML = choice(emojis) + " " + anchorArray[i].innerHTML + " " + choice(emojis);
    }
  }
  for (let i = 0; i < h1Array.length; i++) {
    if (Math.random() + Math.random() > 13 / today) {
      h1Array[i].innerHTML = choice(emojis) + " " + h1Array[i].innerHTML + " " + choice(emojis);
    }
  }
  for (let i = 0; i < h2Array.length; i++) {
    if (Math.random() + Math.random() > 11 / today) {
      h2Array[i].innerHTML = choice(emojis) + " " + h2Array[i].innerHTML + " " + choice(emojis);
    }
  }
  for (let i = 0; i < h3Array.length; i++) {
    if (Math.random() + Math.random() > 9 / today) {
      h3Array[i].innerHTML = choice(emojis) + " " + h3Array[i].innerHTML + " " + choice(emojis);
    }
  }
  for (let i = 0; i < h4Array.length; i++) {
    if (Math.random() + Math.random() < 7 / today) {
      h4Array[i].innerHTML = choice(emojis) + " " + h4Array[i].innerHTML + " " + choice(emojis);
    }
  }
}
turkeyDay();
// <!-- Turkey day stuff ends -->
// <!-- Snow stuff begins -->
// snow stuff
// var isSnowEnabled;
// if (localStorage.getItem("isSnowEnabled") === null) {
//   isSnowEnabled = true;
// }else{
//   isSnowEnabled = localStorage.getItem("isSnowEnabled") === "true";
//   setBrandName()
// }
// document.getElementById("snowCheckbox").checked = isSnowEnabled;
// var flakes = []
// var flakesTotal = Math.floor(100*(Date.now()-1575774414164)/1210000000*Math.random()+100*(Date.now()-1575774414164)/1210000000*Math.random());
// var wind = Math.random()-.5;
// var mouseX;
// var mouseY;
// var clickcount = 0;
//
// function toggleFlakes(){
//   isSnowEnabled = !isSnowEnabled;
//   localStorage.setItem("isSnowEnabled", isSnowEnabled);
//   setBrandName()
// }
// function setBrandName(){
//   if(isSnowEnabled){
//     document.getElementById("brandName").innerHTML = "❄️Bradley❄️Code❄️U❄️"
//   }else{
//     document.getElementById("brandName").innerHTML = "BradleyCodeU"
//   }
// }
// class Snowflake {
//     constructor(size, x, y, vx, vy) {
//         this.size = size;
//         this.x = x;
//         this.y = y;
//         this.initialY = y;
//         this.vx = vx;
//         this.vy = vy;
//         this.hit = false;
//         this.melt = false;
//         this.div = document.createElement('div');
//         this.div.classList.add('snowflake');
//         this.div.style.width = this.size + 'px';
//         this.div.style.height = this.size + 'px';
//     }
//
//     move() {
//         if (this.hit) {
//             if (Math.random() > 0.995) this.melt = true;
//         } else {
//             this.x += this.vx + Math.min(Math.max(wind, -10), 10);
//             this.y += this.vy;
//         }
//         // Wrap the snowflake to within the bounds of the page
//         if (this.x > window.innerWidth + this.size) {
//             this.x -= window.innerWidth + this.size;
//         }
//
//         if (this.x < -this.size) {
//             this.x += window.innerWidth + this.size;
//         }
//
//         if (this.y > window.innerHeight + this.size) {
//             this.x = Math.random() * window.innerWidth;
//             this.y -= window.innerHeight + this.size * 2;
//             this.melt = false;
//         }
//         // var dx = mouseX - this.x;
//         // var dy = mouseY - this.y;
//         // this.hit = !this.melt && dx * dx + dy * dy < 2400;
//     };
//
//     draw() {
//         this.div.style.transform =
//         this.div.style.MozTransform =
//         this.div.style.webkitTransform =
//             'translate3d(' + this.x + 'px' + ',' + this.y + 'px,0)';
//     };
//
//     static update() {
//         for (var i = flakes.length;  i--;) {
//             var flake = flakes[i];
//             if(isSnowEnabled){
//               flake.move();
//               flake.draw();
//             }else{
//               flake.y = flake.initialY;
//               flake.draw();
//               //flakes.splice(i,1);
//             }
//         }
//         requestAnimationFrame(Snowflake.update);
//     }
//
//     static init(container) {
//         flakes = [];
//         for (var i = flakesTotal; i--; ) {
//             var size = (Math.random() + 0.4) * 6 + 1;
//             var flake = new Snowflake(
//                 size,
//                 Math.random() * window.innerWidth,
//                 -Math.random() * window.innerHeight-100,
//                 Math.random() - 0.5,
//                 size * 0.3
//             );
//             container.appendChild(flake.div);
//             flakes.push(flake);
//         }
//     Snowflake.update();
//     }
// }
//
// window.onload = function() {
//   setTimeout(function() {
//     Snowflake.init(document.getElementById("snow"));
//   }, 100);
// }
// <!-- Snow stuff ends -->