import java.util.Scanner;

class MonthDays{
    public static void main(String[] args) {
        /* for this
         * ask for input
         * ask if it is a leap year (for february)
         * switch and group months by day counts
         * 
         * tell code to output days 
         * 
         * 
         * 
         */
        Scanner input = new Scanner(System.in);

        // Ask for month

        System.out.println("Please enter the month: ");
        String month = input.nextLine().toUpperCase();

        // LEAP YEAR QUESTION FOR FREBRUARY
        System.out.println("Is it a leap year? (Yes/no): ");
        String leapYear = input.nextLine().toUpperCase();

        // number of days
        int days = 0;


        // we start the switch 30 days in september april june and november
        // 31 days = January march may July August October December

        switch (month) {
            case "JANUARY":
            case "MARCH":
            case "MAY":
            case "JULY":
            case "AUGUST":
            case "OCTOBER":
            case "DECEMBER":
            days = 31;
            System.out.println(month.toUpperCase()+ " has " + days + " days");
                break;

            case "APRIL":
            case "JUNE":
            case "SEPTEMBER":
            case "NOVEMBER":
            days = 30;
                System.out.println(month.toUpperCase()+ " has " + days + " days");
                    break;

            case "FEBRUARY":
                if (leapYear.equalsIgnoreCase("yes")) {
                    days = 29;
                } else {
                    days = 28;
                }
                System.out.println("February has " + days + " days");
                    break;     
        
            default:
            System.out.println("Invalid input please input a month of the year");
                break;
        }








    }



}