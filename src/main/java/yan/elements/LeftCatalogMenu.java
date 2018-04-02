package yan.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

import java.util.List;

/**
 * Created by Vladimir on 01.04.2018.
 */
//@FindBy(xpath = ".//*[@class = 'catalog-menu i-bem catalog-menu_js_inited']")
//@Block(@FindBy(xpath = ".//*[@class = 'catalog-menu__item']"))

//@FindBy(xpath = ".//*[@class = 'catalog-menu i-bem catalog-menu_js_inited']")
//@FindBy(xpath = "//*[@class ='catalog-menu__item'][0]")

@FindBy(xpath = ".//*[@class = 'catalog-menu i-bem catalog-menu_js_inited']")
public class LeftCatalogMenu extends HtmlElement {
//    @FindBy(xpath = "//a[text()='Комплектующие']")

    @FindBy(xpath = ".//a[text()='Комплектующие']")
    private WebElement lftMenuComponents;

    @FindBy(xpath = ".//*[@class='catalog-menu__title metrika i-bem link metrika_js_inited']")
    private List<Link> lfTMElem;

    public void searchComponents() {
        lftMenuComponents.click();
    }
    public void searchComponentsByName(String nameEl) {
//        int i = 0;
//        int tt;
//        System.out.println(nameEl);
        boolean proof;
        for (Link ln : lfTMElem) {
            String drd = ln.getText();
//            i++;
//            proof = (drd.equals(nameEl));
//            tt = nameEl.compareTo(drd);
            if(drd.equals(nameEl)){
                ln.click();
                break;
            }
//            System.out.println(proof);
//            System.out.println(tt);
//            System.out.println(drd);

        }
//        System.out.println(i);
       // lftMenuComponents.click();
    }
}
