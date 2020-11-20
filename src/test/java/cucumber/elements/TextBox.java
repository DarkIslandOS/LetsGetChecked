package cucumber.elements;

import org.openqa.selenium.By;

public class TextBox extends Element{

    public static void setTextFieldValue(By locator, String textValue){
        getElementByLocator(locator).sendKeys(textValue);
    }

    public static String getTextFieldValue(By locator){
        return getElementByLocator(locator).getText();
    }
}
