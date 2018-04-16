package yan.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.ArrayList;
import java.util.List;

@FindBy(xpath = ".//div[@class = 'n-filter-applied-results metrika b-zone i-bem n-filter-applied-results_js_inited b-zone_js_inited']")
public class SearchResults extends HtmlElement {

    @FindBy(css = "[class^='n-snippet-card2 i-bem b-zone b-spy-visible b-spy-visible_js_inited']")
    private List<WebElement> searchItems;

    @FindBy(css = ".n-snippet-card2__main-price .price")
    private List<WebElement> searchPrices;

    public List<WebElement> getSearchItems() {
        return searchItems;
    }

    public ArrayList<Integer> getSearchPrices() {
//        System.out.println("bbb");

        ArrayList<Integer> resultPrice = new ArrayList<Integer>();
        List<WebElement> resultSearch = searchPrices;

        for (WebElement elem : resultSearch){
            String ss = elem.getAttribute("textContent").replaceAll("[^0-9]+","");
            resultPrice.add(Integer.valueOf(ss));
        }
        return resultPrice;
    }



}
