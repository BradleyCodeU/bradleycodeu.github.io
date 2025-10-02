let today = new Date();
let turkeyDay = new Date(today.getFullYear(), 10, 1);
turkeyDay.setDate(turkeyDay.getDate() + (4 - turkeyDay.getDay()) % 7 + 21); // find 4th Thursday
let flakes = [];
let flakesTotal = 2 + today.getDate() * 4;
let wind = Math.random() - .5;
let isSnowEnabled = false;
// let mouseX;
// let mouseY;
//let clickcount = 0;


// if (today.getMonth() + 1 == 10 && today.getDate() >= 15) {
//   spookySeason();
// } else if (today.getMonth() + 1 == 11 && today <= turkeyDay) {
//   turkeySeason();
// } else if (today.getMonth() + 1 == 12 && today.getDate() <= 24) {
//   snowSeason();
// }
if (today.getMonth() + 1 == 10) {
  spookySeason();
} else if (today.getMonth() + 1 == 11) {
  turkeySeason();
} else if (today.getMonth() + 1 == 12) {
  snowSeason();
}

// <!-- Spooky stuff begins -->
function spookySeason() {
  console.log("🎃");
  document.body.style.background = "#000000";
  document.body.style.transition = "background 2s";
  document.body.style.background = choice([
    "#001100",
    "#002200",
    "#003300",
    "#110011",
    "#112200",
    "#112211",
    "#152511",
    "#152515",
    "#220022",
    "#221122",
    "#221525",
    "#251125",
    "#251522",
    "#330000",
    "#330033",
    "#331111",
    "#333300",
    "#333311",
    "#883300"
  ]);
  let emojis = ["","","","","","","","","","","","","👻","🎃","👻","🎃","👻","🎃","😱","👹","🧛‍","🦇","🕸","🧟‍"]
  let h1Array = document.getElementsByTagName("h1");
  let h2Array = document.getElementsByTagName("h2");
  let h3Array = document.getElementsByTagName("h3");
  let h4Array = document.getElementsByTagName("h4");
  let letters = "ABCDEF";
  let anchorArray = document.getElementsByTagName("a");
  for (let i = 0; i < anchorArray.length; i++) {
    if (!anchorArray[i].classList.contains("nav-link") && !anchorArray[i].classList.contains("navbar-brand") && Math.random() + Math.random() > 15 / today.getDate()) {
      anchorArray[i].innerHTML = choice(emojis) + " " + anchorArray[i].innerHTML + " " + choice(emojis);
    }
  }
  setInterval(() => {
    for (let i = 0; i < h1Array.length; i++) {
      if (Math.random() + Math.random() > 31 / today.getDate()) {
        anchorArray[i].style.transition = "all 2s";
        anchorArray[i].style.marginLeft = Math.floor(Math.random() * today.getDate()*2) + "px";
        anchorArray[i].style.color = "#" + letters[Math.floor(Math.random() * 6)] + letters[Math.floor(Math.random() * 6)] + letters[Math.floor(Math.random() * 6)];
      }
    }
    for (let i = 0; i < h1Array.length; i++) {
      if (Math.random() + Math.random() > 28 / today.getDate()) {
        h1Array[i].style.transition = "all 2s";
        h1Array[i].style.marginLeft = Math.floor(Math.random() * today.getDate()*2) + "px";
        h1Array[i].style.color = "#" + letters[Math.floor(Math.random() * 6)] + letters[Math.floor(Math.random() * 6)] + letters[Math.floor(Math.random() * 6)];
      }
    }
    for (let i = 0; i < h2Array.length; i++) {
      if (Math.random() + Math.random() > 24 / today.getDate()) {
        h2Array[i].style.transition = "all 2s";
        h2Array[i].style.marginLeft = Math.floor(Math.random() * today.getDate()*2) + "px";
        h2Array[i].style.color = "#" + letters[Math.floor(Math.random() * 6)] + letters[Math.floor(Math.random() * 6)] + letters[Math.floor(Math.random() * 6)];
      }
    }
    for (let i = 0; i < h3Array.length; i++) {
      if (Math.random() + Math.random() > 20 / today.getDate()) {
        h3Array[i].style.transition = "all 2s";
        h3Array[i].style.marginLeft = Math.floor(Math.random() * today.getDate()*2) + "px";
        h3Array[i].style.color = "#" + letters[Math.floor(Math.random() * 6)] + letters[Math.floor(Math.random() * 6)] + letters[Math.floor(Math.random() * 6)];
      }
    }
    for (let i = 0; i < h4Array.length; i++) {
      if (Math.random() + Math.random() > 16 / today.getDate()) {
        h4Array[i].style.transition = "all 2s";
        h4Array[i].style.marginLeft = Math.floor(Math.random() * today.getDate()*2) + "px";
        h4Array[i].style.color = "#" + letters[Math.floor(Math.random() * 6)] + letters[Math.floor(Math.random() * 6)] + letters[Math.floor(Math.random() * 6)];
      }
    }

  }, parseInt(150000/today.getDate()));
}
// <!-- Spooky stuff ends -->



