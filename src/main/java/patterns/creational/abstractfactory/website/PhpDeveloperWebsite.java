package patterns.creational.abstractfactory.website;

import patterns.creational.abstractfactory.DeveloperAbstractFactory;

public class PhpDeveloperWebsite implements DeveloperAbstractFactory {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php website code...");
    }
}
