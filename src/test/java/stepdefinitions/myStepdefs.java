package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Test;

public class myStepdefs {

    @Given("The user is on the login page")
    public void test1(){
        System.out.println("pass1");

    }
    @Then("The user should be redirected to the homepage")
    public void test2 (){
        System.out.println("pass2");

    }

}
