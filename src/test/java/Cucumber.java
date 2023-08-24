import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Cucumber {

    @Given("test1 given")
    public void testGiven() {
        System.out.println("given pass");
    }

    @Then("test1 then")
    public void testThen() {
        System.out.println("then pass");
    }
}
