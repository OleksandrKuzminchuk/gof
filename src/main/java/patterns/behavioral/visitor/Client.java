package patterns.behavioral.visitor;

public class Client {
	public static void main(String[] args) {
		Element car = new CarElement();
		car.accept(new HooliganVisitor());
		System.out.println("\n=======================================\n");
		car.accept(new MechanicVisitor());
	}

}
