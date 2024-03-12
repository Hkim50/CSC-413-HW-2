import java.util.*;

public class AccountPriorityQueue {
    private PriorityQueue<Account> priorityQueue;

    public AccountPriorityQueue() {
        priorityQueue = new PriorityQueue<>();
    }

    public void addAccount(Account account) {
        priorityQueue.add(account);
    }

    public Account pollAccount() {
        return priorityQueue.poll();
    }

    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }

    public void printAccounts() {
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
