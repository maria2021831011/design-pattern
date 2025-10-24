package composite;

import java.util.ArrayList;
import java.util.List;

public class folder implements filesystemcomponent{
    List<filesystemcomponent>components=new ArrayList<>();
    String name;
    folder(String name)
    {
        this.name=name;
    }
    void add(filesystemcomponent com)
    {
        components.add(com);
    }
    void remove(filesystemcomponent com){
        components.remove(com);
    }

    @Override
    public void show() {
        System.out.println("folder"+name);
        for(filesystemcomponent com:components){
            com.show();
        }
    }
}
