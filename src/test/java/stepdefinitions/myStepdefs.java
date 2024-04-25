package stepdefinitions;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class myStepdefs {

    @DataProvider(name = "iterations")
    public Object[][] iterations() {
        return new Object[1000][0]; // 100 runs
    }

    @Test(dataProvider = "iterations")
    public void testMethod() {
        voidMethod();
    }

    // Define your void method
    public void voidMethod() {
        // Your implementation goes here
        System.out.println("Void method called");
    }

}
