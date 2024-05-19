package co.com.reto.tasks;

import co.com.reto.templates.CombinarPlantilla;
import co.com.reto.utils.constans.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Map;

public class CrearCuerpoPeticionPost implements Task {

    private final String plantilla;
    private final Map<String, String> data;

    public CrearCuerpoPeticionPost(String plantilla, Map<String, String> data) {
        this.plantilla = plantilla;
        this.data = data;
    }


    public static CrearCuerpoPeticionPost cuerpoPeticion(String plantilla, Map<String, Object> data) {
        return Tasks.instrumented(CrearCuerpoPeticionPost.class, plantilla, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String rutaPlantilla = String.format(Constantes.RUTA_PLANTILLA, plantilla);
        String cuerpoPeticion = CombinarPlantilla.template(rutaPlantilla).withFieldsFrom(data);
        System.out.println("cuerpoPeticion:\n " + cuerpoPeticion);//NOSONAR
        actor.remember(Constantes.CUERPO, cuerpoPeticion);
    }


}
