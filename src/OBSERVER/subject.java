package OBSERVER;

import java.util.Observer;

public interface subject {
    void subscribe(observer o);
    void unsubscribe(observer o);
    void notifyAllObservers();
}
