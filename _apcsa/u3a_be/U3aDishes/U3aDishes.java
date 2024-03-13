public class U3aDishes {
  
  // canGoOut method

  // tasksNeeded method
  

    public static void main(String[] args)
    {
        // run some simple tests
        // NOTE: you do NOT need to collect user input
        boolean haveHomework = false;
        boolean didDishes = true;
        int mathProblemsCompleted = 4;
        double pianoMinutes = 10.0;
        System.out.println("\n\nTesting canGoOut");
      
        System.out.println("\n\nEXPECTED canGoOut(false, true, 4, 19.5) -> true");
        System.out.println("ACTUAL " + canGoOut(false, true, 4, 19.5));
        System.out.println("\n\nEXPECTED canGoOut(true, true, 4, 10.5) -> false");
        System.out.println("ACTUAL " + canGoOut(true, true, 4, 10.5));
        System.out.println("\n\nEXPECTED canGoOut(false, false, 2, 0.0) -> false");
        System.out.println("ACTUAL " + canGoOut(false, false, 2, 0.0));
      
        System.out.println("\n\nTesting tasksNeeded\n");
      
        System.out.println("\n\nEXPECTED tasksNeeded(false, true, 5, 19.0) -> \"You can go out\"");
        System.out.println("ACTUAL " + tasksNeeded(false, true, 5, 19.0));
        System.out.println("\n\nEXPECTED tasksNeeded(false, true, 3, 9.5) -> \"You must complete at least 4 math problems. You must practice piano for at least 10 minutes.\"");
        System.out.println("ACTUAL " + tasksNeeded(false, true, 3, 9.5));
      System.out.println("\n\nEXPECTED tasksNeeded(true, false, 0, 13.1) -> \"You must do your homework. You must do the dishes. You must complete at least 4 math problems.\"");
      System.out.println("ACTUAL " + tasksNeeded(true, false, 0, 13.1));
      System.out.println("\n\nEXPECTED tasksNeeded(false, false, 7, 8.5) -> \"You must do the dishes. You must practice piano for at least 10 minutes.\"");
      System.out.println("ACTUAL " + tasksNeeded(false, false, 7, 8.5));
        
    }


}