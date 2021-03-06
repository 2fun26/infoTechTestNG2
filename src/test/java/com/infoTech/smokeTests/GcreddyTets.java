package com.infoTech.smokeTests;

import com.infoTech.smokeTests.pages.GcreddyPage;
import com.infoTech.utilities.ConfigurationReader;
import com.infoTech.utilities.TestBase;
import org.testng.annotations.Test;

public class GcreddyTets extends TestBase {

    @Test(groups = {"amazon","login"})
    public void giris() throws InterruptedException {

        driver.get(ConfigurationReader.getProperty("grcreddy_link"));
        GcreddyPage page = new GcreddyPage(driver);
        page.grcreddy_userName.sendKeys(ConfigurationReader.getProperty("gcreddy_userName"));
        page.grcreddy_password.sendKeys(ConfigurationReader.getProperty("gcreddy_passWord"));
        page.grcreddy_login.click();

    }
}
