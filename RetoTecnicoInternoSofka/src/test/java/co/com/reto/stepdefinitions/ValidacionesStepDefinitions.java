package co.com.reto.stepdefinitions;


import co.com.reto.exceptions.ExcepcionesServicio;
import co.com.reto.questions.ValidarCodigoRespuesta;
import co.com.reto.questions.ValidarEsquema;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidacionesStepDefinitions {

    @Then("valido el codigo de respuesta {int}")
    public void validoElCodigoDeRespuesta(Integer codigoRespuesta) {
        theActorInTheSpotlight()
                .should(seeThat(ValidarCodigoRespuesta.es(codigoRespuesta))
                        .orComplainWith(ExcepcionesServicio.class,
                                ExcepcionesServicio.ERROR_VALIDANDO_CODIGO_DE_RESPUESTA)
                );
    }
    @Then("valido el esquema que responde {string}")
    public void validoElEsquemaQueResponde(String nombreEsquema) {
        theActorInTheSpotlight()
                .should(seeThat(ValidarEsquema.esperado(nombreEsquema))
                        .orComplainWith(ExcepcionesServicio.class,
                                ExcepcionesServicio.ERROR_VALIDANDO_ESQUEMA)
                );
    }



}
