package decorator;

public abstract class decorator implements coffe {
    coffe c;
    decorator(coffe c)
    {
        this.c=c;
    }
}
