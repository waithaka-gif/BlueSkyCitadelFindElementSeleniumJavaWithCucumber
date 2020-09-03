package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BlueSkyCitadelForm {
    WebDriver driver;


    @Given("^I navigate to blueskycitadelform site$")
    //@Given("I navigate to blueskycitadelform site")
    public void i_navigate_to_blueskycitadelform_site()  {
        //STEP 2: set your system path
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

        //STEP 3: Instantiate your firefox driver
        driver = new FirefoxDriver();

        //STEP 4: Navigate to url
        driver.get("http://blueskycitadel.com/");

    }

    @When("^I click on Automation Testing Form$")
    public void iClickOnAutomationTestingForm() {
        driver.findElement(By.linkText("Automation Testing Form")).click();

    }

    @And("^I enter the Single Line Text$")
    public void iEnterTheSingleLineText()  {
        driver.findElement(By.xpath("//*[@id=\"nf-field-135\"]")).sendKeys("My first line");

    }

    @And("^I click on the Home link$")
    public void iClickOnTheHomeLink() {
        driver.findElement(By.linkText("Home")).click();
    }

    @And("^I click on the About link$")
    public void iClickOnTheAboutLink() {
        driver.findElement(By.linkText("About")).click();

    }

    @And("^I click on some menu links$")
    public void iClickOnSomeMenuLinks() {
        driver.findElement(By.linkText("Events")).click();
        driver.findElement(By.linkText("Contact")).click();

    }

    @Then("^I close my window$")
    public void iCloseMyWindow() {
        driver.close();
    }

    @And("^I enter email address$")
    public void iEnterEmailAddress() {
        driver.findElement(By.id("nf-field-124")).sendKeys("myblueskyemail@test.com");
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        driver.findElement(By.name("nf-field-144")).sendKeys("MySecureBlueSkyCitadelPassword");
    }

    @And("^I click on the radio button$")
    public void iClickOnTheRadioButton() {
        driver.findElement(By.cssSelector("#nf-label-class-field-138-0")).click();
    }
}
