/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestortareas;

import java.util.Scanner;

/**
 * Clase principal que gestiona el menú de usuario.
 *
 * @author Guillermo y Judith
 */
public class GestorTareas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorTarea gestor = new GestorTarea();
        int opcion;
        do {
            System.out.println("\n1. Añadir tarea (Guillermo)");
            System.out.println("2. Listar tareas (Judith)");
            System.out.println("3. Salir");
            System.out.print("Seleccione opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            if (opcion == 1) {
                System.out.print("Escribe la descripción: ");
                String desc = sc.nextLine();
                gestor.añadirTarea(desc);
            } else if (opcion == 2) {
                gestor.mostrarTareas();
            }
        } while (opcion != 3);
    }

}
