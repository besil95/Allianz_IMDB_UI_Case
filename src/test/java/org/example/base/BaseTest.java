package org.example.base;

import org.example.stepDefinitions.StepDefinitions;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.logging.Logger;


public class BaseTest {

    static WebDriver webDriver = null;
    final static Logger logger = Logger.getLogger(String.valueOf(StepDefinitions.class));

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-notifications");
        options.addArguments("disable-popup-blocking");
        setWebdriver(new ChromeDriver(options));
        getWebDriver().navigate().to("https://www.imdb.com");
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebdriver(WebDriver webDriver) {
        BaseTest.webDriver = webDriver;
    }

    public void tearDown() {
        getWebDriver().quit();
        logger.info("test sona erdi.");

    }

}
