package singleton;

public class logger {
    private static logger instance;

    public static logger getInstance() {
        if (instance == null) {
            instance = new logger();
        }
        return instance;
    }
    public void play(String s)
        {
            System.out.println(s);
        }
}