import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;
import yan.pages.MarketPage;

public class MyExampYan {
    private WebDriver driver;

    @FindBy(xpath = ".//*[@class = 'catalog-menu i-bem catalog-menu_js_inited']")
    public class LeftCatalogMenu extends HtmlElement {
        @FindBy(xpath = ".//a[text()='Комплектующие']")
        private WebElement lftMenuComponents;

        public void searchComponents() {
            lftMenuComponents.click();
        }
    }

    public class Page {
        private LeftCatalogMenu leftCatalogMenu;

        public Page(WebDriver driver) {
            PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
        }

        public void SearchComponents() {
            leftCatalogMenu.searchComponents();
        }
    }

    @BeforeTest
    public void loadPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://market.yandex.ru/catalog/54425?hid=91009&track=menu");
    }
    @Test
    public void MyTest() {
        Page Page = new Page(driver);
        Page.SearchComponents();
    }

    @AfterTest
    public void closeDriver() {
        driver.quit();
    }
}