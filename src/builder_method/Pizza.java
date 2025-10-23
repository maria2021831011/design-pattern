package builder_method;



public class Pizza {
    private int size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;
    private boolean extraSauce;

    // Constructor is package-private (default) — only Builder can access
    Pizza(Builder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
        this.extraSauce = builder.extraSauce;
    }

    @Override
    public String toString() {
        return "Pizza [size=" + size +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", mushrooms=" + mushrooms +
                ", extraSauce=" + extraSauce + "]";
    }
}
