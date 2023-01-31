package patterns.creational.abstractfactory.banking;

import patterns.creational.abstractfactory.DeveloperAbstractFactory;
import patterns.creational.abstractfactory.ProjectManager;
import patterns.creational.abstractfactory.ProjectTeamFactory;
import patterns.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public DeveloperAbstractFactory getDeveloper() {
        return new JavaDeveloperBanking();
    }

    @Override
    public Tester getTester() {
        return new QAAutomateTesterBanking();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
