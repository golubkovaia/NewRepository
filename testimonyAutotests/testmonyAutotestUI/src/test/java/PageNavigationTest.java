import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.platform.commons.logging.LoggerFactory;

import org.openqa.selenium.By;
import pages.MainPage;
import pages.SendPage;

import java.util.logging.Logger;

public class PageNavigationTest extends TestBase{

  //  Logger logger = LoggerFactory.getLogger(TestBase.class);
    @Test  //метод, помеченный данной аннотацией JUnit, является тестом

    public void FromMainToSendAndBack () throws InterruptedException {

 /*       MainPage mainPage = new MainPage(applicationManager.driver);
        SendPage sendPage = new SendPage(applicationManager.driver);
        mainPage.clickSend();

        //Assertions.assertEquals(driver.findElement(By.xpath("/html/body/h1")).getText(), "Передача показаний"); //Assertions.assertEquals(X, Y), X - факт, Y - ожидаемый результат

        Assertions.assertEquals(sendPage.getHeaderText(), "Передача показаний");
        Thread.sleep(1000);
        sendPage.clickBackButton(); //нажатие на кнопку Назад
        Assertions.assertEquals(mainPage.getHeaderText(), "Neo ЖКХ");

        // driver.findElement(By.xpath("//*[@id=\"back_button\"]")).click(); //нажатие на кнопку Назад
        //      Assertions.assertEquals(driver.findElement(By.xpath("/html/body/h1")).getText(), "Neo ЖКХ");
*///logger.info("Start FromMainToSendAndBack");
        applicationManager.getMainPage().clickSend();
        Assertions.assertEquals(applicationManager.getSendPage().getHeaderText(), "Передача показаний");
       // Thread.sleep(1000);
        applicationManager.getSendPage().clickBackButton();
        Assertions.assertEquals(applicationManager.getMainPage().getHeaderText(), "Neo ЖКХ");
  //      logger.info("End FromMainToSendAndBack");
    }


    @Test

    public void FromMainToHistoryAndBack () throws InterruptedException {
/*
        MainPage mainPage = new MainPage(applicationManager.driver);

        mainPage.clickHistory();

        Assertions.assertEquals(applicationManager.driver.findElement(By.xpath("/html/body/h1")).getText(), "История показаний");

        applicationManager.driver.findElement(By.xpath("//*[@id=\"back_button\"]")).click();

        Assertions.assertEquals(applicationManager.driver.findElement(By.xpath("/html/body/h1")).getText(), "Neo ЖКХ");
*/

        applicationManager.getMainPage().clickHistory();
        Assertions.assertEquals(applicationManager.getHistoryPage().getHeaderText(), "История показаний");
        Thread.sleep(1000);
        applicationManager.getHistoryPage().clickBackButton();
        Assertions.assertEquals(applicationManager.getMainPage().getHeaderText(), "Neo ЖКХ");
    }


    @Test

    public void FromMainToPriceAndBack () throws InterruptedException {
/*
        MainPage mainPage = new MainPage(applicationManager.driver);
        mainPage.clickPrice();
        Assertions.assertEquals(applicationManager.driver.findElement(By.xpath("/html/body/h1")).getText(), "Справочник стоимости услуг");
        applicationManager.driver.findElement(By.xpath("//*[@id=\"back_button\"]")).click();
        Assertions.assertEquals(applicationManager.driver.findElement(By.xpath("/html/body/h1")).getText(), "Neo ЖКХ");
*/
        applicationManager.getMainPage().clickPrice();
        Assertions.assertEquals(applicationManager.getPricePage().getHeaderText(), "Справочник стоимости услуг");
        Thread.sleep(1000);
        applicationManager.getPricePage().clickBackButton();
        Assertions.assertEquals(applicationManager.getMainPage().getHeaderText(), "Neo ЖКХ");
    }
    @Test
    public void isEmpty(){
        applicationManager.getMainPage().clickSend();

        for(int i = 0; i<applicationManager.getSendPage().getTable().getRows().size();i++)
        {
for (int j=0; j<applicationManager.getSendPage().getTable().getColumnsInRow(applicationManager.getSendPage().getTable().getRows().get(i)).size(); j++) {
    System.out.println(applicationManager.getSendPage().getTable().getColumnsInRow(applicationManager.getSendPage().getTable().getRows().get(i)).size());
    System.out.println("Znachenie yacheiki " + i + "."+j+": " + applicationManager.getSendPage().getTable().getValueFromCell(i, j));

    Assertions.assertNotEquals("", applicationManager.getSendPage().getTable().getValueFromCell(i, j));
}
        }

    }
}
