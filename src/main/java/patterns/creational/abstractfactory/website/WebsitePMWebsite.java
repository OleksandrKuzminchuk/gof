package patterns.creational.abstractfactory.website;

import patterns.creational.abstractfactory.ProjectManager;

public class WebsitePMWebsite implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
