package com.infoTech.tests;
import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Wait extends TestBase {


    @Test
    public void implicitlyWait(){
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        WebElement romeve=driver.findElement(By.xpath("//*[.='Remove']"));
        romeve.click();
        WebElement element= driver.findElement(By.xpath("//*[.='Add']"));
        element.click();
        Assert.assertTrue(element.isDisplayed());
/*
 genellikle TestBase class'inda kullanilir
 -driver'a verecegimiz 1 komut yeterli
 -tiklanabilir,gorunebilir(yani sart belirtmeden kullaniyoruz)
 -kullanma amacimiz,internet,bilgisayar ve calistigimiz sayfanin performasindandir
 -belirttigimiz sure icerisinde elementi bulamassa nosuchElement hatasi verir
 -elementi bulur bulmaz belirledigimiz sureyi beklemeden kodlari calistirmaya devam eder
 -bu komut tum elementler icin.
 */
    }


}