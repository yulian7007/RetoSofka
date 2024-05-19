package co.com.reto.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@eliminarOrdenDeCompra",
        features = "src\\test\\resources\\features\\eliminarOrdenDeCompra.feature",
        glue = {"co.com.reto.stepdefinitions.hook",
                "co.com.reto.stepdefinitions"
        }
)

public class EliminarOrdenDeCompraRunner {
}
