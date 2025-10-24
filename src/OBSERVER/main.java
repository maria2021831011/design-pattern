package OBSERVER;

public class main {
    public static void main(String[] args) {
        youtubechannel y1=new youtubechannel("new loaded");
        subscriber1 s1=new subscriber1("maria");
        y1.subscribe(s1);
        y1.notifyAllObservers();
    }
}
