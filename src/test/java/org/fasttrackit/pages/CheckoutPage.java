package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageObject {
    @FindBy(css=".cart-totals button")
    private WebElementFacade checkoutButton;
    @FindBy(css = "#login-email")
    private WebElementFacade returningEmailCheckout;
    @FindBy(css = "#login-password")
    private WebElementFacade returningPassCheckout;
    @FindBy(css =" div .col-2 button")
    private WebElementFacade loginToCheckout;
    @FindBy(css="#billing-buttons-container span span")
    private WebElementFacade billingInfoContinueButton;
    @FindBy (css = "#shipping-method-buttons-container span span")
    private WebElementFacade giftContinueButton;
    @FindBy(css = "#payment-buttons-container .button")
    private WebElementFacade payInfoContinueButton;
    @FindBy(css = "#checkout-review-table-wrapper")
    private WebElementFacade checkoutReviewDisplayed;

    public void clickCheckoutButton(){ clickOn(checkoutButton);}
    public void setReturningEmailCheckout(String value){ typeInto(returningEmailCheckout,value);}
    public void setReturningPassCheckout(String value){ typeInto(returningPassCheckout,value);}
    public void clickLoginToCheckout(){ clickOn(loginToCheckout);}
    public void clickBillingInfoContinueButton(){ clickOn((billingInfoContinueButton));}
    public void clickGiftContinue(){ clickOn(giftContinueButton);}
    public void clickPayInfoContinueButton(){clickOn(payInfoContinueButton);}



}
