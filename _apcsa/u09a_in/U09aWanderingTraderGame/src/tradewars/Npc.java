package tradewars;

/**
 * NPC for fights
 * @author rob
 */
public class Npc implements Fighter {
  private String name;
  private int health;
  private int maxHealth;
  private int strength;
  private int defense;
  private long lowReward;
  private long highReward;
  private int level;

  public Npc(String name, int maxHealth, int strength, int defense, long lowReward, long highReward){
    this(name, maxHealth, strength, defense, lowReward, highReward, 1);
  }
  
  public Npc(String name, int maxHealth, int strength, int defense, long lowReward, long highReward, int level) {
    this.name = name;
    this.maxHealth = maxHealth;
    this.health = maxHealth;
    this.strength = strength;
    this.defense = defense;
    this.lowReward = lowReward;
    this.highReward = highReward;
    this.level = level;
  }

  public boolean isAlive() {
    return (health > 0);
  }

  public String getName() {
    return name;
  }

  public int getHealth() {
    return health;
  }
  
  public int getMaxHealth(){
    return maxHealth;
  }

  public void takeDamage(int damage) {
    health -= damage;
  }

  public int getStrength() {
    return strength;
  }

  public int getDefense() {
    return defense;
  }

  public int getLevel() {
    return level;
  }

  public long getCash() {
    return lowReward + (long)(Math.random() * ((highReward - lowReward) + 1));
  }
  
  @Override
  public String toString(){
    return name;
  }

  public void reset() {
    health = maxHealth;
  }
}
