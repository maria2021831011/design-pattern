package OBSERVER;

import java.util.ArrayList;
import java.util.List;

public class youtubechannel implements  subject{
    List<observer>subs=new ArrayList<>();
    private String latestVideo;

youtubechannel(String videoTitle) {
        latestVideo = videoTitle;
        notifyAllObservers();
    }
    @Override
    public void subscribe(observer o) {
        subs.add(o);
    }

    @Override
    public void unsubscribe(observer o) {
        subs.remove(o);
    }

    @Override
    public void notifyAllObservers() {
for(observer sub:subs){
sub.update(latestVideo);
}
    }
}
