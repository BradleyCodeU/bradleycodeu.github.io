console.log("=== Running Coding Teacher Bot Function Tests ===");

// --- Test Suite ---

// filterOutPunctuation()
console.assert(filterOutPunctuation("Hello, world!") === "Hello world", "Should remove comma and exclamation point");
console.assert(filterOutPunctuation("Is this a test? (Yes.)") === "Is this a test Yes", "Should remove question mark, parentheses, and period");
console.assert(filterOutPunctuation("NoPunctuation") === "NoPunctuation", "Should return unchanged string if no punctuation");
console.assert(filterOutPunctuation(".,!?;") === "", "Should return empty string if only punctuation");
console.assert(filterOutPunctuation("") === "", "Should handle empty string");


// swapText()
console.assert(swapText("quick brown fox", "brown", "green") === "quick green fox", "Should swap 'brown' for 'green'");
console.assert(swapText("the quick brown fox jumps over the lazy brown dog", "brown", "green") === "the quick green fox jumps over the lazy green dog", "Should swap ALL instances");
console.assert(swapText("quick brown fox", "red", "green") === "quick brown fox", "Should not change if oldWord not found");
console.assert(swapText("Quick Brown Fox", "Brown", "Green") === "Quick Green Fox", "Should handle case-sensitive swap");
console.assert(swapText("Quick Brown Fox", "brown", "green") === "Quick Brown Fox", "Should be case-sensitive by default");


// swapPronouns()
// NOTE: These tests assume you added swaps for 'my'/'your' and 'me'/'you' and their reverses
console.assert(swapPronouns("error i keep having") === "error you keep having", "Should swap 'i' to 'you'");
console.assert(swapPronouns("my problem is me") === "your problem is you", "Should swap 'my' to 'your' and 'me' to 'you'");
console.assert(swapPronouns("i think my code is broken") === "you think your code is broken", "Should handle multiple swaps in one sentence");
console.assert(swapPronouns("I Think MY Code is Broken") === "you think your code is broken", "Should convert to lowercase first");
console.assert(swapPronouns("you are my sunshine") === "i are your sunshine", "Should swap 'you' to 'i' and 'my' to 'your'");


// swapContractions()
console.assert(swapContractions("that's the error i'm getting") === "that is the error i am getting", "Should swap 'that's' and 'i'm'");
console.assert(swapContractions("It's a bug, I can't fix it.") === "it is a bug, i can not fix it.", "Should swap 'It's' and 'can't' and lowercase");
console.assert(swapContractions("He won't, so I don't.") === "he will not, so i do not.", "Should swap 'won't' and 'don't'");
console.assert(swapContractions("hello world") === "hello world", "Should not change string with no contractions");
console.assert(swapContractions("AIN'T") === "is not", "Should swap 'ain't' and lowercase");


console.log("✅ All tests complete!");