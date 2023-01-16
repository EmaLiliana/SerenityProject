package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.LoginPage;

public class AccountSteps extends ScenarioSteps {
    private LoginPage loginPage;
    private AccountPage accountPage;
    @Step
    public void welcomeText(){
        accountPage.isWelcomeText("Cosmin Fast");
        accountPage.getWelcomeText();
        accountPage.userIsLoggedIn("Cosmin Fast");
    }

}
