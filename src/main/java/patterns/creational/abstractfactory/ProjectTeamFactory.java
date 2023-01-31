package patterns.creational.abstractfactory;

public interface ProjectTeamFactory {
    DeveloperAbstractFactory getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
