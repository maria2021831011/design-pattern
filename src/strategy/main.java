package strategy;

public class main {
    public static void main(String[] args) {
        strategy s=new strategy();
s.setP(new cash());
s.display(200);
s.setP(new paypal());
s.display(300);
    }
}
