package state;

public class blue implements state{
    public void press(change c) {
        System.out.println("blue->yellow");
        c.setS(new yellow());
    }
}
