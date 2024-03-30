import java.util.*;

class TicTacToeMarkovChain {
    
    public static char[][] randomMove(char[][] twoDArray, char thisChar) {
        List<int[]> emptyCells = new ArrayList<>();
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[0].length; j++) {
                if (twoDArray[i][j] == ' ') {
                    emptyCells.add(new int[]{i, j});
                }
            }
        }
        if (!emptyCells.isEmpty()) {
            int[] move = emptyCells.get(new Random().nextInt(emptyCells.size()));
            twoDArray[move[0]][move[1]] = thisChar;
        }
        return twoDArray;
    }

    private int size;
    private double randomPercent;
    private Map<String, Map<String, Integer>> transitions;
    private List<String> history;
    private boolean isOnOffense = false; // On Offense == Goes First, On Defense == Goes Second
    private boolean canMakeObviousMoves;
    private boolean trained;


    public TicTacToeMarkovChain(boolean canMakeObviousMoves, boolean canTrain) {
        this.size = 3;
        this.randomPercent = 0.5;
        this.transitions = new HashMap<>();
        // this.transitions.put("x--------", new HashMap<>(Map.of("x--o-----", 1)));
        // this.transitions.put("xx-o-----", new HashMap<>(Map.of("xx-oo----", 1)));
        this.history = new ArrayList<>();
        this.canMakeObviousMoves = canMakeObviousMoves;
        if(canTrain){
            this.train();
            this.trained = true;
        }
    }

    // Define getter methods for canMakeObviousMoves and trained
    public boolean canMakeObviousMoves() {
        return canMakeObviousMoves;
    }

    public boolean isTrained() {
        return trained;
    }

    public int getMarkovChainSize(){
        return this.transitions.size();
    }

    public boolean getIsOnOffense(){
        return this.isOnOffense;
    }

    public void setToOffense(){
        this.isOnOffense = true;
    }

    public void setToDefense(){
        this.isOnOffense = false;
    }
    
    private String gameStateToKey(char[][] twoDArray) {
        StringBuilder result = new StringBuilder();
        for (char[] row : twoDArray) {
            for (char move : row) {
                if (move == 'X') result.append('x');
                else if (move == 'O') result.append('o');
                else result.append('-');
            }
        }
        return result.toString();
    }

    private char[][] keyToGameState(String key) {
        char[][] moves = new char[size][size];
        for (int i = 0; i < key.length(); i++) {
            int row = i / size;
            int col = i % size;
            if (key.charAt(i) == 'x') moves[row][col] = 'X';
            else if (key.charAt(i) == 'o') moves[row][col] = 'O';
            else moves[row][col] = ' ';
        }
        return moves;
    }
    

    public char[][] getNextMove(char[][] twoDArray) {
        String newKey;
        String key = gameStateToKey(twoDArray);
        history.add(key);
    
        // Check for an obvious winning move "OOO" 
        char[][] updatedArray = findObviousMove(twoDArray, 'O');
        if(updatedArray == null){
            // Check for an obvious blocking move "XXO"
            updatedArray = findObviousMove(twoDArray, 'X');
        }
        if(!canMakeObviousMoves){
            updatedArray = null;
        }
        if (updatedArray != null) {
            System.out.println("Markov says 'obvious'");
            newKey = gameStateToKey(updatedArray);
            System.out.println(newKey);
        } else {
            // No obvious move
            System.out.println("Markov says 'no obvious move'");
            if (!transitions.containsKey(key)) {
                transitions.put(key, new HashMap<>());
            }
            if (randomPercent < Math.random() * 100) {
                twoDArray = weightedMove(key, twoDArray);
            } else {
                System.out.println("Markov says 'random move'");
                twoDArray = randomMove(twoDArray, 'O');
            }
            newKey = gameStateToKey(twoDArray);
        }
    
        history.add(newKey);
        // Ensure transitions map contains the key
        if (!transitions.containsKey(key)) {
            transitions.put(key, new HashMap<>());
        }
        // Update transitions
        if (!transitions.get(key).containsKey(newKey)) {
            transitions.get(key).put(newKey, 1);
        }
        return keyToGameState(newKey);
    }
    

    public char[][] findObviousMove(char[][] matrix, char searchChar) {
        char[][] result = new char[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            result[row] = matrix[row].clone(); // Copying the matrix
        }
    
        // Iterate through each row
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length - 2; col++) {
                // Check horizontal two in a row
                if (result[row][col] == searchChar && result[row][col] == result[row][col + 1] && result[row][col + 2] == ' ') {
                    result[row][col + 2] = 'O'; // Place O in the empty space
                    return result;
                }
                // Check reverse horizontal two in a row
                if (result[row][col] == searchChar && result[row][col] == result[row][col + 2] && result[row][col + 1] == ' ') {
                    result[row][col + 1] = 'O'; // Place O in the empty space
                    return result;
                }
                // Check backward horizontal two in a row
                if (result[row][col + 2] == searchChar && result[row][col + 2] == result[row][col + 1] && result[row][col] == ' ') {
                    result[row][col] = 'O'; // Place O in the empty space
                    return result;
                }
            }
        }
    
        // Iterate through each column
        for (int col = 0; col < result[0].length; col++) {
            for (int row = 0; row < result.length - 2; row++) {
                // Check vertical two in a row
                if (result[row][col] == searchChar && result[row][col] == result[row + 1][col] && result[row + 2][col] == ' ') {
                    result[row + 2][col] = 'O'; // Place O in the empty space
                    return result;
                }
                // Check reverse vertical two in a row
                if (result[row][col] == searchChar && result[row][col] == result[row + 2][col] && result[row + 1][col] == ' ') {
                    result[row + 1][col] = 'O'; // Place O in the empty space
                    return result;
                }
                // Check backward vertical two in a row
                if (result[row + 2][col] == searchChar && result[row + 2][col] == result[row + 1][col] && result[row][col] == ' ') {
                    result[row][col] = 'O'; // Place O in the empty space
                    return result;
                }
            }
        }
    
        // Iterate through each diagonal
        for (int row = 0; row < result.length - 2; row++) {
            for (int col = 0; col < result[0].length - 2; col++) {
                // Check diagonal two in a row
                if (result[row][col] == searchChar && result[row][col] == result[row + 1][col + 1] && result[row + 2][col + 2] == ' ') {
                    result[row + 2][col + 2] = 'O'; // Place O in the empty space
                    return result;
                }
                // Check reverse diagonal two in a row
                if (result[row][col] == searchChar && result[row][col] == result[row + 2][col + 2] && result[row + 1][col + 1] == ' ') {
                    result[row + 1][col + 1] = 'O'; // Place O in the empty space
                    return result;
                }
                // Check backward diagonal two in a row
                if (result[row + 2][col + 2] == searchChar && result[row + 2][col + 2] == result[row + 1][col + 1] && result[row][col] == ' ') {
                    result[row][col] = 'O'; // Place O in the empty space
                    return result;
                }
            }
        }
    
        // Iterate through each reverse diagonal
        for (int row = 0; row < result.length - 2; row++) {
            for (int col = result[0].length - 1; col >= 2; col--) {
                // Check reverse diagonal two in a row
                if (result[row][col] == searchChar && result[row][col] == result[row + 1][col - 1] && result[row + 2][col - 2] == ' ') {
                    result[row + 2][col - 2] = 'O'; // Place O in the empty space
                    return result;
                }
                // Check backward reverse diagonal two in a row
                if (result[row][col] == searchChar && result[row][col] == result[row + 2][col - 2] && result[row + 1][col - 1] == ' ') {
                    result[row + 1][col - 1] = 'O'; // Place O in the empty space
                    return result;
                }
                // Check backward reverse diagonal two in a row
                if (result[row + 2][col - 2] == searchChar && result[row + 2][col - 2] == result[row + 1][col - 1] && result[row][col] == ' ') {
                    result[row][col] = 'O'; // Place O in the empty space
                    return result;
                }
            }
        }
    
        // did not find
        return null;
    }
    

    private char[][] weightedMove(String key, char[][] twoDArray) {
        String highKey = null;
        double highValue = -1;
        for (Map.Entry<String, Integer> entry : transitions.get(key).entrySet()) {
            if (entry.getValue() > highValue) {
                highKey = entry.getKey();
                highValue = entry.getValue();
            }
        }
        if (highValue >= Math.random() * randomPercent) {
            System.out.println("Markov says 'i remember this'");
            return keyToGameState(highKey);
        } else {
            System.out.println("Markov says 'random move'");
            return randomMove(twoDArray,'O');
        }
    }

    public void addWin(){
        for (int i = 0; i < history.size() - 1; i += 2) {
                        String state = history.get(i);
                        String nextState = history.get(i + 1);
                        transitions.get(state).put(nextState, transitions.get(state).get(nextState) * 2);

                    }
                    history.clear();
    }
    public void addLoss(){
        for (int i = 0; i < history.size() - 1; i += 2) {
                        String state = history.get(i);
                        String nextState = history.get(i + 1);
                        
                        transitions.get(state).put(nextState, (int) (transitions.get(state).get(nextState) * (0.4 - 0.1 * i)));
                        
                    }
                    history.clear();
    }
    public void addDraw(){
        for (int i = 0; i < history.size() - 1; i += 2) {
                        String state = history.get(i);
                        String nextState = history.get(i + 1);
                        if (this.isOnOffense) {
                            // draws on offense are bad
                            transitions.get(state).put(nextState, (int) (transitions.get(state).get(nextState) * (0.4 - 0.1 * i)));
                        } else {
                            // draws on defense are good
                            transitions.get(state).put(nextState, transitions.get(state).get(nextState) * 2);
                            
                        }
                    }
                    history.clear();
    }

    public void train(){
        // OFFENSIVE MOVES
        // Play your first O in a corner
        this.transitions.put("---------", new HashMap<>(Map.of("o--------", 1)));
        // this.transitions.put("---------", new HashMap<>(Map.of("--o------", 1)));
        // this.transitions.put("---------", new HashMap<>(Map.of("------o--", 1)));
        // this.transitions.put("---------", new HashMap<>(Map.of("--------o", 1)));
        // Next play center
        this.transitions.put("xo-------", new HashMap<>(Map.of("xo--o----", 1)));
        this.transitions.put("o-x------", new HashMap<>(Map.of("o-x-o----", 1)));
        this.transitions.put("o--x-----", new HashMap<>(Map.of("o--xo----", 1)));
        this.transitions.put("o----x---", new HashMap<>(Map.of("o---ox---", 1)));
        this.transitions.put("o-----x--", new HashMap<>(Map.of("o---o-x--", 1)));
        this.transitions.put("o------x-", new HashMap<>(Map.of("o---o--x-", 1)));
        this.transitions.put("o-------x", new HashMap<>(Map.of("o---o---x", 1)));
    
        this.transitions.put("x-o------", new HashMap<>(Map.of("x-o-o----", 1)));
        this.transitions.put("-xo------", new HashMap<>(Map.of("-xo-o----", 1)));
        this.transitions.put("--ox-----", new HashMap<>(Map.of("--oxo----", 1)));
        this.transitions.put("--o--x---", new HashMap<>(Map.of("--o-ox---", 1)));
        this.transitions.put("--o---x--", new HashMap<>(Map.of("--o-o-x--", 1)));
        this.transitions.put("--o----x-", new HashMap<>(Map.of("--o-o--x-", 1)));
        this.transitions.put("--o-----x", new HashMap<>(Map.of("--o-o---x", 1)));
    
        this.transitions.put("x-----o--", new HashMap<>(Map.of("x---o-o--", 1)));
        this.transitions.put("-x----o--", new HashMap<>(Map.of("-x--o-o--", 1)));
        this.transitions.put("--x---o--", new HashMap<>(Map.of("--x-o-o--", 1)));
        this.transitions.put("---x--o--", new HashMap<>(Map.of("---xo-o--", 1)));
        this.transitions.put("-----xo--", new HashMap<>(Map.of("----oxo--", 1)));
        this.transitions.put("------ox-", new HashMap<>(Map.of("----o-ox-", 1)));
        this.transitions.put("------o-x", new HashMap<>(Map.of("----o-o-x", 1)));
    
        this.transitions.put("x-------o", new HashMap<>(Map.of("x---o---o", 1)));
        this.transitions.put("-x------o", new HashMap<>(Map.of("-x--o---o", 1)));
        this.transitions.put("--x-----o", new HashMap<>(Map.of("--x-o---o", 1)));
        this.transitions.put("---x----o", new HashMap<>(Map.of("---xo---o", 1)));
        this.transitions.put("-----x--o", new HashMap<>(Map.of("----ox--o", 1)));
        this.transitions.put("------x-o", new HashMap<>(Map.of("----o-x-o", 1)));
        this.transitions.put("-------xo", new HashMap<>(Map.of("----o--xo", 1)));
    
        //DEFENSIVE MOVES
        // x in corner, go middle
        this.transitions.put("x--------", new HashMap<>(Map.of("x---o----", 1)));
        this.transitions.put("--x------", new HashMap<>(Map.of("--x-o----", 1)));
        this.transitions.put("------x--", new HashMap<>(Map.of("----o-x--", 1)));
        this.transitions.put("--------x", new HashMap<>(Map.of("----o---x", 1)));
        // obvious blocks
        this.transitions.put("xx--o----", new HashMap<>(Map.of("xxo-o----", 1)));
        this.transitions.put("x-x-o----", new HashMap<>(Map.of("xox-o----", 1)));
        this.transitions.put("x--xo----", new HashMap<>(Map.of("x--xo-o--", 1)));
        this.transitions.put("x---o-x--", new HashMap<>(Map.of("x--oo-x--", 1)));
        this.transitions.put("x---o---x", new HashMap<>(Map.of("x--oo---x", 1)));
    
        this.transitions.put("-xx-o----", new HashMap<>(Map.of("oxx-o----", 1)));
        this.transitions.put("x-x-o----", new HashMap<>(Map.of("xox-o----", 1)));
        this.transitions.put("--x-ox---", new HashMap<>(Map.of("--x-ox--o", 1)));
        this.transitions.put("--x-o---x", new HashMap<>(Map.of("--x-oo--x", 1)));
        this.transitions.put("--x-o-x--", new HashMap<>(Map.of("--x-oox--", 1)));
    
        this.transitions.put("----o-xx-", new HashMap<>(Map.of("----o-xxo", 1)));
        this.transitions.put("----o-x-x", new HashMap<>(Map.of("----o-xox", 1)));
        this.transitions.put("---xo-x--", new HashMap<>(Map.of("o--xo-x--", 1)));
        this.transitions.put("----o-x--", new HashMap<>(Map.of("----o-x--", 1)));
    
        this.transitions.put("----o--xx", new HashMap<>(Map.of("----o-oxx", 1)));
        this.transitions.put("----o-x-x", new HashMap<>(Map.of("----o-xox", 1)));
        this.transitions.put("----ox--x", new HashMap<>(Map.of("--o-ox--x", 1)));
        this.transitions.put("--x-o---x", new HashMap<>(Map.of("--x-oo--x", 1)));
        // x in middle, go corner
        this.transitions.put("----x----", new HashMap<>(Map.of("o---x----", 1)));
        this.transitions.put("----x----", new HashMap<>(Map.of("--o-x----", 1)));
        this.transitions.put("----x----", new HashMap<>(Map.of("----x-o--", 1)));
        this.transitions.put("----x----", new HashMap<>(Map.of("----x---o", 1)));
        // obvious blocks
        this.transitions.put("ox--x----", new HashMap<>(Map.of("ox--x--o-", 1)));
        this.transitions.put("o-x-x----", new HashMap<>(Map.of("o-x-x-o--", 1)));
        this.transitions.put("o--xx----", new HashMap<>(Map.of("o--xxo---", 1)));
        this.transitions.put("o---xx---", new HashMap<>(Map.of("o--oxx---", 1)));
        this.transitions.put("o---x-x--", new HashMap<>(Map.of("o-o-x-x--", 1)));
        this.transitions.put("o---x--x-", new HashMap<>(Map.of("oo--x--x-", 1)));
    
    
        this.transitions.put("x-o-x----", new HashMap<>(Map.of("x-o-x---o", 1)));
        this.transitions.put("-xo-x----", new HashMap<>(Map.of("-xo-x--o-", 1)));
        this.transitions.put("--oxx----", new HashMap<>(Map.of("--oxxo---", 1)));
        this.transitions.put("--o-xx---", new HashMap<>(Map.of("--ooxx---", 1)));
        this.transitions.put("--o-x--x-", new HashMap<>(Map.of("-oo-x--x-", 1)));
        this.transitions.put("--o-x---x", new HashMap<>(Map.of("o-o-x---x", 1)));
    
    
        this.transitions.put("x---x-o--", new HashMap<>(Map.of("x---x-o-o", 1)));
        this.transitions.put("-x--x-o--", new HashMap<>(Map.of("-x--x-oo-", 1)));
        this.transitions.put("---xx-o--", new HashMap<>(Map.of("---xxoo--", 1)));
        this.transitions.put("----xxo--", new HashMap<>(Map.of("---oxxo--", 1)));
        this.transitions.put("----x-ox-", new HashMap<>(Map.of("-o--x-ox-", 1)));
        this.transitions.put("----x-o-x", new HashMap<>(Map.of("o---x-o-x", 1)));
    
    
        this.transitions.put("-x--x---o", new HashMap<>(Map.of("-x--x--oo", 1)));
        this.transitions.put("--x-x-o-o", new HashMap<>(Map.of("--x-x-o-o", 1)));
        this.transitions.put("---xx---o", new HashMap<>(Map.of("---xxo--o", 1)));
        this.transitions.put("----xx--o", new HashMap<>(Map.of("---oxx--o", 1)));
        this.transitions.put("----x-x-o", new HashMap<>(Map.of("--o-x-x-o", 1)));
        this.transitions.put("----x--xo", new HashMap<>(Map.of("-o--x--xo", 1)));
        this.transitions.put("x---x---o", new HashMap<>(Map.of("x---x-o-o", 1)));
        this.transitions.put("--x-x-o--", new HashMap<>(Map.of("--x-x-o-o", 1)));
        // x in side, go center
        this.transitions.put("-x-------", new HashMap<>(Map.of("-x--o----", 1)));
        this.transitions.put("---x-----", new HashMap<>(Map.of("---xo----", 1)));
        this.transitions.put("-----x---", new HashMap<>(Map.of("----ox---", 1)));
        this.transitions.put("-------x-", new HashMap<>(Map.of("----o--x-", 1)));
        System.out.println("Markov says 'i'm done training'");
    }
}