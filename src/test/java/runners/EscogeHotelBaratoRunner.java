package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/escoge_hotel_mas_barato.feature",
        glue = "stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class EscogeHotelBaratoRunner {
}
