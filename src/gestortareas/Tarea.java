/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestortareas;

/**
 * Clase que representa una tarea individual en el sistema.
 * @author Guillermo
 */
public class Tarea {
    private String descripcion;
    private boolean completada;

    /**
     * Constructor para crear una nueva tarea.
     * @param descripcion El texto descriptivo de la tarea.
     */
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        String estado = completada ? "[Completada]" : "[Pendiente]";
        return estado + " " + descripcion;
    }
}
