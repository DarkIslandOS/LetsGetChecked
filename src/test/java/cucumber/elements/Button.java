package cucumber.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static cucumber.steps.StepDefinition.webDriver;
import static cucumber.uicommon.UITestConstants.WAIT_TEN_SECONDS;

public class Button extends Element{
    public static void clickButton(By locator, WebDriverWait wait, ExpectedCondition<Boolean> waitCondition){
         WebElement element = getElementByLocator(locator);
         WebDriverWait webDriverWait = new WebDriverWait(webDriver, WAIT_TEN_SECONDS);
         webDriverWait.until(ExpectedConditions.visibilityOf(element));
         webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
         element.click();
         wait.until(waitCondition);
    }
}
