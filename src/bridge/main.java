package bridge;

public class main {
    public static void main(String[] args) {
        remotecontrol r=new basicremotecontrol(new tv());
        r.pressoff();
        r.presson();
    }}
