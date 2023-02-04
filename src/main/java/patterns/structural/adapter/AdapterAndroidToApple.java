package patterns.structural.adapter;

public class AdapterAndroidToApple extends OSAndroid implements AppleTV {
    @Override
    public void choseChanel(Integer chanel) {
        showChanel(chanel);
    }

    @Override
    public void showMenu() {
        showMainMenu();
    }
}
