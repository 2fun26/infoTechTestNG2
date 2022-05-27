package com.infoTech.tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class WebTable extends TestBase {

    protected void giris() {

        driver.get("https://demo.guru99.com/test/web-table-element.php");
        WebElement guvenlikDuvari = driver.findElement(By.xpath("//*[.='Consent']"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        guvenlikDuvari.click();
    }



//    @Test
//    public void table(){
//
//        driver.get("https://demo.guru99.com/test/web-table-element.php");
//    }


    @Test
    public void table() throws InterruptedException {
    giris();
    Thread.sleep(3000);

    //tbody kismindaki verileri almak icin kullaniyoruz.
    WebElement tbody = driver.findElement(By.xpath("//tbody"));
        System.out.println(tbody.getText());
        System.out.println("===============================================");
        //tum basliklari almak icin

        List<WebElement> baslik=driver.findElements(By.xpath("//thead/tr/th"));
        for(WebElement basliklar:baslik){
            System.out.println(basliklar.getText());
        }
    }

    @Test
    public void tumSatirlari() throws InterruptedException {

        giris();
        Thread.sleep(3000);
        //tum satirlari yazdirmak icin
        List<WebElement> tumSatirlar = driver.findElements(By.xpath("//tbody/tr"));
        for(WebElement satirlar:tumSatirlar){
            System.out.println(satirlar.getText());
        }

    }

    @Test
    public void tumHucreler() throws InterruptedException {

        giris();
        Thread.sleep(3000);
        //hucreleri yazdirmak icin
        List<WebElement> tumHucreler = driver.findElements(By.xpath("//tbody/tr/td"));
        for(WebElement hucreler:tumHucreler){
            System.out.println(hucreler.getText());
        }
    }

}
