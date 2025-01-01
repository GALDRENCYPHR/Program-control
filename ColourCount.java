
import java.util.Scanner;

class ColourCount {

    public static void main(String[] args) {
        // ask for 10 inputs
        Scanner input = new Scanner(System.in);
        int colour[] = new int[10];
        int counts[] = new int[5];

        int greenColour = 0;
        int orangeColour = 0;
        int redColour = 0;
        int purpleColour = 0;

        System.out.println(" Please input your colour choice ");
        System.out.println("---------------------------------");
        System.out.println("Please pick a number for a colour");
        System.out.println(" Green    Orange   Red    Purple ");
        System.out.println("   1        2       3        4   ");
        System.out.println("---------------------------------");

        for (int i = 0; i < 10; i++) {
            int choice;
            do {
                System.out.print("Enter choice " + (i + 1) + ": ");
                choice = input.nextInt();

                if (choice > 4) {
                    System.out.println("Invalid input! Please enter a number corresponding to the colours.");
                }
            } while (choice > 4);

            colour[i] = choice;
            counts[choice]++;
        }
        input.close();

        counts[1] = greenColour;
        counts[2] = orangeColour;
        counts[3] = redColour;
        counts[4] = purpleColour;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Colour " + i + ": " + counts[i] + " times");
        }

        for (int i = 0; i < 10; i++) {

        }

    }

}
