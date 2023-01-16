package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageObject {
    @FindBy(css="li.nav-5 a")
    private WebElementFacade saleButton;
    @FindBy(css=".actions a")
    private WebElementFacade selectItem;
    @FindBy(css=".swatch-label img")
    private WebElementFacade selectColor;
    @FindBy(css="#configurable_swatch_size span")
    private WebElementFacade selectSizeItem;
    @FindBy(css=".add-to-cart-buttons span span")
    private WebElementFacade addToCartButton;
    @FindBy(css=".header-minicart .label")
    private WebElementFacade cartIconButton;
    @FindBy(css=".minicart-wrapper ")
    private WebElementFacade miniCartDisplay;
    @FindBy(css = ".f-left a")
    private WebElementFacade editCartLinkFromCheckout;
    @FindBy(css=".product-cart-actions li a")
    private WebElementFacade editCartLinkShoppingCart;
    @FindBy(css="#qty")
    private WebElementFacade editQuantity;
    @FindBy(css=".add-to-cart-buttons span span")
    private WebElementFacade updateCartButton;
    @FindBy(css=".product-cart-remove a")
    private WebElementFacade removeItemFromCart;


    public void clickSaleButton(){
        clickOn(saleButton);
    }
    public void clickSelectItem(){
        clickOn(selectItem);
    }
    public void clickSelectColor(){
        clickOn(selectColor);
    }
    public void clickSelectSizeItem(){
        clickOn(selectSizeItem);
    }
    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }

    public void clickEditCartLinkFromCheckout(){ clickOn(editCartLinkFromCheckout);} //Aici

    public void clickEditCartLinkShoppingCart(){ clickOn(editCartLinkShoppingCart);}
    public void setEditQuantity(String value){typeInto(editQuantity,value);}
    public void clickUpdateCart(){clickOn(updateCartButton);}

    public void clickRemoveItemFromCart(){ clickOn(removeItemFromCart);}
    public void clickMiniCartDisplay(){clickOn(miniCartDisplay);}



   


}
