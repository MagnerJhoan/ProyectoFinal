/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Jhonny
 */
/**
 * Clase principal que contiene el método main.
 */
public class Mainn {
    /**
     * Método principal que se ejecuta al iniciar la aplicación.
     * Crea una instancia de la clase IngresoPinQuechua y la hace visible.
     */
    public static void main(String[] args) {
        // Crear una instancia de la clase IngresoPinQuechua
        IngresoPinQuechua ventana = new IngresoPinQuechua();
        // Hacer visible la ventana
        ventana.setVisible(true);
        // Establecer la ubicación de la ventana en el centro de la pantalla
        ventana.setLocationRelativeTo(null);
    }
}
