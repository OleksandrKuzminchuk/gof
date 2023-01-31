package patterns.creational.abstractfactory.banking;

import patterns.creational.abstractfactory.DeveloperAbstractFactory;

public class JavaDeveloperBanking implements DeveloperAbstractFactory {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java banking code...");
    }
}
