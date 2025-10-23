package builder_method;



public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Builder(12)
                .addCheese()
                .addPepperoni()
                .addExtraSauce()
                .build();

        System.out.println(pizza);
    }
}
