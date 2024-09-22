import java.util.Scanner;

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
        // Not a User
        else if(response.equals("n")){
            System.out.println("Don't have an account? Create one now!");

            System.out.println("Please enter your first name: ");
            String firstName = scanner.nextLine();

            System.out.println("Please enter your last name: ");
            String lastName = scanner.nextLine();

        }
        else{
            System.out.println("Error: Please enter a valid option.");
            return;
        }


        System.out.println("Please enter your 9-digit account number: ");
        String accountNumber = scanner.nextLine();

        double accountBalance = 0.0;

        // Create new account
        Account account = new Account(firstName, lastName, accountNumber, accountBalance);

        account.accountSummary();

        scanner.close();
    }
}