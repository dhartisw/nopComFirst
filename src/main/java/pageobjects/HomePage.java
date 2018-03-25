package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HomePage implements BasePage {



    /* --------------- Locators  ---------------------- */

 // public String url = "http://demo.nopcommerce.com";

  public By nopCommerceLogo = By.className("header-logo");
  public By computerLogo = By.linkText("Computers");

    public String url = "http://argos.co.uk";

    public By clearancetext  = By.xpath("//a[@style='background-color:#ffd520;']");




   public void getHomePage(String urlString)
   {
       driver.get(urlString);
       driver.manage().window().maximize();
   }
}
