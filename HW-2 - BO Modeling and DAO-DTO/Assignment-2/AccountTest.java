import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;
import java.util.List;

public class AccountTest {

    @Test
    public void testConstructorAndGetters() {
        Customer customer = new Customer(1, "John Doe", "john@example.com", "password123");
        Account account = new Account(2, customer, 5000);

        assertEquals(2, account.getAccountNumber());
        assertEquals(customer, account.getCustomer());
        assertEquals(5000, account.getBalance(), 0);
        assertNotNull(account.getTransactions());
        assertTrue(account.getTransactions().isEmpty());
    }

    @Test
    public void testSetters() {
        Customer customer = new Customer(1, "John Doe", "john@example.com", "password123");
        Account account = new Account(101, customer, 5000);

        account.setAccountNumber(102);
        assertEquals(102, account.getAccountNumber());

        Customer newCustomer = new Customer(2, "Jane Smith", "jane@example.com", "password456");
        account.setCustomer(newCustomer);
        assertEquals(newCustomer, account.getCustomer());

        account.setBalance(6000);
        assertEquals(6000, account.getBalance(), 0);
    }

    @Test
    public void testAddTransaction() {
        Customer customer = new Customer(1, "John Doe", "john@example.com", "password123");
        Account account = new Account(101, customer, 5000);
        Transaction transaction = new Transaction(1, "Deposit", 1000, new Date(), account);

        account.addTransaction(transaction);
        List<Transaction> transactions = account.getTransactions();
        
        assertFalse(transactions.isEmpty());
        assertEquals(1, transactions.size());
        assertEquals(transaction, transactions.get(0));
    }
}
