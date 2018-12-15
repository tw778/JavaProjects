import java.util.Scanner;

public class TravelPlanner {

    public static void main(String[] args) {
       methodgreeting();
       methodtravelbudg();
       methodtimechange();
       methodsquare();

}
    public static void methodgreeting () {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Travel Planner!");
        System.out.print("What is your name?");
        String name = input.nextLine();

        System.out.print("Nice to meet you" + " " + name + "," + " where are you traveling to?" );
        String dest = input.nextLine();
        System.out.print("Great! " + dest + " " + " sounds like a awesome trip.");

    }
    public static void methodtravelbudg () {
        Scanner input = new Scanner(System.in);
        System.out.print(" How many days will you be in your destination?");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip?");
        double money = input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination?");
        String letters = input.next();
        System.out.print("How many " + letters + " " + "are there in one USD?");
        double conv = input.nextDouble();

        int hours = days * 24;
        int minutes = days * 24 * 60;
        int seconds = days * 24 * 60 * 60;
        double budg = money / days;
        double budg1= budg * 100;
        int budg2 = (int)budg1;
        double budg3 = budg2 / 100.0;
        double converted = money * conv;
        double converted1= converted * 100;
        int converted2 = (int)converted1;
        double converted3 = converted2/ 100.0;
        double convertedd = converted / days;
        double convertedd1= convertedd * 100;
        int convertedd2 = (int)convertedd1;
        double convertedd3 = convertedd2/ 100.0;

        System.out.println("If you are traveling for " + days + " days," + " " + " that is equivalent to " + hours + " hours, " + minutes + " minutes," + " or " + seconds + " seconds." );
        System.out.println("If your budget is " + money + " you can spend " + budg3 + " dollars per day. " + " Your total amount in " + letters + " is " + converted3 + " " + letters + " and you can spend " + convertedd3 + " per day.");

    }
    public static void methodtimechange () {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your house and your travel destination?");
        int timechange = input.nextInt() % 24;
        int midchange = timechange + 0;
        int noonchange = timechange + 12;
        System.out.println("That means that when it midnight at home, it is " + midchange + ":00 and it will be " + noonchange +":00 " + " at noon in your travel destination.");
    }
    public static void methodsquare () {
        Scanner input = new Scanner (System.in);
        System.out.print("What is the square area of your travel destination country?");
        double kmsquare = input.nextDouble();
        double kmsquare1= kmsquare * 100;
        int kmsquare2 = (int)kmsquare1;
        double kmsquare3 = kmsquare2/ 100.0;
        System.out.print("In miles, that is " + kmsquare3 / 2.59+ " miles^2.");
    }
}
