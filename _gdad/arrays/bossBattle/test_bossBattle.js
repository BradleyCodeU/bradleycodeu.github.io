// Testing Suite for Boss Battle
// Test Runner Counter
let totalPassed = 0;
let totalFailed = 0;

/**
 * Custom test assertion wrapper around console.assert
 * Tracks pass/fail counts and logs failures to console.
 */
function assertTest(condition, testName) {
  if (condition) {
    totalPassed++;
  } else {
    totalFailed++;
  }
  console.assert(condition, `FAILED: ${testName}`);
}

// --- Test Setup & Mocks ---
// Mock window.alert to prevent popups during automated test run
const originalAlert = window.alert;
window.alert = () => {};

// Ensure required DOM elements exist for DOM tests
const setupMockDOM = () => {
  if (!document.getElementById("bossHealthBox")) {
    const el = document.createElement("div");
    el.id = "bossHealthBox";
    document.body.appendChild(el);
  }
  if (!document.getElementById("playerHealthBox")) {
    const el = document.createElement("div");
    el.id = "playerHealthBox";
    document.body.appendChild(el);
  }
  if (!document.getElementById("playerButtons")) {
    const el = document.createElement("div");
    el.id = "playerButtons";
    document.body.appendChild(el);
  }
};

setupMockDOM();

// ==========================================
// 1. Basic Validity Tests
// ==========================================

// randomHealth() Range Test
let validHealth = true;
for (let i = 0; i < 50; i++) {
  let h = randomHealth();
  if (typeof h !== "number" || h < 30 || h > 50) {
    validHealth = false;
    break;
  }
}
assertTest(validHealth, "randomHealth() should return a number between 30 and 50");

// randomTrueFalse() Type Test
let validBool = true;
for (let i = 0; i < 20; i++) {
  let tf = randomTrueFalse();
  if (typeof tf !== "boolean") {
    validBool = false;
    break;
  }
}
assertTest(validBool, "randomTrueFalse() should return a boolean value");

// diceRoll() Range Test
let validDice = true;
for (let i = 0; i < 50; i++) {
  let roll = diceRoll();
  if (typeof roll !== "number" || roll < 1 || roll > 6) {
    validDice = false;
    break;
  }
}
assertTest(validDice, "diceRoll() should return an integer between 1 and 6");


// ==========================================
// 2. Statistical Distribution & Coverage Tests (1000 Runs)
// ==========================================

// Statistical Balance Test for randomTrueFalse()
let trueCount = 0;
let falseCount = 0;
for (let i = 0; i < 1000; i++) {
  if (randomTrueFalse()) {
    trueCount++;
  } else {
    falseCount++;
  }
}
// Expecting roughly ~50% true/false (allowing a safe statistical variance window of 40% to 60%)
let tfBalanced = trueCount >= 400 && trueCount <= 600 && (trueCount + falseCount === 1000);
assertTest(
  tfBalanced,
  `randomTrueFalse() balance test: expected ~500 true and ~500 false, got ${trueCount} true and ${falseCount} false`
);

// Full Value Coverage Test for randomHealth() (30 through 50)
const generatedHealths = new Set();
let healthInBounds = true;

for (let i = 0; i < 1000; i++) {
  let val = randomHealth();
  if (val < 30 || val > 50 || !Number.isInteger(val)) {
    healthInBounds = false;
  }
  generatedHealths.add(val);
}
// 30 through 50 inclusive contains 21 distinct integer values
let hasAllHealthValues = generatedHealths.size === 21 && healthInBounds;
assertTest(
  hasAllHealthValues,
  `randomHealth() coverage test: expected all 21 integers (30-50), received ${generatedHealths.size} unique values`
);

// Full Value Coverage Test for diceRoll() (1 through 6)
const generatedRolls = new Set();
let diceInBounds = true;

