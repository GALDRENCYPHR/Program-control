
import java.util.Scanner;

class TaxCalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double income;

        double taxA = 0.2d;
        double taxB = 0.3d;
        while (true) {
            System.out.println("Enter your Monthly Income in pounds (or -99 to exit) : ");
            income = input.nextDouble();

            if (income == -99) {
                System.out.println("Tax calculations have now ended.");
                break;

            }

            if (income <= 1500) {
                System.out.println("Your Tax is: " + income * taxA);
            } else if (income > 1500) {
                System.out.println("Your Tax is:" + income * taxB);
            } else {
            }
        }
    }
}
