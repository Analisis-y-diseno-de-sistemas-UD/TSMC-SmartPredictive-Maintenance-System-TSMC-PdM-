package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*crear los objetos
         *
         */
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

        /* prueba de que funciona */

        System.out.println(monitor_prueba.evaluarEstado(Maquina_prueba));

    }
}