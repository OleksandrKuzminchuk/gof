package patterns.behavioral.template;

public class BattlefieldLoader extends BaseGameLoader {
    @Override
    byte[] loadLocalData() {
        System.out.println("Loading Battlefield files...");
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating Battlefield objects...");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading Battlefield sounds...");
    }

    @Override
    void initializeProfiles() {
        System.out.println("Loading Battlefield profiles...");
    }
}
