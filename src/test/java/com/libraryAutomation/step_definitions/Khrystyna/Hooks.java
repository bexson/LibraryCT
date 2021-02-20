package com.libraryAutomation.step_definitions.Khrystyna;

import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import org.junit.Before;

public class Hooks {

    //setUp scenario is logIn
    @Before
    public void setUpScenario(){
        String url = ConfigurationReader.getProperty("logIn_Url");
        Driver.getDriver().get(url);

        //passing password/email in the email/password fields

    }

}
