package com.cybertek.tests.Day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {
    public static void main(String[] args) {


//    1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//    2- Go to: https://google.com
        driver.get("https://google.com");
//    3- Click to Gmail from top right.
        // Locating webElement then click
        driver.findElement(By.linkText("Gmail")).click();

//    4- Verify title contains:   Expected: Gmail
        String expectedGmailTitle = "Gmail";
        String actualGmailTitle = driver.getTitle();
        if(actualGmailTitle.contains(expectedGmailTitle)){
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
        }

        // COMMAND + D: multiplies the current line
        // control + D: multiplies the current line
        // moving the line up and down: Control + shift + up/down arrow

//     5- Go back to Google by using the .back();
       driver.navigate().back();
//     6- Verify title equals:    //    Expected: Google
        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();
        if(expectedGoogleTitle.contains(actualGoogleTitle)){
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
        }

}
}
