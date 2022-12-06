package com.orangehrmlive.demo.testesuite;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials()   {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Dashboard";
        Assert.assertEquals(loginPage.getErrorMessage(),expectedErrorMessage,"Dashbord text is not displayed");
    }
}
