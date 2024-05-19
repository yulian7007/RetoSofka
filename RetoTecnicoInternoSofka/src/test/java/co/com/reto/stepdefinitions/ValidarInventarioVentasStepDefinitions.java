package co.com.reto.stepdefinitions;

import co.com.reto.tasks.ConsultarOrdenDeCompra;
import co.com.reto.tasks.ValidarInventarioVentas;
import co.com.reto.utils.constans.EndPoints;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidarInventarioVentasStepDefinitions {


    @When("envio la peticion {string} para consultar el inventario")
    public void envioLaPeticionParaConsultarElInventario(String endPoint) {
        theActorInTheSpotlight().attemptsTo(ValidarInventarioVentas.servicioGet(EndPoints.obtenerUrl(endPoint)));
    }


}
