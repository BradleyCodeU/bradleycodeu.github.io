import cs1.Keyboard;

public class StudentTwoDimArray
{
	public static void main(String[] args)
	{
		Student[][] period1 = new Student[3][4];

		period1[0][0] = new Student("Bob", "Miller", 10, 3.5);
		period1[0][2] = new Student("Karen", "Smith", 9, 3.9);
		period1[1][1] = new Student("Tina", "Tangle", 11, 2.3);
		period1[1][3] = new Student("Chris", "Morris", 10, 3.0);
		period1[2][0] = new Student("Emma", "Slimer", 12, 2.3);
		period1[2][2] = new Student("Oliva", "Baker", 11, 2.9);


		//Examples:
		System.out.println("Display first name: " + period1[2][0].getFirstName());
		System.out.println("Display last name: " + period1[2][0].getLastName());
		System.out.println("\nDisplay student using toString method: " + period1[2][0]);

		//**** Fill in code to display grade level and grade point average for the student in location [2][0] (just like the examples above)
		System.out.println("\nDisplay grade level: ");
		System.out.println("\nDisplay grade point average: " );

		System.out.println();

		//Display "Seating Chart" with first names using traditional for loops
		System.out.println("--- Seating chart with first names using traditional for loops ---");

		for (int i  = 0; i < period1.length; i++)
		{
			for (int j  = 0; j < period1[i].length; j++)
			{
				if (period1[i][j] != null)
				{
					System.out.print(period1[i][j].getFirstName() + "\t");
				}
				else
				{
					System.out.print("-----\t");
				}
			}
			System.out.println();
		}
		System.out.println();


		//*** Display "Seating Chart" with last names using traditional for loops
		System.out.println("--- Seating chart with last names using traditional for loops ---");



		System.out.println();

		//Display "Seating Chart" with first names using for-each loops(enhanced for loops)
		System.out.println("--- Seating chart with first names using for-each loops(enhanced for loops) ---");
		System.out.println("Seating chart of first names: ");

		for (Student[] currRow : period1)
		{
			for (Student curr : currRow)
			{
				if (curr != null)
				{
					System.out.print(curr.getFirstName() + "\t");
				}
				else
				{
					System.out.print("-----\t");
				}
			}
			System.out.println();
		}

		System.out.println();

		//*** Display "Seating Chart" with last names using for-each loops(enhanced for loops)
		System.out.println("--- Seating chart with last names using for-each loops(enhanced for loops) ---");



		System.out.println();

		//*** Display all student first names (row major order) using traditional for loop
		/* 	Sample output:
			1. Bob
			2. Karen
			3. Tina
			4. Chris
			5. Emma
			6. Olivia

			There are 6 students
		*/
		System.out.println("List of first names using traditional for loop: ");




		System.out.println();


		//*** Display all student first names (row major order) using a for-each loop
		/* 	Sample output:
			1. Bob
			2. Karen
			3. Tina
			4. Chris
			5. Emma
			6. Olivia

			There are 6 students
		*/
		System.out.println("List of first names using for-each loop: ");




		System.out.println();


		//*** Display the first and last name of students who are in the grade level entered by the user
		System.out.println("\nStudents in a particular grade");

		System.out.print("Enter a grade number ");
		int userGrade = Keyboard.readInt();




		//*** Display first name of students with the minimum grade point average
		System.out.print("Enter a minimum grade point average: ");
		double minGradePoint = Keyboard.readDouble();

		System.out.println("\nDarby students with at least " + minGradePoint + " gpa: ");




	}
}