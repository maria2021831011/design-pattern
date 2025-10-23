package prototype;

public class main {
    public static void main(String[] args){
        doc d1=new doc("prototype.doc",20);
        doc d2=(doc) d1.clone();
        d1.dis();
        d2.setName("hi");
        d2.dis();
    }
}
