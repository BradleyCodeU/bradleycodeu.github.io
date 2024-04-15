class Player {
  constructor(_name) {
    this.name = _name;
    this.guessArray = [0,0,0,0,0,0];
    this.scoreboardRow = new ScoreboardRow();
  }
  makeGuess(_roundNumber,_roundGoalString){
    this.guessArray[_roundNumber] = prompt(this.name + ", " + _roundGoalString);
  }
  addPoints(_guess,_position,_points){
    this.scoreboardRow.add(_guess,_position,_points);
  }
  getScore(){
    return this.scoreboardRow.score;
  }
}