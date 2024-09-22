public class Account {
    // Initialize variables
    private String firstName;
    private String lastName;
    private String accountId;
    private double accountBalance;


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
        return accountId;
    }
    public double getAccountBalance() {
        return accountBalance;
    }


}
