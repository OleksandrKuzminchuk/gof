package patterns.behavioral.visitor;

public record WheelElement(String name) implements Element {
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
