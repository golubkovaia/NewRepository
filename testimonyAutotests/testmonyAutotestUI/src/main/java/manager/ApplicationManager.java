package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HistoryPage;
import pages.MainPage;
import pages.PricePage;
import pages.SendPage;

import java.util.concurrent.TimeUnit;

public class ApplicationManager{
    public WebDriver driver;
    public MainPage mainPage;
    public SendPage sendPage;
    public PricePage pricePage;
    public HistoryPage historyPage;


        public void init() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\igolubkova\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");

            driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // ждет в течение 10 секунд появления элемента в DOM дереве если элемент появился то все хорошо, если нет то выбросит исключение.
            driver.get("http://127.0.0.1:5500/index.html");
            mainPage = new MainPage(driver);
            sendPage = new SendPage(driver);
            pricePage = new PricePage(driver);
            historyPage = new HistoryPage(driver);
            //       Thread.sleep(1000);
        }

    public MainPage getMainPage() {
        return mainPage;
    }

    public SendPage getSendPage() {
        return sendPage;
    }
    public PricePage getPricePage() {
        return pricePage;
    }

    public HistoryPage getHistoryPage() {
        return historyPage;
    }
    public void close() {
            driver.quit();
        }


}
