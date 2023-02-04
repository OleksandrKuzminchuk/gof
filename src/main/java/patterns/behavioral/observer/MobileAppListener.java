package patterns.behavioral.observer;

public record MobileAppListener(String userName) implements Listener {
    @Override
    public void update(Event eventType) {
        System.out.println("Sending mobile app notification to " + userName + " concerning " + eventType);
    }
}
