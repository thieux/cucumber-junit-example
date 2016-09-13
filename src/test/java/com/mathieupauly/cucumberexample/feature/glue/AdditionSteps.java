package com.mathieupauly.cucumberexample.feature.glue;

import cucumber.api.java.en.Then;

import static org.assertj.core.api.Assertions.assertThat;

public class AdditionSteps {
    @Then("^(\\d+)\\+(\\d+) should equal (\\d+)$")
    public void should_equal(int a, int b, int expected) throws Throwable {
        int actual = add(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    private int add(int a, int b) {
        return a;
    }
}
