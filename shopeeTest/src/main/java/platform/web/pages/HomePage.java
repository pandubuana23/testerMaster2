package platform.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import platform.web.modules.AbstractPage;

public class HomePage extends AbstractPage{

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

//    public WebElement signInBtn = webDriver.findElement(By.xpath("//*[@id=\"login\"]/form/div[3]/input[3]"));
    @FindBy (xpath = "//*[@id=\"login\"]/form/div[3]/input[3]")
    protected WebElement signinBtn;
    @FindBy (id = "//*[@id=\"login_field\"]")
    protected WebElement emailField;
    @FindBy (id = "password")
    protected WebElement passwordField;

    @FindBy (id = "//*[@id=\"user-links\"]/li[2]/details/summary")
    protected WebElement option1;
    @FindBy (xpath = "//*[@id=\"user-links\"]/li[2]/details/details-menu/a[3]")
    protected WebElement newGistBtn;

    @FindBy (id = "//*[@id=\"gists\"]/div[2]/div/div[1]/div[1]/input[2]")
    protected WebElement gistNameField;
    @FindBy (id = "//*[@id=\"gists\"]/div[2]/div/div[2]/div/div[5]")
    protected WebElement gistDesc;
    @FindBy (id = "//*[@id=\"new_gist\"]/div/div[2]/button[1]")
    protected WebElement submitGistBtn;

    @FindBy (id = "//*[@id=\"gist-pjax-container\"]/div[1]/div/div[1]/ul/li[1]/a")
    protected WebElement editGistBtn;
    @FindBy(id = "//*[@id=\"edit_gist_93374752\"]/div/div[2]/button")
    protected WebElement updatePublicGistBtn;

    @FindBy(id = "//*[@id=\"gist-pjax-container\"]/div[1]/div/div[1]/ul/li[2]/form/button")
    protected WebElement deleteGistBtn;
    @FindBy(xpath = "//button[contains(text(),'OK')]")
    protected WebElement okPopupBtn;

    @FindBy(xpath = "//*[@id=\"gist-pjax-container\"]/div[1]/div/div[1]/h1/span[1]/a/span")
    protected WebElement usernameGist;
    @FindBy(xpath = "//*[@id=\"gist-pjax-container\"]/div[2]/div[1]")
    protected WebElement listGist;

//    ===================

    public void clickSignInBtn() {
        waitForVisibilityOf(emailField);
        inputTextToElement(emailField, "pandubuana23@gmail.com");
        inputTextToElement(passwordField, "December13thh");
        isElementPresentVerifyclick(signinBtn);
    }

    public void clickOption1() {
        isElementPresentVerifyclick(option1);
    }
    public void clickNewGist() {
        isElementPresentVerifyclick(newGistBtn);
    }
    public void inputNewGistField() {
        inputTextToElement(gistNameField, "TestGist");
    }
    public void inputUpdateNewGistField() {
        inputTextToElement(gistNameField, "TestGist Update");
    }
    public void clickNewGistBtn() {
        isElementPresentVerifyclick(newGistBtn);
    }
    public void inputGistDesc() {
        inputTextToElement(gistDesc, "tester Gist 1");
    }
    public void clickSubmitGistBtn() {
        isElementPresentVerifyclick(submitGistBtn);
    }
    public void clickEditGistBtn() {
        isElementPresentVerifyclick(editGistBtn);
    }
    public void clickUpdateGistBtn() {
        isElementPresentVerifyclick(updatePublicGistBtn);
    }
    public void clickDeleteGistBtn() {
        isElementPresentVerifyclick(deleteGistBtn);
        isElementPresentVerifyclick(okPopupBtn);
    }
    public void clickUsernameGist() {
        isElementPresentVerifyclick(usernameGist);
        isElementPresentVerifyclick(listGist);
    }


}
