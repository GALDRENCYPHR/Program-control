import java.util.Scanner;

class BankProgram {

    public static void main(String[] args) {
        
        //set interest rate
        double interestRate = 0.045;

        // setup Scanner
        Scanner input = new Scanner(System.in);

        // set program exit status
        boolean exit = false;

        // MENU and DO-WHILE

        do {
            // the main things in the program
            System.out.println("------------------------");
            System.out.println("    BANK PROGRAM MENU   ");
            System.out.println("------------------------");
            System.out.println("[C] - Calculate Interest ");
            System.out.println("[R] - Check Interest Rate");
            System.out.println("[X] - Exit Program       ");;
            System.out.println("------------------------");

            System.out.println("Choose an option...     ");
            String choice = input.next();

            // CREATE SWITCH with paths
        switch(choice) {

            case "C":
                // do the interest calculations - code here
                 // FOR SECTION
                System.out.println("How many balances to enter?");
                int accounts = input.nextInt();

                double[] balances = new double [accounts];
                // set for loop to go from 0 to number of accounts
                for (int i=0; i < accounts; i++) {

                    // IF-ELSE SECTION
                    System.out.println("Enter account balance ");
                    balances[i] = input.nextDouble();

                    // check to see if balance is more than 4000
                    if(balances[i]>4000) {
                        // do this if over 4000
                        double interest4000 = 4000*interestRate;
                        balances[i] += interest4000;
                    }
                    
                    else if (balances[i]>0 && balances[i]<=4000) {
                        // do this if 4000 or less
                        balances[i] += balances[i]*interestRate;
                    }

                    else {
                        System.out.println("No interest applied");
                    }
                // output updated balance
                System.out.println("Balance with interest is "+balances[i]);
                }
                System.out.println();
                System.out.println();
                break;
            case "R":
                // display interest rate - code here
                System.out.println("Interest rate is currently "+interestRate*100+" \u0025");
                System.out.println();
                System.out.println();
                break;  
            case "X":
                // exit program - code here
                exit = true;
            }
            
        }

        while(exit==false);
       // close the scanner - good for resource efficiency
       input.close();
       System.out.println("PROGRAM ENDS");
    }
}