
import java.util.Scanner;

class ColourCount2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] colours = {"green", "orange", "red", "purple"}; // string of the colour options

        int[] colourCount = new int[4]; // to count occurences of each colour

        System.out.println("Please enter your favourite color from the following options: green, orange, red, purple.");  // ask for input

        for (int i = 0; i < 10; i++) { //collect 10 inputs
            String colour;
            boolean validInput = false; //false boolean

            do {
                System.out.println("User " + (i + 1) + " Enter your colour choice: ");
                colour = input.next().toLowerCase();

                for (int j = 0; j < colours.length; j++) { // check if colour = colours[j]

                    if (colour.equals(colours[j])) {
                        colourCount[j]++;
                        validInput = true;
                        break;
                    }

                }
                if (!validInput) {
                    System.out.println("Invalid input! Please choose from: green, orange, red, or purple.");
                }

            } while (!validInput); // continue looping while validInput is not valid
        }
        input.close();

        System.out.println("\nThis is the number of people that selected each colour: "); // display number for each colour
        for (int i = 0; i < colours.length; i++) {
            System.out.println(colours[i] + ":" + colourCount[i] + " people");
        }

        int maximumCount = 0; // find popular colour
        String mostPopular = "";

        for (int i = 0; i < colours.length; i++) {
            if (colourCount[i] > maximumCount) {
                maximumCount = colourCount[i];
                mostPopular = colours[i];
            } else if (colourCount[i] == maximumCount && maximumCount != 0) {
                mostPopular += "and" + colours[i];
            }
        }

        System.out.println("\n The most popular colour is: " + mostPopular);
    }
}
