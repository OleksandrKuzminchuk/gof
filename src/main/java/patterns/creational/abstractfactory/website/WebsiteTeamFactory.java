package patterns.creational.abstractfactory.website;

import patterns.creational.abstractfactory.DeveloperAbstractFactory;
import patterns.creational.abstractfactory.ProjectManager;
import patterns.creational.abstractfactory.ProjectTeamFactory;
import patterns.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public DeveloperAbstractFactory getDeveloper() {
        return new PhpDeveloperWebsite();
    }

    @Override
    public Tester getTester() {
        return new QAManualTesterWebsite();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePMWebsite();
    }
}
