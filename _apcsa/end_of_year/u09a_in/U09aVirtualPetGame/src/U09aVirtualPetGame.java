import java.util.Scanner;

class U09aVirtualPetGame {

    // createPets: Initialize pets array and fill it with Pet objects
    private static Pet[] createPets() {
        // Declare an array of Pet objects
        // Fill pets array with pet objects
        // You need to implement this part
        return pets;
    }

    // updateScore: Update the score based on the happiness of pets
    private static int updateScore(int score, Pet[] pets) {
        int happyPets = 0;
        for (Pet each : pets) {
            if (each.isHappy()) {
                score += 1;
                happyPets += 1;
            } else {
                score -= 1;
            }
        }
        if (happyPets == pets.length) {
            score += 1;
        }
        return score;
    }

    // validInt: Validate if a string represents a valid integer
    private static boolean validInt(String myString) {
        try {
            Integer.parseInt(myString);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // selectPet: Helper method to select a pet
    private static int selectPet(Scanner input, Pet[] pets) {
        boolean validInput = false;
        int petNumber = -1;
        while (!validInput) {
            System.out.print("Select a pet 0-5: ");
            String myString = input.nextLine();
            if (myString.length() == 0) {
                continue;
            } else {
                if (U09aVirtualPetGame.validInt(myString)) {
                    petNumber = Integer.parseInt(myString);
                    if (petNumber >= 0 && petNumber <= 5) {
                        validInput = true;
                    }
                }
            }
        }
        return petNumber;
    }

    // performAction: Helper method to perform an action on a pet
    private static boolean performAction(Pet[] pets, int petNumber, String action) {
        if (action.length() > 0) {
            for (String each : pets[petNumber].getListOfActions()) {
                if (action.toLowerCase().equals(each.toLowerCase())) {
                    pets[petNumber].doAction(action.toLowerCase());
                    return true;
                }
            }
        } else {
            System.out.println("You didn't type anything.");
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 50;

        // Initialize pets array and fill it with pet objects
        Pet[] pets = U09aVirtualPetGame.createPets();

        System.out.println("\n\n*** Virtual Pet Game ***");
        while (true) {
            System.out.println("= = = = = = = = = = = = = = = = = = = =");
            for (int i = 0; i < pets.length; i++) {
                pets[i].addOneHour();
                System.out.print(i + ": ");
                System.out.println(pets[i].toString() + "\n\n");
            }
            score = U09aVirtualPetGame.updateScore(score, pets);
            System.out.println("Score = " + score);

            if (score >= 100) {
                System.out.println("You Win !!!");
                break;
            }
            if (score <= 0) {
                System.out.println("Game Over");
                break;
            }
            int petNumber = U09aVirtualPetGame.selectPet(input, pets);
            System.out.println(". . . . . . . . . . . .\n");
            System.out.println(pets[petNumber].toString() + "\n");
            System.out.println("Please type one of the following actions:");
            for (String each : pets[petNumber].getListOfActions()) {
                if (each.length() > 0) {
                    System.out.println("  " + each);
                }
            }
            System.out.print("Type an action: ");
            String action = input.nextLine().toLowerCase();
            boolean actionFound = U09aVirtualPetGame.performAction(pets, petNumber, action);
            if (!actionFound) {
                System.out.println("Sorry, I don't know how to " + action);
            }
        }
    }
}
