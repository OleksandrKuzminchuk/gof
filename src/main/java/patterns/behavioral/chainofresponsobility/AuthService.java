package patterns.behavioral.chainofresponsobility;

import patterns.behavioral.chainofresponsobility.handlers.Handler;

public class AuthService {
    private final Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }
    public boolean logIn(String userName, String password){
        if (handler.handle(userName, password)){
            System.out.println("Authorization was successfully");
            return true;
        }
        return false;
    }
}
