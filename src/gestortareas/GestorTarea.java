/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestortareas;

import java.util.ArrayList;

/**
 * Lógica de negocio para gestionar la lista de tareas.
 *
 * @author Guillermo y Judith
 */
public class GestorTarea {

    private ArrayList<Tarea> listaTareas;

    public GestorTarea() {
        this.listaTareas = new ArrayList<>();
    }

    /**
     * Añade una tarea a la lista (Implementado por Guillermo).
     * @param descripcion Descripción de la nueva tarea.
     */
    public void añadirTarea(String descripcion) {
        Tarea nuevaTarea = new Tarea(descripcion);
        listaTareas.add(nuevaTarea);
        System.out.println("Tarea añadida con éxito.");
    }
    
    /**
     * * Muestra todas las tareas por consola (Implementado por Judith).
     */
    public void mostrarTareas() {
        if (listaTareas.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("\n--- LISTA DE TAREAS ---");
            for (int i = 0; i < listaTareas.size(); i++) {
                System.out.println((i + 1) + ". " + listaTareas.get(i).toString());
            }
        }
    }
}
