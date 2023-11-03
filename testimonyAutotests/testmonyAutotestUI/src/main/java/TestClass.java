import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\igolubkova\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe"); //задаём путь к драйверу
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5500/index.html"); //сайт, который открываем
        WebElement header = driver.findElement(By.xpath("/html/body/h1"));
        System.out.println(header.getText());
        driver.quit(); //закрытие всех окон, связанных с запущенным тестом

        WebDriver WebDriver = new ChromeDriver();
        WebDriver.get("https://www.deepl.com/ru/translator");
        WebElement element = WebDriver.findElement(By.cssSelector("h2"));
       System.out.println(element.getText());
        WebDriver.quit();
    }
}
