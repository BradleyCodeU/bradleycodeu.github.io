console.log("=== Running Rock-Paper-Scissors Function Tests ===");

// --- Global variables for testing getWhoWins ---
let gameCount = 0;
let userWins = 0;
let botWins = 0;

// Helper reset global variables for clean testing
function resetGlobals() {
  gameCount = 0;
  userWins = 0;
  botWins = 0;
}

// --- getWinPercent() ---
console.assert(getWinPercent(1, 3) === "33%", "1/3 should be 33%");
console.assert(getWinPercent(2, 3) === "67%", "2/3 should be 67%");
console.assert(getWinPercent(1, 2) === "50%", "1/2 should be 50%");
console.assert(getWinPercent(0, 5) === "0%", "0/5 should be 0%");
console.assert(getWinPercent(5, 5) === "100%", "5/5 should be 100%");
console.assert(getWinPercent(0, 0) === "0%", "0/0 should be 0% (Handle divide by zero)");

// --- getWhoWins() ---

// Expected lowercase messages for comparison
const expected_bot_win = "bot wins";
const expected_user_win = "user wins";

// Test 1: Tie cases
resetGlobals();
console.assert(getWhoWins("r", "r") === "tie", "r, r should be a tie");
console.assert(gameCount === 1 && userWins === 0 && botWins === 0, "Tie should only increment gameCount");

resetGlobals();
console.assert(getWhoWins("p", "p") === "tie", "p, p should be a tie");
console.assert(gameCount === 1 && userWins === 0 && botWins === 0, "Tie should only increment gameCount");

resetGlobals();
console.assert(getWhoWins("s", "s") === "tie", "s, s should be a tie");
console.assert(gameCount === 1 && userWins === 0 && botWins === 0, "Tie should only increment gameCount");

// Test 2: Bot win cases
resetGlobals();
let msg_rp = getWhoWins("r", "p"); // user: rock, bot: paper
console.assert(msg_rp.toLowerCase().includes(expected_bot_win), "r, p should be a bot win");
console.assert(gameCount === 1 && userWins === 0 && botWins === 1, "Bot win should increment gameCount and botWins");

resetGlobals();
let msg_ps = getWhoWins("p", "s"); // user: paper, bot: scissors
console.assert(msg_ps.toLowerCase().includes(expected_bot_win), "p, s should be a bot win");
console.assert(gameCount === 1 && userWins === 0 && botWins === 1, "Bot win should increment gameCount and botWins");

resetGlobals();
let msg_sr = getWhoWins("s", "r"); // user: scissors, bot: rock
console.assert(msg_sr.toLowerCase().includes(expected_bot_win), "s, r should be a bot win");
console.assert(gameCount === 1 && userWins === 0 && botWins === 1, "Bot win should increment gameCount and botWins");

// Test 3: User win cases
resetGlobals();
let msg_pr = getWhoWins("p", "r"); // user: paper, bot: rock
console.assert(msg_pr.toLowerCase().includes(expected_user_win), "p, r should be a user win");
console.assert(gameCount === 1 && userWins === 1 && botWins === 0, "User win should increment gameCount and userWins");

resetGlobals();
let msg_sp = getWhoWins("s", "p"); // user: scissors, bot: paper
console.assert(msg_sp.toLowerCase().includes(expected_user_win), "s, p should be a user win");
console.assert(gameCount === 1 && userWins === 1 && botWins === 0, "User win should increment gameCount and userWins");

resetGlobals();
let msg_rs = getWhoWins("r", "s"); // user: rock, bot: scissors
console.assert(msg_rs.toLowerCase().includes(expected_user_win), "r, s should be a user win");
console.assert(gameCount === 1 && userWins === 1 && botWins === 0, "User win should increment gameCount and userWins");

// Test 4: Input handling (full word and uppercase)
resetGlobals();
let msg_word = getWhoWins("rock", "s"); // user: rock, bot: scissors
console.assert(msg_word.toLowerCase().includes(expected_user_win), "Full word 'rock' should be a user win");
console.assert(gameCount === 1 && userWins === 1, "Full word 'rock' should increment user wins");

resetGlobals();
let msg_upper = getWhoWins("Paper", "r"); // user: Paper, bot: rock
console.assert(msg_upper.toLowerCase().includes(expected_user_win), "Uppercase 'Paper' should be a user win");
console.assert(gameCount === 1 && userWins === 1, "Uppercase 'Paper' should increment user wins");

console.log("✅ All tests complete!");