package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageObject {
    @FindBy (css=" [title|=Register]")
    private WebElementFacade registerButtonAccountPage;
    @FindBy (css="#firstname")
    private WebElementFacade firstNameRegister;
    @FindBy (css="#lastname")
    private WebElementFacade lastNameRegister;
    @FindBy (css="#email_address")
    private WebElementFacade emailRegister;
    @FindBy (css="#password")
    private WebElementFacade passRegister;
    @FindBy (css="#confirmation")
    private WebElementFacade passConfirmRegister;
    @FindBy (css="#is_subscribed")
    private WebElementFacade subscribedRegister;
    @FindBy (css=".buttons-set span span")
    private WebElementFacade registerButton;
    @FindBy(css=".hello strong")
    private WebElementFacade welcomeMsgRegister;

    public void clickRegisterButtonAccountPage(){clickOn(registerButtonAccountPage);}
    public void setFirstNameRegister(String value){typeInto(firstNameRegister, value);}
    public void setLastNameRegister(String value){typeInto(lastNameRegister, value);}
    public void setEmailRegister(String value){typeInto(emailRegister, value);}
    public void setPassRegister(String value){typeInto(passRegister,value);}
    public void setPassConfirmRegister(String value){typeInto(passConfirmRegister,value);}
    public void clickSubscribedRegister(){clickOn(subscribedRegister);}
    public void clickRegisterButton(){clickOn(registerButton);}
    public void userIsRegistered(String userName){
        welcomeMsgRegister.shouldContainOnlyText("Hello, " + userName + "!");}



}
