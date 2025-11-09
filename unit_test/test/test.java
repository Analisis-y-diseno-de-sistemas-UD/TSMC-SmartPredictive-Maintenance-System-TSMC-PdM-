

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

}
