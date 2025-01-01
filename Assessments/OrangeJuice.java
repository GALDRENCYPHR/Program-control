
import java.util.Scanner;

class OrangeJuice {

    public static void main(String[] args) {
        /*
         * initialize bottle sizes as an array
         * ask for input and validate that while loop?
         * 
         * we need to divide the total juice by each of the bottle size to find how many bottles are needed for loop?
         * I have to keep the value of how much juice is available
         * 
         * This should work
         */

        Scanner input = new Scanner(System.in);

        int[] bottles = {2000, 1000, 500, 200, 125}; // had to change this to be decending

        //ask for input and make sure its over 125ml and less than 5000ml
        int JuiceVolume;
        while (true) {  // keeps asking till the right one is entered it is very annoying
            System.out.println("How much juice do you want? (In millilitres)");
            JuiceVolume = input.nextInt();
            if (JuiceVolume >= 125 && JuiceVolume <= 5000) {
                break;
            } else {
                System.out.println("Please enter a valid juice volume (from 125 to 5000)");
            }

        }

        // reply camlmy like your code even works 
        System.out.println("You need the following bottles: ");

        int leftOverJuice = JuiceVolume;
        for (int bottle : bottles) { // a for each loop to got through each
            if (leftOverJuice >= bottle) {
                int requiredBottles = leftOverJuice / bottle; // divide to get the count of bottles in the volume the user gave
                System.out.println(requiredBottles + "x" + bottle + "ml (full)");

                leftOverJuice %= bottle; // adding the remaining to the bottle variable so it can be added to the next  go through the loop

            }
        }

        // for if a bit remains
        if (leftOverJuice > 0) {

            System.out.println("1 x 125ml (part filled)");

        }

        System.out.println("Enjoy your Orange Juice");

        input.close();

    }

}

/* right Aafter input
 * for(int i = 0; i < bottles.length; i++){
 * // you have to call bottle count  above to use this  int[] bottleCount = new int[bottles.length];
 * bottleCount[i] = juiceVolume / bottles; //divide to get the bottle count duh?
 * juiceVolume %= bottles[i];
 * }
 * 
 * // show bottle distribution
    System.out.println("You need the following bottles:");
    for (int i = 0; i < bottles.length; i++) {
        if (bottleCounts[i] > 0) { // Only print if there's at least one bottle of that size
            System.out.println(bottleCount[i] + " x " + bottles[i] + " ml" +
            (juiceVolume > 0 && i == bottles.length - 1 ? " (part filled)" : " (full)"));
            }
        }
 * 
 * 
 * 
 */
