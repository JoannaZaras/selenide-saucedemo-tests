package pl.joannazaras.saucedemo;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pl.joannazaras.saucedemo.config.ConfigReader;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

    @BeforeEach
    void setUp() {
        SelenideLogger.addListener(
                "AllureSelenide",
                new AllureSelenide()
                        .screenshots(true)
                        .savePageSource(true)
        );

        Configuration.browser = System.getProperty("browser", ConfigReader.getProperty("browser"));
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = Long.parseLong(ConfigReader.getProperty("timeout"));

        open(ConfigReader.getProperty("base.url"));
        clearBrowserCookies();
        clearBrowserLocalStorage();
        open(ConfigReader.getProperty("base.url"));

    }

    @AfterEach
    void tearDown() {
        closeWebDriver();
    }
}