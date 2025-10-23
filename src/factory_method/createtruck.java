package factory_method;

public class createtruck extends factory{
    public vehicle v(){
        return new bus();
    }
}
