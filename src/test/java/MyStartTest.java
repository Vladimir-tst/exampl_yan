//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test; org.testng.
//import org.testng
//import org.testng.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertFalse;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
/**
 * Created by Vladimir on 01.04.2018.
 */
public class MyStartTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private FirefoxBinary bin;

    @BeforeMethod
    public void setUp() throws Exception {
//        driver = new FirefoxDriver();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();
    }

    @Test
    public void myFstTest() throws Exception {
// comm
// Проверка того что верхнее меню появляется на главной странице

//        driver.get("https://market.yandex.ru/");
        driver.get("https://market.yandex.ru/catalog/54425?hid=91009&track=menu");

        WebElement myElemT = driver.findElement(By.xpath(".//*[@class = 'catalog-menu i-bem catalog-menu_js_inited']"));
        myElemT.findElement(By.xpath(".//a[text()='Комплектующие']")).click();

        //   driver.findElement(By.xpath(".//*[@class = 'link topmenu__link'][text()='Компьютеры']")).click();
    }


    @AfterMethod
    public void tearDown() throws Exception {
 //       driver.quit();
    }

}
