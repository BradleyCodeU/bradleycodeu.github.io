/*
TO DO LIST:
Room (14 tasks)
 - private instance vars for String name, String description, Npc character, Item roomItem, Room north, Room south, Room east, Room west;
 + NoArgsConstructor
 + Room(String _name)
 + Npc getCharacter()
 + Item getItem()
 + Room getLocationTo(String direction)
 + String getName()
 + String getPossibleDirections()
 + void linkRoom(Room r, String direction)
 + void setCharacter(Npc character)
 + void setDescription(String d)
 + void setItem(Item i)
 + void setName(String _name)
 + toString() // returns only the description
*/
public class Room{
    // instance variables go here
    // TODO
  
    public Room(){
        // TODO
    }
  
    public Room(String _name){
        // TODO

    }
  
    public Npc getCharacter(){
      // TODO
      return null;
    }
  
    public Item getItem()
    {
      // TODO
      return null;
    }
  
   // precondition: direction is either "north" or "south" or "east" or "west"
   // if none of those directions, then return the current room
    public Room getLocationTo(String direction)
    {
      // TODO
      // if none of those conditions, then return the current room
      if (direction.equals("north")) {
        return this.north;
    //   } else if (// TODO){
    //     // TODO
    //   } else if (// TODO){
    //     // TODO
    //   } else if(// TODO){
    //     // TODO
      } else{
        return this;
      }
    }
  
    public String getName()
    {
      // TODO
      return null;
    }
  
    public String getPossibleDirections()
    {
      String result = "";
      if (this.north != null){
        result += "North, ";
      }
    //   else if (// TODO){
    //     // TODO
    //   }
    //   else if (// TODO){
    //     // TODO
    //   }
    //   else if (// TODO){
    //     // TODO
    //   }
      return null;
    }
  
    /**
    @param direction - direction should be the lowercase words "north" "south" "east" or "west
    @param r - a room object should be supplied for the variable r
  
    // precondition: direction is either "north" or "south" or "east" or "west" */
   public void linkRoom(Room r, String direction)
    {
      // TODO
      if (direction.equals("north")) {
        this.north = r;
      }
        // else if (// TODO) {
    //     // TODO
    //   } else if (// TODO) {
    //     // TODO
    //   } else if (// TODO) {
    //     // TODO
    //   }
    }
  
  
    /**
    @param a npc object that is then stored into the instance variable character
    // sets the character to a Npc object that is passed into this method
  
   */
    public void setCharacter(Npc _character)
    {
      // TODO
    }
  
    /**
    @param  String that describes a room. example: "dark room that is very small"
  
   */
    public void setDescription(String newDescription)
    {
      // TODO
    }
  
    public void setItem(Item i)
    {
      // TODO
    }
  
    public void setName(String _name)
    {
      // TODO
    }
  
     // returns only the description
    public String toString()
    {
      // TODO
      return null;
    }
  
  }
  
  


