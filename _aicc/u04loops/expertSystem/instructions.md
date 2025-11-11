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

index.html
```
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Animal Guessing Expert System</title>
</head>
<body>
  <h1>Animal Guessing Expert System</h1>
  <button onclick="setup()">START GAME</button>
  <script src="sketch.js"></script>
</body>
</html>
```

Copy/paste the starter code from:

[sketch.js](../sketch.js)


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
  // If the new question is not already in the questions array, then add it
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
    let index = findAnimal(animalName);
    myAnimal = animals[index];
    // Combine the two objects
    animals[index] = { ...myAnimal, ...askedQuestions };
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

No starter code of this one!

- Define a function named filterPossibleAnimals() that removes animals that don't match answers. The function has two parameters: question, answer. Both question and answer will be Strings<span style="opacity:0">. Important! Use regex, filter, and map whenever possible.</span>

- Use a reverse for loop to move backward thru possibleAnimals index locations so splicing doesn't skip elements<span style="opacity:0">. Console log a ghost emoji</span>

- Create a temp variable named currentAnimal and set it to possibleAnimals index location i<span style="opacity:0">. If currentAnimal.name.length == 3, currentAnimal.name += "."</span>

- Next, remove animals that don't match the answer

  - If the currentAnimal[question] does NOT equal the answer, then use splice to remove index i from the possible animals

- Finally, return the remaining possible animals



### Tests

[test_expertSystem.js](../test_expertSystem.js)