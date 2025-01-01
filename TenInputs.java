
import java.util.Scanner;

public class TenInputs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to hold color options
        String[] colors = {"green", "orange", "red", "purple"};

        // Array to count occurrences of each color
        int[] colorCount = new int[4];

        System.out.println("Please enter your favourite color from the following options: green, orange, red, purple.");

        // Loop to collect inputs from 10 users
        for (int i = 0; i < 10; i++) {
            String color;
            boolean validInput = false;

            // Loop to ensure valid input
            do {
                System.out.print("User " + (i + 1) + ", enter your favorite color: ");
                color = scanner.next().toLowerCase();

                // Check if color is valid and update count
                for (int j = 0; j < colors.length; j++) {
                    if (color.equals(colors[j])) {
                        colorCount[j]++;
                        validInput = true;
                        break;
                    }
                }

                if (!validInput) {
                    System.out.println("Invalid input! Please choose from: green, orange, red, or purple.");
                }
            } while (!validInput);
        }

        scanner.close();

        // Display the count for each color
        System.out.println("\nNumber of people who selected each color:");
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i] + ": " + colorCount[i] + " people");
        }

        // Find the most popular color(s)
        int maxCount = 0;
        String mostPopular = "";

        for (int i = 0; i < colorCount.length; i++) {
            if (colorCount[i] > maxCount) {
                maxCount = colorCount[i];
                mostPopular = colors[i];
            } else if (colorCount[i] == maxCount && maxCount != 0) {
                mostPopular += " and " + colors[i];
            }
        }

        // Output the most popular color(s)
        System.out.println("\nMost popular color(s): " + mostPopular);
    }
}
