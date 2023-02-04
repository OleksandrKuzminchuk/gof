package patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat{
    private User admin;
    private List<User> users = new ArrayList<>();

    public void setAdmin(User admin){
        if (admin instanceof Admin){
            this.admin = admin;
        }else {
            throw new RuntimeException("Don't have rights");
        }
    }
    public void addUser(User user){
        if (admin == null){
            throw new RuntimeException("The chat has not had a admin");
        }
        if (user instanceof SimpleUser){
            users.add(user);
        }else {
            throw new RuntimeException("The admin can't enter to another chat");
        }
    }
    @Override
    public void sendMessage(String message, User user) {
       if (user instanceof Admin){
           users.forEach(simpleUser -> simpleUser.getMessage(user.getNick() + ": " + message));
       }
       if (user instanceof SimpleUser){
           users.forEach(simpleUser -> {
               if (simpleUser != user && simpleUser.isEnable()) {
                   simpleUser.getMessage(user.getNick() + ": " + message);
               }
           });
           if (admin.isEnable())
               admin.getMessage(user.getNick() + ": " + message);
       }
    }
}
