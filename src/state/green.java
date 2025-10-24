package state;

public class green implements state{
    public void press(change c) {
        System.out.println("green->red");
        c.setS(new red());
    }
}
