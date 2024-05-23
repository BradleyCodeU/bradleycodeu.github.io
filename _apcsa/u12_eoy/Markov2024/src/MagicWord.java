import java.util.ArrayList;

public class MagicWord {
   
    private String previousText;
    private ArrayList<Character> followers;

    public MagicWord(String _previousText, char following){
        previousText = _previousText;
        followers = new ArrayList<Character>();
        followers.add(following);
    }

    public void addFollowers(char follower){
        followers.add(follower);
    }

    public char getRandomFollower(){
        return followers.get( (int) (Math.random()*followers.size()) );
    }

    public String getPreviousText(){
        return previousText;
    }

    public String toString(){
        return previousText + " : " + followers +"\n";
    }



}
