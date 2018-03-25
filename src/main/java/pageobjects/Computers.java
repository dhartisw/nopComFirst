package pageobjects;

import org.openqa.selenium.By;

public class Computers implements BasePage {

    public By computerText = By.xpath("//h1");
    public By noteBookText = By.linkText("Notebooks");
}
