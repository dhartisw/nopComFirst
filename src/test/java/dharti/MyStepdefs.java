package dharti;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.*;

public class MyStepdefs implements BasePage {
    HomePage homePage = new HomePage( );
    Utils utils = new Utils( );
    Computers computers = new Computers( );
    Notebooks notebooks = new Notebooks( );
    AppleMacBook appleMacBook = new AppleMacBook( );
    Trolley trolley = new Trolley( );
    Books books = new Books( );
    FirstPrizePie firstPrizePie = new FirstPrizePie( );
    Clearance clearance = new Clearance( );
    TelevisionsAndAccessories televisionsAndAccessories = new TelevisionsAndAccessories( );
    RemoteControl remoteControl = new RemoteControl( );
    Technology technology = new Technology( );
    OriginalTechnology originalTechnology = new OriginalTechnology();


    @When("^user opens '(.*)'$")
    public void userOpensHttpDemoNopcommerceCom(String url) throws Throwable {
        homePage.getHomePage(homePage.url);
    }

    @Then("^user should see nopcommerce logo$")
    public void userShouldSeeNopcommerceLogo() throws Throwable {
        utils.verifyElementIsPresent(homePage.nopCommerceLogo);
    }

    @When("^user goes in 'Computers' page$")
    public void userGoesInComputersPage() throws Throwable {
        utils.cliclAnElement(homePage.computerLogo);
    }

    @Then("^user should see 'Computers'$")
    public void userShouldSeeComputers() throws Throwable {
        utils.askDriverToWait( );
        utils.verifyElementIsPresent(computers.computerText);
    }

    @When("^user goes in 'Notebooks' page$")
    public void userGoesInNotebooksPage() throws Throwable {
        utils.askDriverToWait( );
        utils.cliclAnElement(computers.noteBookText);
    }

    @Then("^user should see 'Notebooks'$")
    public void userShouldSeeNotebooks() throws Throwable {
        utils.verifyElementIsPresent(notebooks.noteBooksLogo);
    }

    @When("^user select 'Apple MacBook Pro (\\d+)-inch'$")
    public void userSelectAppleMacBookProInch(int arg0) throws Throwable {
        utils.askDriverToWait( );
        utils.cliclAnElement(notebooks.appleMacBook);
    }

    @Then("^user should see 'Apple MacBook Pro (\\d+)-inch'$")
    public void userShouldSeeAppleMacBookProInch(int arg0) throws Throwable {
        utils.verifyElementIsPresent(appleMacBook.applemecbooklogo);
    }

    @When("^user click Add to cart$")
    public void userClickAddToCart() throws Throwable {
        utils.cliclAnElement(appleMacBook.addtotrolley);
    }

    @Then("^shopping cart quantity should be '(\\d+)'$")
    public void shoppingCartQuantityShouldBe(int arg0) throws Throwable {
        utils.cliclAnElement(appleMacBook.gototrolley);
    }

    @When("^user select 'Books'$")
    public void userSelectBooks() throws Throwable {
        utils.askDriverToWait( );
        utils.cliclAnElement(trolley.books);

    }


    @Then("^user should see 'Books'$")
    public void userShouldSeeBooks() throws Throwable {
        utils.verifyElementIsPresent(books.book);
    }

    @When("^user select 'First Prize Pies'$")
    public void userSelectFirstPrizePies() throws Throwable {
        utils.cliclAnElement(books.firstprizepies);

    }

    @Then("^user should see 'First Prize Pies'$")
    public void userShouldSeeFirstPrizePies() throws Throwable {
        utils.verifyElementIsPresent(firstPrizePie.addtocart);

    }

    @When("^user select Add to cart$")
    public void userSelectAddToCart() throws Throwable {
        utils.cliclAnElement(firstPrizePie.addtotrolley);
    }

    @Given("^User is on homepage$")
    public void userIsOnHomepage() throws Throwable {
        homePage.getHomePage(homePage.url);
        utils.askDriverToWait( );
    }


    @When("^User click on CLEARANCE$")
    public void userClickOnCLEARANCE() throws Throwable {
        utils.cliclAnElement(homePage.clearancetext);

    }

    @And("^User can see CLEARANCE$")
    public void userCanSeeCLEARANCE() throws Throwable {
        utils.verifyElementIsPresent(clearance.clearancelogo);
    }

    @And("^User click on Technology$")
    public void userClickOnTechnology() throws Throwable {
        utils.askDriverToWait( );
        utils.cliclAnElement(clearance.technologytext);
    }

    @And("^User click on Televisions and accessories$")
    public void userClickOnTelevisionsAndAccessories() throws Throwable {
        utils.cliclAnElement(clearance.televisionandaccessories);
    }

    @And("^User click on Sky Union Jack Remote Control$")
    public void userClickOnSkyUnionJackRemoteControl() throws Throwable {
        utils.askDriverToWait( );
        utils.cliclAnElement(televisionsAndAccessories.remotecontrol);

    }

    @And("^User click on Add To Trolley$")
    public void userClickOnAddToTrolley() throws Throwable {
        utils.askDriverToWait( );
        utils.cliclAnElement(remoteControl.addtotrolley);
    }

    @And("^User click on Go To Trolley$")
    public void userClickOnGoToTrolley() throws Throwable {
        utils.askDriverToWait( );
        utils.cliclAnElement(remoteControl.gototrolley);
    }
    @And("^User click on OriginalTechnology$")
    public void userClickOnOriginalTechnology() throws Throwable {
        utils.cliclAnElement(originalTechnology.technology);
    }

    @And("^User click on Home audio$")
    public void userClickOnHomeAudio() throws Throwable {
        utils.askDriverToWait( );
        utils.cliclAnElement(technology.homeaudiotext);
    }


    @And("^User click on Audio accessories$")
    public void userClickOnAudioAccessories() throws Throwable {

    }
}
