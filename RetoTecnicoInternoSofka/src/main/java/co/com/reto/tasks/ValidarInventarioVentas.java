package co.com.reto.tasks;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ValidarInventarioVentas implements Task {


    private final String endPoint;

    public ValidarInventarioVentas(String endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        SerenityRest.reset();
        actor.attemptsTo(
                Get.resource(endPoint)
                        .with(request -> request
                                .contentType(ContentType.JSON)
                                .relaxedHTTPSValidation().log().all()
                        )
        );
    }

    public static ValidarInventarioVentas servicioGet(String endPoint) {
        return Tasks.instrumented(ValidarInventarioVentas.class, endPoint);
    }

}
