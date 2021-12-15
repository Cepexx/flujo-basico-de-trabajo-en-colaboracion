/**
 * Clase Procesador
 */
public class Procesador
{
    // Variables de la clase
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
    
    // Devuelve el voltaje del procesador
    public int getVoltaje() {
        return voltaje;
    }
    
    // Dice si el procesador tiene gráfica integrada
    public boolean getGraficaIntegrada() {
        return graficaIntegrada;
    }
    
    // Asigna el voltaje del procesador
    public void setVoltage(int voltajeProcesador) {
        voltaje = voltajeProcesador;
    }
    
    // Asigna si el procesador tiene gráfica integrada
    public void setGraficaIntegrada(boolean tieneGraficaIntegrada) {
        graficaIntegrada = tieneGraficaIntegrada;
    }
    
    // Imprime los detalles del procesador
    public void imprimeDetalles(){
        System.out.println("Voltaje: " + voltaje + "W " + " Tiene gráfica: " + graficaIntegrada);
    }
}