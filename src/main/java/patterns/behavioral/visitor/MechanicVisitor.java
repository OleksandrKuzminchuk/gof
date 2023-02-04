package patterns.behavioral.visitor;

public class MechanicVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Checked the engine");
    }
    @Override
    public void visit(BodyElement body) {
        System.out.println("Polished the hull");
    }
    @Override
    public void visit(CarElement car) {
        System.out.println("Checked appearance a car");
    }
    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Pumped up " + wheel.name() + " the wheel");
    }
}
