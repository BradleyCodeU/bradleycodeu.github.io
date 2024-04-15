class ScoreboardRow {
  static ordinal_suffix_of(i) {
    var j = i % 10,
      k = i % 100;
    if (j == 1 && k != 11) {
      return i + "st";
    }
    if (j == 2 && k != 12) {
      return i + "nd";
    }
    if (j == 3 && k != 13) {
      return i + "rd";
    }
    return i + "th";
  }

  constructor(_name) {
    this.name = _name;
    this.score = 0;
    this.tr = document.createElement('tr');
    let td1 = document.createElement('td');
    let text1 = document.createTextNode(this.name);
    td1.appendChild(text1);
    this.tr.appendChild(td1);
  }
  add(_guess, _position, _points) {
    let td1 = document.createElement('td');
    let text1 = document.createTextNode(_guess + " ("+ScoreboardRow.ordinal_suffix_of(_position)+" = "+_points+"pts)");
    td1.appendChild(text1);
    this.tr.appendChild(td1);
  }
}