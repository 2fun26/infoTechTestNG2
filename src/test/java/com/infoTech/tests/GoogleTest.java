package com.infoTech.tests;

import com.infoTech.smokeTests.pages.GooglePage;
import com.infoTech.utilities.TestBase;
import org.testng.annotations.Test;

public class GoogleTest extends TestBase {

    @Test
    public void aramaTesti(){

        driver.get("https://google.com");

        GooglePage page = new GooglePage(driver);
        page.guvenlikDuvari.click();
        page.aramaKutusu.sendKeys("page' e selam olsun");
    }

}
