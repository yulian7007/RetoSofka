package co.com.reto.stepdefinitions;

import co.com.reto.tasks.EliminarOrdenDeCompra;
import co.com.reto.utils.constans.EndPoints;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EliminarOrdenDeCompraStepDefinitions {

    @When("envio la peticion {string} para eliminar una Orden De Compra")
    public void envioLaPeticionParaEliminarUnaOrdenDeCompra(String endPoint) {
        theActorInTheSpotlight().attemptsTo(EliminarOrdenDeCompra.servicioGet(EndPoints.obtenerUrl(endPoint)));
    }

}
