---
layout: project
category: u04forandforeachloops
title: localStorage MVP
---


localStorage MVP

Build a working Minimum Viable Product (MVP) web page that saves text into your browser's local memory (localStorage) when you click a Save button, and retrieves that text when you click a Load button. Fill in the 5 blanks ??? in the starter code.

https://www.w3schools.com/jsreF/prop_win_localstorage.asp

You will use the setItem and getItem methods 

localStorage.setItem(key, value)

localStorage.getItem(key)

STARTER CODE:
```
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>localStorage MVP</title>
 
</head>
<body>

  <h2>Local Storage MVP</h2>
  <p>Type a message below and practice saving/loading it from your browser memory</p>

  <label for="userMessage">Message:</label><br>
  <input type="text" id="userMessageBox" placeholder="Type something here...">

  <br><br>

  <!-- Save Button -->
  <button onclick="saveToLocalStorage()">Save to localStorage</button>
  
  <!-- TO DO call the load function when the load button is clicked -->
  <button onclick=" ??? ">Load from localStorage</button>

  <!-- Output Area -->
  <div class="display-box">
    <strong>Saved Message:</strong>
    <p id="displayArea"><i>Nothing loaded yet.</i></p>
  </div>

  <script>
    // Make a consistent key name String to access our storage item
    const STORAGE_KEY = ???; // TO DO

    function saveToLocalStorage() {
      // Step A: Read the text from the input box
      const messageText = userMessageBox.value;

      // Check if the input is empty
      if (messageText === '') {
        displayArea.innerHTML = "Please type a message before saving!";
        return;
      }

      // Step B: Save to localStorage using setItem(key, value)
      localStorage.setItem( ??? ); // TO DO

      // Step C: Provide feedback & clear input
      displayArea.innerHTML = "Message saved to browser storage!";
      userMessageBox.value = "";
    }

    // Retrieve text from localStorage
    function loadFromLocalStorage() {
      // Fetch stored text using getItem(key)
      const savedText = ???; // TO DO

      // Step B: Check if data exists and display it
      if ( ??? ) { // TO DO check if the saved text is null or is not null
        displayArea.innerHTML = savedText;
      } else {
        displayArea.innerHTML = "No saved message found in localStorage";
      }
    }
  </script>

</body>
</html>
```
