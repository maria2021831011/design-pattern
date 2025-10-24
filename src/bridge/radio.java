package bridge;

public class radio implements device{
    @Override
    public void offbtn() {
        System.out.println("radio is off");
    }

    @Override
    public void onbtn() {
        System.out.println("radio is on");
    }
}
