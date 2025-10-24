package iterator;

import java.util.ArrayList;
import java.util.List;

public class playlist implements iterator{
    List<String>lists=new ArrayList<>();
    int pos=0;
    void add(String li)
    {
        lists.add(li);}


    @Override
    public boolean hasnext() {
        return pos<lists.size();
    }

    @Override
    public String next() {
        return lists.get(pos++);
    }
}
