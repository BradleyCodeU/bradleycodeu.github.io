# Ch2 Pitchers and Batters
---

Mr. Riley has provided a Pitcher class and a Batter class. Documentation for the classes can be found here: [https://bradleycodeu.github.io/apcsa/u02a_uo/U02aPitchersAndBatters/doc/package-summary.html](https://bradleycodeu.github.io/apcsa/u02a_uo/U02aPitchersAndBatters/doc/package-summary.html)

A Pitcher object MUST be given a name as an argument when it is constructed. Construct a Pitcher object like this...
```
Pitcher myPitcher = new Pitcher("Steve");
```

A Pitcher object can only do one thing, nextPitch(), which returns a String...
```
String message = myPitcher.nextPitch();
```

A Batter object MUST be given a name as an argument when it is constructed. A Batter object can only do one thing, nextSwing(), which returns a String...
```
message = myBatter.nextSwing();
```

STARTER TEMPLATE:
```
class Main {
  public static void main(String[] args) {
    System.out.println("-=-=-=-=-=-=-=-=-PART 1");
    // PART 1: construct two different pitchers, the first pitcher's name MUST start with a vowel and the second's name MUST start with a consonant

    // invoke the nextPitch method on the first pitcher and print what the method returns
    
    // invoke the nextPitch method on the second pitcher and print what the method returns

    System.out.println("-=-=-=-=-=-=-=-=-PART 2");
    // PART 2: construct two different batters, the first batter's name MUST start with a vowel and the second's name MUST start with a consonant

    // invoke the nextSwing method on the first pitcher and print what the method returns

    // invoke the nextSwing method on the second pitcher and print what the method returns

    System.out.println("-=-=-=-=-=-=-=-=-PART 3");
    // PART 3: The nextPitch method isn't random. It's using the player's name to decide if it's a good pitch or a bad pitch. Documentation for the class is here: https://bradleycodeu.github.io/apcsa/ch2usingobjects/PitchersAndBatters/index-all.html  
    // Print your answer to the following question... Which of the following names would make the best pitcher and why? 1) "Tyler" 2) "Louie" 3) "Aaron" 4) "Steven"
    System.out.println("Which of the following names would make the best pitcher and why? 1) \"Tyler\" 2) \"Louie\" 3) \"Aaron\" 4) \"Steven\"");

    System.out.println("-=-=-=-=-=-=-=-=-PART 4");
    // Finally, simulate a series of three pitches and swings between pitcher 1 and batter 1. Don't forget to print each time.
    System.out.println("-=-=-=-=-=-=-=-=-");
    // 1st pitch and 1st swing

    
    System.out.println("-=-=-=-=-=-=-=-=-");
    // 2nd pitch and 2nd swing


    System.out.println("-=-=-=-=-=-=-=-=-");
    // 3rd pitch and 3rd swing


    System.out.println("-=-=-=-=-=-=-=-=-");
  }
}
```