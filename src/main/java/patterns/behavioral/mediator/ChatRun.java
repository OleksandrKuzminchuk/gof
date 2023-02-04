package patterns.behavioral.mediator;

public class ChatRun {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat, "Kostya");
        User user = new SimpleUser(chat, "Sasha");
        User user1 = new SimpleUser(chat, "Kolya");
        User user2 = new SimpleUser(chat, "Kiril");

        chat.setAdmin(admin);
        chat.addUser(user);
        chat.addUser(user1);
        chat.addUser(user2);

        user.sendMessage("Hello! I am User 1");
//        admin.sendMessage("Hello! I am Admin");
    }
}