for (let i = 0; i < 1000; i++) {
  let val = diceRoll();
  if (val < 1 || val > 6 || !Number.isInteger(val)) {
    diceInBounds = false;
  }
  generatedRolls.add(val);
}
// 1 through 6 contains 6 distinct integer values
let hasAllDiceValues = generatedRolls.size === 6 && diceInBounds;
assertTest(
  hasAllDiceValues,
  `diceRoll() coverage test: expected all 6 integers (1-6), received ${generatedRolls.size} unique values`
);


// ==========================================
// 3. Combat Logic Tests (hitBoss & hitPlayer)
// ==========================================

// Override diceRoll to return a fixed deterministic value (3) for formula calculations
const originalDiceRoll = diceRoll;
diceRoll = () => 3;

// Test max weakness match (Ice + Magic weaknesses both active)
iceWeakness = true;
magicWeakness = true;
let dmgIceSpell = hitBoss("ice spell"); // Base (3) + Ice (3) + Magic (3) = 9
assertTest(dmgIceSpell === 9, "hitBoss('ice spell') correctly calculates double weakness bonus (9)");

// Test non-matching weakness conditions (iceWeakness=false, magicWeakness=false)
iceWeakness = false;
magicWeakness = false;
let dmgFireSword = hitBoss("fire sword"); // Base (3) + Fire (3) + Sword (3) = 9
assertTest(dmgFireSword === 9, "hitBoss('fire sword') correctly calculates bonus when iceWeakness=false and magicWeakness=false (9)");

// Test zero weakness match
let dmgNoMatch = hitBoss("ice spell"); // Base (3) + No match = 3
assertTest(dmgNoMatch === 3, "hitBoss('ice spell') returns base damage (3) when no weaknesses match");

// Player health > 25 triggers extra dice roll
playerHealth = 30;
let highHealthDmg = hitPlayer(); // Base (3) + Bonus Roll (3) = 6
assertTest(highHealthDmg === 6, "hitPlayer() deals extra dice roll damage (6) when playerHealth > 25");

// Player health <= 25 gets normal single roll
playerHealth = 20;
let lowHealthDmg = hitPlayer(); // Base (3) = 3
assertTest(lowHealthDmg === 3, "hitPlayer() deals single dice roll damage (3) when playerHealth <= 25");


// ==========================================
// 4. Game State & Win/Loss Condition Tests
// ==========================================

// Player defeat state
document.getElementById("playerButtons").style.display = "block";
playerHealth = 0;
bossHealth = 20;
checkForWins();
assertTest(
  document.body.style.backgroundColor === "red",
  "checkForWins() sets backgroundColor to be the word 'red' when player health <= 0"
);
assertTest(
  document.getElementById("playerButtons").style.display === "none" || document.getElementById("playerButtons").style.visibility === "hidden",
  "checkForWins() hides buttons when player health <= 0"
);

// Player victory state
document.getElementById("playerButtons").style.display = "block";
playerHealth = 20;
bossHealth = 0;
checkForWins();
assertTest(
  document.body.style.backgroundColor === "green",
  "checkForWins() sets backgroundColor to be the word 'green' when boss health <= 0"
);
assertTest(
  document.getElementById("playerButtons").style.display === "none" || document.getElementById("playerButtons").style.visibility === "hidden",
  "checkForWins() hides buttons when boss health <= 0"
);

// Tie state
document.getElementById("playerButtons").style.display = "block";
playerHealth = -1;
bossHealth = -2;
checkForWins();
assertTest(
  document.body.style.backgroundColor === "red",
  "checkForWins() sets backgroundColor to be the word 'red' when both player health and boss health are less than zero"
);
assertTest(
  document.getElementById("playerButtons").style.display === "none" || document.getElementById("playerButtons").style.visibility === "hidden",
  "checkForWins() hides buttons when both player health and boss health are less than zero"
);

// --- Restore Environment Mocks ---
diceRoll = originalDiceRoll;
window.alert = originalAlert;


// ==========================================
// Final Report
// ==========================================
console.log(`Total Passed: ${totalPassed} | Total Failed: ${totalFailed}`);

if (totalFailed === 0) {
  console.log("All tests passed!");
}