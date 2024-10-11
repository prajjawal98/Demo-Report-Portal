import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cucumber {

    @Given("test1 given")
    public void testGiven() {
        System.out.println("given pass");
    }

    @Then("test1 then")
    public void testThen() {
        System.out.println("then pass");
    }

    @Given("test2 given")
    public void testGiven1() {
        System.out.println("given pass");
    }

    @Then("test2 then")
    public void testThen2() {
        System.out.println("then pass");
    }

    private static WebDriver driver;

    @Given("^I navigate to website$")
    public void iNavigateToWebsite() {
        initializeWebDriver();
        driver.get("https://www.flipkart.com");
    }

    @When("Navigate to Other website {string}")
    public void navigateToOtherWebsite(String url) {
        driver.navigate().to(url);
    }

    @Then("Title should be {string} of website")
    public void titleShouldBeOfWebsite(String arg0) {
        String pageTitle = driver.getTitle();
        assert pageTitle != null;
        Assert.assertTrue(pageTitle.contains(arg0));
    }

    private static void initializeWebDriver() {
        WebDriverManager.chromedriver().setup(); // Automatically manage ChromeDriver binaries
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Enable headless mode
        options.addArguments("--disable-gpu"); // Optional: Disables GPU acceleration

        driver = new ChromeDriver(options);
    }


    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
