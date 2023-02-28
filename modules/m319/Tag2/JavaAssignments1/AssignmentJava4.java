package m319.Tag2.JavaAssignments1;
import java.util.Scanner;

/**
 * AssignmentJava4
 */
public class AssignmentJava4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    // Set up the exchange rates
    double yenRate = 0.0090;
    double chfRate = 1.0080;
    double usdRate = 1.0000;
    double eurRate = 1.1890;
    double gbpRate = 1.3180;

    // Get the amount of money to exchange
    System.out.print("How much money do you want to exchange? ");
    double amount = input.nextDouble();

    // Get the currency to exchange
    System.out.println("What currency do you want to exchange?");
    System.out.println("Yen (y), CHF (c), USD (u), EUR (e), GBP (g)");
    String currency = input.next();

    // Calculate the exchanged amount
    double exchangedAmount = 0.0;
    switch (currency) {
      case "y":
        exchangedAmount = amount * yenRate;
        break;
      case "c":
        exchangedAmount = amount * chfRate;
        break;
      case "u":
        exchangedAmount = amount * usdRate;
        break;
      case "e":
        exchangedAmount = amount * eurRate;
        break;
      case "g":
        exchangedAmount = amount * gbpRate;
        break;
    }

    // Print out the exchanged amount
    System.out.println("You will receive " + exchangedAmount + ".");
    }
}