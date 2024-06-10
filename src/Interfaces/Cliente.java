/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.io.Serializable;
import java.util.ArrayList;
/**
 * 
 *
 * @author MAGNER
 */
// Declaración de la clase Cliente que implementa Serializable
public class Cliente implements Serializable {
    // Declaración de variables miembro de la clase Cliente
    public String nombre; // Nombre del cliente
    public String apellido; // Apellido del cliente
    public int ci; // CI (Cédula de Identidad) del cliente
    public String direccion; // Dirección del cliente
    public int telefono; // Número de teléfono del cliente
    public String usuario; // Nombre de usuario del cliente
    public String contraseña; // Contraseña del cliente
    public ArrayList<Cuenta> listaCuentas; // ArrayList para almacenar las cuentas del cliente
    
    // Constructor de la clase Cliente
    public Cliente(String nombre, String apellido, int ci, String direccion, int telefono, String usuario, String contraseña){
        // Inicialización de las variables del cliente con los valores recibidos
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.direccion = direccion;
        this.telefono = telefono;
        this.usuario = usuario;
        this.contraseña = contraseña;
        listaCuentas = new ArrayList<>(); // Inicialización del ArrayList para las cuentas
    }
    
    // Métodos getters y setters para acceder y modificar los atributos del cliente
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}