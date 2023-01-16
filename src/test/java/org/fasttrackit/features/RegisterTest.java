package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.steps.RegisterSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterTest {
    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private RegisterSteps registerSteps;

    @Before
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }
    @Test
    public void doRegister(){
        registerSteps.clickOnAccount();
        registerSteps.clickRegisterButtonAccountPage();
        registerSteps.typeFirstNameRegister("Cosmin");
        registerSteps.typeLastNameRegister("Fasty");
        registerSteps.typeEmailRegister("cosminn@yahoo.com");
        registerSteps.typePassRegister("123456");
        registerSteps.typePassConfirmRegister("123456");
        registerSteps.clickSubscribedRegister();
        registerSteps.clickRegisterButton();
        registerSteps.userIsRegistered("Cosmin Fasty");



    }
}
