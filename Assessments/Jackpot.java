
import java.util.Random;
import java.util.Scanner;

class Jackpot {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int[] userPicks = new int[6]; //An array representing the numbers chosen by the user.
        int[] lotteryPicks = new int[6]; // array representing the randomly drawn lottery numbers.

        // my UI 
        System.out.println("                This is Jackpot!                ");
        System.out.println("------------------------------------------------");
        System.out.println("       Please enter  6 numbers from 1 to 45     ");
        System.out.println("------------------------------------------------");
        System.out.println("                     Good Luck                  ");

        for (int i = 0; i < 6; i++) { // ask user for number
            boolean valid = false;
            while (!valid) {
                System.out.println("Enter number " + (i + 1) + ": ");

                if (!input.hasNextInt()) { // this is to bounce non - numeric number
                    System.out.println("Invalid input. Please enter a number.");
                    input.next();
                    continue;
                }

                int choice = input.nextInt();

                if (choice < 1 || choice > 45) { // for invalid input
                    System.out.println("Invalid number. Please enter a number between 1 and 45");
                } else if (isInArray(userPicks, choice)) { // this one is for same input 
                    System.out.println(" Number already chosen, Please choose a different number");
                } else {
                    userPicks[i] = choice;
                    valid = true;

                }
            }
        }

        for (int i = 0; i < 6; i++) { // This will generate random numbers 6 times 
            int choice;

            do {
                choice = 1 + random.nextInt(45);
            } while (isInArray(lotteryPicks, choice));
            lotteryPicks[i] = choice; // assigns random number to  a specific position in the  array

        }

        System.out.println("Your number picks are: "); // This shows the lottery numbers
        for (int choice : lotteryPicks) {
            System.out.println("number " + choice); // changed this, it was lotterypicks before

        }
        System.out.println(""); //moves the cursor below

        int matched = countMatched(userPicks, lotteryPicks); // now we try to find out if there are matches
        System.out.println("You matched " + matched + " numbers.");

        switch (matched) {  // we will use a stwich case thingy to award the matches the  default will be try again or something
            case 2:
                System.out.println("Congratulations! You won £10!");
                break;
            case 3:
                System.out.println("Congratulations! You won £250!");
                break;
            case 4:
                System.out.println("Congratulations! You won £45,000!");
                break;
            case 5:
                System.out.println("Congratulations! You won £220,000!");
                break;
            case 6:
                System.out.println("JACKPOT! You won £6,400,000!");
                break;
            default:
                System.out.println("Aww Try again");
                ;
        }

    }

    private static boolean isInArray(int[] picks, int choice) { // the private zones it off [these have default values of 0 and is interfering with isInArrray]
        for (int pick : picks) { // adding pick here and picks (userpicks doent work it is a diff one) since by now user would not have inputed a pick
            if (pick == choice) {
                return true;
            }

        }
        return false;
    }

    private static int countMatched(int[] userPicks, int[] lotteryPicks) { // the private zones it off
        int count = 0;
        for (int userPicked : userPicks) {
            for (int lotteryPicked : lotteryPicks) {
                if (userPicked == lotteryPicked) { // i was comparing the whole array instead of the individual elements (userPicks == lotteryPicks)
                    count++;
                    break;
                }

            }

        }

        return count;

    }

}
