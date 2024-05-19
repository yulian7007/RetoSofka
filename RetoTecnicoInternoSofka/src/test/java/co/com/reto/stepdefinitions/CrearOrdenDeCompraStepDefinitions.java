package co.com.reto.stepdefinitions;


import co.com.reto.models.MapDatosPost;
import co.com.reto.tasks.CargarData;
import co.com.reto.tasks.ConsultarOrdenDeCompra;
import co.com.reto.tasks.ConsumirServicioPost;
import co.com.reto.tasks.CrearCuerpoPeticionPost;
import co.com.reto.utils.constans.EndPoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearOrdenDeCompraStepDefinitions {

    @Given("envio la informacion de la Orden de compra")
    public void envioLaInformacionDeLaOrdenDeCompra(List<Map<String, String>> datos) {
        theActorInTheSpotlight().wasAbleTo(CargarData.datosPrueba(datos.get(0)));
    }

    @When("envio la peticion {string} para crear la Orden de compra")
    public void envioLaPeticionParaCrearLaOrdenDeCompra(String endPoint) {
        theActorInTheSpotlight().attemptsTo(CrearCuerpoPeticionPost.cuerpoPeticion(endPoint + "Request.json", MapDatosPost.getData()));
        theActorInTheSpotlight().attemptsTo(ConsumirServicioPost.servicioPost(EndPoints.obtenerUrl(endPoint)));
    }

    @When("envio la peticion {string} para consultar la Orden de compra creada")
    public void envioLaPeticionParaConsultarLaOrdenDeCompra(String endPoint) {
        theActorInTheSpotlight().attemptsTo(ConsultarOrdenDeCompra.servicioGet(EndPoints.obtenerUrl(endPoint)));
    }

}
