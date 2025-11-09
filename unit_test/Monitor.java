public class Monitor {

    public String evaluarEstado(Maquina maquina) {
        if (maquina == null) {
            return "Error: Máquina nula";
        }
        
        try {
            double temperatura = maquina.getTemperatura();
            double vibracion = maquina.getVibracion();
            
            // Validar que los valores sean números válidos
            if (Double.isNaN(temperatura) || Double.isNaN(vibracion)) {
                return "Error: Valores NaN";
            }
            
            if (Double.isInfinite(temperatura) || Double.isInfinite(vibracion)) {
                return "Error: Valores infinitos";
            }
            
            // Verificar posibles desbordamientos antes del cálculo
            if (Math.abs(temperatura) > Double.MAX_VALUE / 2 || 
                Math.abs(vibracion) > Double.MAX_VALUE / 2) {
                return "Error: Valores muy grandes para cálculo";
            }
            
            double promedio = (temperatura + vibracion) / 2;
            
            // Validar que el promedio sea un número válido
            if (Double.isNaN(promedio)) {
                return "Error: Promedio NaN";
            }
            
            if (Double.isInfinite(promedio)) {
                return "Error: Promedio infinito";
            }

            // Lógica original exactamente igual
            if (promedio <= 25) {
                return "Verde";
            } else if (promedio <= 50) {
                return "Amarillo";
            } else if (promedio <= 75) {
                return "Naranja";
            } else {
                return "Rojo";
            }
            
        } catch (NullPointerException e) {
            return "Error: Método de máquina retorna null";
        } catch (Exception e) {
            return "Error: Exception no controlada - " + e.getClass().getSimpleName();
        }
    }
}