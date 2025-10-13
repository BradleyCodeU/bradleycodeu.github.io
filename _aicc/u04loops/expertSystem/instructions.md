---
layout: project
category: u04loops
title: Expert System
---

Create a chatbot app that can guess what animal you are thinking.

For example...

```
Bot: Hello
Bot: Think of an animal, click ok to continue
Bot: Is it smaller than a horse? y or n?
User: n
Bot: Does it have a long neck? y or n?
User: y
Bot: Does it have 4 legs? y or n?
User: y
Bot: I think I know... are you thinking giraffe? y or n?
```

This is an untrained model and can only learn new facts based on user input

```
Bot: What yes/no question would differentiate duck and hawk?
User: Can it swim
Bot: zebra, can it swim? y or n?
User: y
```

### Setup

```

// Define the game states as constants
const GAMESTATE = {
  "SAY_HELLO": 0,     // Initial greeting state
  "RESET_GAME": 1,     // Resetting the game to start a new round
  "IN_GAME": 2,        // Currently guessing the user's animal
  "I_THINK_I_KNOW": 3, // Bot thinks it knows the animal
  "GIVE_UP": 4,        // Bot gives up and learns a new animal
  "QUIT": null         // Player chose to quit
};


// Set up the main game variables
let currentState = GAMESTATE.SAY_HELLO; // Current game state
let animals = [];                       // List of animal objects
let questions = [];                     // List of known yes/no questions
let possibleAnimals = [];               // Subset of animals that might match
let notAskedQuestions = [];             // Remaining questions not yet asked
let askedQuestions = {};                // Record of questions and "y"/"n" answers

// Start the game by loading saved data
loadData();

// saveData() stores animal and question data in localStorage
function saveData(){
  localStorage.setItem("animals", JSON.stringify(animals));
  localStorage.setItem("questions", JSON.stringify(questions));
}

// resetData() clears all saved data
function resetData(){
  localStorage.removeItem("animals");
  localStorage.removeItem("questions");
}

// loadData() loads saved data when the game starts
function loadData(){
  // Check if there’s saved data in localStorage
  const storedData = localStorage.getItem("animals");
  // If data exists, load it into memory
  if (storedData) {
    animals = JSON.parse(localStorage.getItem("animals"));
    questions = JSON.parse(localStorage.getItem("questions"));
  }
}

// askRandomQuestion() asks a random not-yet-asked question
function askRandomQuestion(){
  // If there are still unasked questions
  if(notAskedQuestions.length > 0){
    // Remove one from the end of the list
    let currentQuestion = notAskedQuestions.pop();
    // Ask it as a yes/no question
    let yesOrNo = askYesOrNoQuestion(currentQuestion);
    // If player cancels, quit the game
    if(yesOrNo == null){
      return GAMESTATE.QUIT;
    }
    // Record the player's answer
    askedQuestions[currentQuestion] = yesOrNo;
    // Filter animals based on this new info
    filterPossibleAnimals(currentQuestion, yesOrNo);
  }
  // Stay in game state until narrowed down
  return GAMESTATE.IN_GAME;
}

// inGame() decides what to do during active play
function inGame(){
  // If no animals match, bot gives up
  if(possibleAnimals.length == 0){
    return GAMESTATE.GIVE_UP;
  }
  // If only one animal remains, bot makes a guess
  else if(possibleAnimals.length == 1){
    return GAMESTATE.I_THINK_I_KNOW;
  } 
  // Otherwise, ask another question
  else {
    return askRandomQuestion(); 
  }
}

// iThink() asks if the bot's guess is correct
function iThink(){
  // Ask if the bot's guess is correct
  let yesOrNo = prompt("I think I know... are you thinking " + possibleAnimals[0].name + "? y or n?");
  // If the player cancels, quit
  if(yesOrNo == null){
    return GAMESTATE.QUIT;
  }
  // Check first character of answer
  if(yesOrNo.substring(0,1) == "y"){
    // Bot guessed correctly
    alert("Yes! I win!");
    return GAMESTATE.RESET_GAME;
  } 
  else {
    // Bot was wrong
    return GAMESTATE.GIVE_UP;
  }
}

// giveUp() triggers when bot cannot guess correctly
function giveUp(){
  // Ask player what animal they were thinking of
  let newAnimal = prompt("I GIVE UP! What animal are you thinking of?");
  // Add that new animal to memory
  addNewAnimal(newAnimal);
  // Let the player know the bot is learning
  let keepPlaying = confirm("I will try to remember that.");
  if(keepPlaying == false){
    return GAMESTATE.QUIT;
  }
  // Start a new round
  return GAMESTATE.RESET_GAME;
}

// getNextBotMessage() manages state transitions
function getNextBotMessage(){
  // Save data before moving on
  saveData();
  // Move between states based on currentState
  if(currentState == GAMESTATE.RESET_GAME){
    currentState = resetGame();
  }
  else if(currentState == GAMESTATE.IN_GAME){
    currentState = inGame();
  }
  else if(currentState == GAMESTATE.I_THINK_I_KNOW){
    currentState = iThink();
  }
  else if(currentState == GAMESTATE.GIVE_UP){
    currentState = giveUp();
  }
  // If not quitting, continue to next state
  if(currentState != GAMESTATE.QUIT){
    getNextBotMessage();
  }
}

// sayHello() greets the user at the start
function sayHello(){
  // Ask player if they want to play
  let keepPlaying = confirm("Hello");
  if(keepPlaying == false){
    return GAMESTATE.QUIT;
  }
  // Move to the reset game state
  currentState = GAMESTATE.RESET_GAME;
  getNextBotMessage();
}
```

