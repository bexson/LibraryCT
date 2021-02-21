package com.libraryAutomation.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/libraryAutomation/step_definitions"
)

public class FailedTestRunner {
/*THIS CLASS WILL ONLY RUN FAILED TESTS
- This helps us to save time on running our tests.
- Instead of running the whole test suite, we have the option to run only failed tests.*/
}
