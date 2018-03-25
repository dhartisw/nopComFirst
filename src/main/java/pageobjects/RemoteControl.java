package pageobjects;

import org.openqa.selenium.By;

public class RemoteControl implements BasePage {

    public By addtotrolley = By.xpath("//div[@class='xs-8--none']/button");
            //By.className("xs-8--none");

    public By gototrolley = By.linkText("GO TO TROLLEY");
            //By.xpath("//div[@class='xs-row']/")
}
