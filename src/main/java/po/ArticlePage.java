package po;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class ArticlePage {

    private final SelenideElement firstHeading = $x("//h1[@id='firstHeading']/span");

    private final SelenideElement firstHeadingHistory = $x("//h1[@id='firstHeading']");

    public String getHeadingOfArticle() {
        return firstHeading.getText();
    }
}
