package cucumber.elements;

import cucumber.steps.StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class Element {
    public static WebElement getElementByLocator(By textField){
        return StepDefinition.webDriver.findElement(textField);
    }
}
