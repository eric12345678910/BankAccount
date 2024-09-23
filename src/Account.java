public class Account {
    // Initialize variables
    final String firstName;
    final String lastName;
    final int accountId;
    private double accountBalance = 0.0;
    final String password;

    String[][] userAccounts = {
            {"Adam", "Brown", "100200300", "740.65", "brown"},
            {"Cassandra", "Davis", "101202303", "1520.76", "davis"},
            {"Eric", "Finkle", "111222333","25000.09", "finkle"}
    };

    public Account(String firstName, String lastName, int accountId, double accountBalance, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountId = accountId;
        this.accountBalance = accountBalance;
        this.password = password;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAccountId() {
        return accountId;
    }
    public double getAccountBalance() {
        return accountBalance;
    }

    public String getPassword() {
        return password;
    }


    public void displayAccountSummary(){
        System.out.println("/////////////////////////////////////////////////");
        System.out.printf("Account Summary\nName: %s %s\nAccount Number: %s\nAccount Balance: %.2f\n", firstName, lastName, accountId, accountBalance);
        System.out.println("/////////////////////////////////////////////////");
    }

}
