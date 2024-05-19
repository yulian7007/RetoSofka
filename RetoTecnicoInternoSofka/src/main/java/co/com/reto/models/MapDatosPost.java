package co.com.reto.models;

import java.util.HashMap;
import java.util.Map;

public class MapDatosPost {

    private static Map<String, Object> map = new HashMap<>();

    public static Map<String, Object> getData() {
        return map;
    }

    public static void setData(Map<String, Object> mapDatosPost) {
        map = mapDatosPost;
    }

    private MapDatosPost(){

    }

}


