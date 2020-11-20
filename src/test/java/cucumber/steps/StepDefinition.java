package cucumber.steps;

import io.cucumber.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.elements.Button;

import static cucumber.elements.TextBox.getTextFieldValue;
import static cucumber.elements.TextBox.setTextFieldValue;
import static cucumber.uicommon.UITestConstants.*;
import static cucumber.uicommon.UITestConstants.WAIT_TEN_SECONDS;

public class StepDefinition extends BaseSetup implements En {

    public StepDefinition() {

        Given("I launch the Google maps homepage and verify {word}", (String key) -> {
            setUpWebDriver();
            webDriver.get(BASE_URL);
            webDriver.switchTo().frame(webDriver.findElement(new By.ByTagName(uiLocators.get(key))));
        });

        And("I agree to cookies {word}", (String key1) -> {
            WebDriverWait wait = new WebDriverWait(webDriver, WAIT_TEN_SECONDS);
            wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ById(uiLocators.get(key1))));
            Button.clickButton(new By.ById(uiLocators.get(key1)), new WebDriverWait(webDriver, WAIT_TEN_SECONDS), ExpectedConditions.invisibilityOfElementLocated(By.id(uiLocators.get(key1))));
        });

        Given("I enter {word} in the {word} box", (String city, String key) -> {
            setTextFieldValue(By.cssSelector(uiLocators.get(key)), city);
        });

        Then("the left panel has {word} as a {word} text", (String city, String key) -> {
            Assert.assertEquals(getTextFieldValue(By.cssSelector(uiLocators.get(key))), city);
        });

        Then("I click {word} button and {word} is on {word}", (String key1, String text, String key2) -> {
            Button.clickButton(By.cssSelector(uiLocators.get(key1)), new WebDriverWait(webDriver, WAIT_TWENTY_SECONDS), ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(uiLocators.get(key2)), text));
        });

        Then("I click {word} icon and {word} is on {word} in attribute {word}", (String key1, String text, String key2, String key3) -> {
                    Button.clickButton(By.xpath(uiLocators.get(key1)), new WebDriverWait(webDriver, WAIT_TEN_SECONDS), ExpectedConditions.attributeContains(By.xpath(uiLocators.get(key2)), uiLocators.get(key3), text));
        });

        After(() -> webDriver.close());
    }
}