// version 2020.02.10

var questions;
var currentQuestion = 0;
var randomSeed = "";
var numberOfOptions = 6;
document.body.style.backgroundColor = "#343a40";
document.getElementById("windowLocation").innerHTML = window.location.toString().slice(31);
if (localStorage.getItem("randomseed") === null) {
  randomSeed = getRandomSeed();
  localStorage.setItem("currentquestion", currentQuestion);
} else {
  randomSeed = localStorage.getItem("randomseed");
  currentQuestion = JSON.parse(localStorage.getItem("currentquestion"));
}

$.getJSON("./trivia.json", function(json) {
  questions = shuffle(json, randomSeed);
  //console.log(json);
  loadQuestion();
});

function loadQuestion() {
  document.getElementById("questionText").innerHTML =
    questions[currentQuestion % questions.length].question;
  loadAnswers();
}

function loadAnswers() {
  Math.seedrandom(randomSeed);
  var answers = [questions[currentQuestion % questions.length].answer];
  while (answers.length < numberOfOptions) {
    var flag = false;
    Math.seedrandom("" + new Date().getMilliseconds());
    var newAnswer =
      questions[Math.floor(Math.random() * questions.length)].answer;
    for (var i = 0; i < answers.length; i++) {
      if (answers[i].toLowerCase() == newAnswer.toLowerCase()) {
        flag = true;
        break;
      }
    }
    if (!flag) {
      answers.push(newAnswer);
    }
  }
  console.log(answers);
  var answers2 = answers.slice(0);
  answers2 = shuffle(answers2, "" + new Date().getMilliseconds());
  updateOptions(answers2);
}

function updateOptions(answers) {
  console.log(answers);
  var optArray = document.getElementsByClassName("opt");
  //console.log(optArray);
  for (var i = 0; i < answers.length; i++) {
    optArray[i].value = answers[i];
    optArray[i].innerHTML = answers[i];
  }
  document.getElementById("pick").selected = true;
}

function checkAnswer(value) {
  if (
    value.toLowerCase() ==
    questions[currentQuestion % questions.length].answer.toLowerCase()
  ) {
    document.body.style.backgroundColor = "#00ff00";
    setTimeout(() => {
      document.body.style.backgroundColor = "#343a40";
    }, 200);
    currentQuestion++;
    localStorage.setItem("currentquestion", currentQuestion);
    loadQuestion();
  } else {
    document.body.style.backgroundColor = "#ff0000";
    setTimeout(() => {
      document.body.style.backgroundColor = "#343a40";
    }, 200);
  }
}

function getRandomSeed() {
  var r = "" + new Date().getMilliseconds();
  localStorage.setItem("randomseed", r);
  Math.seedrandom(r);
  return r;
}

function shuffle(array, myseed) {
  var temporaryValue,
    randomIndex;
  Math.seedrandom(myseed);
  for(var i=0;i<array.length;i++){
    // Pick a remaining element...

    randomIndex = Math.floor(Math.random() * array.length);

    // And swap it with the current element.
    temporaryValue = array[i];
    array[i] = array[randomIndex];
    array[randomIndex] = temporaryValue;
  }
  return array;
}

function compareArrays(a, b) {
  if (JSON.stringify(a) == JSON.stringify(b)) return true;
  else return false;
}
