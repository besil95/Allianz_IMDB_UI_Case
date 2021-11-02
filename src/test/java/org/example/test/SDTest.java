package org.example.test;

import org.example.base.BaseTest;
import org.example.stepDefinitions.StepDefinitions;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class SDTest extends BaseTest {

    StepDefinitions stepDefinitions;

    @Before
    public void before() {
        stepDefinitions = new StepDefinitions(getWebDriver());
    }

    @Test
    public void test() {
        stepDefinitions.menu();
        stepDefinitions.categories();
        stepDefinitions.oscarsGuıde();
        stepDefinitions.honoraryAward();
        stepDefinitions.getInfo();
        stepDefinitions.search();
    }

    @After
    public void after() {
        tearDown();
    }
}
