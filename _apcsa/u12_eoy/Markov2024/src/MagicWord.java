import java.util.ArrayList;

public class MagicWord {
   
    private String previousText;
    private ArrayList<String> followers;

    public MagicWord(String _previousText, char following){
        previousText = _previousText;
        followers = new ArrayList<String>();
        followers.add(""+following);
    }

    public void addFollowers(String follower){
        followers.add(follower);
    }

    public String getPreviousText(){
        return previousText;
    }

    public String toString(){
        return previousText + " : " + followers;
    }



}
