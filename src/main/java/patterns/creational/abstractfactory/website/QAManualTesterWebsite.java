package patterns.creational.abstractfactory.website;

import patterns.creational.abstractfactory.Tester;

public class QAManualTesterWebsite implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA manual tester tests website code...");
    }
}
