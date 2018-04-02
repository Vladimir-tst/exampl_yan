import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import yan.pages.MarketPage;

/**
 * Created by Vladimir on 01.04.2018.
 */
public class MyMainSearch {

    public WebDriver driver;

    @BeforeTest
    public void loadStartPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://market.yandex.ru/");
    }

    @Test
    public void SearchinghResults() {

        MarketPage mainPage = new MarketPage(driver);
        mainPage.SearchComputers();
        mainPage.SearchComponents("Комплектующие");
        mainPage.SearchComponents("Процессоры (CPU)");
        mainPage.SearchComponentsHH("Intel");
        mainPage.SearchFilterBlock("по цене");
        mainPage.EnterStartPrice("5000");
        mainPage.EnterFinalPrice("7000");

    }

    @AfterTest
    public void closeDriver() {
//        driver.quit();
    }
}
