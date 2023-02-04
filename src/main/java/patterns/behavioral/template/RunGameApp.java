package patterns.behavioral.template;

public class RunGameApp {
    public static void main(String[] args) {
        BaseGameLoader battlefield = new BattlefieldLoader();
        battlefield.load();

        System.out.println("=======================================================");

        BaseGameLoader callOfDuty = new CallOfDutyLoader();
        callOfDuty.load();
    }
}
