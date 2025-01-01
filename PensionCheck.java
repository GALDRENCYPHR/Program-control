import java.util.Scanner;

class PensionCheck{
    public static void main(String[] args) {
        
        // set up scanner
        Scanner input = new Scanner(System.in);

        // Ask for Age
        System.out.println("--------------------------------------------------------");
        System.out.println("   This program checks if you're eligible for  Pension  ");
        System.out.println("                   Please input your age                ");
        System.out.println("--------------------------------------------------------");
                
        int age = input.nextInt();

        if (age >= 66) {
            System.out.println("You are Eligible!");
            
        }
        else {
            System.out.println("Sorry you are not Eligible");
        }

    input.close();
    }
}