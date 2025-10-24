package composite;

public class file implements filesystemcomponent{
    private  int size;
    private String name;

    public file(String name, int size) {
        this.name = name;
        this.size = size;
    }
    @Override
    public void show() {
        System.out.println(
                "file"+name+"////,"+size
        );
    }
}
