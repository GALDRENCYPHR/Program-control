import java.util.Scanner;

    class TimeGreeting {
    public static void main(String[] args) {
    // initialize scanner
    Scanner input = new Scanner(System.in);
    //ask for input
    System.out.println("Please input current time in 24 hour format (e.g 1200 or 615)");
    int currentTime = input.nextInt();

    // since the input is to 100s devide by 100 to ge the number of hours very annoying that i uses id totalHours > 1200 and < 1700 before this just makes it smarter
    int totalHours = currentTime/100;

    // else -if to select the hours

    if (totalHours >= 5 && totalHours < 12) {
        System.out.println("Good morning!");
        
    } else if (totalHours >= 12 && totalHours < 17)  {

        System.out.println("Good afternoon!");
        
    } else if (totalHours >= 17 && totalHours < 20)  {

        System.out.println("Good evening!");
        
    } 
    
    else {
        System.out.println("Good night!");
    }
    
    input.close();
}

    // I believe we should just hope no one tries 1280 cos I do not have a converter to hours
}