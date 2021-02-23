package com.libraryAutomation.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features/TablesWithDefaultInfo.feature",
        glue = {"com/libraryAutomation/step_definitions/tables_default_info",
                "com/libraryAutomation/step_definitions/hooks"
        },
        dryRun = false, // if dryRun is true , it will not run your step_definitions
        tags = "@user_story_6"
)

public class TablesDefaultInfoCukesRunner {


}
