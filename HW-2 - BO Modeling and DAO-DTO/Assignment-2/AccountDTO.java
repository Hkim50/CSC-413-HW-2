// DTO for Account
public class AccountDTO {
    private int accountNumber;
    private int customerId;
    private double balance;

    public AccountDTO(int accountNumber, int customerId, double balance) {
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.balance = balance;
    }

    // Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
