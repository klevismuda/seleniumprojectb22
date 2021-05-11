package com.cybertek.tests.Day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearchVerification {
    public static void main(String[] args) {
      //TC #4:	Google	search
       // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//    2- Go to: https://google.com
        driver.get("https://google.com");

//    3- Write	“apple”	in	search	box
//    4- Click	google	search	button
      driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);
    // Keys.ENTER   behave like click

        driver.findElement(By.partialLinkText("Apple")).click();
//        5- Verify	title:
//        Expected:	Title	should	start	with	“apple”	word

        String expectedTitle = "Apple";
        String actualTitle = driver.getTitle();
        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
        }

        driver.quit();
    }
}
