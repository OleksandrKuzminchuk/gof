package patterns.creational.factory;

public class PhpDeveloperFactory implements DeveloperFactory{
	@Override
	public Developer createDeveloper() {
		return new phpDeveloper();
	}

}
