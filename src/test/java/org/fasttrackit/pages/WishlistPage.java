package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends PageObject {
    @FindBy(css="li.nav-5 a")
    private WebElementFacade saleButton;
    @FindBy(css=".actions a")
    private WebElementFacade selectItem;
    @FindBy(css = ".link-wishlist")
    private WebElementFacade itemWishlistButton;

    @FindBy(css = ".success-msg span")
    private WebElementFacade successMsgAddedToWishlist;


    public void clickSaleButton(){
        clickOn(saleButton);
    }
    public void clickSelectItem(){clickOn(selectItem);}
    public void clickItemWishlistButton() {clickOn(itemWishlistButton);
    }

}
