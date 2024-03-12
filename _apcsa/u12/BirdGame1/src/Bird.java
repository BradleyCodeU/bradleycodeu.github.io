import java.util.ArrayList;

public class Bird {
    private int OhioRank;
    private String CommonName;
    private int OhioOccurrences;
    private String ScientificName;
    private String Order;
    private String Family;
    private String Genus;
    private String Species;
    private int WingspanCentimeters;
    private ArrayList<String> Audio;
    private ArrayList<String> Images;
    private ArrayList<String> Tags;
    
    

    // Getters and setters (you can generate them using your IDE or write them manually)
    public String getCommonName() {
        return this.CommonName;
    }
    public ArrayList<String> getImages(){
        return this.Images;
    }
}
