package com.infoTech.tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsHandleTest extends TestBase {

    @Test
    public void WindowsHandle() throws InterruptedException {

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

        //Set olan listemizi once Array' e ceviriyoruz.
        Object[] array = (Object[]) tumElementler.toArray();

        //istediginiz sayfanin indexini yazip cagiriyoruz.
        String sonSayfaHandle = array[array.length-1].toString();
        System.out.println("Son sayfa Handle ==> "+sonSayfaHandle);

        Thread.sleep(3000);
        driver.switchTo().window(handle);
       // driver.switchTo().window("9C1DBC1FFC1205F5DE1089CBC6E84ED4");
    }
}
