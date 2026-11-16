console.log("=== Running RPS Trigrams Function Tests ===");

// Helper reset global variables for clean testing
function resetGlobals() {
  botMemory = "";
  botTrigrams = {};
}

// --- updateTrigrams() ---

// Test 1: Initial move (memory is empty)
resetGlobals();
updateTrigrams("r");
console.assert(botMemory === "r", "Test 1: botMemory should be 'r'");
console.assert(Object.keys(botTrigrams).length === 0, "Test 1: botTrigrams should be empty");

// Test 2: Second move (memory length is 1)
resetGlobals();
botMemory = "r"; // Setup state
updateTrigrams("p");
console.assert(botMemory === "rp", "Test 2: botMemory should be 'rp'");
console.assert(Object.keys(botTrigrams).length === 0, "Test 2: botTrigrams should still be empty");

// Test 3: Third move (first trigram created)
resetGlobals();
botMemory = "rp"; // Setup state
updateTrigrams("s");
console.assert(botMemory === "rps", "Test 3: botMemory should be 'rps'");
console.assert(Object.keys(botTrigrams).length === 1, "Test 3: botTrigrams should have one key");
console.assert(botTrigrams["rp"] !== undefined, "Test 3: 'rp' key should be created");
console.assert(Array.isArray(botTrigrams["rp"]), "Test 3: 'rp' value should be an array");
console.assert(botTrigrams["rp"].length === 1, "Test 3: 'rp' array should have one item");
console.assert(botTrigrams["rp"][0] === "s", "Test 3: 'rp' array should contain 's'");

// Test 4: Fourth move (second trigram created)
resetGlobals();
botMemory = "rps"; // Setup state
botTrigrams = { "rp": ["s"] }; // Setup state
updateTrigrams("r");
console.assert(botMemory === "rpsr", "Test 4: botMemory should be 'rpsr'");
console.assert(Object.keys(botTrigrams).length === 2, "Test 4: botTrigrams should have two keys");
console.assert(botTrigrams["ps"] !== undefined, "Test 4: 'ps' key should be created");
console.assert(botTrigrams["ps"][0] === "r", "Test 4: 'ps' array should contain 'r'");

// Test 5: Fifth move (adding to an *existing* trigram)
resetGlobals();
botMemory = "rpsr"; // Setup state
botTrigrams = { "rp": ["s"], "ps": ["r"] }; // Setup state
updateTrigrams("p");
console.assert(botMemory === "rpsrp", "Test 5: botMemory should be 'rpsrp'");
console.assert(Object.keys(botTrigrams).length === 3, "Test 5: botTrigrams should have three keys ('sr' is new)");
console.assert(botTrigrams["sr"][0] === "p", "Test 5: 'sr' array should contain 'p'");

// Test 6: Sixth move (adding a second item to an existing trigram)
resetGlobals();
botMemory = "rpsrp"; // Setup state
botTrigrams = { "rp": ["s"], "ps": ["r"], "sr": ["p"] }; // Setup state
updateTrigrams("s");
console.assert(botMemory === "rpsrps", "Test 6: botMemory should be 'rpsrps'");
console.assert(Object.keys(botTrigrams).length === 3, "Test 6: botTrigrams should still have three keys");
console.assert(botTrigrams["rp"].length === 2, "Test 6: 'rp' array should now have two items");
console.assert(botTrigrams["rp"][0] === "s", "Test 6: 'rp' array's first item should be 's'");
console.assert(botTrigrams["rp"][1] === "s", "Test 6: 'rp' array's second item should be 's'");

resetGlobals();

console.log("✅ All tests complete!");