/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.io.Serializable;

/**
 *
 * @author MAGNER
 */

/**
 * Define la clase DATOS que implementa la interfaz Serializable.
 * Contiene variables de instancia y métodos para acceder a ellas.
 */
public class DATOS implements Serializable { // La clase implementa la interfaz Serializable para poder ser serializable
    // Variables de instancia
    public String numeroCuenta; // Número de cuenta
    public String nombreApellido; // Nombre y apellido del titular de la cuenta
    public String tipoCuenta; // Tipo de cuenta (ahorros, corriente, etc.)
    public String tipoMoneda; // Tipo de moneda (dólares, euros, etc.)
    public String saldo; // Saldo de la cuenta

    /**
     * Constructor de la clase DATOS.
     * @param numeroCuenta Número de cuenta
     * @param nombreApellido Nombre y apellido del titular de la cuenta
     * @param tipoCuenta Tipo de cuenta
     * @param tipoMoneda Tipo de moneda
     * @param saldo Saldo de la cuenta
     */
    public DATOS(String numeroCuenta, String nombreApellido, String tipoCuenta, String tipoMoneda, String saldo) {
        // Asigna los valores recibidos a las variables de instancia
        this.numeroCuenta = numeroCuenta;
        this.nombreApellido = nombreApellido;
        this.tipoCuenta = tipoCuenta;
        this.tipoMoneda = tipoMoneda;
        this.saldo = saldo;
    }

    // Getters para acceder a los valores de las variables de instancia
    /**
     * Obtiene el número de cuenta.
     * @return Número de cuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Obtiene el nombre y apellido del titular de la cuenta.
     * @return Nombre y apellido del titular de la cuenta
     */
    public String getNombreApellido() {
        return nombreApellido;
    }

    /**
     * Obtiene el tipo de cuenta.
     * @return Tipo de cuenta
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * Obtiene el tipo de moneda.
     * @return Tipo de moneda
     */
    public String getTipoMoneda() {
        return tipoMoneda;
    }

    /**
     * Obtiene el saldo de la cuenta.
     * @return Saldo de la cuenta
     */
    public String getSaldo() {
        return saldo;
    } 
}