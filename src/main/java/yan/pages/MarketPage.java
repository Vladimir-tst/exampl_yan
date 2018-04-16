package yan.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;
import yan.elements.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.stalenessOf;

/**
 * Created by Vladimir on 01.04.2018.
 */

public class MarketPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private TopMenu topMenu;
    private LeftCatalogMenu leftCatalogMenu;
    private HeadlineHeader headlineHeader;
    private FilterBlock filterBlock;
    private SearchPrepack searchPrepack;

    public MarketPage(WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
        this.driver = driver;
    }

    public SearchPage searchForTask() {
        this.SearchFilterBlock("по цене");
        this.EnterStartPrice("5000");
        this.EnterFinalPrice("7000");

        return new SearchPage(driver);
    }


    public void SearchComputers () {
        topMenu.searchTMComputers();
    }

    private void WaitStaleness (WebElement wEl){
//        WebElement wEl = driver.findElements(By.cssSelector(".n-snippet-card2__main-price .price")).get(0);
        wait = new WebDriverWait(driver, 30);
        wait.until(stalenessOf(wEl));
    }
    private WebElement GetElem (){
        return driver.findElements(By.cssSelector(".n-snippet-card2__main-price .price")).get(0);
    }

    public void SearchComponents (String nameElement) {
        leftCatalogMenu.searchComponentsByName(nameElement);
    }
    public void SearchComponentsHH (String nameElement) {
        headlineHeader.searchByName(nameElement);
    }
    public void SearchFilterBlock (String nameElement) {
        WebElement ww = GetElem();
        filterBlock.searchByName(nameElement);
        WaitStaleness(ww);
    }

    public void EnterStartPrice (String nameElement) {
        WebElement ww = GetElem();
        searchPrepack.enterStartPrice(nameElement);
        WaitStaleness(ww);

    }
    public void EnterFinalPrice (String nameElement) {
        WebElement ww = GetElem();
        searchPrepack.enterFinalPrice(nameElement);
        WaitStaleness(ww);
    }

}
