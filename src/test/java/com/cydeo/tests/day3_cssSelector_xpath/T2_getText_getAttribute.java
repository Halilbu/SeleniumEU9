package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.*;

public abstract class T2_getText_getAttribute {

    public static void main(String[] args) {


        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();

        if (actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("Label verification Passed");
        } else {
            System.out.println("Label verification Failed");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotPasswordText = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgotText = "Forgot your password?";
        String actualForgotText = forgotPasswordText.getText();

        if (actualForgotText.equals(expectedForgotText)){
            System.out.println("Forgot text verification Passed");
        } else {
            System.out.println("Forgot text verification Failed");
        }


        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualHrefAttributeValue = forgotPasswordText.getAttribute("href");

        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);

        if (actualHrefAttributeValue.contains(expectedInHref)){
            System.out.println("href verification Passed");
        } else {
            System.out.println("href verification Failed");
        }


    }


}
