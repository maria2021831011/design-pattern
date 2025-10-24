package decorator;

public class main {
    public static void main(String[] args) {
coffe sim=new basecoffe();
        System.out.println(sim.cost()+"$, "+"name:"+sim.name());
        coffe milk=new milkcoffe(sim);
        System.out.println(milk.cost()+"$, "+"name:"+milk.name());
    coffe suger=new suggercoffe(milk);
        System.out.println(suger.cost()+"$, "+"name:"+suger.name());
    }
}
