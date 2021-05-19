package org.orders.cucumber.Options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/org/orders/features",glue={"org.orders.stepDefinitions"})
public class TestRunner {
}
