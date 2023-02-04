package patterns.structural.bridge;

public class BeamBridge extends Bridge {
    public BeamBridge(Company company) {
        super(company);
    }

    @Override
    String showType() {
        return "Beam Bridge";
    }
}
