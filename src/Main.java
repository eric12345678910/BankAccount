import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("===========Bank Accounts of the Internet============");

        // User Input - Create Scanner
        Scanner scanner = new Scanner(System.in);

        // Existing or New User
        System.out.println("Do you have an account with us\nPlease respond y/n");
        String response = scanner.nextLine();

        // Existing User
        if(response.equals("y")){
            System.out.println("Sign in now!");
            System.out.println("Please enter your account number:");
            String accountNumber = scanner.nextLine();

        }
        // Not a User - Create New Account
        else if(response.equals("n")){
            System.out.println("Don't have an account? Create one now!");

            System.out.println("Please enter your first name: ");
            String firstName = scanner.nextLine();

            System.out.println("Please enter your last name: ");
            String lastName = scanner.nextLine();
            double accountBalance = 0.0;

            // Create account number
            Random random = new Random();

            int accountNumber = 100000000 + random.nextInt(9000000);
            System.out.println("accountNumber: " + accountNumber);


            Account account1 = new Account(firstName, lastName, accountNumber, accountBalance);
        }

        // Invalid Option - Try Again
        else{
            System.out.println("Error: Please enter a valid option.");
            return;
        }



        // Create new account
        //Account account = new Account(firstName, lastName, accountNumber, accountBalance);

        //account.accountSummary();

        scanner.close();
    }
}