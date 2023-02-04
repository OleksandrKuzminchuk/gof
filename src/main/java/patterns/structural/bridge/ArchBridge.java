package patterns.structural.bridge;

public class ArchBridge extends Bridge {
    public ArchBridge(Company company) {
        super(company);
    }
    @Override
    String showType() {
        return "Arch Bridge";
    }
}
