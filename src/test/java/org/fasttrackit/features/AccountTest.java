package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.AccountSteps;
import org.fasttrackit.steps.LoginSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AccountTest {
    @Managed(uniqueSession = true)
    public WebDriver driver;
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private AccountSteps accountSteps;
    @Before
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }

    @Test
    public void welcomeTextTest(){
        loginSteps.doLogin("cosmin@fasttrackit.org","123456");
        accountSteps.welcomeText();

    }


}
