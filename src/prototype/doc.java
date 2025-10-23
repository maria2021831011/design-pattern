package prototype;

public class doc implements  prototype{
    String name;
    int size;
    public doc(String name,int size){
        this.name=name;
        this.size=size;
    }
    public doc(doc d)
    {
        this.name=d.name;
        this.size=d.size;
    }
    @Override
    public prototype clone() {
        return new doc(this);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void dis(){
        System.out.println(name+ ","+size);
    }
}
