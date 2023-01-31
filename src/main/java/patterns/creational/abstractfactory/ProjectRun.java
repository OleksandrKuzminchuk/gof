package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.banking.BankingTeamFactory;
import patterns.creational.abstractfactory.website.WebsiteTeamFactory;

public class ProjectRun {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = createProjectTeamByNameProject(TypeProject.WEBSITE);
        DeveloperAbstractFactory developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }

    static ProjectTeamFactory createProjectTeamByNameProject(TypeProject projectName){
        if (projectName.equals(TypeProject.BANKING)){
            System.out.println("Creating banking project...");
            return new BankingTeamFactory();
        } else if (projectName.equals(TypeProject.WEBSITE)) {
            System.out.println("Creating website project...");
            return new WebsiteTeamFactory();
        }else {
            throw new RuntimeException("Can't create project by name: " + projectName);
        }
    }
}
