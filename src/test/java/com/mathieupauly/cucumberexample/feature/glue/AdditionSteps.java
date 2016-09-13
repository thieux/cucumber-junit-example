package com.mathieupauly.cucumberexample.feature.glue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class AdditionSteps {
    @Then("^(\\d+)\\+(\\d+) should equal (\\d+)$")
    public void should_equal(int arg1, int arg2, int arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
