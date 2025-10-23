package abstract_factory;

public class main {
    public static void main(String[] args) {
        abstractfactory abs=new darkthemefactory();
        button b=abs.btn();
        checkbox c=abs.check();
        b.display();
        c.display();
    }
}
