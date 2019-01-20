package io.cucumber.skeleton;

import cucumber.api.java.en.Given;

public class Stepdefs {
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
    }
    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    Belly belly = new Belly();
        belly.wait(int1);
    throw new cucumber.api.PendingException();
}

    @Then("^my belly should growl$")
    public void my_belly_should_growl() {
        Belly belly = new Belly();
        belly.growl();
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}
}
