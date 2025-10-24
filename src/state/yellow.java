package state;

public class yellow implements state{
    public void press(change c) {
        System.out.println("yellow->green");
        c.setS(new green());
    }
}
