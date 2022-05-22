package com.infoTech.odev3;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Ornek_AmazonKayitSayfasi extends TestBase {

    @Test
    public void test1() throws InterruptedException {

        driver.get("https://amazon.com");
        String titleAmazon = driver.getTitle();
        System.out.println("Title ==> "+titleAmazon);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(titleAmazon,"Amazon.com. Spend less. Smile more.");
        softAssert.assertAll();

        Actions action = new Actions(driver);
        Thread.sleep(2000);
        WebElement sign = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Thread.sleep(2000);
        action.moveToElement(sign).perform();

        WebElement signButton = driver.findElement(By.partialLinkText("Sign in"));
        Thread.sleep(2000);
        signButton.click();

        WebElement startHere = driver.findElement(By.id("createAccountSubmit"));
        Thread.sleep(2000);
        startHere.click();
        String titleAmazon2 = driver.getTitle();
        System.out.println("title2 ==> " + titleAmazon2);

        softAssert.assertEquals(titleAmazon2,"Amazon Registration");
        softAssert.assertAll();
    }

    @Test (dependsOnMethods = "test1")
    public void test2() throws InterruptedException {

        WebElement isim = driver.findElement(By.id("ap_customer_name"));
        Thread.sleep(2000);
        isim.click();
        isim.sendKeys("Mecusi Atesetapanoglu");

        WebElement eposta = driver.findElement(By.id("ap_email"));
        Thread.sleep(2000);
        eposta.click();
        eposta.sendKeys("mecusiatesetapanoglu@gmail.com");

        WebElement sifre = driver.findElement(By.id("ap_password"));
        Thread.sleep(2000);
        sifre.click();
        sifre.sendKeys("123456");

        WebElement sifreOnay = driver.findElement(By.id("ap_password_check"));
        Thread.sleep(2000);
        sifreOnay.click();
        sifreOnay.sendKeys("123456");

        WebElement onaylama = driver.findElement(By.id("continue"));
        Thread.sleep(2000);
        onaylama.click();

        String title3 = driver.getTitle();
        System.out.println("title3 ==> " + title3);


    }

}
