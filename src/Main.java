import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Please enter your account number: ");
        String accountNumber = scanner.nextLine();

        double accountBalance = 0.0;

        // Create new account
        Account account = new Account(firstName, lastName, accountNumber, accountBalance);
        System.out.println("//////////////////////////////////////////");
        System.out.println("User Information: ");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + accountBalance);

    }
}