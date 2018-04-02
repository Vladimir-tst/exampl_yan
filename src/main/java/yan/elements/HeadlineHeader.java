package yan.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

import java.util.List;

/**
 * Created by Vladimir on 02.04.2018.
 */
@FindBy(xpath = ".//*[@class='headline__header']")
public class HeadlineHeader extends HtmlElement {

    @FindBy(xpath = ".//div[@class='n-recipes-intents__item i-slider__item']")
    private List<WebElement> lfTMElem;

    public void searchByName(String nameEl) {

        boolean proof;
        for (WebElement ln : lfTMElem) {
            String drd = ln.getAttribute("textContent");
//            System.out.println(drd);

            if(drd.equals(nameEl)){
                ln.click();
                break;
            }
        }
    }

}
