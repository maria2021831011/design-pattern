package adapter;

public class main {
    public static void main(String[] args) {

      adaptee adt=new adaptee();
      target t=new adapter(adt) ;
      t.showXML();
    }
}