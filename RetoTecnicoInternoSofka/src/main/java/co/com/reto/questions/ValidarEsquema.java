package co.com.reto.questions;


import co.com.reto.utils.constans.Constantes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class ValidarEsquema implements Question<Boolean> {
    private final String nombreEsquema;

    public ValidarEsquema(String nombreEsquema) {
        this.nombreEsquema = nombreEsquema;
    }


    @Override
    public Boolean answeredBy(Actor actor) {

        actor.should(
                seeThatResponse(Constantes.VALIDAR_ESQUEMA,
                        response -> {
                            String esquemaCompleto = response.extract().asString();//NOSONAR
                            System.out.println("Esquema que responde el servicio: \n" + esquemaCompleto);//NOSONAR

                            response.assertThat()
                                    .body(matchesJsonSchemaInClasspath("schemas/" + nombreEsquema + ".json")).log().all();//NOSONAR
                        })
        );
        return true;
    }

    public static ValidarEsquema esperado(String nombreEsquema) {
        return new ValidarEsquema(nombreEsquema);
    }
}
