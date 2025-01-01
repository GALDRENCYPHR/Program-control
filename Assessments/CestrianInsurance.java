import java.util.Scanner;

class CestrianInsurance{
    public static void main(String[] args) {
        
        /*
         * So these are my thought
         * Declare the car premiume and motorcycle premium since they are standard
         * have a standard premium equate to 0 we add the others as we go
         * get the vehicle type
         * 
         * add vehicletype first  to tot premium
         * add 0.30 if age is > 25
         * add 100 for >6 penalty
         * 
         * so many ifs
         * 
         */

        //initialize scanner

    Scanner input = new Scanner(System.in);


    // The main premiums to note
    int carPremium = 305;
    int motorcyclePremium = 360;
    double totPremium = 0;

    // ask for  vehicle type
    System.out.println("Please input vehilce type (car/ motorcycle): ");
    String vehicleType = input.nextLine().toUpperCase(); // to upper cas is ver obvious  just adding this cos first time 
    
    
    
    // add vehicletype first  to total premium  I moved this up so the program closes if the wrong vehicle is inputted
    if (vehicleType.equals("CAR")) {
        totPremium = carPremium;
    } else if (vehicleType.equals("MOTORCYCLE")){
        totPremium = motorcyclePremium;
    } else {
        System.out.println("invalid vehicle Entered, please go back and input the right vehicle "); // it allows me to bounce bad enteries!!! I want it to exit here if the car type is wrong
        System.exit(0); // to exit the program
         
    }

    // ask for age
    System.out.println("Enter your age please: ");
    int age = input.nextInt();

    // ask for penalty points
    System.out.println("Enter penalty points please: ");
    int penalty = input.nextInt();


     

    

    // add age penalty?
    if (age < 25) {
        totPremium *= 1.30; // apparently you have to do 130% because.... just because wtf too man
    }

    //penalty point check

    if (penalty > 6) {
        totPremium += 100; // note to self when you do *= or += it adds to the variable and holds it one of the assignment operators put your desire befor = and it assigns it
    }

    // Show total premium
    System.out.println("Total premium you have to pay is:" + totPremium);

    }
}
