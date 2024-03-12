import java.util.*;
public class Elective {
    private String name;
    private int maxClassSize;
    private int classSize;
    private ArrayList studentList = new ArrayList();

    // constructor not shown
    public Elective(String nm, int max, int currentSize) {
        name = nm;
        maxClassSize = max;
        classSize = currentSize;
    }
    // postcondition: returns the name of this Elective
    public String getName() {
        // code implementation not shown
        return name;
    }

    // postcondition: returns the maximum number of students that 
    //     can be added to this Elective
    public int getMaxClassSize() {
        // code implementation not shown
        return maxClassSize;
    }

    /* postcondition: returns the number of Students that have been added to 
    this Elective; 0<= getClassSize() <= getMaxClassSize()
    */
    public int getClassSize() {
        // code implementatin not shown
        return classSize;
    }
    /* precondition: getClassSize() < getMaxClassSize(); s is not null
       postcondition: s has been added to this Elective; getClassSize() has been 
                      increased by 1
    */
    public void addStudent(Student s){
        // code implementation not shown
        studentList.add(s);
        classSize++;
    }
    public String toString(){
        String output = "";
        output += "\nName: " + name;
        output += "\nMax Size: " + maxClassSize + "   Current Size: " + classSize;
        return output;
    }
}