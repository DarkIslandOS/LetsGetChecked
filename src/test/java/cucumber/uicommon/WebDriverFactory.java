package cucumber.uicommon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static cucumber.uicommon.UITestConstants.*;

public class WebDriverFactory {

    public static WebDriver setDesiredBrowser(Browser browser){
        switch (browser){
            case FIREFOX:
                System.setProperty(PATH_PROPERTY_GECKO, GECKO_DRIVER_PATH);
                return new FirefoxDriver();
            case EDGE:
                System.setProperty(PATH_PROPERTY_EDGE, EDGE_DRIVER_PATH);
                return new EdgeDriver();
            default:
                System.setProperty(PATH_PROPERTY_CHROME, CHROME_DRIVER_PATH);
                return new ChromeDriver();
        }
    }
}
