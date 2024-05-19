package co.com.reto.interactions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static io.restassured.http.ContentType.JSON;

public class EjecutarServicioPost implements Interaction {

    private final String cuerpoPeticion;
    private final String endPoint;

    public EjecutarServicioPost(String endPoint, String cuerpoPeticion) {
        this.endPoint = endPoint;
        this.cuerpoPeticion = cuerpoPeticion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        SerenityRest.reset();
        actor.attemptsTo(
                Post.to(endPoint)
                        .with(request -> request.
                                contentType(JSON)
                                .body(cuerpoPeticion)
                                .relaxedHTTPSValidation().log().all()
                        )
        );

    }

    public static EjecutarServicioPost peticionPost(String cuerpoPeticion, String endPoint) {
        return Tasks.instrumented(EjecutarServicioPost.class, cuerpoPeticion, endPoint);
    }


}
