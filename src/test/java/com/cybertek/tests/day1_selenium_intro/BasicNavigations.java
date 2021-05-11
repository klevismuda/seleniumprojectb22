package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        // 1- Set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2- create instance of selenium web driver
        WebDriver driver = new ChromeDriver();

        // this line will basically maximize the browser size
        driver.manage().window().maximize();

        // work only for mac
        //driver.manage().window().fullscreen();

        //3- get the page for the tesla.com
        driver.get("https://www.tesla.com/");
        System.out.println("Current title " + driver.getTitle());
        String currentUrl = driver.getCurrentUrl();
        System.out.println("current URL " + currentUrl);

        // going back using navigations
        Thread.sleep(1500); // three seconds of wait/ stop
        driver.navigate().back();

        // going forward using navigations
        Thread.sleep(1500);
        driver.navigate().forward();

        // refreshing the page  using navigations
        Thread.sleep(1500);
        driver.navigate().refresh();

        // going to another url using .to() navigations
        Thread.sleep(1500);
        driver.navigate().to("http://google.com");

        System.out.println("Current title " + driver.getTitle());

        currentUrl = driver.getCurrentUrl();
        System.out.println("current URL " + currentUrl);

        // will close the currently focused page or tab
        driver.close();

        //driver.quit();  close all of the opened browsers or tabs


    }
}
