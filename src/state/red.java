package state;

public class red implements state{
    @Override
    public void press(change c) {
        System.out.println("red->blue");
        c.setS(new blue());
    }
}
