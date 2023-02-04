package patterns.structural.bridge;

public class CableStayedBridge extends Bridge {
    public CableStayedBridge(Company company) {
        super(company);
    }

    @Override
    String showType() {
        return "Cable-Stayed Bridge";
    }
}
