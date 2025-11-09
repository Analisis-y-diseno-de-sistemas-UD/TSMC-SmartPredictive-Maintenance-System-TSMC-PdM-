
public class Monitor {

    public String evaluarEstado(Maquina maquina) {
        double temperatura = maquina.getTemperatura();
        double vibracion = maquina.getVibracion();
        double promedio = (temperatura + vibracion) / 2;

        if (promedio <= 25) {
            return "Verde";
        } else if (promedio <= 50) {
            return "Amarillo";
        } else if (promedio <= 75) {
            return "Naranja";
        } else {
            return "Rojo";
        }
    }
}

