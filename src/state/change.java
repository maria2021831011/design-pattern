package state;

public class change {
    public state s;
    change(){
        s=new red();
    }
    void setS(state s){
this.s=s;
    }
    void pass()
    {
        s.press(this);

    }
}
