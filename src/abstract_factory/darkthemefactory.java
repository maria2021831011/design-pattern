package abstract_factory;

public class darkthemefactory implements abstractfactory {
    @Override
    public button btn() {
        return new darkbtn();
    }

    @Override
    public checkbox check() {
        return new darkcheckbox();

    }
}
