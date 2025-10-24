package strategy;

public class strategy {
    public payment p;
    void setP(payment p)
    {
        this.p=p;
    }
    void display(int amount){
        p.method(amount);
    }
}
