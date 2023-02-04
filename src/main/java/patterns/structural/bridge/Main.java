package patterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Bridge bridge = new BeamBridge(new UkraineBridgeCompany());
        bridge.showDetails();
    }
}
