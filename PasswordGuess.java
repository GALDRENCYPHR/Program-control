
import java.util.Scanner;

class PasswordGuess {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        String rightPassword = "Chester001";

        do { // do while so it keeps asking do while does do as long as while is false
            System.out.println("Enter password");
            password = input.nextLine();
            if (!password.equals(rightPassword)) { // basically saying if the input is false print this
                System.out.println("Incorrect password. Please try again. ");

            }

        } while (!password.equals(rightPassword)); // if password is wrong that means while is true so keep looping when password is 
        // right stop and print the below because then the while will be wrong
        System.out.println("Access Granted!");    // this will print when password is actually equal to right password

        input.close();
    }
}
