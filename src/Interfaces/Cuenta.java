/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces; // Paquete que contiene la clase Cuenta

import java.io.Serializable; // Importación de la interfaz Serializable para permitir la serialización de objetos
import java.util.ArrayList; // Importación de la clase ArrayList para usar listas dinámicas
/**
 *
 * @author MAGNER
 */
public class Cuenta implements Serializable {
    // Declaración de variables miembro de la clase Cuenta
    public int numeroCuenta; // Número de cuenta
    public String moneda; // Tipo de moneda (true para bolivianos, false para dólares)
    public double saldo; // Saldo de la cuenta
    public String tipoCuenta; // Tipo de cuenta (por ejemplo, ahorros, crédito, débito)
    public String usuario; // Usuario asociado a la cuenta
    public ArrayList<Historia> Historia = new ArrayList(); // Lista de historial de transacciones
    
    /**
     * Constructor de la clase Cuenta.
     * @param numerocuenta Número de cuenta
     * @param moneda Tipo de moneda (bolivianos o dólares)
     * @param saldo Saldo de la cuenta
     * @param tipoCuenta Tipo de cuenta (ahorros, crédito, débito, etc.)
     * @param usuario Usuario asociado a la cuenta
     */
    public Cuenta(int numerocuenta, String moneda, double saldo, String tipoCuenta, String usuario) {
        this.numeroCuenta = numerocuenta; // Inicializa el número de cuenta
        this.moneda = moneda; // Inicializa el tipo de moneda
        this.saldo = saldo; // Inicializa el saldo de la cuenta
        this.tipoCuenta = tipoCuenta; // Inicializa el tipo de cuenta
        this.usuario = usuario; // Inicializa el usuario asociado a la cuenta
    }
    
    // Métodos de acceso para obtener los valores de las variables miembro
    
    public int getNumeroCuenta() {
        return numeroCuenta; // Retorna el número de cuenta
    }

    public String getMoneda() {
        return moneda; // Retorna el tipo de moneda
    }

    public double getSaldo() {
        return saldo; // Retorna el saldo de la cuenta
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo; // Establece el saldo de la cuenta
    }

    public ArrayList<Historia> getListaHistoria() {
        return Historia; // Retorna la lista de historial de transacciones
    }

    public String getTipoCuenta() {
        return tipoCuenta; // Retorna el tipo de cuenta
    }

    public String getUsuario() {
        return usuario; // Retorna el usuario asociado a la cuenta
    }
}
