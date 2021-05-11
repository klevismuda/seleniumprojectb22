package com.cybertek.tests.Day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerification {
    public static void main(String[] args) {
        /**
         * TC #2: Cybertek practice tool verifications
         * 1. Open Chrome browser
         * 2. Go to http://practice.cybertekschool.com
         * 3. Verify URL contains
         *    Expected: cybertekschool
         * 4. Verify title:
         *    Expected: Practice
         */
/*
EXPLAINING HIGH LEVEL WHAT IS GOING ON IN THIS CLASS.
 */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");
        //maximize
        driver.manage().window().maximize();

        // Verify URL contains
        // Expetcted: cybertekschool
        String actualURL = driver.getCurrentUrl();
        String exptectedURL = "cybertekschool";

        if (actualURL.contains(exptectedURL)){
            System.out.println("URL verification PASSED");
        } else {
            System.out.println("URL verification FAILED");
        }

        // verify title

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
        }
    }
}
