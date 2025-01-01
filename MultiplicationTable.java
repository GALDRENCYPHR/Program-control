
import java.util.Scanner;

class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask for number input 
        System.out.println("Please enter number between 1 and 10");
        int number = input.nextInt();

        // make sure the range is followed
        if (number >= 0 && number <= 10) {

            System.out.println("Multiplication table for " + number + ":");

            // a for loop for the calculation
            for (int i = 1; i <= 12; i++) { //<= "that number" to stop at that number for says start from here to here and this is what to do
                int result = i * number;
                System.out.println(i + "x" + number + " = " + result);

            }

        } else {
            System.out.println("Please input a number from 1 to 10");
        }

        input.close();

    }

}
