package io.github.bradleycodeu;
class Name {
  private static int currentMascotNumber = 0;

  private static final String[] playerNames = { "Amy", "Bob", "Carol", "Dan", "Elizabeth", "Frank", "Greg", "Hannah",
      "Ian", "Jane", "Kate", "Larry", "Mary", "Nancy", "Oscar", "Pat", "Quincy", "Rachel", "Steve", "Tina", "Ursula",
      "Victor", "Wendy", "Xavier", "Yvonne", "Zach", "Adam", "Beth", "Cathy", "David", "Eric", "Fred", "Gina", "Holly",
      "Ivy" };

  private static final String[] adjectives = { "Red", "Blue", "Fightin", "Mighty", "Happy", "Sad", "Angry", "Sick",
      "Hungry", "Thirsty", "Tired", "Fire", "Thunder", "Water", "Earth", "Air", "Ice", "Wind", "Lightning", "Dark",
      "Light", "Mad", "Golden", "Silver", "Bronze", "Diamond", "Ruby", "Sapphire" };
  private static final String[] mascots = {
      "Mice", "Hamsters", "Rabbits", "Foxes", "Bears", "Pandas", "Lions", "Tigers",
      "Koalas", "Polar Bears", "Pandas", "Kangaroos", "Badgers", "Dogs", "Cats"
  };
  private static final String[] emojis = {
      "🐭", "🐹", "🐰", "🦊", "🐻", "🐼", "🦁", "🐯",
      "🐨", "🐻‍❄️", "🐼", "🦘", "🦡", "🐶", "🐱"
  };

  private static final String[] cities = { "Columbus", "Windy City", "Seattle", "Albuquerque", "Moab", "Portland",
      "Constantinople", "Jerusalem", "Nassau", "Atlantis", "Djibouti City", "Wakanda", "Ohio", "North Pole", "Buffalo",
      "Ottawa", "Neptune", "Big Apple", "Sin City", "Big Easy", "Motor City", "Metropolis", "Gotham City", "Metrocity",
      "New Vegas", "San Andreas", "Bikini Bottom", "Nuketown", "Gulag", "Valhalla", "Cloud City", "Emerald City",
      "Springfield", "New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Paris", "London", "Berlin", "Moscow",
      "Madrid", "Rome" };

  public static String randomPlayerName() {
    String str1 = playerNames[(int) (Math.random() * playerNames.length)];
    String str2 = playerNames[(int) (Math.random() * playerNames.length)];
    str1 = str1.substring(0, (str1.length() / 2));
    str2 = str2.substring(str2.length() / 2);
    return str1 + str2;
  }

  public static String randomMascot() {
    currentMascotNumber++;
    String mas = mascots[currentMascotNumber % mascots.length];
    String adj = adjectives[currentMascotNumber % adjectives.length];
    return adj + " " + mas;
  }

  public static String randomEmoji() {
    return emojis[currentMascotNumber % emojis.length];
  }

  public static String randomCityName() {
    String str1 = cities[(int) (Math.random() * cities.length)];
    String str2 = cities[(int) (Math.random() * cities.length)];
    str1 = str1.substring(0, (str1.length() / 2));
    str2 = str2.substring(str2.length() / 2);
    return str1 + str2;
  }

}