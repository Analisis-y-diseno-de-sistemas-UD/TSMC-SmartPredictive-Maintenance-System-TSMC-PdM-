public class Monitor {

    public String evaluarEstado(Maquina maquina) {
        if (maquina == null) {
            return "Error: Máquina nula";
        }
        
        try {
            double temperatura = maquina.getTemperatura();
            double vibracion = maquina.getVibracion();
            
            // Validar que los valores sean números válidos
            if (Double.isNaN(temperatura) || Double.isNaN(vibracion) ||
                Double.isInfinite(temperatura) || Double.isInfinite(vibracion)) {
                return "Error: Valores inválidos";
            }
            
            // Validar que no sean negativos (si aplica en tu caso)
            if (temperatura < 0 || vibracion < 0) {
                return "Error: Valores negativos";
            }
            
            double promedio = (temperatura + vibracion) / 2;
            
            // Validar que el promedio sea un número válido
            if (Double.isNaN(promedio) || Double.isInfinite(promedio)) {
                return "Error: Promedio inválido";
            }

            if (promedio <= 25) {
                return "Verde";
            } else if (promedio <= 50) {
                return "Amarillo";
            } else if (promedio <= 75) {
                return "Naranja";
            } else {
                return "Rojo";
            }
            
        } catch (Exception e) {
            return "Error: Exception no controlada";
        }
    }
}