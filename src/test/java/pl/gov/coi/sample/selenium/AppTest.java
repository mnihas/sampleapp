package pl.gov.coi.sample.selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest {
    @Test
    public void firstTestMethod() {
        System.setProperty("webdriver.chrome.driver", "/opt/chromedriver/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--no-sandbox");

        WebDriver driver = new ChromeDriver(chromeOptions);

        //driver.get("http://google.pl");
        System.out.println("Test passed");

        //driver.quit();
    }
}

