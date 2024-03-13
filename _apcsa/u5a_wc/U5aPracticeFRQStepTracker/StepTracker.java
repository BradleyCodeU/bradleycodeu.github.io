// PART 1 of 4 ---------------------------------------------------------------
// This question involves the implementation of a fitness tracking system that is represented by the **StepTracker** class.

// A StepTracker object is created with a parameter that defines the minimum number of steps that must be taken for a day to be considered active. 

// The StepTracker class provides a constructor and the following methods.

//      - addDailySteps, which accumulates information about steps, in readings taken once per day.

//      - activeDays, which returns the number of active days.

//      - averageSteps, which returns the average number of steps per day, calculated by dividing the total number of steps taken by the number of days tracked.

// Write the first draft of the class StepTracker below with the class name, the instance variables, and the constructor with a parameter for the minimum number of steps threshold for active days. Make sure it compiles. It may help to first identify the variables that are needed for the constructor and the accessor and mutator methods. What are the instance variables (at least 4!) that you need for the StepTracker class? What are the data types for each instance variable?

// Write class name here

// {
//    // write instance variable declarations here


//    // write the constructor with a parameter here


//    public static void main(String[] args)
//    {
//       StepTracker tr = new StepTracker(10000);
//       System.out.println("Expected: it compiles with no syntax errors");
//    }
// }


// PART 2 of 4 ---------------------------------------------------------------

// Write the accessor method activeDays which returns the number of active days.

// // Write the accessor method activeDays() here
// // @return activeDays

// // YOUR CODE GOES HERE

// public static void main(String[] args)
// {
//   StepTracker tr = new StepTracker(10000);
//   System.out.println("Expected: returns 0. No data has been recorded yet.");
//   System.out.println(tr.activeDays()); // returns 0. No data has been recorded yet.
// }



// PART 3 of 4 ---------------------------------------------------------------

// Write the mutator method addDailySteps which takes a parameter and adds it to the appropriate instance variable and changes other instance variables appropriately.

// // Write the mutator method addDailySteps here.
// // @param number of steps taken that day

// // YOUR CODE GOES HERE

// public static void main(String[] args)
// {
//   StepTracker tr = new StepTracker(10000);
//   System.out.println("Expected: returns 0. No data has been recorded yet.");
//   System.out.println(tr.activeDays()); // returns 0. No data has been recorded yet.
//   tr.addDailySteps(9000); // This is too few steps for the day to be considered active.
//   tr.addDailySteps(5000); // This is too few steps for the day to be considered active.
//   System.out.println("Expected: returns 0.  No day had at least 10,000 steps.");
//   System.out.println(tr.activeDays()); // returns 0.  No day had at least 10,000 steps.
//   tr.addDailySteps(13000); // This represents an active day.
//   System.out.println("Expected: returns 1. Of the three days for which step data were entered, one day had at least 10,000 steps.");
//   System.out.println(tr.activeDays());  // returns 1. Of the three days for which step data were entered, one day had at least 10,000 steps.
// }




// PART 4 of 4 ---------------------------------------------------------------

// Write the accessor method averageSteps which returns the average number of steps per day, calculated by dividing the total number of steps taken by the number of days tracked.


// //Write the accessor method averageSteps() here
// // @return average steps calculated by dividing the total number of steps taken by the number of days tracked (which should be instance variables). Make sure you use type casting to double!

// // YOUR CODE GOES HERE

// public static void main(String[] args)
// {
//   StepTracker tr = new StepTracker(10000);
//   System.out.println("Expected: returns 0. No data has been recorded yet.");
//   System.out.println(tr.activeDays()); // returns 0. No data has been recorded yet.
//   System.out.println("Expected: returns 0.0. When no step data have been recorded, the averageSteps method returns 0.0.");
//   System.out.println(tr.averageSteps()); // returns 0.0. When no step data have been recorded, the averageSteps method returns 0.0.
//   tr.addDailySteps(9000); // This is too few steps for the day to be considered active.
//   tr.addDailySteps(5000); // This is too few steps for the day to be considered active.
//   System.out.println("Expected: returns 0.  No day had at least 10,000 steps.");
//   System.out.println(tr.activeDays()); // returns 0.  No day had at least 10,000 steps.
//   System.out.println("Expected: returns 7000.0 The average number of steps per day is (14000 / 2).");
//   System.out.println(tr.averageSteps()); // returns 7000.0 The average number of steps per day is (14000 / 2).
//   tr.addDailySteps(13000); // This represents an active day.
//   System.out.println("Expected: returns 1. Of the three days for which step data were entered, one day had at least 10,000 steps.");
//   System.out.println(tr.activeDays());  // returns 1. Of the three days for which step data were entered, one day had at least 10,000 steps.
//   System.out.println("Expected: returns 9000.0. The average number of steps per day is (27000 / 3).");
//   System.out.println(tr.averageSteps()); // returns 9000.0. The average number of steps per day is (27000 / 3).
//   tr.addDailySteps(23000); // This represents an active day.
//   tr.addDailySteps(1111); // This is too few steps for the day to be considered active.
//   System.out.println("Expected: returns 2. Of the five days for which step data were entered, two days had at least 10,000 steps.");
//   System.out.println(tr.activeDays()); // returns 2. Of the five days for which step data were entered, two days had at least 10,000 steps.
//   System.out.println("Expected: returns 10222.2. The average number of steps per day is (51111 / 5).");
//   System.out.println(tr.averageSteps()); // returns 10222.2. The average number of steps per day is (51111 / 5).
// }






