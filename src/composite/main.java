package composite;

public class main {
    public static void main(String[] args) {
        filesystemcomponent f1=new file("f1",10);
        f1.show();
      folder fol1=new folder("folder1----");
        fol1.add(f1);
        fol1.show();
    }
}
