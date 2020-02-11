package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EatingStepDefs {
    private int cucumber_count;

    @Given("there are {int} cucumbers")
    public void there_are_cucumbers(int arg0) {
        cucumber_count = arg0;
    }

    @When("I eat {int} cucumbers")
    public void when_i_eat_cucumbers(int arg0) {
        cucumber_count -= arg0;
    }

    @Then("I should have {int} cucumbers")
    public void i_should_have_cucumbers(int arg0) {
        assertEquals(arg0, cucumber_count);
    }
}
