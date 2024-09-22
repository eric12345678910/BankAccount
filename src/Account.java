public class Account {
    // Initialize variables
    final String firstName;
    final String lastName;
    final String accountId;
    private double accountBalance = 0.0;


    public Account(String firstName, String lastName, String accountId, double accountBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountId = accountId;
        this.accountBalance = accountBalance;
    }

    // Create methods to instantiate variables
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAccountId() {
        return accountId; // keeping account number as a string
    }
    public double getAccountBalance() {
        return accountBalance;
    }

    public void accountSummary(){
        System.out.println("/////////////////////////////////////////////////");
        System.out.printf("Account Summary%nName: %s %s%nAccount Number: %s%nAccount Balance: %.2f%n", firstName, lastName, accountId, accountBalance);
        System.out.println("/////////////////////////////////////////////////");
    }


}
