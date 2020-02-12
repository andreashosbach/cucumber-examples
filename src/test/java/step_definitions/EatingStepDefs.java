package step_definitions;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Before;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EatingStepDefs {
    private TestContext testContext;

    public EatingStepDefs(TestContext testContext){
        this.testContext = testContext;
    }

    @Before
    public void setup(){
       testContext.setCucumberCount(0);
    }

    @Given("there are {int} cucumbers")
    public void there_are_cucumbers(int arg0) {
        testContext.setCucumberCount(arg0);
    }

    @When("I eat {int} cucumbers")
    public void when_i_eat_cucumbers(int arg0) {
        testContext.setCucumberCount(testContext.getCucumberCount() - arg0);
    }

    @Then("I should have {int} cucumbers")
    public void i_should_have_cucumbers(int arg0) {
        assertEquals(arg0, testContext.getCucumberCount());
    }
}
