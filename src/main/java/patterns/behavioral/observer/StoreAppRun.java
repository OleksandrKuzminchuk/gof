package patterns.behavioral.observer;

import static patterns.behavioral.observer.Event.NEW_ITEM;
import static patterns.behavioral.observer.Event.SALE;

public class StoreAppRun {
    public static void main(String[] args) {
        Store store = new Store();
        getExamplesSubscribe(store, NEW_ITEM);
        getExamplesSubscribe(store, SALE);

        store.newItemPromotion();
        System.out.println("=================================================");
        store.salePromotion();
        System.out.println("=================================================");
        getExamplesUnsubscribe(store);
        store.salePromotion();
    }

    private static void getExamplesUnsubscribe(Store store) {
        store.getNotificationService().unsubscribe(SALE, new MobileAppListener("alex"));
        store.getNotificationService().unsubscribe(SALE, new EmailMsgListener("peter@gmail.com"));
        store.getNotificationService().unsubscribe(SALE, new EmailMsgListener("alex@gmail.com"));
    }

    private static void getExamplesSubscribe(Store store, Event eventType) {
        store.getNotificationService().subscribe(eventType, new EmailMsgListener("alex@gmail.com"));
        store.getNotificationService().subscribe(eventType, new EmailMsgListener("peter@gmail.com"));
        store.getNotificationService().subscribe(eventType, new EmailMsgListener("anna@gmail.com"));
        store.getNotificationService().subscribe(eventType, new MobileAppListener("alex"));
        store.getNotificationService().subscribe(eventType, new MobileAppListener("peter"));
        store.getNotificationService().subscribe(eventType, new MobileAppListener("anna"));
    }
}
