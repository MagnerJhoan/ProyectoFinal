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
 * La clase Historia representa un registro de historial de transacciones.
 * Implementa la interfaz Serializable para permitir la serialización de objetos.
 */
public class Historia implements Serializable {
    public String fecha; // Almacena la fecha de la transacción
    public String descripcion; // Almacena la descripción de la transacción
    public String monto; // Almacena el monto de la transacción
    public String destinatario; // Almacena el destinatario de la transacción
    public int cuentadestinatario; // Almacena el número de cuenta del destinatario
    public String saldo; // Almacena el saldo actual después de la transacción

    /**
     * Constructor de la clase Historia que inicializa los atributos con los valores proporcionados.
     * @param fecha Fecha de la transacción
     * @param descripcion Descripción de la transacción
     * @param monto Monto de la transacción
     * @param destinatario Destinatario de la transacción
     * @param cuentadestinario Número de cuenta del destinatario
     * @param saldo Saldo actual después de la transacción
     */
    public Historia(String fecha, String descripcion, String monto, String destinatario, int cuentadestinario, String saldo) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.monto = monto;
        this.cuentadestinatario = cuentadestinario;
        this.destinatario = destinatario;
        this.saldo = saldo;
    }

    /**
     * Constructor de la clase Historia que inicializa los atributos con valores nulos o por defecto.
     */
    public Historia() {
        this.fecha = null;
        this.descripcion = null;
        this.monto = null;
        this.cuentadestinatario = 0;
        this.destinatario = null;
        this.saldo = null;
    }

    /**
     * Setter para la fecha de la transacción.
     * @param fecha La fecha de la transacción a establecer
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    // Getter para saldo
    public String getSaldo() {
        return saldo;
    }

    // Getter para destinatario
    public String getDestinatario() {
        return destinatario;
    }

    // Getter para el número de cuenta del destinatario
    public int getCuenta() {
        return cuentadestinatario;
    }

    // Getter para la fecha de la transacción
    public String getFecha() {
        return fecha;
    }

    /**
     * Setter para la descripción de la transacción.
     * @param descripcion La descripción de la transacción a establecer
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getter para la descripción de la transacción
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter para el monto de la transacción.
     * @param monto El monto de la transacción a establecer
     */
    public void setMonto(String monto) {
        this.monto = monto;
    }

    // Getter para el monto de la transacción
    public String getMonto() {
        return monto;
    }
}
