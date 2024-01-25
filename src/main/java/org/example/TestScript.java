package org.example;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.List;


import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestScript {

    //AndroidDriver<MobileElement> drivers;


    @Before
    public void setUp() {


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:platformVersion", "13.0");
        capabilities.setCapability("appium:udid", "9A311FFBA00376");
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        // Add more capabilities as needed

        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http://127.0.0.1:4723/wd/hub");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
/*
        AppiumDriver<MobileElement> driver = new AndroidDriver<>(appiumServerURL, capabilities);

*/
        AppiumDriver w = new AndroidDriver(appiumServerURL, capabilities);
        WebDriver driver = new AppiumDriver(appiumServerURL, capabilities);



        WebElement a1 = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
        a1.click();
        WebElement plus = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/op_add"));
        plus.click();
        WebElement a2 = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
        a2.click();
        WebElement aequal = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/eq"));
        aequal.click();


        WebElement resultElement = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
        String resultText = resultElement.getText();
        System.out.println("Calculator Result: " + resultText);
        if (resultText.equals("4")) {
            System.out.println("Test pass: Addition operation is working ");
        } else {
            System.out.println("Test failed: Calculation is wrong");
        }

        WebElement clear1 = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/clr"));
        clear1.click();


        WebElement s1 = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
        s1.click();
        WebElement s2 = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/digit_0"));
        s2.click();
        WebElement minus = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/op_sub"));
        minus.click();
        WebElement s3 = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/digit_1"));
        s3.click();
        WebElement s4 = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/digit_0"));
        s4.click();
        WebElement sequal = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/eq"));
        sequal.click();


        WebElement resultElement2 = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
        String resultText2 = resultElement.getText();
        System.out.println("Calculator Result: " + resultText2);
        if (resultText2.equals("40")) {
            System.out.println("Test pass: Substraction operation is working ");
        } else {
            System.out.println("Test failed: Calculation is wrong");
        }


        WebElement clear2 = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/clr"));
        clear2.click();

        WebElement m1 = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
        m1.click();
        WebElement m2 = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
        m2.click();
        WebElement multi = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/op_mul"));
        multi.click();
        WebElement m3 = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/digit_3"));
        m3.click();
        WebElement mequal = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/eq"));
        mequal.click();


        WebElement resultElement3 = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
        String resultText3 = resultElement.getText();
        System.out.println("Calculator Result: " + resultText3);
        if (resultText3.equals("75")) {
            System.out.println("Test pass: Multiplication operation is working ");
        } else {
            System.out.println("Test failed: Calculation is wrong");
        }

        WebElement clear3 = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/clr"));
        clear3.click();

        WebElement d1 = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/digit_1"));
        d1.click();
        WebElement d2 = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/digit_0"));
        d2.click();
        WebElement d3 = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/digit_0"));
        d3.click();
        WebElement div =(WebElement) driver.findElement(By.id("com.google.android.calculator:id/op_div"));
        div.click();
        WebElement d4 = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/digit_4"));
        d4.click();
        WebElement dequal = (WebElement) driver.findElement(By.id("com.google.android.calculator:id/eq"));
        dequal.click();


        WebElement resultElement4 = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
        String resultText4 = resultElement.getText();
        System.out.println("Calculator Result: " + resultText4);
        if (resultText.equals("25")) {
            System.out.println("Test pass: Division operation is working ");
        } else {
            System.out.println("Test failed: Calculation is wrong");
        }
    }


    @After
    public void tearDown() {
      // driver.quit();
    }
}
