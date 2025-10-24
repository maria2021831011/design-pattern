package OBSERVER;

public class subscriber1  implements observer{
    String name;
    subscriber1(String name)
    {
        this.name=name;
    }
    @Override
    public void update(String videoTitle) {
        System.out.println(name+"  here your notify"+videoTitle);
    }
}
