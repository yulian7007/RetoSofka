package co.com.reto.tasks;

import co.com.reto.interactions.EjecutarServicioPost;
import co.com.reto.utils.constans.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ConsumirServicioPost implements Task {


    private final String endPoint;

    public ConsumirServicioPost(String endPoint) {
        this.endPoint = endPoint;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        String cuerpoPeticion = actor.recall(Constantes.CUERPO).toString();
        actor.attemptsTo(EjecutarServicioPost.peticionPost(endPoint, cuerpoPeticion));
    }

    public static ConsumirServicioPost servicioPost(String endPoint) {
        return Tasks.instrumented(ConsumirServicioPost.class, endPoint);
    }

}
