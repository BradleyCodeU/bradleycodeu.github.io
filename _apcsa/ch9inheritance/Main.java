import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int score = 50;
    
    // Create a pet array and fill it with pet objects
    ??? // fill in this code yourself. 

    System.out.println( ??? your names go here + "'s Virtual Pet Game"); // add your names. the rest of this class is complete.
    
    while (true)
    {
      System.out.println("= = = = = = = = = = = = = = = = = = = =");

      for(int i = 0; i< pets.length; i++ )
      {
        pets[i].addOneHour();
        System.out.print(i + ": ");
        System.out.println(pets[i].toString() + "\n\n");
        
      }
      score = updateScore(score, pets);
      System.out.println("Score = " + score);
      
      if (score >= 100)
      {
        System.out.println("You Win !!!");
        break;
      }
      if (score <= 0)
      {
        System.out.println("Game Over");
        break;
      }
      boolean validInput = false;
      int petNumber = -1;

      while (!validInput)
      {
        System.out.print("Select a pet 0-5: ");
        String myString = input.nextLine();
        if (myString.length() == 0)
        {
          continue;
        }
        else
        {
          if (validInt(myString))
          {
            petNumber = Integer.parseInt(myString); 
            if (petNumber>=0 && petNumber <=5)
            {
              validInput = true;
            }
          }
        }
        

        
      }
      System.out.println(". . . . . . . . . . . .\n");
      System.out.println(pets[petNumber].toString() + "\n");
      System.out.println("Please type one of the following actions:");
      for (String each: pets[petNumber].getActionsList())
      {
        if (each.length() > 0)
        {
          System.out.println("  " + each);
        }
      }
      String action = "";
      validInput = false;
      boolean actionFound = false;
 
      System.out.print("Type an action: ");
      action = input.nextLine().toLowerCase();
      if (action.length() > 0)
      {
        for (String each: pets[petNumber].getActionsList())
        {
          if (action.toLowerCase().equals(each.toLowerCase()))
          {
            pets[petNumber].doAction(action.toLowerCase());
            actionFound = true;
          }
        }
        if (!actionFound)
        {
          System.out.println("Sorry, I don't know how to " + action);
        }
        
        

      }
      else
      {
        System.out.println("You didn't type anything.");
      }
      
    }

    
  }

  private static int updateScore(int score, Pet[] pets)
  {
    int happyPets = 0;
    for (Pet each: pets)
    {
      if (each.isHappy())
      {
        score+=1;
        happyPets+=1;
      }
      else
      {
        score-=1;
      }
    }

    if (happyPets == pets.length)
    {
      score+=1;
    }
    return score;
  }

  private static boolean validInt(String myString)
  {
    try
    {
      int number = Integer.parseInt(myString);
      return true;
    }
    catch (Exception e)
    {
      return false;
    }
  }
}