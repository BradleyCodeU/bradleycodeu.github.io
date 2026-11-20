---
layout: project
category: u07twodimensionalarrays
title: Anime Suggestions
---

Anime Suggestions

WORKING WITH A NEURAL NETWORK

Neural networks cannot read words like "Action, Comedy" or numbers like 9.26.

Every input MUST be converted ("normalized") into a number between 0 and 1.

### STEP 1:

Fill in the blanks ???

### STEP 2:

Test your app. There are (at least) 3 things to fix…

1. In index.html, the button onclick is trying to call the getSuggestions() function, but that function doesn’t exist. What function SHOULD it be calling?

2. The results SHOULD be sorted from HIGHEST score to LOWEST score, but it’s sorting them in reverse. 

3. In the results, it is currently keeping only the top 10 matches. Change it to keep the top 25 matches.

### STEP 3:

Switch the training data from anime.csv to animatedMovies.csv OR animatedTop100.csv

### STEP 4:

Test your app.

If you say that you only like “Family” movies and dislike movies that are NOT "Family", then it should suggest “Family” movies for you.

If you like all “Sci-Fi” and dislike all “Comedy” then your suggestions should include “Sci-Fi” and NOT include "Comedy"

### STARTER CODE

index.html
```
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Movie/TV Suggestions</title>
    <!-- Load the Brain.js Neural Network library -->
    <script src="https://cdn.jsdelivr.net/npm/brain.js"></script>
</head>
<body>
    <h1>Movie/TV Suggestions</h1>
    <p>Rate <strong>at least 5</strong> movies/shows (mix of Likes and Dislikes) to train your Neural Network!</p>

    <div class="card">
        <h2 id="animeTitle">Loading anime.csv...</h2>
        <p id="animeDetails"></p>
        <button onclick="rateAnime(1)">LIKE</button>
        <button onclick="rateAnime(0)">DISLIKE</button>
        <button onclick="showNextAnime()">Skip</button>
    </div>

    <p id="status">Movies/shows rated so far: 0</p>
    <button onclick="getSuggestions()">Train Neural Network & Get Suggestions</button>

    <h3>Top 10 Suggestions:</h3>
    <ul id="resultsList"></ul>

    <script src="script.js"></script>
</body>
</html>
```

