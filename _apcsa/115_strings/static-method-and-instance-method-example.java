// Write code for the static gimmeFirstName method.
// Takes 1 String argument and returns a String that contains everything 
// before the first space.
// PRECONDITION: Assume there will always be 1 " " space in the middle
// For example, if I provide the argument gimmeFirstName("Apple Banana") 
// then it would return "Apple". 
// Copy/paste the starter code below.

public class Test1
{
    // write the static gimmeFirstName method here
    public static String gimmeFirstName(String arg){
        int spaceIndex = arg.indexOf(" ");
        return arg.substring(0, spaceIndex);
    }


    public static void main(String[] args)
    {
        String name1 = gimmeFirstName("Alexis Kim");
        System.out.println(name1); // expected "Alexis"
        String name2 = gimmeFirstName("Ishaan Patel");
        System.out.println(name2); // expected "Ishaan"
    }
}


// Write code for the getFullName method.
// For example, if Student a = new Student("a","b") then a.getFullName() would return "a b"
// then it would return "Apple". 
// Copy/paste the starter code below.

public class Student
{
    private String firstName;
    private String lastName;

    public Student(String _firstName, String _lastName){
       this.firstName = _firstName;
       this.lastName = _lastName;
    }

    // create the getFullName method here
    public String getFullName(){
        if(firstName.length() == 0){
            return 
        }
        return firstName + " " + lastName;
    }
}