package co.com.reto.exceptions;

public class ExcepcionesServicio extends AssertionError {

    private static final long serialVersionUID = 1L;
    public static final String ERROR_VALIDANDO_CAMPOS_DE_RESPUESTA = "Los campos que responde el servicio son diferente a los esperados.";
    public static final String ERROR_VALIDANDO_ESQUEMA_VACIO = "El esquema recibido contiene datos y posiblemente no esta vacío.";
    public static final String ERROR_VALIDANDO_ESQUEMA = "El esquema recibido es diferente al esperado.";
    public static final String ERROR_VALIDANDO_CANTIDAD_DE_CAMPOS = "La cantidad de campos que responde el servicio es diferente al esperado.";
    public static final String ERROR_VALIDANDO_CODIGO_DE_RESPUESTA = "El codigo de respuesta no es el esperado.";



    public ExcepcionesServicio(String message, Throwable cause){
        super(message, cause);
    }

    public ExcepcionesServicio(String message){
        super(message);
    }


}
