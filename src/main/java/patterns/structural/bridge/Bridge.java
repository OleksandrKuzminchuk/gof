package patterns.structural.bridge;

public abstract class Bridge {
    Company company;

    protected Bridge(Company company) {
        this.company = company;
    }
    abstract String showType();
    void showDetails(){
        String typeBridge = showType();
        company.createBridge(typeBridge);
    }
}
