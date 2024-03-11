---
layout: project
category: u5a_wc
title: U5a RPS Teams
---



Complete the 20 TO DO!!! tasks listed below...

```
// Stats class
// - wins
// - losses
// + addLoss()  <--- TO DO!!!
// + addPointsScored(int points)  <--- TO DO!!!
// + addWin()  <--- TO DO!!!
// + toString()  <--- TO DO!!!

// Player class
// - name
// - team
// - idNumber
// - favPlay
// - currentSeasonStats
// - lifetimeStats
// - skillLevel
// + Constructor  <--- TO DO!!!
// + addLoss()  <--- TO DO!!!
// + addPointsScored(int points)  <--- TO DO!!!
// + addWin()  <--- TO DO!!!
// + getLifetimeStats()  <--- TO DO!!!
// + getPlay()  <--- TO DO!!!
// + getSeasonStats()  <--- TO DO!!!
// + getSkillLevel()  <--- TO DO!!!
// + getWins()  <--- TO DO!!!
// + setTeamEmoji(String emoji) <--- TO DO!!!
// + toString()  <--- TO DO!!!

// Game class
// - isGameOver
// - team1
// - team2
// - t1score
// - t2score
// - winner
// + playSingleRound(Player player1, Player player2) <--- TO DO!!!
// + Constructor  <--- TO DO!!!
// + play()  <--- TO DO!!!
// + toString()  <--- TO DO!!!

class Main {

  public static void main(String[] args) {
    Team[] teams = { new Team(), new Team(), new Team(), new Team() };
    System.out.println(teams[0].toString());

    System.out.println(teams[1].toString());
    Game g1 = new Game(teams[0], teams[1]);
    System.out.println(g1.toString());
    g1.play();

    // Add another game between the other two teams <--- TO DO!!!

  }

}
```

EXAMPLE OUTPUT:
```
🦊 Madndreas Mighty Foxes
🦊 Wins: 0, Losses: 0, Points Scored: 0
🦊 Player: Iula, ID: 10, Favorite Play: s, Skill Level: 6.455363066904333
🦊 Player: Mahel, ID: 11, Favorite Play: s, Skill Level: 5.074522045084514
🦊 Player: Quiier, ID: 12, Favorite Play: s, Skill Level: 3.7378889451236086
🦊 Player: Indy, ID: 13, Favorite Play: p, Skill Level: 3.8239083958223654
🦊 Player: Ina, ID: 14, Favorite Play: p, Skill Level: 8.405772024969252
🐻 NepApple Happy Bears
🐻 Wins: 0, Losses: 0, Points Scored: 0
🐻 Player: Vicob, ID: 15, Favorite Play: s, Skill Level: 4.660557843801345
🐻 Player: Frrry, ID: 16, Favorite Play: s, Skill Level: 0.14771414353256795
🐻 Player: Cally, ID: 17, Favorite Play: r, Skill Level: 0.583125770891495
🐻 Player: Adabeth, ID: 18, Favorite Play: s, Skill Level: 0.6331730838033001
🐻 Player: Strol, ID: 19, Favorite Play: s, Skill Level: 3.9174229316506146
Madndreas Mighty Foxes: 0, NepApple Happy Bears: 0
🦊 Iula plays: s
🐻 Vicob plays: s
🦊 Iula scores the point
Madndreas Mighty Foxes: 1, NepApple Happy Bears: 0
🦊 Mahel plays: p
🐻 Frrry plays: s
🐻 Frrry scores the point
Madndreas Mighty Foxes: 1, NepApple Happy Bears: 1
🦊 Quiier plays: s
🐻 Cally plays: r
🐻 Cally scores the point
Madndreas Mighty Foxes: 1, NepApple Happy Bears: 2
🦊 Indy plays: r
🐻 Adabeth plays: s
🦊 Indy scores the point
Madndreas Mighty Foxes: 2, NepApple Happy Bears: 2
🦊 Ina plays: r
🐻 Strol plays: r
🦊 Ina scores the point
Madndreas Mighty Foxes: 3, NepApple Happy Bears: 2
```