package com.libraryAutomation.step_definitions;

import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.After;

public class Hooks {

    @After(value = "@US")
    public void tearDownScenario(){
        Driver.closeDriver();
    }
}
