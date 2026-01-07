import java.util.*;
public class Student {
    private String name;
    private Elective elective;
    private String[] electiveChoice = new String[3];
    public Student(String nm, String choice1, String choice2, String choice3){
        name = nm;
        electiveChoice[0] = choice1;
        electiveChoice[1] = choice2;
        electiveChoice[2] = choice3;
        elective = null;
    }
    // precondition: 0 <= index < 3
    // postcondition: returns the name of the given elective choice
    public String getChoice(int index){
        // code implementation not shown
        return electiveChoice[index];
    }
    // postcondition: returns true if an Elective has been assigned to this Student
    public boolean hasElective() {
        // code implementation not shown
        if(elective != null)
            return true;
        return false;
    }
    // precondition: e is not null
    // postcondition: e has been assigned to this Student; e has not been modified
    public void assignElective(Elective e) {
        // code implementation not shown
        elective = e;
    }
    public String toString() {
        String output = "";
        output += "\nName: " + name;
        output += "\nHas Elective: " + hasElective();
        if(elective != null)
            output += "\nElective: " + elective.getName();
        return output;
    }
}