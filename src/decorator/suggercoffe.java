package decorator;

public class suggercoffe extends decorator{
    suggercoffe(coffe c){
        super(c);
    }
    public String name() {
        return c.name()+"sugar";
    }

    @Override
    public double cost() {
        return c.cost()+20;
    }
}
