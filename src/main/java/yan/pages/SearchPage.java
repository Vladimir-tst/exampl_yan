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

    private SearchResults searchResults;

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
        this.driver = driver;
    }

    public SearchResults getSearchResults() {
        return this.searchResults;
    }
}
