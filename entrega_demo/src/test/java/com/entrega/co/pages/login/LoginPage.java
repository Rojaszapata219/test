package com.entrega.co.pages.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(id = "input-14")
    protected WebElementFacade txt_username;

    @FindBy(id = "input-17")
    protected WebElementFacade txt_password;

    public WebElementFacade getUsernameField() {
        return txt_username;
    }

    public WebElementFacade getPasswordField() {
        return txt_password;
    }
}
