package decorator;

public class basecoffe implements coffe{


    @Override
    public double cost() {
        return 5;
    }

    @Override
    public String name() {
        return "coffe";
    }
}
