package com.infoTech.smokeTests;

import com.infoTech.utilities.ConfigurationReader;
import com.infoTech.utilities.TestBase;
import org.testng.annotations.Test;

public class GcreddyTets extends TestBase {

    @Test
    public void gris(){

        driver.get(ConfigurationReader.getProperty("grcreddy_link"));
    }
}
