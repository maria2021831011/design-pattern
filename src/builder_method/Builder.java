package builder_method;


public class Builder {
    int size;
    boolean cheese;
    boolean pepperoni;
    boolean mushrooms;
    boolean extraSauce;

    public Builder(int size) {
        this.size = size;
    }

    public Builder addCheese() {
        this.cheese = true;
        return this;
    }

    public Builder addPepperoni() {
        this.pepperoni = true;
        return this;
    }

    public Builder addMushrooms() {
        this.mushrooms = true;
        return this;
    }

    public Builder addExtraSauce() {
        this.extraSauce = true;
        return this;
    }

    public Pizza build() {
        return new Pizza(this);
    }
}
