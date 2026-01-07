import java.awt.Point;

class BasketballPlayer {
    private String name;
    private String teamName;
    private int jerseyNumber;
    private Point location;

    public BasketballPlayer() {
        this.name = "First name";
        this.teamName = null;
    }

    public BasketballPlayer(String name, String teamName, int jerseyNumber) {
        this.name = name;
        this.teamName = teamName;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public int getJerseyNumber() {
        return this.jerseyNumber;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setTeamName(String newTeamName) {
        this.teamName = newTeamName;
    }

    public void setJerseyNumber(int newJerseyNumber) {
        this.jerseyNumber = newJerseyNumber;
    }

    public Point getLocation() {
        return this.location;
    }

    public void setLocation(Point newLocation) {
        this.location = newLocation;
    }
}
