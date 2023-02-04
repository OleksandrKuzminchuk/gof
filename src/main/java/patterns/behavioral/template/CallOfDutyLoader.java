package patterns.behavioral.template;

public class CallOfDutyLoader extends BaseGameLoader {
    @Override
    byte[] loadLocalData() {
        System.out.println("Loading Call of Duty files...");
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating Call of Duty objects...");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading Call of Duty sounds...");
    }

    @Override
    void initializeProfiles() {
        System.out.println("Loading Call of Duty profiles...");
    }
}
