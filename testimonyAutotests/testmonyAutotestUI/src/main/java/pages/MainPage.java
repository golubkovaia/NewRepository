package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HistoryPage;

public class MainPage extends Element{
  //  private WebDriver driver;
    public MainPage(WebDriver driver){
       super(driver);
    }


    private By dataSend = By.xpath("//*[@id=\"send_button\"]");  //нашли по xpath кнопку Передача показаний
    private By dataHistory = By.xpath("//*[@id=\"history_button\"]");
    private By catalog = By.xpath("//*[@id=\"catalog_button\"]");


   /* public SendPage clickSend() throws InterruptedException { //метод, с помощью которого нажимаем на кнопку Передача показаний

        driver.findElement(dataSend).click(); //метод selenium Selenium WebDriver, который выполняет клик по элементу
        Thread.sleep(2000);

        return new SendPage(driver);

    }*/
   public void clickSend() {
       click(driver.findElement(dataSend));
   }
    public void clickHistory() {
        click(driver.findElement(dataHistory));
    }
    public void clickPrice() {
        click(driver.findElement(catalog));
    }
   /* public HistoryPage clickHistory() {

        driver.findElement(dataHistory).click();

        return new HistoryPage(driver);
    }

    public PricePage clickPrice() {

        driver.findElement(catalog).click();

        return new PricePage(driver);

    }*/


}