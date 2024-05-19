package co.com.reto.tasks;

import co.com.reto.models.MapDatosPost;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CargarData implements Task {

    private final Map<String, String> datosUsuario;
    private static final String ID = "id";
    private final Random random = new Random();

    public CargarData(Map<String, String> datosUsuario) {
        this.datosUsuario = datosUsuario;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Map<String, Object> cleanedData = new HashMap<>();
        for (Map.Entry<String, String> entry : datosUsuario.entrySet()) {
            String value = entry.getValue() != null ? entry.getValue() : "";
            cleanedData.put(entry.getKey(), value);
        }
        MapDatosPost.setData(cleanedData);
        Map<String, Object> data = MapDatosPost.getData();

        String requestId = (String) data.get("id");
        if ("Random".equals(requestId)) {
            int numeroAleatorio = 10 + random.nextInt(99);
            data.put("id", numeroAleatorio);
            actor.remember(ID, numeroAleatorio);
        }else {
            int idValue = Integer.parseInt(requestId);
            actor.remember(ID, idValue);
        }

    }

    public static CargarData datosPrueba(Map<String, String> datosUsuario) {
        return Tasks.instrumented(CargarData.class, datosUsuario);
    }

}


