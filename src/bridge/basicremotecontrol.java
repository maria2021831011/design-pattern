package bridge;

public class basicremotecontrol extends remotecontrol{
    basicremotecontrol(device d){
        super(d);
    }

    @Override
    void presson() {
        d.onbtn();
        System.out.println("basic on");
    }

    @Override
    void pressoff() {
        d.offbtn();
        System.out.println("basic off");
    }
}
