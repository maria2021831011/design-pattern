package bridge;

public class tv implements device{
    @Override
    public void onbtn() {
        System.out.println("tv is on");
    }

    @Override
    public void offbtn() {
        System.out.println("tv is off");
    }
}
