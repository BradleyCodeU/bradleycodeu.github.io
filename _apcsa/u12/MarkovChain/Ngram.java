import java.util.ArrayList;

class Ngram implements Comparable<Ngram> {

  private String name;
  private ArrayList<String> followers = new ArrayList<String>();

  public Ngram(String _name){
    name = _name;
  }

  public void add(String _follower){
    followers.add(_follower);
  }

  public String getFollower(){
    return followers.get((int)(Math.random()*followers.size()));
  }
  public String getFollower(int num){
    return followers.get(num);
  }
  public String getName(){
    return name;
  }

  
    public int compareTo(Ngram other) {
        return this.name.compareTo(other.name);
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Ngram other = (Ngram) o;
        return this.name.equals(other.name);
    }

    @Override
    public String toString(){
      return this.name + "->" + this.followers;
    }
  
}