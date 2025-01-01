import java.util.Scanner;

class DrivingLiscense{
    public static void main(String[] args) {
        
        // set up scanner
        Scanner input = new Scanner(System.in);

        // Ask for Age
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("   This program checks if you're eligible  apply for the provisional driving license  ");
        System.out.println("--------------------------------------------------------------------------------------");
        
        
        // ask for age
        System.out.println("Please input your age");
        int age = input.nextInt();
        
        //ask if they have permission
        System.out.println("Do you have permission to live in Great britain  (YES/NO) ");
        String permission = input.next();

        //I want to compine the age and permission
        if (age >= 16 && permission.equalsIgnoreCase("Yes") ) {     //.equalsIgnoreCase helps ignore case difference 
            System.out.println("You are Eligible!");
            
        }
        else {
            System.out.println("Sorry you are not Eligible");
        }
        

    input.close();
    }
}