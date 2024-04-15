class CpuPlayer extends Player {
  static nameArray = [];
  constructor() {
    super(Name.create_first_name());
  }
  makeGuess(_roundNumber) {
    let presetGuess = [37, 22, 11, 36, 45, 75]
    this.guessArray[_roundNumber] = Math.floor(
      Math.random() * (_roundNumber + 20) +
      Math.random() * (_roundNumber + 20) +
      presetGuess[_roundNumber] - _roundNumber - 20
    ) % 100;
  }
}