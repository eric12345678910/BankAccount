public class Account {
    // Initialize variables
    final String firstName;
    final String lastName;
    final int accountId;
    private double accountBalance = 0.0;


    public Account(String firstName, String lastName, int accountId, double accountBalance) {
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
    public int getAccountId() {
        return accountId;
    }
    public double getAccountBalance() {
        return accountBalance;
    }

    public void accountSummary(){
        System.out.println("/////////////////////////////////////////////////");
        System.out.printf("Account Summary\nName: %s %s\nAccount Number: %s\nAccount Balance: %.2f\n", firstName, lastName, accountId, accountBalance);
        System.out.println("/////////////////////////////////////////////////");
    }

    public String[][] existingAccounts(String text){
        String[][]accountUsers = {
            {"Adam", "Brown", "100200300", "740.65"},
            {"Cassandra", "Davis", "101202303", "1520.76"},
            {"Eric", "Funkle", "111222333","25000.09"}
        };

        return accountUsers;
    };

}
