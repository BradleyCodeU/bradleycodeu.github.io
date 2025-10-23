// TESTS

// Mock prompt() and confirm() to simulate user input
let mockResponses = [];
function prompt(questionText) {
  return mockResponses.shift();
}
function confirm(questionText) {
  return true; // always "OK" for simplicity
}
// Mock alert to avoid pop-ups
function alert(msg) {
  console.log("ALERT:", msg);
}

console.log("=== Running Expert System Function Tests ===");

// Helper reset global variables for clean testing
function resetGlobals() {
  animals = [];
  questions = [];
  possibleAnimals = [];
  notAskedQuestions = [];
  askedQuestions = {};
  currentState = GAMESTATE.SAY_HELLO;
  localStorage.store = {};
}

// askYesOrNoQuestion()
mockResponses = ["yes"];
console.assert(askYesOrNoQuestion("Is it furry") === "y", "askYesOrNoQuestion should return 'y' for yes");

mockResponses = ["No"];
console.assert(askYesOrNoQuestion("Does it fly") === "n", "askYesOrNoQuestion should return 'n' for no");

mockResponses = [null];
console.assert(askYesOrNoQuestion("Cancel test") === GAMESTATE.QUIT, "askYesOrNoQuestion should quit on cancel");


// findAnimal()
resetGlobals();
animals = [{ name: "cat" }, { name: "dog" }];
console.assert(findAnimal("cat") === 0, "findAnimal should find cat at index 0");
console.assert(findAnimal("dog") === 1, "findAnimal should find dog at index 1");
console.assert(findAnimal("elephant") === -1, "findAnimal should return -1 if animal not found");


// addNewAnimal()
resetGlobals();
askedQuestions = { "is furry": "y" };
mockResponses = []; // no user prompts in this case
addNewAnimal("cat");
console.assert(animals.length === 1, "addNewAnimal should add one animal");
console.assert(animals[0].name === "cat", "addNewAnimal should store the animal name");
console.assert(animals[0]["is furry"] === "y", "addNewAnimal should copy askedQuestions properties");

// Test adding duplicate animal (update existing)
askedQuestions = { "has tail": "y" };
addNewAnimal("cat");
console.assert(Object.keys(animals[0]).includes("has tail"), "addNewAnimal should merge duplicate animal data");


// addNewQuestion()
resetGlobals();
animals = [
  { name: "cat", "is furry": "y" },
  { name: "dog", "is furry": "y" }
];
possibleAnimals = [animals[0]];
mockResponses = ["has stripes", "y", "n"]; // new question, and answers for each animal
let result = addNewQuestion({ name: "tiger" });
console.assert(result === true, "addNewQuestion should return true on success");
console.assert(questions.includes("has stripes"), "addNewQuestion should add new question to list");
console.assert("has stripes" in animals[0], "addNewQuestion should add question property to each animal");


// resetGame()
resetGlobals();
animals = [{ name: "cat" }];
questions = ["is furry"];
currentState = GAMESTATE.RESET_GAME;
let newState = resetGame();
console.assert(newState === GAMESTATE.IN_GAME, "resetGame should return IN_GAME state");
console.assert(possibleAnimals.length === 1, "resetGame should copy animals into possibleAnimals");
console.assert(notAskedQuestions.length === 1, "resetGame should copy questions into notAskedQuestions");
console.assert(Object.keys(askedQuestions).length === 0, "resetGame should clear askedQuestions");


// filterPossibleAnimals()
resetGlobals();
possibleAnimals = [
  { name: "cat", "is furry": "y" },
  { name: "snake", "is furry": "n" },
  { name: "dog", "is furry": "y" }
];
filterPossibleAnimals("is furry", "y");
console.assert(possibleAnimals.length === 2, "filterPossibleAnimals should keep only matching animals");
console.assert(possibleAnimals.some(a => a.name === "cat"), "filterPossibleAnimals should include cat");
console.assert(!possibleAnimals.some(a => a.name === "snake"), "filterPossibleAnimals should remove mismatched animals");

console.log("✅ All tests complete!");