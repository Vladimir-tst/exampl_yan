package yan.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;
import yan.elements.*;

/**
 * Created by Vladimir on 04.04.2018.
 */
public class SearchPage {
    private WebDriver driver;

//    private FilterBlock filterBlock;
//    private SearchPrepack searchPrepack;
    private SearchResults searchResults;

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
        this.driver = driver;
    }
////    public void SearchFilterBlock (String nameElement) {
////        filterBlock.searchByName(nameElement);
////    }
////    public void EnterStartPrice (String nameElement) {
////        searchPrepack.enterStartPrice(nameElement);
////    }
////
////    public void EnterFinalPrice (String nameElement) {
////        searchPrepack.enterFinalPrice(nameElement);
////    }
//
//    public SearchPage searchFor() {
//        System.out.println("======yyyy=======");
////        this.SearchFilterBlock("по цене");
////        this.EnterStartPrice("5000");
////        this.EnterFinalPrice("7000");
//        return this;
//    }

    public SearchResults getSearchResults() {
        return this.searchResults;
    }
}