// <!-- Turkey stuff begins -->
function choice(arr) {
  return arr[Math.floor(Math.random() * arr.length)];
}

function turkeySeason() {
  console.log("🦃");
  let emojis = ["😋", "😋", "😋", "🦃", "🦃", "🦃", "🦃", "🍗", "🥧", "🥧", "🥧", "🥧", "🍂", "🍂", "🍂", "🍂", "🍃", "🍃", "🍃", "🎑", "🎑", "🎑", "🌇", "🌇", "🌇", "🍁", "🍁", "🍁", "🍁", "🌽", "🌽", "🌽", "🎩", "🎩", "🎩", "🎈", "🎈", "🎈", "🏈", "🏈", "🏈", "🎉", "🎉", "🎉", "🍞", "🤤", "🤤", "🤤", "🥔", "🥔", "🥔", "🥕", "🥕", "🥕", "🏡", "🏡", "🏡", "🧣", "🧣", "🧣", "🍴", "🍴", "🍴", "☕", "☕", "☕", "🧤", "🧤", "🧤", "🍽️", "🍽️", "🍽️", "🏫", "💯", "👨‍🏫"];
  // These don't work?! "🍽️","🍽️","🍽️"

  let h1Array = document.getElementsByTagName("h1");
  let h2Array = document.getElementsByTagName("h2");
  let h3Array = document.getElementsByTagName("h3");
  let h4Array = document.getElementsByTagName("h4");
  let anchorArray = document.getElementsByTagName("a");
  for (let i = 0; i < anchorArray.length; i++) {
    if (!anchorArray[i].classList.contains("nav-link") && !anchorArray[i].classList.contains("navbar-brand") && Math.random() + Math.random() > 16 / today.getDate()) {
      anchorArray[i].innerHTML = choice(emojis) + " " + anchorArray[i].innerHTML + " " + choice(emojis);
    }
  }
  for (let i = 0; i < h1Array.length; i++) {
    if (Math.random() + Math.random() > 24 / today.getDate()) {
      h1Array[i].innerHTML = choice(emojis) + " " + h1Array[i].innerHTML + " " + choice(emojis);
    }
  }
  for (let i = 0; i < h2Array.length; i++) {
    if (Math.random() + Math.random() > 20 / today.getDate()) {
      h2Array[i].innerHTML = choice(emojis) + " " + h2Array[i].innerHTML + " " + choice(emojis);
    }
  }
  for (let i = 0; i < h3Array.length; i++) {
    if (Math.random() + Math.random() > 16 / today.getDate()) {
      h3Array[i].innerHTML = choice(emojis) + " " + h3Array[i].innerHTML + " " + choice(emojis);
    }
  }
  for (let i = 0; i < h4Array.length; i++) {
    if (Math.random() + Math.random() > 12 / today.getDate()) {
      h4Array[i].innerHTML = choice(emojis) + " " + h4Array[i].innerHTML + " " + choice(emojis);
    }
  }
}



// <!-- Turkey day stuff ends -->
// <!-- Snow stuff begins -->
// snow stuff
// add div to body

// <!-- <div id="snow">
//   <label class="switch">
//     <input id="snowCheckbox" type="checkbox" onclick="toggleFlakes()">
//     <span class="slider round"></span>
//   </label>
// </div> -->
function setBrandName(emoji) {
  document.getElementById("brandName").innerHTML = emoji + "Bradley" + emoji + "Code" + emoji + "U" + emoji;
}

