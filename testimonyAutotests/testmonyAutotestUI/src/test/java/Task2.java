import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Table;

public class Task2{
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\igolubkova\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe"); //задаём путь к драйверу
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5500/index.html"); //сайт, который открываем
     //       WebElement header = driver.findElement(By.xpath("/html/body/h1"));
     //   System.out.println(header.getText());
    //    driver.quit(); //закрытие всех окон, связанных с запущенным тестом
        WebElement dataSend = driver.findElement(By.xpath("//*[@id=\"send_button\"]"));
    //    By dataSend = By.xpath("//*[@id=\"send_button\"]");  //нашли по xpath кнопку Передача показаний

        dataSend.click();

        WebElement Date = driver.findElement(By.xpath("//*[@id=\"date\"]"));
        Date.sendKeys("01.01.2023");
        WebElement ColdData = driver.findElement(By.id("coldData"));
        ColdData.sendKeys("23");

        WebElement HotData = driver.findElement(By.id("hotData"));
        HotData.sendKeys("15");

        WebElement GasData = driver.findElement(By.id("gasData"));
        GasData.sendKeys("1323");

        WebElement ElecData = driver.findElement(By.id("elecData"));
        ElecData.sendKeys("7656");
        Thread.sleep(1000);
        WebElement Send = driver.findElement(By.xpath("//*[@id=\"button\"]"));
        //    By dataSend = By.xpath("//*[@id=\"send_button\"]");  //нашли по xpath кнопку Передача показаний

   //     WebElement table = driver.findElement(By.id("table"));
   //     Table tab = new Table(table, driver);
  //     tab.setValueToCell(2,2);

        Send.click();
        Thread.sleep(1000);
        driver.quit();
    }


}


