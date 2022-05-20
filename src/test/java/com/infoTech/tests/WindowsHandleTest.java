package com.infoTech.tests;

import com.infoTech.utilities.TestBase;
import org.testng.annotations.Test;

public class WindowsHandleTest extends TestBase {

    @Test
    public void WindowsHandle(){

    driver.get("https://the-internet.herokuapp.com/windows");

    String handle = driver.getWindowHandle();
        System.out.println(handle);
    }
}
