package patterns.behavioral.chainofresponsobility;

import patterns.behavioral.chainofresponsobility.handlers.*;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        Handler handler = new UserExistsHandler(dataBase);
        handler
                .setNextHandler(new ValidPasswordHandler(dataBase))
                .setNextHandler(new RoleCheckHandler())
                .setNextHandler(new SomeHandler());
        AuthService authService = new AuthService(handler);

        System.out.println("=============================================");
        System.out.println(authService.logIn("username", "password"));
        System.out.println("================================================");
        System.out.println(authService.logIn("user_username", "password"));
        System.out.println("============================================================");
        System.out.println(authService.logIn("user_username", "user_password"));
        System.out.println("===============================================================");
        System.out.println(authService.logIn("admin_username", "admin_password"));
        System.out.println("============================================================");
    }
}
