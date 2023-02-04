package patterns.behavioral.observer;

import static patterns.behavioral.observer.Event.NEW_ITEM;
import static patterns.behavioral.observer.Event.SALE;

public class Store {
    private final Notification notification;

    public Store() {
        this.notification = new NotificationService();

    }
    public void newItemPromotion(){
        notification.notification(NEW_ITEM);
    }
    public void salePromotion(){
        notification.notification(SALE);
    }
    public Notification getNotificationService(){
        return notification;
    }
}
