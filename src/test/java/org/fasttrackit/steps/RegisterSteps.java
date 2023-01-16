package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.RegisterPage;

public class RegisterSteps extends ScenarioSteps {
    private HomePage homePage;
    private RegisterPage registerPage;
    @Step
    public void clickOnAccount(){
        homePage.open();
        homePage.clickOnAccountButton();}

    @Step
    public void clickRegisterButtonAccountPage(){registerPage.clickRegisterButtonAccountPage();}
    @Step
    public void typeFirstNameRegister(String firstName){ registerPage.setFirstNameRegister(firstName);}
    @Step
    public void typeLastNameRegister(String lastName){ registerPage.setLastNameRegister(lastName);}
    @Step
    public void typeEmailRegister(String email){ registerPage.setEmailRegister(email);}
    @Step
    public void typePassRegister(String pass){ registerPage.setPassRegister(pass);}
    @Step
    public void typePassConfirmRegister(String passConfirm){ registerPage.setPassConfirmRegister(passConfirm);}
    @Step
    public void clickSubscribedRegister(){registerPage.clickSubscribedRegister();}
    @Step
    public void clickRegisterButton(){registerPage.clickRegisterButton();}

    @Step
    public void userIsRegistered(String userName){
        registerPage.userIsRegistered(userName);

    }








}
