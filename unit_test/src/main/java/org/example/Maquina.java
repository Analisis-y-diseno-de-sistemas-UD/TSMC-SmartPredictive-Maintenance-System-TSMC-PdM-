package org.example;

public class Maquina



{


    private String fechaInstalacion;
    private String tiempoEnProduccion;
    private String nombre;
    private String tipo;
    private double temperatura;
    private double vibracion;
    private String[] fechasMantenimiento;

    public Maquina(String fechaInstalacion, String tiempoEnProduccion, String nombre, String tipo, double temperatura, double vibracion, String[] fechasMantenimiento) {
        this.fechaInstalacion = fechaInstalacion;
        this.tiempoEnProduccion = tiempoEnProduccion;
        this.nombre = nombre;
        this.tipo = tipo;
        this.temperatura = temperatura;
        this.vibracion = vibracion;
        this.fechasMantenimiento = fechasMantenimiento;
    }

    public String getFechaInstalacion() {
        return fechaInstalacion;
    }

    public void setFechaInstalacion(String fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }

    public String getTiempoEnProduccion() {
        return tiempoEnProduccion;
    }

    public void setTiempoEnProduccion(String tiempoEnProduccion) {
        this.tiempoEnProduccion = tiempoEnProduccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getVibracion() {
        return vibracion;
    }

    public void setVibracion(double vibracion) {
        this.vibracion = vibracion;
    }

    public String[] getFechasMantenimiento() {
        return fechasMantenimiento;
    }

    public void setFechasMantenimiento(String[] fechasMantenimiento) {
        this.fechasMantenimiento = fechasMantenimiento;
    }

}
