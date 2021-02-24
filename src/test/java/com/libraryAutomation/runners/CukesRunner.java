package com.libraryAutomation.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "com/libraryAutomation/step_definitions",
        dryRun = false, // if dryRun is true , it will not run your step_definitions
        tags = "@categoriesDD"
)

public class CukesRunner {

}
