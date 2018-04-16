import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import yan.pages.MarketPage;
import yan.pages.SearchPage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladimir on 01.04.2018.
 */
public class MyMainSearch {

    public WebDriver driver;

    @BeforeTest
    public void loadStartPage() {
//        driver = new ChromeDriver();
        driver = new FirefoxDriver();

        driver.manage().window().maximize();
//        driver.get("http://market.yandex.ru/");
        driver.get("https://market.yandex.ru/catalog/54425?hid=91009&track=menu");

    }

    @Test
    public void SearchinghResults() {

        MarketPage mainPage = new MarketPage(driver);
//        mainPage.SearchComputers();
        mainPage.SearchComponents("Комплектующие");
        mainPage.SearchComponents("Процессоры (CPU)");
        mainPage.SearchComponentsHH("Intel");

        SearchPage page = mainPage.searchForTask();
        boolean isListReliable = page.getSearchResults().getSearchPrices().
                stream().anyMatch(i -> i<5000 || i>7000);

        Assert.assertFalse(isListReliable);
    }

    @AfterTest
    public void closeDriver() {
        driver.quit();
    }
}
