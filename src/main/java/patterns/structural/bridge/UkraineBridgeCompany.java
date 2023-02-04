package patterns.structural.bridge;

public class UkraineBridgeCompany implements Company {
    @Override
    public void createBridge(String typeBridge) {
        System.out.println("Ukraine bridge company creates bridge: " + typeBridge);
    }
}
