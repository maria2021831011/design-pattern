package strategy;

public class paypal implements payment{
    @Override
    public void method(int amount) {
        System.out.println("paypal  "+amount);
    }
}
