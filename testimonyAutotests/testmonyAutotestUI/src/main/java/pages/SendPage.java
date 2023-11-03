package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendPage extends Element{

    public SendPage(WebDriver driver) {
        super(driver); //обращаемся к конструктору родительского класса
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='coldData']")
    private WebElement coldWaterInput;
    public void inputColdWater(String inputValue) {
        waitForElementClickable(coldWaterInput, driver);
     //   inputText(coldWaterInput, inputValue);
        coldWaterInput.sendKeys(inputValue);
    }
    public Table getTable()
    {
        WebElement table = driver.findElement(By.id("table"));
        Table tab = new Table(table, driver);

        return tab;
    }
}
