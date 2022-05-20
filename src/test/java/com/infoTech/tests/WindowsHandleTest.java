package com.infoTech.tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsHandleTest extends TestBase {

    @Test
    public void WindowsHandle(){

    driver.get("https://the-internet.herokuapp.com/windows");

    // sayfanin handle' ini aldik
    String handle = driver.getWindowHandle();
        System.out.println(handle);

        driver.findElement(By.partialLinkText("Click Here")).click();

        //Tum sayfalarin handle' inin aliyoruz.

        Set<String> tumElementler = driver.getWindowHandles();
        for(String w : tumElementler){

            System.out.println(w);
        }
    }
}
