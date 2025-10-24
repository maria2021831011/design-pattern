package adapter;

public class adapter implements target{
    private adaptee adapt;
    adapter(adaptee adapt){
        this.adapt=adapt;
    }



    public void showXML() {
        adapt.showJSON();
        System.out.println("<name>Maria</name><age>22</age>");
    }
   // @Override
    //public void draw(int x, int y, int width, int height) {
//adapt.drawRectangle(x, y, x + width, y + height);
    }

