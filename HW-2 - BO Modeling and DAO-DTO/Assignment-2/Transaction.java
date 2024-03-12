import java.util.Date;

public class Transaction {
    private int transactionId;
    private String type;
    private double amount;
    private Date date;
    private Account account;

    public Transaction(int transactionId, String type, double amount, Date date, Account account) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    // Getters and Setters
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
