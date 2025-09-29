---
layout: project
category: u02_classification
title: localStorage Shopping List v3
---

Continue working on your previous project.


## ADD CATEGORY AND PRICE LOOKUP

Automatically classify items into the correct categories. For example, frozen foods, fruits, veggies, cereal, etc. Create a dictionary (a JavaScript object [https://www.w3schools.com/js/js_object_definition.asp](https://www.w3schools.com/js/js_object_definition.asp)) that lists the correct category and price for each item. When an item is added, retrieve the correct category and price from the dictionary. Categories should be displayed seperately on the webpage.


## USE GROCERY ITEM CLASS

```
class GroceryItem {
  constructor(name, quantity, price, category) {
    this.name = name;
    this.quantity = quantity;
    this.price = price;
    this.category = category
  }

  // Method to get item info in a compressed format for localstorage
  // For example, "2|carrots|0.50|veggies"
  getStorageString() {
    // return the instance variable values as a String with "|" dividing the instance variables
    // TODO
  }

  // Method to calculate total cost for this item
  getTotalCost() {
    // return the quantity multiplied by the price
    // TODO
  }

  // Method to display item info in a human-readable format
  toString() {
    return this.quantity + " x " + this.name + " @ " + this.price.toFixed(2) + " = " + this.getTotalCost().toFixed(2);
  }
}
```

## SAVE OBJECTS TO LOCAL STORAGE

```
function saveToLocalStorage() {
    let finalString = "";
    // loop thru each item in myArray
    for(??? of ???){
        // concatenate a comma onto finalString
        finalString += ",";

        // call the getStorageString() method for each object and concatenate it onto finalString
        // TODO

    }
    // save finalString to localStorage
    localStorage.savedList = finalString;
}
```

Update the addListItem() function to use the saveToLocalStorage() function.


## LOAD OBJECTS FROM LOCAL STORAGE

```
function convertStorageStringToGroceryObject(str){
    // If the length of str is less than 4, then continue
    if(???){ // TODO
        return null;
    }

    // Use the split() method to divide str into an array of attribute strings: name, quantity, price, category
    // For example, ["1", "apples", "0.70", "fruits"]
    // TODO

    // Use parseInt() to convert the quantity string into an integer and save it in a temp variable
    // TODO

    // Extract the name and save it in a temp variable
    // TODO

    // Use parseFloat() to convert the price string into a floating-point number and save it in a temp variable
    // TODO

    // Extract the category and save it in a temp variable
    // TODO

    // Return a new GroceryItem object created with these temp variables
    // TODO

}
function loadFromLocalStorage() {
    let resultsArray = [];

    // Check if localStorage.savedList is undefined (has never been created)
    if (typeof localStorage.savedList === "undefined") {
        return; // Exit the function if no saved list exists
    }

    // Check if localStorage.savedList exists but is an empty string
    if (localStorage.savedList.length === 0) {
        return; // Exit the function if the saved list is empty
    }

    // Retrieve the raw string of saved grocery items from localStorage
    // For example, "1|apples|0.70|fruits,2|carrots|0.50|veggies" 
    let localStorageString = localStorage.savedList;

    // Use the split() method to divide the string into an array of item strings
    // For example, ["1|apples|0.70|fruits", "2|carrots|0.50|veggies"]
    let arrayOfStorageStrings = ???; // TODO

    for(const eachStorageString of arrayOfStorageStrings){
        
        // Use the convertStorageStringToGroceryObject() function to convert each and save what is returned in a temp variable
        // TODO

        // If the temp variable does NOT equal null, then push the temp variable into resultsArray
        // TODO
        
    }
    // return resultsArray
    
}

```





Show Mr. Riley when finished