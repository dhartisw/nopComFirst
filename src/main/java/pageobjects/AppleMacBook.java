package pageobjects;

import org.openqa.selenium.By;

public class AppleMacBook implements BasePage {

    public By applemecbooklogo = By.xpath("//h1[@itemprop='name']");
    public By addtotrolley = By.id("add-to-cart-button-4");
    public By gototrolley = By.className("cart-label");
}
