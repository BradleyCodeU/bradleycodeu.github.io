import java.util.*;

public class School {
    private ArrayList<Student> studentList;
    /* each element is an instance of a Student representing
    one student at the school; students are in the order they 
    should be scheduled */
    private ArrayList<Elective> electiveList;
    /* each element is an instance of an Elective representing one
    elective offered at the school */

    public School(ArrayList<Student> students, ArrayList<Elective> electives) {
        studentList = students;
        electiveList = electives;
    }
    private int getElectiveListSize() {
        return electiveList.size();
    }
    private int getStudentListSize() {
        return studentList.size();
    }
    
    // precondition: name is the name of an Elective in electiveList
    // postcondition: returns the Elective in electiveList with the given name
    public Elective getElectiveByName(String name) {
        // to be implemented in part a)
        return null;
    }
    /* postcondition: All students in studentList have been either assigned their
    first available elective choice or not assigned; All electives in electiveList
    have been updated appropriately as Students are assigned to them */
    public void assignElectivesToStudents() {
        // to be implemented in part b)
    }
    /* postcondition: returns a list of those Students who have not been assigned
    an Elective */
    public ArrayList<Student> studentsWithoutElectives() {
        // to be implemented in part c)
        return null; 
    }
}