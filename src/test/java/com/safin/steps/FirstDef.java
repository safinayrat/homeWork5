package com.safin.steps;

import com.safin.setup.Setup;
import io.cucumber.java.Before;
import io.cucumber.java.ru.Пусть;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class FirstDef {
  WebDriver webDriver;

  @Before
  public void initDriver() {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
    webDriver = Setup.getWebDriver();
    webDriver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
  }

  @Пусть("открыт ресурс авито")
  public void открытРесурсАвито() {
    webDriver.get("https://m.avito.ru");
  }
}
