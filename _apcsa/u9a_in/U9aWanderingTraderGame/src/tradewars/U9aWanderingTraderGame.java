package tradewars;

import tradewars.events.*;
import tradewars.exceptions.*;
import java.util.*;

/**
 * Main game class. Holds state for the game.
 * by Rob Hurring
 */
public final class U9aWanderingTraderGame implements TraderConstants {

  static private U9aWanderingTraderGame instance = null;
  // public Product(String name, int lowPrice, int highPrice)
  final static private Product[] products = {
    new Product("Apple", 1, 3)





  };
  // public Location(String name, Product[] products)
  // NOTE: all locations must offer the same array of products
  final static private Location[] locations = {
    new Location("Alex Village", products)





  };
  // public Npc(String name, int maxHealth, int strength, int defense, long lowReward, long highReward)
  final static private Npc[] npcs = {
    new Npc("Zombie", 20, 25, 5, 200, 400)



    

  };
  private Player player;
  private Location location;
  private Trade currentTrade;
  private int day;
  private Event[] gameEvents;
  private ArrayList<Event> events;
  private ArrayList<Message> messages;
  private Fight fight;

  static public U9aWanderingTraderGame getInstance() {
    if (instance == null) {
      instance = new U9aWanderingTraderGame();
    }

    return instance;
  }

  private U9aWanderingTraderGame() {
    events = new ArrayList<Event>();
    messages = new ArrayList<Message>();
    day = 0;

    player = new Player("You");
    location = locations[0];

    setupEvents();
    updatePrices();
  }

  public void checkGameConditions()
          throws GameOverException {
    boolean over = false;

    if (day > DAYS_IN_GAME) {
      throw new GameOverException("Time's up!");
    }

    if (getPlayer().getCash() < 0) {
      throw new GameOverException("You're broke!");
    }

    if (!getPlayer().isAlive()) {
      throw new GameOverException("You're dead!");
    }
  }

  public Trade getCurrentTrade() {
    return currentTrade;
  }

  public void setCurrentTrade(Trade trade) {
    this.currentTrade = trade;
  }

  public int getDay() {
    return day;
  }

  public boolean moveTo(Location location) throws GameOverException {
    boolean moved = false;

    if (this.location != location) {
      events.clear();
      messages.clear();
      this.location = location;
      runGameEvents();
      day++;
      moved = true;
      checkGameConditions();
    }

    return moved;
  }

  public Location[] getLocations() {
    return locations;
  }

  public Npc[] getNpcs() {
    return npcs;
  }

  public Location getLocation() {
    return location;
  }

  public ArrayList<Event> getEvents() {
    return events;
  }

  public Player getPlayer() {
    return player;
  }

  public Product[] getProducts() {
    return products;
  }

  public ArrayList<Message> getMessages() {
    return messages;
  }

  public void addMessage(Message message) {
    messages.add(message);
  }

  public void runGameEvents() {
    updatePrices();
    int r;
    Product product;

    for (Event e : gameEvents) {
      if (e.inEvent()) {
        events.add(e);
      }
    }
  }

  public void updatePrices() {
    Message m;
    for (Product p : products) {
      p.updatePrice();
      if ((m = p.getMessage()) != null) {
        addMessage(m);
      }
    }
  }

  public Fight getFight() {
    return fight;
  }

  public boolean inFight() {
    return (fight != null);
  }

  public void fightOver() {
    fight = null;
  }

  public int daysLeft() {
    return (DAYS_IN_GAME - day);
  }

  public Fight startFight() {
    ArrayList<Npc> available = new ArrayList<Npc>();

    for (Npc n : npcs) {
      if (n.getLevel() <= player.getLevel()) {
        available.add(n);
      }
    }

    int i = (int) (Math.random() * available.size());
    return startFight(available.get(i));
  }

  public Fight startFight(Npc npc) {
    npc.reset();
    this.fight = new Fight(npc);

    return getFight();
  }

  /**
   * setup the events that make the game "fun"
   * these need to be here since we cannot get proper references without
   * initializing first
   */
  private void setupEvents() {
    this.gameEvents = new Event[]{
      new ArmorEvent(this),
      new AutoHealEvent(this),
      new CoatEvent(this),
      new FightEvent(this),
      new FullHealEvent(this),
      new GunEvent(this),
      new LuckyEvent(this),
      new TripEvent(this)
    };
  }
}
