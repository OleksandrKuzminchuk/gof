package patterns.behavioral.chainofresponsobility.handlers;

import patterns.behavioral.chainofresponsobility.DataBase;

public class UserExistsHandler extends Handler {
    private final DataBase dataBase;
    public UserExistsHandler(DataBase dataBase){this.dataBase = dataBase;}
    @Override
    public boolean handle(String userName, String password) {
        if (!dataBase.isValidUser(userName)){
            System.out.println("This user name is not registered");
            System.out.println("Sign up to our app now)");
            return false;
        }
        return handleNext(userName, password);
    }
}
