package bridge;

public class advanceremotecontrol extends remotecontrol{
    public  advanceremotecontrol(device d){
        super(d);
    }
    @Override
    void pressoff() {
      d.offbtn();
    }

    @Override
    void presson() {
        d.onbtn();
    }
}