### Ask Yes Or No Question

```
// askYesOrNoQuestion() prompts the user for a y/n answer
function askYesOrNoQuestion(questionText){
  // Ask the player a yes/no question
  let yesOrNo = prompt(questionText + "? y or n?");
  // If yesOrNo variable is null, then quit the game
  if(???){ // TODO
    return GAMESTATE.QUIT;
  }
  // Convert input to lowercase
  yesOrNo = yesOrNo.toLowerCase();
  // Take only the first character (in case user types “yes” or “no”)
  yesOrNo = yesOrNo.???; // TODO
  // Return "y" or "n" based on input
  if(yesOrNo ???){ // TODO
    return ???; // TODO
  }
  else{
    return ???; // TODO
  }
}
```


### Add New Question

```
// addNewQuestion() asks for and adds a new differentiating question
function addNewQuestion(newAnimal){
  let newQuestion;
  // Ask for a question that can tell two animals apart
  if(possibleAnimals.length > 0){
    newQuestion = prompt("What yes/no question would differentiate " + newAnimal.name + " and " + possibleAnimals[0].name);
  } else {
    newQuestion = prompt("What yes/no question would differentiate " + newAnimal.name + " and " + animals[0].name);
  }
  // Convert question to lowercase
  newQuestion = newQuestion.toLowerCase();
  // For each animal in the list of animals, add an answer for this new question
  for(let eachAnimal of ???){ // TODO
    // If the animal doesn't already have that question
    if(eachAnimal[newQuestion] == undefined){
      // Ask the user what this animal's answer should be
      let yesOrNo = askYesOrNoQuestion(eachAnimal.name + ", " + newQuestion);
      if(yesOrNo == null){
        return GAMESTATE.QUIT;
      }
      // Save the user's answer inside that animal’s data
      eachAnimal[newQuestion] = ???; // TODO
    }
  }
  // If the nex question is not in the questions array, add it
  if(questions.indexOf(???) ??? ???){ // TODO
    questions.push(???); // TODO
  }
  return true;
}
```


### Find Animal

```
// findAnimal() searches the animals list by name
function findAnimal(searchName){
  // Loop through all animals index locations using a for loop
  for(???){ // TODO
    // Return index if a match is found
    if(animals[i].name == ???){ // TODO
      return i;
    }
  }
  // Return -1 if not found
  return -1;
}
```

### Add New Animal

```
// addNewAnimal() creates or updates an animal object
function addNewAnimal(animalName){
  // If user cancels or if the length is zero then, quit
  if(animalName == null || ???){ // TODO
    return GAMESTATE.QUIT;
  }
  // Convert to lowercase
  animalName = animalName.toLowerCase();
  let myAnimal;
  // If findAnimal returns a number greater than -1, then the animal already exists
  if(findAnimal(animalName) ??? ???){ // TODO
    // Get the existing animal and update with new info
    myAnimal = animals[findAnimal(animalName)];
    // Combine the two objects
    myAnimal = { ...myAnimal, ...askedQuestions };
  }
  else {
    // Create a brand-new animal entry
    myAnimal = {};
    // Make a new copy of the askedQuestions object
    myAnimal = { ...askedQuestions };
    myAnimal.name = animalName;
    // Add the new animal object to the array of animals
    ??? // TODO
  }
  // If there are more than 1 animals, ask for a new distinguishing question
  if(???){ // TODO
    addNewQuestion(myAnimal);
  }
  return true;
}
```


### Reset Game

```
// resetGame() prepares the game for a new round
function resetGame(){
  // Ask the player to think of an animal before starting
  let keepPlaying = confirm("Think of an animal, click ok to continue");
  // If the player cancels, end the game
  if(keepPlaying == false){
    return GAMESTATE.???; // TODO
  }
  // Create a new empty list for possible animals this round
  possibleAnimals = [];
  // Copy each animal from the full list into the possible animals list
  for (let ??? of ???) { // TODO
    possibleAnimals.push(???); // TODO
  }
  // Create a new empty list for questions that haven't been asked yet
  notAskedQuestions = [];
  // Copy each question from the full question list into the not-asked list
  for (let ??? of ???) { // TODO
    notAskedQuestions.push(???); // TODO
  }
  // Clear the record of questions asked in this round
  askedQuestions = {};
  // Set the game state to "in game" and return it
  return GAMESTATE.???; // TODO
}
```

### Filter Possible Animals

```
// filterPossibleAnimals() removes animals that don't match answers
function filterPossibleAnimals(question, answer){
  // Loop backward thru possibleAnimals index locations so splicing doesn't skip elements
  for(let i = ???; ???; ???){ // TODO
    let currentAnimal = possibleAnimals[i];
    // Remove animals that don't match the answer
    if(currentAnimal[question] != ???){ // TODO
      possibleAnimals.splice(???, ???); // TODO
    }
  }
  // Return remaining possible animals
  return possibleAnimals;
}
```

