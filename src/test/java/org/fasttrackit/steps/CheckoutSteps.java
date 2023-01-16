package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.HomePage;

public class CheckoutSteps extends ScenarioSteps {
    private HomePage homePage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    @Step
    public void addItemToCart(){
        cartPage.clickSaleButton();
        cartPage.clickSelectItem();
        cartPage.clickSelectColor();
        cartPage.clickSelectSizeItem();
        cartPage.clickAddToCartButton();

    }
    @Step
    public void editCart(){
        cartPage.clickEditCartLinkFromCheckout();
        cartPage.clickEditCartLinkShoppingCart();
        cartPage.setEditQuantity("1");
        cartPage.clickUpdateCart();
        cartPage.clickRemoveItemFromCart();
    }


}
