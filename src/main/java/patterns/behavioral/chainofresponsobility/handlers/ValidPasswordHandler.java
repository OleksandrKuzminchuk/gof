package patterns.behavioral.chainofresponsobility.handlers;

import patterns.behavioral.chainofresponsobility.DataBase;

public class ValidPasswordHandler extends Handler {
    private final DataBase dataBase;

    public ValidPasswordHandler(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public boolean handle(String userName, String password) {
        if (!dataBase.isValidPassword(userName, password)){
            System.out.println("Wrong password");
            return false;
        }
        return handleNext(userName, password);
    }
}
