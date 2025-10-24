package iterator;

public class main {
    public static void main(String[] args) {
        playlist ply=new playlist();
        ply.add("hi");
        ply.add("jello");
        while (ply.hasnext()){
            System.out.println(ply.next());
        }
    }
}
