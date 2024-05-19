package co.com.reto.utils.constans;

import java.util.HashMap;
import java.util.Map;

public class EndPoints {
    private static Map<String, String> urls = new HashMap<>();

    static {

        urls.put("OrdenCompra",                 "store/order/");
        urls.put("ValidarInventarioVentas",     "store/inventory");

    }

    private EndPoints() {
    }

    public static String obtenerUrl(String endpoint) {
        return urls.get(endpoint);
    }
}
