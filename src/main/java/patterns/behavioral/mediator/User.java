package patterns.behavioral.mediator;

public abstract class User {
    Chat chat;
    String nick;
    boolean isEnable = true;

    protected User(Chat chat, String nick) {
        this.chat = chat;
        this.nick = nick;
    }
    public boolean isEnable(){return isEnable;}
    public void setEnable(boolean isEnable){this.isEnable = isEnable;}
    public String getNick(){return this.nick;}
    public void sendMessage(String message){chat.sendMessage(message, this);}
    abstract void getMessage(String message);

    @Override
    public String toString() {
        return "User{" +
                "nick='" + nick + '\'' +
                '}';
    }
}
