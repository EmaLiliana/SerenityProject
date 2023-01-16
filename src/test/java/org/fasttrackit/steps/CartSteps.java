package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CartSteps extends ScenarioSteps {
    private HomePage homePage;
    private CartPage cartPage;


    @Step
    public void clickOnSale() {
        cartPage.clickSaleButton();
    }

    @Step
    public void clickOnItem() {
        cartPage.clickSelectItem();
    }

    @Step
    public void clickOnColor() {

        cartPage.clickSelectColor();
    }

    @Step
    public void clickOnSize() {
        cartPage.clickSelectSizeItem();
    }

    @Step
    public void clickOnAddToCart() {
        cartPage.clickAddToCartButton();
    }

    @Step
    public void addItemToCart() {
        homePage.open();
        clickOnSale();
        clickOnItem();
        clickOnColor();
        clickOnSize();
        clickOnAddToCart();
    }
    @Step
    public void clickOnEditCartLinkFromCheckout(){ cartPage.clickEditCartLinkFromCheckout();}
    @Step
    public void clickOnEditCartLinkShoppingCart(){ cartPage.clickEditCartLinkShoppingCart();}
    @Step
    public void typeEditQuantity(String quantity){cartPage.setEditQuantity(quantity);}
    @Step
    public void clickOnUpdateCartButton(){ cartPage.clickUpdateCart();}
    @Step
    public void clickOnRemoveItemFromCart(){cartPage.clickRemoveItemFromCart();}

    @Step
    public void EditAndRemoveItemCart(String quantity){
        clickOnEditCartLinkFromCheckout();
        clickOnEditCartLinkShoppingCart();
        typeEditQuantity(quantity);
        clickOnUpdateCartButton();
        clickOnRemoveItemFromCart();}

    }























