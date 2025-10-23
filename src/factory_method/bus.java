package factory_method;

public class bus implements vehicle{
    @Override
    public void deliver() {
        System.out.println("bus created");
    }
}
