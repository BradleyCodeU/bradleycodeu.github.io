---
layout: project
category: arrays
title: JS String Methods Practice Generator
---

<p>Practice Generator for .length, .substring(from, to), .substring(from), .indexOf(str), and .split(del)</p>

<button onclick="generateMethod()">Generate String Method Example</button>
<pre id="methodOutput"></pre>
<table>
  <tr>
    <td><button onclick="revealMethodAnswer()">Reveal Answer</button></td>
    <td><span id="methodAnswer" style="display:none;"></span></td>
  </tr>
</table>

<script>
let methodType = "";
let baseStr, secondStr, from, fromB, to, searchStr, delimiter;

function generateMethod() {
  let roll = Math.random() * 5;
  baseStr = pickRandomString(1);
  secondStr = pickRandomString(2);

  if (roll < 1) {
    // .length
    methodType = "length";
    document.getElementById("methodOutput").innerText =
      `let word1 = "${baseStr}";\nlet word2 = "${secondStr}";\nconsole.log(word1.length + word2.length);`;

  } else if (roll < 2) {
    // .substring(from, to)
    methodType = "substring2";
    from = getRandomIndex(baseStr.length - 1);
    to = from + getRandomIndex(baseStr.length - from) + 1;
    document.getElementById("methodOutput").innerText =
      `let word = "${baseStr}";\nconsole.log(word.substring(${from}, ${to}));`;

  } else if (roll < 3) {
    // .substring(from)
    methodType = "substring1";
    from = getRandomIndex(baseStr.length - 1);
    fromB = getRandomIndex(secondStr.length - 1);
    document.getElementById("methodOutput").innerText =
      `let wordA = "${baseStr}";\nlet wordB = "${secondStr}";\nconsole.log(wordA.substring(${from}) + wordB.substring(${fromB}));`;

  } else if (roll < 4) {
    // .indexOf(str)
    methodType = "indexOf";
    let idx = getRandomIndex(baseStr.length - 1);
    searchStr = baseStr.charAt(idx);
    document.getElementById("methodOutput").innerText =
      `let word = "${baseStr}";\nconsole.log(word.indexOf("${searchStr}"));`;

  } else {
    // .split(del)
    methodType = "split";
    delimiter = pickRandomDelimiter();
    let strWithDel = baseStr.split("").join(delimiter);
    document.getElementById("methodOutput").innerText =
      `let word = "${strWithDel}";\nconsole.log(word.split("${delimiter}"));`;
  }

  // hide answer until revealed
  document.getElementById("methodAnswer").style.display = "none";
  document.getElementById("methodAnswer").innerText = "";
}

function revealMethodAnswer() {
  let answer;
  if (methodType === "length") {
    answer = baseStr.length + secondStr.length;
  } else if (methodType === "substring2") {
    answer = baseStr.substring(from, to);
  } else if (methodType === "substring1") {
    answer = baseStr.substring(from) + secondStr.substring(fromB);
  } else if (methodType === "indexOf") {
    answer = baseStr.indexOf(searchStr);
  } else if (methodType === "split") {
    let strWithDel = baseStr.split("").join(delimiter);
    answer = JSON.stringify(strWithDel.split(delimiter));
  }
  document.getElementById("methodAnswer").innerText = "Answer: " + answer;
  document.getElementById("methodAnswer").style.display = "inline";
}

// --- Helpers ---
function pickRandomString(listNumber) {
  let samples = ["apple", "avacado", "banana", "apricot", "cherry",
                "lime", "lemon", "coconut", "kiwi", "grape", 
                "fig", "dragon fruit", "cranberry", "blackberry", "fig",
                "avacado", "cucumber","durian", "raisin","guava",
                "broccoli", "cabbage", "carrot", "celery", "corn",
                "eggplant","fig","garlic","lettuce","mushroom","yam"];
  if(listNumber == 2){
    samples = ["crab apple", "cactus fruit", "goji berry", "star fruit", "blueberry", 
                "nectarine", "cantaloupe", "bell pepper", "mango", "orange",
                "papaya", "peach", "plum", "pear", "raspberry",
                "brussel sprouts", "nectarine", "onion", "potato", "pumpkin",
                "pineapple","spinach","squash","sweet potato",
                "tomato","roma tomato","cherry tomato","sweet onion","yellow onion",
                "white onion", "watermelon"
                ];
  }
  
  return samples[Math.floor(Math.random() * samples.length)];
}

function pickRandomDelimiter() {
  let dels = ["a", "e", "i", "o", "u"];
  return dels[Math.floor(Math.random() * dels.length)];
}

function getRandomIndex(max) {
  return Math.floor(Math.random() * (max + 1));
}

// Generate one on load
generateMethod();
</script>
