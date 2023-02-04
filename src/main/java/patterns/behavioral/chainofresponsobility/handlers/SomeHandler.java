package patterns.behavioral.chainofresponsobility.handlers;

public class SomeHandler extends Handler {
    @Override
    public boolean handle(String userName, String password) {
        return true;
    }
}
