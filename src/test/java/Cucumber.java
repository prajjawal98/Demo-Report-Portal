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

    @Given("test2 given")
    public void testGiven1() {
        System.out.println("given pass");
    }

    @Then("test2 then")
    public void testThen2() {
        System.out.println("then pass");
    }
}
