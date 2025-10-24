package proxy;

public class real implements basic {
    private double balance=1000;

    @Override
    public void withdraw(double amount) {
        balance-=amount;
        System.out.println("Withdrawn: $" + amount + ", Remaining: $" + balance);
    }
}
