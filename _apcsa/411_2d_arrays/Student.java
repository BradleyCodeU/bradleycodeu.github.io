public class Student
{
	//fields / instance variables
	private String firstName;
	private String lastName;
	private int gradeLevel;
	private double gradePointAverage;

	// constructor - this class only has one constructor.
	// there can be as many constructors as needed, but each constructor must have a different signature
	// The signature of this constructor is Student(String, String, int, double)
	public Student (String _firstName, String _lastName, int _gradeLevel, double _gradePointAverage)
	{
		firstName = _firstName;
		lastName = _lastName;
		gradeLevel = _gradeLevel;
		gradePointAverage = _gradePointAverage;
	}

	// get methods
	public String getName()
	{
		return firstName + " " + lastName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public int getGradeLevel()
	{
		return gradeLevel;
	}

	public double getGradePointAverage()
	{
		return gradePointAverage;
	}

	// set methods
	public boolean setGradeLevel(int newGradeLevel)
	{
		if (newGradeLevel >= 0 && newGradeLevel <=12)
		{
			gradeLevel = newGradeLevel;
			return true;
		}

		return false;
	}

	//
	public int setGradePointAverage(int newGradePointAverage)
	{
		if (newGradePointAverage >= 0.0 && newGradePointAverage <= 5.0)
		{
			gradePointAverage = newGradePointAverage;
			return 0;
		}
		else if (newGradePointAverage < 0.0)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}

	//toString method
	public String toString()
	{
		if (gradeLevel != 0)
			return firstName + " " + lastName + " is in grade "+ gradeLevel;
		else  //if Kindergarten (grade 0)
			return firstName + " " + lastName + " is in grade "+ gradeLevel;
	}

}