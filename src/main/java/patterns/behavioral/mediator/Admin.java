package patterns.behavioral.mediator;

public class Admin extends User{
    public Admin(Chat chat, String nick) {
        super(chat, nick);
    }
    @Override
    public void getMessage(String message) {
        System.out.println("Admin " + getNick() + " is receiving message: " + message);
    }
}
