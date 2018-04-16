package yan.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import ru.yandex.qatools.htmlelements.annotations.

import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;
//import ru.yandex.qatools.htmlelements.annotations;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

/**
 * Created by Vladimir on 01.04.2018.
 */

@FindBy(className = "topmenu__list")
public class TopMenu extends HtmlElement {
    @FindBy(xpath = "//*[@class = 'link topmenu__link'][text()='Компьютеры']")
    private WebElement topMenuComputers;

    public void searchTMComputers() {
        topMenuComputers.click();
    }
}
