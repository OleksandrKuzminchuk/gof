package patterns.structural.bridge;

public class USABridgeCompany implements Company {
    @Override
    public void createBridge(String typeBridge) {
        System.out.println("USA bridge company creates bridge: " + typeBridge);
    }
}
