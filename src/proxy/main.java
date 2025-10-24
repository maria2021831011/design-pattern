package proxy;

public class main {
    public static void main(String[] args) {
        basic proxy1=new proxy("admin");
        basic proxy2=new proxy("user");
        proxy1.withdraw(100);
        proxy2.withdraw(200);
    }
}
