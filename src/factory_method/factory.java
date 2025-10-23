package factory_method;

public abstract class factory {
    abstract vehicle v();
    public truck call()
    {
        vehicle vehu=v();
        vehu.deliver();
        return null;
    }

}
