package platform.web.modules;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public abstract class AbstractPage {
    protected WebDriver webDriver;
    protected WebElement webElement;
    public AbstractPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

//    public abstract void checkTitlePage();

    protected void assertTrue(String message, boolean condition){
        Assert.assertTrue(message, condition);
    }

    protected void assertElementIsDisplayed(WebElement webElement){
        assertTrue("Failed : "+ webElement.toString() + " Is Not Displayed", isElementPresent(webElement));
    }

    public void isElementPresentVerifyclick(WebElement webElement){
        Assert.assertTrue("Failed : "+ webElement.toString() + " Is Not Displayed", isElementPresent(webElement));
        webElement.click();
        waitFor(1);
    }

    protected void inputTextToElement(WebElement webElement, String textToInput){
        assertElementIsDisplayed(webElement);
        webElement.sendKeys(textToInput);
    }

    protected String getTextOrValueElement(WebElement webElement){
        assertElementIsDisplayed(webElement);
        return webElement.getText();
    }

    public Boolean isElementPresent(WebElement webElement){
       return webElement.isDisplayed();
    }

    protected void waitForVisibilityOf(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void waitFor(long timeout) {
        long multipliedTimedOut = timeout * 1000;
        try {
            Thread.sleep(multipliedTimedOut);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
