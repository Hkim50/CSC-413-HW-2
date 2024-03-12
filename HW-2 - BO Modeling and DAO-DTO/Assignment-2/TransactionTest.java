import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class TransactionTest {

    @Test
    public void testConstructorAndGetters() {
        Customer customer = new Customer(1, "John Doe", "john@example.com", "password123");
        Account account = new Account(101, customer, 5000);
        Transaction transaction = new Transaction(1, "Deposit", 1000, new Date(), account);

        assertEquals(1, transaction.getTransactionId());
        assertEquals("Deposit", transaction.getType());
        assertEquals(1000, transaction.getAmount(), 0);
        assertNotNull(transaction.getDate());
        assertEquals(account, transaction.getAccount());
    }

    @Test
    public void testSetters() {
        Customer customer = new Customer(1, "John Doe", "john@example.com", "password123");
        Account account = new Account(101, customer, 5000);
        Transaction transaction = new Transaction(1, "Deposit", 1000, new Date(), account);

        transaction.setTransactionId(2);
        assertEquals(2, transaction.getTransactionId());

        transaction.setType("Withdrawal");
        assertEquals("Withdrawal", transaction.getType());

        transaction.setAmount(500);
        assertEquals(500, transaction.getAmount(), 0);

        Date newDate = new Date();
        transaction.setDate(newDate);
        assertEquals(newDate, transaction.getDate());

        Customer newCustomer = new Customer(2, "Jane Smith", "jane@example.com", "password456");
        Account newAccount = new Account(102, newCustomer, 6000);
        transaction.setAccount(newAccount);
        assertEquals(newAccount, transaction.getAccount());
    }
}
