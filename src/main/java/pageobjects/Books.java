package pageobjects;

import org.openqa.selenium.By;

public class Books implements BasePage {

    public By book = By.xpath("//h1");
    public By firstprizepies = By.linkText("First Prize Pies");
}
