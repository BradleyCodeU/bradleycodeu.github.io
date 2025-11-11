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

// Setup should only happen when the user presses the START GAME button
function setup(){
  // greet the user
  let keepPlaying = confirm("Hello!");
  if(keepPlaying == false){
    return GAMESTATE.QUIT;
  }
  // Move to the reset game state
  currentState = GAMESTATE.RESET_GAME;
  // Start the game loop
  getNextBotMessage();
}

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