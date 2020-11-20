package cucumber.uicommon;

import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.HashMap;

public class UITestConstants {
    public enum Browser {
        CHROME,
        FIREFOX,
        EDGE
    }
    public static final String BASE_URL = "https://www.google.com/maps";
    public static final String TEST_YAML_FILE = "src/test/resources/web-element-locators.yml";
    public static Yaml testConfigurationLocators = new Yaml();
    public static HashMap<String, String> uiLocators;
    public static String PATH_PROPERTY_GECKO = "webdriver.gecko.driver";
    public static String PATH_PROPERTY_EDGE = "webdriver.edge.driver";
    public static String PATH_PROPERTY_CHROME = "webdriver.chrome.driver";
    public static String GECKO_DRIVER_PATH = "./src/test/resources/geckodriver.exe";
    public static String EDGE_DRIVER_PATH = "./src/test/resources/msedgedriver.exe";
    public static String CHROME_DRIVER_PATH = "./src/test/resources/chromedriver.exe";

    public static String CONSENT_URL = "https://consent.google.ie/set?pc=m&uxe=4423402";
    public static int WAIT_TEN_SECONDS = 10;
    public static int WAIT_TWENTY_SECONDS = 20;

    static {
        try {
            uiLocators = testConfigurationLocators.load(new FileInputStream(Paths.get(TEST_YAML_FILE).toAbsolutePath().toFile()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
