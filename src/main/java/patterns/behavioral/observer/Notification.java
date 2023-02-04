package patterns.behavioral.observer;

public interface Notification {
    void subscribe(Event eventType, Listener listener);
    void unsubscribe(Event eventType, Listener listener);
    void notification(Event eventType);
}
