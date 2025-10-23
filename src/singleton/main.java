package singleton;

public class main {
    public static void main(String[] args) {
        logger log1=logger.getInstance();
        logger log2=logger.getInstance();
        log1.play("jii");
        System.out.println(log1==log2);
    }
}
