package patterns.behavioral.visitor;

import java.util.Arrays;

public class CarElement implements Element {
	Element [] elements;
	public CarElement() {
		
		this.elements = new Element[] {
			new WheelElement("Front the right"),
			new WheelElement("Front the left"),
			new WheelElement("Rear the right"),
			new WheelElement("Rear the left"),
			new BodyElement(),
			new EngineElement()
		};
	}

	@Override
	public void accept(Visitor visitor) {
		Arrays.stream(elements).forEach(element -> element.accept(visitor));
		visitor.visit(this);
	}

	

}
