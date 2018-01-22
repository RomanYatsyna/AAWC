package com.ryatsyna;

import io.appium.java_client.windows.WindowsDriver;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MyWinAppDriver implements DriverSource {

    @Override
    public WebDriver newDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
        capabilities.setCapability("platformName", "Windows");
        capabilities.setCapability("deviceName", "WindowsPC");
        WindowsDriver driver = null;
        try {
            driver = new WindowsDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
