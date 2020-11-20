package cucumber.steps;

import cucumber.uicommon.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static cucumber.uicommon.UITestConstants.Browser.CHROME;
import static cucumber.uicommon.UITestConstants.WAIT_TEN_SECONDS;

public class BaseSetup {
    public static WebDriver webDriver;

    public void setUpWebDriver() {
        webDriver = WebDriverFactory.setDesiredBrowser(CHROME);
        webDriver.manage().timeouts().implicitlyWait(WAIT_TEN_SECONDS, TimeUnit.SECONDS);
        webDriver.manage().timeouts().pageLoadTimeout(WAIT_TEN_SECONDS, TimeUnit.SECONDS);
    }
}
