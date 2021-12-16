
/**
 * Clase Ordenador
 */
public class Ordenador {
    // Los atributos
    private String usuario;
    private float precio;
    private Procesador microProcesador;

    /**
     * Constructor for objects of class Ordenador
     */
    public Ordenador(String usuarioOrdenador, float precioOrdenador, Procesador microProcesadorOrdenador)
    {
        //Inicializar los cambios
        usuario = usuarioOrdenador;
        precio = precioOrdenador;
        microProcesador = microProcesadorOrdenador;
    }
}
