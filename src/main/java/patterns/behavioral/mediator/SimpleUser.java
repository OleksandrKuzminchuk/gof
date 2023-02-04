package patterns.behavioral.mediator;

public class SimpleUser extends User {
    public SimpleUser(Chat chat, String nick) {
        super(chat, nick);
    }
    @Override
    public void getMessage(String message) {
        System.out.println("Simple user " + getNick() + " is receiving massage: " + message);
    }
}
