package bridge;

public abstract  class remotecontrol {
    device d;
    remotecontrol(device d){
        this.d=d;
    }
    abstract void presson();
    abstract void pressoff();
}
