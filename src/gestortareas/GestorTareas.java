/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestortareas;

import java.util.Scanner;

/**
 * Clase principal que gestiona el menú de usuario.
 *
 * @author Alumno A y Alumno B
 */
public class GestorTareas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorTarea gestor = new GestorTarea();

        // Menú con la opción 1 programada
        System.out.println("1. Añadir tarea");
        System.out.print("Seleccione opción: ");
        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        if (opcion == 1) {
            System.out.print("Escribe la descripción de la tarea: ");
            String desc = sc.nextLine();
            gestor.añadirTarea(desc);
        }
    }

}
