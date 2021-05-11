package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #1: Yahoo Title Verification
1. Open Chrome browser
2. Go to https://www.yahoo.com
3. Verify title:
Expected: Yahoo
 */
public class YahooPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com");
        // Expected: Yahoo
        String expectedTitle = "Yahoo";
        // current title
        String currentTitle = driver.getTitle();
        if (expectedTitle.equals(currentTitle)){
            System.out.println("Title is as expected. You passed!");
        } else {
            System.out.println("Title is not as expected. You failed!");
        }

        driver.manage().window().maximize();
        // closing browser
        driver.close();

        /**
         * TC #2: Cybertek practice tool verifications
         * 1. Open Chrome browser
         * 2. Go to https://practice.cybertekschool.com
         * 3. Verify URL contains
         *    Expected: cybertekschool
         * 4. Verify title:
         *    Expected: Practice
         */
        WebDriverManager.chromedriver();
        WebDriver driver1 = new ChromeDriver();
        driver.get("https://practice.cybertekschool.com");
        String currentUrl = driver.getCurrentUrl();
        System.out.println("current URL " + currentUrl);
        System.out.println("Title is " + driver.getTitle());

    }
}
