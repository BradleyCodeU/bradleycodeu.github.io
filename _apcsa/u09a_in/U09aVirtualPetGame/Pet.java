import java.util.ArrayList;

public abstract class Pet {
    private String name;
    private String picture;
    private ArrayList<String> actions = new ArrayList<String>();
    private int hunger;

    public abstract void addOneHour(); // each child class MUST override this

    public abstract boolean isHappy(); // each child class MUST override this

    public void addAction(String _action) {
        this.actions.add(_action);
    }

    // NOTE: assume that the argument will always be lowercase
    public void doAction(String _action) {
        _action = _action.toLowerCase(); 
        if (_action.equals("feed")){
            // what should happen when player feeds their pet?
            your code goes here // fill in this code yourself. the rest of this class is complete.
        }
    }

    public ArrayList<String> getListOfActions() {
        return this.actions;
    }

    public int getHunger() {
        return this.hunger;
    }

    public String getName() {
        return this.name;
    }

    public String getPicture() {
        return this.picture;
    }

    public void setHunger(int _hunger) {
        this.hunger = _hunger;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public void setPicture(String _picture) {
        this.picture = _picture;
    }

    public String toString() {
        if (this.isHappy()) {
            return this.getName() + "\n" + this.getPicture();
        } else {
            return this.getName() + " is NOT HAPPY\n" + this.getPicture();
        }
    }

}