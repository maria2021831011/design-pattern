package factory_method;

public class createbus extends factory{

    @Override
    public vehicle v(){
        return new bus();

    }
}
