package gov.russianhackers.bank;
import java.util.concurrent.Semaphore;

public class PerfectRobbery {
    private Semaphore bankAccount = new Semaphore(-42);

    public static void main(String[] args) {
        PerfectRobbery perfectRobbery = new PerfectRobbery();
        perfectRobbery.takeAllMoney();
        perfectRobbery.checkBalance();
    }

    public void takeAllMoney() {
        bankAccount.drainPermits();
    }

    public void checkBalance() {
        System.out.println(bankAccount.availablePermits());
    }
}