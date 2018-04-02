package yan.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;
import yan.elements.*;

/**
 * Created by Vladimir on 01.04.2018.
 */

public class MarketPage {
//    private WebDriver driver;
    private TopMenu topMenu;
    private LeftCatalogMenu leftCatalogMenu;
    private HeadlineHeader headlineHeader;
    private FilterBlock filterBlock;
    private SearchPrepack searchPrepack;

    public MarketPage(WebDriver driver) {
        //PageFactory.initElements(new HtmlElementDecorator(driver), this);
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
//        this.driver = driver;
    }

    public void SearchComputers () {
        topMenu.searchTMComputers();
    }

    public void SearchComponents (String nameElement) {
//        leftCatalogMenu.searchComponents();
        leftCatalogMenu.searchComponentsByName(nameElement);

    }
    public void SearchComponentsHH (String nameElement) {
//        leftCatalogMenu.searchComponents();
        headlineHeader.searchByName(nameElement);

    }
    public void SearchFilterBlock (String nameElement) {
//        leftCatalogMenu.searchComponents();
        filterBlock.searchByName(nameElement);

    }

    public void EnterStartPrice (String nameElement) {
//        leftCatalogMenu.searchComponents();
        searchPrepack.enterStartPrice(nameElement);

    }
    public void EnterFinalPrice (String nameElement) {
//        leftCatalogMenu.searchComponents();
        searchPrepack.enterFinalPrice(nameElement);

    }

}
