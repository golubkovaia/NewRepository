package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

public class BasePage {
    protected WebDriver driver;
    //private WebDriver driver;
    private By backButton = By.xpath("//*[@id='back_button']");
    protected final static int WAITING_TIME_IN_SECONDS = 30;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(WebElement element) {
        element.click();
    }
    protected boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException ex){
            return false;
        }
    }

    public void clickBackButton(){
        waitForElementClickable(driver.findElement(backButton), driver);
        click(driver.findElement(backButton));
    }
    public static WebElement waitForElementClickable(WebElement element, WebDriver driver) {
        return (new WebDriverWait(driver, WAITING_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(element)); //ждать 30 сек. пока элемент не будет кликабельным
    }
}
