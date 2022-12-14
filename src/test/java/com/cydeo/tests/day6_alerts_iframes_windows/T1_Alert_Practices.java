package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alert_test1() throws InterruptedException {
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        informationAlertButton.click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();

        alert.accept();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed(), "Result text is not displayed");

        String expectedText = "You successfully clicked on alert";
        String actualText = resultText.getText();

        Assert.assertEquals(actualText, expectedText,"Actual Text is not as expected");
    }


}
