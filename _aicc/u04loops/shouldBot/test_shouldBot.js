console.log("=== Running ShouldBot Function Tests ===");

// Note: Because buildBotReply relies on a random choice,
// we test if the result is *one of* the valid possibilities.

// Test 1: Simple "or" split
let options1 = ["pizza", "hamburgers"];
let result1 = buildBotReply("pizza or hamburgers");
console.assert(options1.includes(result1), "Should return 'pizza' or 'hamburgers'");

// Test 2: Simple "or" split with extra spaces
let options2 = ["pizza", "hamburgers"];
let result2 = buildBotReply("  pizza   or   hamburgers  ");
console.assert(options2.includes(result2), "Should handle extra spaces and trim options");

// Test 3: Multi "or" split
let options3 = ["hot dog", "salad", "sushi"];
let result3 = buildBotReply("hot dog or salad or sushi");
console.assert(options3.includes(result3), "Should handle multiple 'or's in a sentence");

// Test 4: Comma split
let options4 = ["pizza", "burgers", "hot dogs"];
let result4 = buildBotReply("pizza, burgers, hot dogs");
console.assert(options4.includes(result4), "Should split by comma as well as 'or'");

// Test 5: Oxford Comma (Critical Test)
let options5 = ["chocolate", "vanilla", "strawberry"];
let result5 = buildBotReply("chocolate, vanilla, or strawberry");
console.assert(options5.includes(result5), "Should correctly handle Oxford comma (e.g., 'A, B, or C')");

// Test 6: Oxford Comma with trailing punctuation
let options6 = ["chocolate", "vanilla", "strawberry"];
let result6 = buildBotReply("chocolate, vanilla, or strawberry?");
console.assert(options6.includes(result6), "Should handle Oxford comma AND trailing punctuation");

// Test 7: "should i" replacement (no "or")
let result7 = buildBotReply("should i go");
console.assert(result7 === "you should go", "Should replace 'should i' phrase");

// Test 8: "should i" replacement (with "or")
let options8 = ["you should get pizza", "hamburgers"];
let result8 = buildBotReply("should i get pizza or hamburgers");
console.assert(options8.includes(result8), "Should replace 'should i' AND then split by 'or'");

// Test 9: "should i" replacement (with Oxford Comma)
let options9 = ["you should get pizza", "burgers", "subs"];
let result9 = buildBotReply("should i get pizza, burgers, or subs");
console.assert(options9.includes(result9), "Should handle 'should i' AND comma/Oxford comma splitting");

// Test 10: Single option (no splitters)
let result10 = buildBotReply("pizza");
console.assert(result10 === "pizza", "Should return the single item if no splitters found");

// Test 11: Single option with spaces and punctuation
let result11 = buildBotReply("  pizza?  ");
console.assert(result11 === "pizza", "Should clean and return a single item with punctuation/spaces");


// --- swapAll() ---
// **FIXED**: Renamed variables to avoid redeclaration errors

// Test 1: Multiple occurrences (user's example)
let s_result1 = swapAll("I came, I saw, I conquered", "I", "We");
console.assert(s_result1 === "We came, We saw, We conquered", "Should replace all occurrences");

// Test 2: No occurrences
let s_result2 = swapAll("the quick brown fox", "dog", "cat");
console.assert(s_result2 === "the quick brown fox", "Should return original string if no match");

// Test 3: Multiple adjacent/overlapping occurrences
let s_result3 = swapAll("banana", "na", "pa");
console.assert(s_result3 === "bapapa", "Should handle adjacent matches");

// Test 4: Case sensitivity (full match)
let s_result4 = swapAll("hello hello", "hello", "hi");
console.assert(s_result4 === "hi hi", "Should replace all lowercase matches");

// Test 5: Case sensitivity (partial match)
let s_result5 = swapAll("Hello hello", "hello", "hi");
console.assert(s_result5 === "Hello hi", "Should be case-sensitive and only match 'hello'");

// Test 6: Case sensitivity (different case)
let s_result6 = swapAll("Hello hello", "Hello", "Hi");
console.assert(s_result6 === "Hi hello", "Should be case-sensitive and only match 'Hello'");

// Test 7: Partial word replacement
let s_result7 = swapAll("this is his thesis", "is", "was");
console.assert(s_result7 === "thwas was hwas theswas", "Should replace partial word fragments");

// Test 8: Replacing with an empty string (deleting)
let s_result8 = swapAll("banana", "a", "");
console.assert(s_result8 === "bnn", "Should delete all occurrences of 'a'");

// Test 9: Empty input string
let s_result9 = swapAll("", "a", "b");
console.assert(s_result9 === "", "Should handle an empty string input");

console.log("✅ All tests complete!");