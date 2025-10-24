package decorator;

public class milkcoffe extends decorator{
   milkcoffe(coffe c)
   {
       super(c);
   }

    @Override
    public String name() {
        return c.name()+"milk";
    }

    @Override
    public double cost() {
        return c.cost()+10;
    }
}
