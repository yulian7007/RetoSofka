package co.com.reto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;


public class ValidarCodigoRespuesta implements Question<Boolean> {

    private final int codigo;

    public ValidarCodigoRespuesta(int codigoDeEstado) {
        this.codigo = codigoDeEstado;
    }



    @Override
    public Boolean answeredBy(Actor actor) {

        actor.should(
                ResponseConsequence.seeThatResponse("Código de respuesta del estado del servicio",
                        response -> response.statusCode(codigo))
        );
        return true;
    }

    public static ValidarCodigoRespuesta es(int codigoDeEstado) {
        return new ValidarCodigoRespuesta(codigoDeEstado);
    }

}
