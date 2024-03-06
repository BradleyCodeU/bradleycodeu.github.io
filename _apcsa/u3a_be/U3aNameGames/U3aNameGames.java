class Main {
  

  // Define a static method named isVowel that requires String parameter singleLetter and returns a boolean
  {
    // create a string named vowels that is "aeiouy"
    // convert singleLetter to lower case
    // if vowels.indexOf(singleLetter) equals -1
    
        // return false
    
    // else
    
        // return true
    
  }
  
  
  // Define a static method named findFirstVowel that requires a String parameter inputWord and returns an int (the index of the first vowel or returns 0 if no vowels)
  {
    //create a counter starts at 0
    
    //while the counter is less than the length of inputWord
    while(???)
    {
        //get a singleLetter using inputWord substring from counter to counter+1

        //if isVowel(singleLetter) equals false
      
      
            //add one to counter so that we check the next letter in the string
      
        //else
      
        
            //return counter we are done! here is the index of the first vowel
      
    } // end of while loop
    //return 0 we didn’t find a vowel
  }


  //  Define a static method called vowelName that takes a string like “Bradley” as argument, calls findFirstVowel, and returns “adley”.
  {
    
  }

  // public static String nameFacts(String firstName) and returns the following facts as one long String: length, longer/shorter than average (6.5), starts with, middle letter, ends with. For example, the name "Steve" would return "Your name is 5 letters long. Your name is shorter than average. Your name starts with a S. The letter e is at the center of your name. Your name ends with a e."

  // public static String spoonerism(String firstName, String lastName)

  // public static String scoobyDoo(String firstName, String lastName)

  // public static String jeringonza(String firstName, String lastName)

  // public static String ubbiDubbi(String firstName, String lastName)
  


  public static void main(String[] args)
  {
    System.out.print("Enter your first name: ");
    System.out.println("Hello ");
   
    
    System.out.println(nameFacts(firstName));
    System.out.print("Enter your last name: ");
    // Display manipulated names
    System.out.println("Spoonerism= " + spoonerism(firstName, lastName));
    System.out.println("Scooby-doo= " + scoobyDoo(firstName, lastName));
    System.out.println("Jeringonza= " + jeringonza(firstName, lastName));
    System.out.println("Ubbi Dubbi= " + ubbiDubbi(firstName, lastName));
  }
  
}