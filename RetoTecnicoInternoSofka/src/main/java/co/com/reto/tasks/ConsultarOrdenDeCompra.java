package co.com.reto.tasks;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ConsultarOrdenDeCompra implements Task {

    private final String endPoint;
    private static final String ID = "id";

    public ConsultarOrdenDeCompra(String endPoint) {
        this.endPoint = endPoint;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        Integer id = actor.recall(ID);

        SerenityRest.reset();
        actor.attemptsTo(
                Get.resource(endPoint + String.valueOf(id))
                        .with(request -> request
                                .contentType(ContentType.JSON)
                                .relaxedHTTPSValidation().log().all()
                        )
        );
    }

    public static ConsultarOrdenDeCompra servicioGet(String endPoint) {
        return Tasks.instrumented(ConsultarOrdenDeCompra.class, endPoint);
    }


}
