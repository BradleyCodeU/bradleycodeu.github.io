package tradewars.events;

import tradewars.U09aWanderingTraderGame;
import tradewars.Message;
import tradewars.Player;
import tradewars.TraderConstants;

/**
 * Base event class
 * @author rob
 */
public abstract class Event implements TraderConstants {
  protected U09aWanderingTraderGame game;
  protected Player player;
  protected Message message;
          
  public Event(U09aWanderingTraderGame game){
    this.game = game;
    player = game.getPlayer();
  }
  
  public Message getMessage(){
    return message;
  }

  public boolean hit(int sides){
    int r = (int)(Math.random() * sides) + 1;
    return (r == 1);
  }
  
  public abstract boolean inEvent();
  abstract public Message handleEvent(boolean yes);
  abstract public boolean requiresInput();
}
