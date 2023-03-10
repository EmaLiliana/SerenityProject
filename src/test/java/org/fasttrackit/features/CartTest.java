package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.CheckoutSteps;
import org.fasttrackit.steps.LoginSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private CartSteps cartSteps;
    @Steps
    private CheckoutSteps checkoutSteps;

    @Before
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }


    @Test
    public void cartTest(){
        cartSteps.addItemToCart();
    }

    }













