package com.infoTech.pages.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class silinecek {
    WebDriver driver;
    @Test
    public void deneme() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/insurance/v1/index.php");
        Thread.sleep(1000);
        driver.switchTo().frame(6);
        WebElement cerez=driver.findElement(By.xpath("//*[.='Accept All']"));
        cerez.click();

    }
}