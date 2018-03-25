
package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;


import java.util.concurrent.TimeUnit;

public class Utils implements BasePage {
    public void cliclAnElement(By by)
    {
        driver.findElement(by).click();
    }
    public void askDriverToWait()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
   public void verifyElementIsPresent(By by)
   {
       Assert.assertTrue(driver.findElement(by).isDisplayed());
   }


}
