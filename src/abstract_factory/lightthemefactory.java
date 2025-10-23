package abstract_factory;

public class lightthemefactory implements abstractfactory{
    @Override
    public checkbox check() {
        return new lightcheckbox();
    }

    @Override
    public button btn() {
        return new lightbtn();
    }
}
