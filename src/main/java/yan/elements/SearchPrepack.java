package yan.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

import java.util.List;

/**
 * Created by Vladimir on 02.04.2018.
 */
@FindBy(id ="search-prepack")
public class SearchPrepack extends HtmlElement {
    @FindBy(css = ".lih4lXS8EN [class = '_2yK7W3SWQ- _1d02bPcWht']")
    private TextInput startPrice;

    @FindBy(css = ".lih4lXS8EN [class = '_2yK7W3SWQ- _1f2usTwyAs']")
    private TextInput finalPrice;

//    private List<Link> lfTMElem;

    public void enterStartPrice(String enterPrice) {
        startPrice.sendKeys(enterPrice);
        }
    public void enterFinalPrice(String enterPrice) {
        finalPrice.sendKeys(enterPrice);
    }

}
