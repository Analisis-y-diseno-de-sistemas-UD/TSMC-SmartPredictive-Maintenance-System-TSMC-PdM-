

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import javax.management.monitor.Monitor;


public class test {

    @Test
    public void testEvaluarestado_naranja(){

        Maquina Maquina_prueba = new Maquina(
                "2023-06-15",         // fechaInstalacion
                "2 años",             // tiempoEnProduccion
                "Torno CNC",          // nombre
                "Industrial",         // tipo
                65.5,                 // temperatura (0 a 100)
                40.2,                 // vibracion (0 a 100)
                new String[]{"2023-12-10", "2024-06-10", "2025-01-10"} // fechasMantenimiento
        );

        Monitor monitor_prueba = new Monitor();

        String resultado = monitor_prueba.evaluarEstado(Maquina_prueba);
        assertEquals("Naranja", resultado);

    }
    /* para correrlo usar mvn test en consola
     */

    @Test
    void testMaquinaNula() {
        Monitor monitor = new Monitor();
        assertEquals("Error: Máquina nula", monitor.evaluarEstado(null));
    }

    @Test
    void testTemperaturaNaN() {
        Maquina m = new Maquina("2024-01-01", "10h", "M3", "Motor", Double.NaN, 50, new String[]{"2024-02-01"});
        Monitor monitor = new Monitor();
        assertEquals("Error: Valores NaN", monitor.evaluarEstado(m));
    }

    @Test
    void testVibracionInfinita() {
        Maquina m = new Maquina("2024-01-01", "10h", "M4", "Motor", 50, Double.POSITIVE_INFINITY, new String[]{"2024-02-01"});
        Monitor monitor = new Monitor();
        assertEquals("Error: Valores infinitos", monitor.evaluarEstado(m));
    }

    @Test
    void testValorMuyGrande() {
        Maquina m = new Maquina("2024-01-01", "10h", "M5", "Motor", Double.MAX_VALUE, 10, new String[]{"2024-02-01"});
        Monitor monitor = new Monitor();
        assertEquals("Error: Valores muy grandes para cálculo", monitor.evaluarEstado(m));
    }

    @Test
    void testErrorDesconocido() {
        // Simula una excepción inesperada manipulando un valor que cause un error lógico
        Maquina m = new Maquina("2024-01-01", "10h", "M6", "Motor", 0, 0, new String[]{"2024-02-01"}) {
            @Override
            public double getTemperatura() {
                throw new RuntimeException("Falla desconocida");
            }
        };
        Monitor monitor = new Monitor();
        String resultado = monitor.evaluarEstado(m);
        assertTrue(resultado.startsWith("Error: Exception no controlada"));
    }

}
