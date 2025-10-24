package template;

public abstract class bev { public final void prepareBeverage() {
    boilWater();
    brew();
    pourInCup();
    addExtras();
}

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void brew();
    abstract void addExtras();
}
