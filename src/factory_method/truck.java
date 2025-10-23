package factory_method;

public class truck implements vehicle{
    @Override
    public void deliver() {
        System.out.println("truck created");
    }
}
