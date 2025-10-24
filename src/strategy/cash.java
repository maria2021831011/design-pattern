package strategy;

public class cash implements  payment{
    public void method(int amount) {
        System.out.println("cash  "+amount);
    }
}
