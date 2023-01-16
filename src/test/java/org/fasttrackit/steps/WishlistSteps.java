package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.WishlistPage;

public class WishlistSteps extends ScenarioSteps {
    private HomePage homePage;
    private LoginSteps loginPage;
    private CartPage cartPage;
    private WishlistPage wishlistPage;


    @Step
    public void clickSaleButton(){ cartPage.clickSaleButton();}
    @Step
    public void clickSelectItem(){ cartPage.clickSelectItem();}
    @Step
    public void clickItemWishlistButton() {wishlistPage.clickItemWishlistButton();}
    @Step
    public void addItemToWishlist(){
        clickSaleButton();
        clickSelectItem();
        clickItemWishlistButton();
    }

}




