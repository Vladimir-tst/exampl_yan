package yan.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

import java.util.List;

/**
 * Created by Vladimir on 02.04.2018.
 */
@FindBy(xpath = ".//*[@class='n-filter-block_pos_left i-bem']")
public class FilterBlock extends HtmlElement {

    @FindBy(xpath = ".//a[@class = 'link link_theme_major n-filter-sorter__link i-bem link_js_inited']")
    private List<WebElement> lfTMElem;

    public void searchByName(String nameEl) {

        boolean proof;
        for (WebElement ln : lfTMElem) {
            String drd = ln.getAttribute("textContent");
            if(drd.equals(nameEl)){
                ln.click();
                break;
            }
        }
    }
}
