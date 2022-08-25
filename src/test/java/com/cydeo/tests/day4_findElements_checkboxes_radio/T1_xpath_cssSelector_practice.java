package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        //Home link
        //Locate homelink using cssSelector
        WebElement homelink_ex1 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //Locate homelink using cssSelector syntax #2
        WebElement homelink_ex2 = driver.findElement(By.cssSelector("a.nav-link"));

        //Locate homelink using cssSelector, href value
        WebElement homelink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));

        //Forgot password header
        WebElement header_ex1 = driver.findElement(By.cssSelector("div.example > h2"));

        //Locate header using xpath
        //WebElement header_ex2 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        //Locate email input box
        WebElement inputBox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));

        //Locate input box using xpath contains method
        WebElement inputBox_ex2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        //e. “Retrieve password” button
        //button[@type='submit']
        //button[@class='radius']
        WebElement retrievePasswordBtn = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. “Powered by Cydeo text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("homelink_ex1.isDisplayed() = " + homelink_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox_ex1.isDisplayed() = " + inputBox_ex1.isDisplayed());
        System.out.println("retrievePasswordBtn.isDisplayed() = " + retrievePasswordBtn.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());


    }


}
