package patterns.behavioral.observer;

import java.util.*;

public class NotificationService implements Notification {
    private final EnumMap<Event, List<Listener>> customers;

    public NotificationService() {
        this.customers = new EnumMap<>(Event.class);
        Arrays.stream(Event.values()).forEach(event -> customers.put(event, new ArrayList<>()));
    }

    @Override
    public void subscribe(Event eventType, Listener listener) {
        customers.get(eventType).add(listener);
    }

    @Override
    public void unsubscribe(Event eventType, Listener listener) {
        customers.get(eventType).remove(listener);
    }

    @Override
    public void notification(Event eventType) {
        customers.get(eventType).forEach(listener -> listener.update(eventType));
    }
}
