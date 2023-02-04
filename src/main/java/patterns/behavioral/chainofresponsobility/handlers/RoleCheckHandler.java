package patterns.behavioral.chainofresponsobility.handlers;

public class RoleCheckHandler extends Handler {
    @Override
    public boolean handle(String userName, String password) {
        if ("admin_username".equalsIgnoreCase(userName)){
            System.out.println("Loading Admin Page...");
            return true;
        }
        System.out.println("Loading Default Page...");
        return handleNext(userName, password);
    }
}