function snowSeason() {
  console.log("❄️");
  // create the snowflake toggle checkbox
  var divSnow = document.createElement('div');
  var brSnow = document.createElement('br');
  divSnow.id = "snow";
  divSnow.style.cssText = 'position:fixed;top:0;left:0;padding:3px;width:100%;height:1px;z-index:11111;';
  var labelSwitch = document.createElement('label');
  labelSwitch.style.cssText = 'font-size:8px;position:relative;display:inline-block;width:32px;height:16px;margin:0px!important;';
  var inputSnowCheckbox = document.createElement('input');
  inputSnowCheckbox.id = "snowCheckbox";
  inputSnowCheckbox.type = "checkbox";
  inputSnowCheckbox.checked = false;
  inputSnowCheckbox.onclick = function() {
    toggleFlakes()
  };
  divSnow.style.cssText = 'position:fixed;top:0;left:0;padding:3px;width:100%;height:1px;z-index:11111;';
  var textNode = document.createTextNode("snow");
  labelSwitch.appendChild(textNode);
  labelSwitch.appendChild(brSnow);
  labelSwitch.appendChild(inputSnowCheckbox);
  divSnow.appendChild(labelSwitch);
  document.body.appendChild(divSnow);
  if (localStorage.getItem("isSnowEnabled") === null) {
    isSnowEnabled = true;
  } else {
    isSnowEnabled = localStorage.getItem("isSnowEnabled") === "true";
  }
  if (isSnowEnabled) {
    setBrandName("❄️");
  } else {
    setBrandName("");
  }
  document.getElementById("snowCheckbox").checked = isSnowEnabled;
  setTimeout(function() {
    Snowflake.init(document.getElementById("snow"));
  }, 100);
}



function toggleFlakes() {
  isSnowEnabled = !isSnowEnabled;
  document.getElementById("snowCheckbox").checked = isSnowEnabled;
  localStorage.setItem("isSnowEnabled", isSnowEnabled);
  if (isSnowEnabled) {
    document.getElementById("brandName").innerHTML = "❄️Bradley❄️Code❄️U❄️"
  } else {
    document.getElementById("brandName").innerHTML = "BradleyCodeU"
  }
}

class Snowflake {
  constructor(size, x, y, vx, vy) {
    this.size = size;
    this.x = x;
    this.y = y;
    this.initialY = y;
    this.vx = vx;
    this.vy = vy;
    this.hit = false;
    this.melt = false;
    this.div = document.createElement('div');
    this.div.classList.add('snowflake');
    this.div.style.width = this.size + 'px';
    this.div.style.height = this.size + 'px';
  }
  move() {
    if (this.hit) {
      if (Math.random() > 0.995) this.melt = true;
    } else {
      this.x += this.vx + Math.min(Math.max(wind, -10), 10);
      this.y += this.vy;
    }
    // Wrap the snowflake to within the bounds of the page
    if (this.x > window.innerWidth + this.size) {
      this.x -= window.innerWidth + this.size;
    }

    if (this.x < -this.size) {
      this.x += window.innerWidth + this.size;
    }

    if (this.y > window.innerHeight + this.size) {
      this.x = Math.random() * window.innerWidth;
      this.y -= window.innerHeight + this.size * 2;
      this.melt = false;
    }
    // var dx = mouseX - this.x;
    // var dy = mouseY - this.y;
    // this.hit = !this.melt && dx * dx + dy * dy < 2400;
  };
  draw() {
    this.div.style.transform =
      this.div.style.MozTransform =
      this.div.style.webkitTransform =
      'translate3d(' + this.x + 'px' + ',' + this.y + 'px,0)';
  };
  static update() {
    for (var i = flakes.length; i--;) {
      var flake = flakes[i];
      if (isSnowEnabled) {
        flake.move();
        flake.draw();
      } else {
        flake.y = flake.initialY;
        flake.draw();
        //flakes.splice(i,1);
      }
    }
    requestAnimationFrame(Snowflake.update);
  }
  static init(container) {
    flakes = [];
    for (var i = flakesTotal; i--;) {
      var size = (Math.random() + 0.4) * 6 + 1;
      var flake = new Snowflake(
        size,
        Math.random() * window.innerWidth,
        -Math.random() * window.innerHeight - 100,
        Math.random() - 0.5,
        size * 0.3
      );
      container.appendChild(flake.div);
      flakes.push(flake);
    }
    Snowflake.update();
  }
}

// <!-- Snow stuff ends -->
