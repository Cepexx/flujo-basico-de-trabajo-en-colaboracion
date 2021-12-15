
/**
 * Clase Procesador
 */
public class Procesador
{
    // instance variables - replace the example below with your own
    private int voltaje;
    private boolean graficaIntegrada;

    /**
     * Constructor para la clase Procesador
     */
    public Procesador(int voltajeProcesador, boolean graficaIntegradaProcesador)
    {
        // Inicializa las variables
        voltaje = voltajeProcesador;
        graficaIntegrada = graficaIntegradaProcesador;
    }
    
    public int getVoltaje() {
        return voltaje;
    }
    
    public boolean getGraficaIntegrada() {
        return graficaIntegrada;
    }
    
    public void setVoltage() {
        voltaje = 3;
    }
    
    public void setGraficaIntegrada() {
        graficaIntegrada = true;
    }
}