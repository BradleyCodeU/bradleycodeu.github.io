let dictionary = {};
let submittedQuestions = [];

fetch("dictionary.json")
  .then(response => response.json())
  .then(data => {
    dictionary = data;
    displayWelcomeMessage();
  });

const mylist = document.getElementById("mylist");
const textbox = document.getElementById("userQuestionBox");

document.onkeydown = function(e) {
  if (e.keyCode === 13) {
    submitQuestion();
    e.preventDefault();
  }
};

function submitQuestion() {
  const userInput = textbox.value.trim();
  if (!userInput) return;

  addMessage(userInput, "from-me");

  if (!submittedQuestions.includes(userInput)) {
    submittedQuestions.push(userInput);
    // You could also save this to localStorage if needed
  }

  const responses = getResponses(userInput.toLowerCase());
  for(let each of responses){
      addMessage(each, "to-me");
  }
  

  textbox.value = "";
}

function getResponses(userInput) {
  const cleaned = removePunctuation(userInput);
  let responseArray = [];
  for (let key in dictionary) {
    if (cleaned.includes(key)) {
      responseArray.push(randomOf(dictionary[key]));
    }
  }
  if(responseArray.length == 0){ return randomOf(dictionary["default"]) }
  return responseArray;
}

function addMessage(text, className) {
  const node = document.createElement("LI");
  node.textContent = text;
  node.classList.add(className);
  mylist.appendChild(node);
  setTimeout(() => window.scrollTo(0, document.body.scrollHeight - 300), 10);
}

function displayWelcomeMessage() {
  addMessage(randomOf(dictionary["welcome"]), "to-me");
}

function randomOf(arr) {
  return arr[Math.floor(Math.random() * arr.length)];
}

const punctuation = '!"#$%&\'()*+,-./:;<=>?@[\\]^_`{|}~';

function removePunctuation(str) {
  return str
    .split("")
    .filter(c => !punctuation.includes(c))
    .join("");
}
