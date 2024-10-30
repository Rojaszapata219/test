package com.entrega.co.steps.login;

import com.entrega.co.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep {
    private LoginPage loginPage;

    @Step("Ingresar usuario")
    public void typeUsername(String username) {
        loginPage.getUsernameField().sendKeys(username);
    }

    @Step("Ingresar usuario")
    public void typePassword(String password) {
        loginPage.getPasswordField().sendKeys(password);
    }


    }




