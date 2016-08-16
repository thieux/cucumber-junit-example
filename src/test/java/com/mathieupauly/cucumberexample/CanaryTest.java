package com.mathieupauly.cucumberexample;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CanaryTest {
    @Test
    public void test() {
        assertThat(1).isEqualTo(1);
    }
}
