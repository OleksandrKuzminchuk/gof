package patterns.behavioral.visitor;

public class HooliganVisitor implements Visitor {
	@Override
	public void visit(EngineElement engine) {
		System.out.println("Turn on the engine");
	}
	@Override
	public void visit(BodyElement body) {
		System.out.println("Knocked the hull");
	}
	@Override
	public void visit(CarElement car) {
		System.out.println("Smooked inside a car");
	}
	@Override
	public void visit(WheelElement wheel) {
		System.out.println("Kicked " + wheel.name() + " wheel");
	}

}
