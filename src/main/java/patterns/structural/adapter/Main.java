package patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        AppleTV appleTV = new AdapterAndroidToApple();
        appleTV.choseChanel(5);
        appleTV.showMenu();
    }
}