script.js
```
let animeList = [];       // Holds all anime objects loaded from anime.csv
let trainingData = [];    // Holds the examples you Like/Dislike to train the Neural Network
let ratedNames = [];      // Keeps track of anime you already rated so we don't recommend them
let currentAnime = null;  // The anime currently shown on the card
let currentIndex = 0;     // Tracks our position in the popularity-sorted list

// DOM Elements
const titleEl = document.getElementById("animeTitle");
const detailsEl = document.getElementById("animeDetails");
const statusEl = document.getElementById("status");
const resultsList = document.getElementById("resultsList");

// ------------------------------------------------------------------
// PART 1: Converting Data for the Neural Network (Feature Extraction)
// ------------------------------------------------------------------
// NEURAL NETWORK CONCEPT:
// Neural networks cannot read words like "Action, Comedy" or numbers like 9.26.
// Every input MUST be converted ("normalized") into a number between 0 and 1.
function animeToInputs(anime) {
    // Create an empty object to store our normalized 0-to-1 inputs
    let inputs = {};
  
    // Check if this anime is a Movie (1) or TV show (0)
    if (anime.type === "Movie") {
        inputs.isMovie = 1;
    } else {
        inputs.isMovie = 0;
    }
  
    // Set genre properties to 1 if included, or 0 if not
    if (anime.genre.indexOf("Action") >= 0) {
        inputs.action = 1;
    } else {
        inputs.action = 0;
    }
    if (anime.genre.indexOf("Adventure") >= 0) {
        inputs.adventure = 1;
    } else {
        inputs.adventure = 0;
    }
    if (anime.genre.indexOf("Comedy") >= 0) {
        inputs.comedy = 1;
    } else {
        inputs.comedy = 0;
    }
    if (anime.genre.indexOf("Drama") >= 0) {
        inputs.drama = 1;
    } else {
        inputs.drama = 0;
    }

    // TODO: Check if anime.genre includes "Fantasy" (1 if true, 0 if false)
    if (anime.genre.indexOf(???) >= 0) {
        inputs.fantasy = 1;
    } else {
        inputs.fantasy = 0;
    }

    // TODO: Check if anime.genre includes "Historical" (1 if true, 0 if false)
    if (anime.genre.indexOf(???) >= 0) {
        inputs.historical = 1;
    } else {
        inputs.historical = 0;
    }

    // TODO: Check if anime.genre includes "Romance" (1 if true, 0 if false)
    if (???) {
        inputs.romance = 1;
    } else {
        inputs.romance = 0;
    }

    // TODO: Check if anime.genre includes "Sci-Fi" or "Science Fiction" (1 if true, 0 if false)
    if (???) {
        inputs.scifi = 1;
    } else {
        inputs.scifi = 0;
    }

    // TODO: Write an if/else statement to set inputs.school to 1 if anime.genre includes "School", or 0 if false
    ???

    // TODO: Write an if/else statement to set inputs.supernatural to 1 if anime.genre includes "Supernatural", or 0 if false
    ???

    // TODO: Normalize anime.rating (which is currently from 0 to 10) to a 0.0 - 1.0 decimal
    inputs.rating = ???;

    return inputs;
}

// ------------------------------------------------------------------
// PART 2: Collecting Training Data (Supervised Learning)
// ------------------------------------------------------------------
// NEURAL NETWORK CONCEPT:
// In "Supervised Learning", we teach the AI by giving it labeled examples:
// { input: [features of the anime], output: { liked: 1 or 0 } }
function rateAnime(likedValue) {
    if (!currentAnime) return;

    // 1. Convert currentAnime into 0-to-1 inputs using animeToInputs()
    let inputs = animeToInputs(currentAnime);

    // 2. TODO: Push a new training object into the trainingData array.
    // It should look like: { input: inputs, output: { liked: likedValue } }
    ???

    // Save the name so we don't recommend it later
    ratedNames.push(currentAnime.name);
    statusEl.textContent = "Anime rated so far: " + trainingData.length;

    // Load the next most popular anime onto the card
    showNextAnime();
}

// ------------------------------------------------------------------
// PART 3: Training the Neural Network & Making Predictions
// ------------------------------------------------------------------
function getRecommendations() {
    if (trainingData.length < 4) {
        alert("Please rate at least 4 anime (with both Likes and Dislikes) first!");
        return;
    }

    removeOldList();

    // NEURAL NETWORK CONCEPT:
    // Create a Neural Network with 1 hidden layer containing 4 neurons.
    // These 4 hidden neurons connect the ~8 inputs to the 1 output ("liked").
    const net = new brain.NeuralNetwork({ hiddenLayers: [4] });

    // NEURAL NETWORK CONCEPT (TRAINING / BACKPROPAGATION):
    // net.train() loops through your trainingData hundreds of times.
    // Every time the network guesses wrong, it adjusts its internal connection
    // "weights" until its predictions match your Likes and Dislikes!
    net.train(trainingData);

    let recommendations = [];

    // Loop through every anime in animeList to ask the AI for a prediction
    for (let anime of animeList) {
        // Skip anime the user has already rated
        if (ratedNames.includes(anime.name)) {
            continue;
        }

        // Convert this unseen anime into 0-to-1 inputs
        let inputs = animeToInputs(anime);

        // NEURAL NETWORK CONCEPT (INFERENCE / PREDICTION):
        // net.run(inputs) passes the numbers through the trained weights
        // and returns an object like { liked: 0.87 } (87% chance you'll like it).
        let prediction = net.run(inputs);

        // TODO: Push an object into recommendations with name, genre, and score
        // Hint: The score is prediction.liked
        recommendations.push({
            name: anime.name,
            genre: anime.genre,
            score: ???
        });
    }

    // Sort recommendations from HIGHEST score to LOWEST score
    recommendations.sort((a, b) => { return a.score - b.score });

    // Keep only the top 10 matches
    let top10 = recommendations.slice(0, 10);

    // Display each recommendation in the HTML list
    for (let item of top10) {
        let percent = Math.round(item.score * 100);
        addToList(percent + "% " + item.name + " (" + item.genre + ")");
    }
}

// ------------------------------------------------------------------
// HELPER FUNCTIONS (Already Completed for You)
// ------------------------------------------------------------------
function showNextAnime() {
    if (currentIndex >= animeList.length) {
        titleEl.textContent = "No more anime to rate!";
        detailsEl.textContent = "";
        return;
    }

    currentAnime = animeList[currentIndex];
    currentIndex++;

    titleEl.textContent = currentAnime.name;
    detailsEl.textContent = "Type: " + currentAnime.type + " | Rating: " + currentAnime.rating + "/10 | Members: " + currentAnime.members.toLocaleString() + " | Genres: " + currentAnime.genre;
}

function addToList(myText) {
    let li = document.createElement("li");
    let textNode = document.createTextNode(myText);
    li.appendChild(textNode);
    resultsList.appendChild(li);
}

function removeOldList() {
    while (resultsList.firstChild) {
        resultsList.removeChild(resultsList.firstChild);
    }
}

// Loads anime.csv, cleans HTML quotes, and filters for classroom-safe popular titles
async function loadAnimeCSV() {
    const response = await fetch("anime.csv");
    const csvText = await response.text();
    const lines = csvText.split("\n");

    for (let i = 1; i < lines.length; i++) {
        // Regex splits by commas ONLY outside of double quotes
        const cols = lines[i].match(/(".*?"|[^",]+)(?=\s*,|\s*$)/g);
        if (!cols || cols.length < 7) continue;

        let name = cols[1].replace(/^"|"$/g, "").replace(/&#039;/g, "'").replace(/&quot;/g, '"');
        let genre = cols[2].replace(/^"|"$/g, "");
        let type = cols[3].trim();
        let rating = parseFloat(cols[5]);
        let members = parseInt(cols[6]);

        // Filter out missing ratings and obscure entries (< 1,000 members)
        if (isNaN(rating) || members < 1000) continue;

        animeList.push({ name, genre, type, rating, members });
    }

    // Sort from most popular (most members) to least popular
    animeList.sort((a, b) => b.members - a.members);

    showNextAnime();
}

loadAnimeCSV();
```

